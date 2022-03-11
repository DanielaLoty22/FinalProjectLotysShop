package Tests;

import Base.Hooks;
import Page.IndexPage;
import Page.SearchProductPage;
import org.junit.Test;

public class SearchInvalidProductTests extends Hooks {

    public IndexPage indexPage;
    public SearchProductPage searchProductPage;

    @Test
    public void searchForInvalidProduct() {
        indexPage = new IndexPage(getDriver());
        searchProductPage = new SearchProductPage(getDriver());

        indexPage.cancelPopupElement();
        indexPage.acceptCookiesElement();
        searchProductPage.searchFor(inputData.get("product"));
        searchProductPage.validateErrorMessage(inputData.get("message"));
    }
}
