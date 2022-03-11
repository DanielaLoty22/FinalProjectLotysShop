package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "div.row.align-items-center >div:nth-child(3)>div>div>a>i")
    private WebElement loginElement;
    @FindBy(id = "username")
    private WebElement loginUserElement;
    @FindBy(css = "input[type='password']")
    private WebElement loginPasswordElement;
    @FindBy(css = "button[type='submit']")
    private WebElement submitLoginElement;
    @FindBy(css = ".header-account-title")
    private WebElement myAccountElement;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginTopBar() {
        elementMethods.clickElement(loginElement);
    }

    public void fillEmail(String value) {
        elementMethods.fillElement(loginUserElement, value);
    }

    public void fillPassword(String value) {
        elementMethods.fillElement(loginPasswordElement, value);
    }

    public void clickSubmitBtn() {
        elementMethods.clickElement(submitLoginElement);
    }

    public void login(String email, String password) {
        fillEmail(email);
        fillPassword(password);
        clickSubmitBtn();
    }

    public void validateLoginSuccessful() {
        elementMethods.validateElementText(myAccountElement, "My account");
    }
}

