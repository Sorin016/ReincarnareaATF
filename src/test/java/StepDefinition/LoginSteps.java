package StepDefinition;

import Factory.PageFactoryManager;
import Pages.LoginPage;
import Utils.Singletone;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {

    private static LoginPage loginPage;

    private final WebDriver driver = Singletone.getDriver();  // Use the Singleton to get the driver instance

    @When("^User inserts (.*)$")
    public void user_insert_username(String username) throws InterruptedException {
        loginPage = PageFactoryManager.getLoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        loginPage
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        Thread.sleep(5000);

    }

    @When("^User insert (.*)$")
    public void user_insert_password(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

    }

    @When("User click submit")
    public void user_click_submit() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("User is redirect to the home page")
    public void user_is_redirect_to_the_home_page() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Time at Work']")));
        driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
    }
}
