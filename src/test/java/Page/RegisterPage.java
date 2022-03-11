package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(css = "div.row.align-items-center >div:nth-child(3)>div>div>a>i")
    private WebElement loginElement;
    @FindBy(css = "#reg_email")
    private WebElement registerEmailElement;
    @FindBy(css = "button[value ='Create an Account']")
    private WebElement createAccountElement;
    @FindBy(css = ".woocommerce-error li")
    private WebElement errorMessageElement;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginTopBar() {
        elementMethods.clickElement(loginElement);
    }

    public void fillEmailUser(String value) {
        elementMethods.fillElement(registerEmailElement, value);
    }

    public void accountCreate() {
        elementMethods.clickElement(createAccountElement);
    }

    public void validateErrorMessage(String message) {
        elementMethods.validateElementText(errorMessageElement, message);
    }
}
