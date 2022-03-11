package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends BasePage {

    @FindBy(css = "div.col-xl-5.d-none.d-xl-block > div > form > div > input.search-field.js-autocomplete-search")
    private WebElement searchTopBarElement;
    @FindBy(css = "p.woocommerce-info")
    private WebElement errorMessageElement;
    @FindBy(css = ".woocommerce-products-header__count")
    private WebElement numberOfSearchedProducts;

    public SearchProductPage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String product) {
        elementMethods.fillElement(searchTopBarElement, product);
        searchTopBarElement.sendKeys(Keys.ENTER);
    }

    public void validateErrorMessage(String message) {
        elementMethods.validateElementText(errorMessageElement, message);
    }

    public void validateNumberOfProducts(String numberOfProducts) {
        elementMethods.validateElementText(numberOfSearchedProducts, numberOfProducts);
    }
}
