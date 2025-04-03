package StepDefinition;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Test;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

import static StepDefinition.AbstractStepDef.restAssuredBaseURL;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredSteps {
    Response getResponse;
    Response postResponse;

    @Test
    public void connect() {
        getResponse = RestAssured.get(restAssuredBaseURL + "/api/users?page=2");
        System.out.println(getResponse.getStatusCode());
        System.out.println(getResponse.getBody().asString());
        Assert.assertEquals(getResponse.getStatusCode(), SC_OK);
    }

    @Test
    public void check() {
        connect();
        getResponse.then().body("data[2].id", equalTo(9));
        getResponse.then().body("data[2].first_name", equalTo("Tobias"));
    }

    @Test
    //insert a record
    public void post() {
        Map<String, Object> map = new HashMap<>();
        map.put("first_name", "Tobias");
        map.put("last_name", "Bias");
        JSONObject jsonRequest = new JSONObject(map);

        postResponse = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(jsonRequest.toJSONString())
                .when()
                .post(restAssuredBaseURL + "/api/users");
        Assert.assertEquals(postResponse.getStatusCode(), SC_CREATED);
    }
    @Test
    //update the record
    public void put() {
        Map<String, Object> map = new HashMap<>();
        map.put("first_name", "Tobias");
        map.put("last_name", "Bias");
        JSONObject jsonRequest = new JSONObject(map);

        postResponse = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(jsonRequest.toJSONString())
                .when()
                .put(restAssuredBaseURL + "/api/users/2");
        System.out.println(postResponse.getBody().asString());
        Assert.assertEquals(postResponse.getStatusCode(), SC_OK);
    }
}
