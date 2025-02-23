package Pages;

import org.openqa.selenium.WebDriver;
import Utils.Singletone;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
    private WebDriver driver;

    LoginPage loginPage = new LoginPage(driver);


    public AbstractPage(WebDriver driver) {
        this.driver = Singletone.getDriver();
        PageFactory.initElements(driver, this);
    }
}
