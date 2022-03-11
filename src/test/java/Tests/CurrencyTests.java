package Tests;

import Base.Hooks;
import Page.CurrencyPage;
import Page.IndexPage;
import org.junit.Test;

public class CurrencyTests extends Hooks {
    public IndexPage indexPage;
    public CurrencyPage currencyPage;

    @Test
    public void selectCurrencyFromList() {
        indexPage = new IndexPage(getDriver());
        currencyPage = new CurrencyPage(getDriver());
        indexPage.cancelPopupElement();
        indexPage.acceptCookiesElement();

        currencyPage.selectCurrency(inputData.get("value1"));
        currencyPage.validateCurrency(inputData.get("value1"));

        currencyPage.selectCurrency(inputData.get("value2"));
        currencyPage.validateCurrency(inputData.get("value2"));
    }
}
