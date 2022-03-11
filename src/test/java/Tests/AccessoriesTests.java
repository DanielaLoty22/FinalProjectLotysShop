package Tests;

import Base.Hooks;
import Page.AccessoriesPage;
import Page.IndexPage;
import org.junit.Test;

public class AccessoriesTests extends Hooks {
    public IndexPage indexPage;
    public AccessoriesPage accessoriesPage;

    @Test
    public void accessoriesTestsForWomenAndMen() {
        indexPage = new IndexPage(getDriver());
        accessoriesPage = new AccessoriesPage(getDriver());

        indexPage.cancelPopupElement();
        indexPage.acceptCookiesElement();
        accessoriesPage.goToAccessoriesWomenBags();
        accessoriesPage.goToAccessoriesMenBags();
    }


}
