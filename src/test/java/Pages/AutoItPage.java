package Pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class AutoItPage extends AbstractPage {
    @FindBy(xpath = "//div[@id='uploadifive-file_upload']")
    WebElement fileUploadButton;

    @FindBy(xpath = "//div[@id='savefiles']")
    WebElement saveFileButton;

    public AutoItPage(WebDriver driver) {
        super(driver);
    }
}
