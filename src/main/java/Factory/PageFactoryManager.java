package Factory;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    public PageFactoryManager(WebDriver driver) {
    }

    public static LoginPage getLoginPage(WebDriver driver) {
        return new LoginPage(driver);
    }
}
