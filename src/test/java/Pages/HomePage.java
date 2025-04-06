package Pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class HomePage extends AbstractPage {

    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[1]")
    private WebElement adminLink;

    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[2]")
    private WebElement PIMLink;

    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[3]")
    private WebElement leavLink;
    //....

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
