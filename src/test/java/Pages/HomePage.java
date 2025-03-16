package Pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
@AllArgsConstructor
public class HomePage extends AbstractPage {

    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[1]")
    WebElement adminLink;

    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[2]")
    WebElement PIMLink;

    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[3]")
    WebElement leavLink;
    //....

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public HomePage(){}
}
