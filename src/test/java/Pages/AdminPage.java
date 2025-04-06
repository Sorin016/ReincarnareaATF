package Pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class AdminPage extends AbstractPage {

    @FindBy(xpath = "//div[@role='table']")
    private WebElement tableWithAllUsers;

    public AdminPage(WebDriver driver) {
        super(driver);
    }
}
