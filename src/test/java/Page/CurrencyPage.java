package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrencyPage extends BasePage {
    @FindBy(css = "i.icon-down-open")
    private WebElement currencyListElement;
    @FindBy(css = "#header .current-currency .code")
    private WebElement currencyCodeElement;
    @FindBy(css = "#header .header-currency-switcher")
    private WebElement currencyElement;

    public CurrencyPage(WebDriver driver) {
        super(driver);
    }

    public void selectCurrency(String currency) {
        elementMethods.clickElement(currencyElement);
        currencyElement.findElement(By.cssSelector(".currency-item[data-code='"+ currency + "']")).click();
    }

    public void validateCurrency(String currency) {
        elementMethods.validateElementText(currencyCodeElement, "(" + currency + ")");
    }
}
