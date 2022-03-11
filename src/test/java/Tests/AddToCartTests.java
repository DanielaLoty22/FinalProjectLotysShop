package Tests;

import Base.Hooks;
import Page.AddToCartPage;
import Page.IndexPage;
import org.junit.Test;

public class AddToCartTests extends Hooks {
    public IndexPage indexPage;
    public AddToCartPage addToCartPage;


    @Test
    public void addToCartFunctionality() {
        indexPage = new IndexPage(getDriver());
        addToCartPage = new AddToCartPage(getDriver());
        indexPage.cancelPopupElement();
        indexPage.acceptCookiesElement();
        addToCartPage.goToShopNow();
        addToCartPage.choiceTheProduct();
        addToCartPage.choiceTheProductColor();
        addToCartPage.addProductToCart();
        addToCartPage.goToViewCart();
        addToCartPage.removeProductFromCart();
        addToCartPage.validateEmptyCartMessage(inputData.get("message"));
    }
}
