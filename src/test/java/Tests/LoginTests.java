package Tests;

import Base.Hooks;
import Page.IndexPage;
import Page.LoginPage;
import org.junit.Test;

public class LoginTests extends Hooks {

    public IndexPage indexPage;
    public LoginPage loginPage;

    @Test
    public void loginUserPage() {
        indexPage = new IndexPage(getDriver());
        loginPage = new LoginPage(getDriver());

        indexPage.cancelPopupElement();
        indexPage.acceptCookiesElement();
        loginPage.clickLoginTopBar();
        loginPage.login(inputData.get("email"), inputData.get("password"));
        loginPage.validateLoginSuccessful();
    }

}
