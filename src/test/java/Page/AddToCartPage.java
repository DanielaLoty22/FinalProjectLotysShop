package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {

    @FindBy(css = "div.slide.is-selected > div > div > div.slide-buttons > a")
    private WebElement shopNowElement;
    @FindBy(xpath = "//*[@id='main']/div/div/div/div[2]/div[1]/div/div/div[1]/div[1]/a/div/div/img")
    private WebElement powerBankProductElement;
    @FindBy(xpath = "//*[@id='product-35947']/div/div[1]/div[1]/div[2]/form/table/tbody/tr/td[2]/div/span[1]/i/img")
    private WebElement productChoiceColorElement;
    @FindBy(css = "div.single_add_to_cart_button-group")
    private WebElement addCartProductElement;
    @FindBy(xpath = "//*[@id='cart-sidebar']/div[2]/div/div[2]/a[1]")
    private WebElement viewCartProductElement;
    @FindBy(css = "a.remove.text-muted")
    private WebElement removeProductElement;
    @FindBy(css = "#content > div.checkout-content.mt-px-15 > div > div > p")
    private WebElement cartEmptyElement;

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    public void goToShopNow() {
        elementMethods.clickElement(shopNowElement);
    }

    public void choiceTheProduct() {
        elementMethods.clickElement(powerBankProductElement);
    }

    public void choiceTheProductColor() {
        elementMethods.clickElement(productChoiceColorElement);
    }

    public void addProductToCart() {
        elementMethods.clickElement(addCartProductElement);
    }

    public void goToViewCart() {
        elementMethods.clickElement(viewCartProductElement);
    }

    public void removeProductFromCart() {
        elementMethods.clickElement(removeProductElement);
    }

    public void validateEmptyCartMessage(String message) {
        elementMethods.validateElementText(cartEmptyElement, message);
    }
}
