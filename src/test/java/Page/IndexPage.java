package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage {

    @FindBy(css = ".hustle-button-close.has-background")
    private WebElement cancelPopupElement;
    @FindBy(xpath = "//button[contains(text(),'Accept cookies')]")
    private WebElement acceptCookiesElement;

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void cancelPopupElement() {
        elementMethods.clickElement(cancelPopupElement);
    }

    public void acceptCookiesElement() {
        elementMethods.clickElement(acceptCookiesElement);
    }
}