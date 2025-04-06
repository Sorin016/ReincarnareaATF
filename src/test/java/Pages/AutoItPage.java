package Pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AutoItPage extends AbstractPage {
    @FindBy(xpath = "//div[@id='uploadifive-file_upload']")
    private WebElement fileUploadButton;

    @FindBy(xpath = "//div[@id='savefiles']")
    private WebElement saveFileButton;

    @FindBy(xpath = "//div[contains(text(),'Отправьте ссылку доступа по э-почте:')]")
    private WebElement confiramtionText;

    public AutoItPage(WebDriver driver) {
        super(driver);
    }
}
