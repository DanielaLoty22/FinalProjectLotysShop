package Tests;

import Base.Hooks;
import Page.IndexPage;
import Page.SearchProductPage;
import org.junit.Test;

public class SearchValidProductTests extends Hooks {
    public IndexPage indexPage;
    public SearchProductPage searchProductPage;

    @Test
    public void searchForValidProduct() {
        indexPage = new IndexPage(getDriver());
        searchProductPage = new SearchProductPage(getDriver());

        indexPage.cancelPopupElement();
        indexPage.acceptCookiesElement();
        searchProductPage.searchFor(inputData.get("product"));
        searchProductPage.validateNumberOfProducts(inputData.get("number_of_products"));
    }
}
