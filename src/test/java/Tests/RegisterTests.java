package Tests;

import Base.Hooks;
import Page.IndexPage;
import Page.RegisterPage;
import org.junit.Test;

public class RegisterTests extends Hooks {

    public IndexPage indexPage;
    public RegisterPage registerPage;


    @Test
    public void setRegisterPage(){
        indexPage= new IndexPage(getDriver());
        registerPage=new RegisterPage(getDriver());


        indexPage.cancelPopupElement();
        indexPage.acceptCookiesElement();

        registerPage.clickLoginTopBar();
        registerPage.fillEmailUser(inputData.get("email"));
        registerPage.accountCreate();
        registerPage.validateErrorMessage(inputData.get("message"));
    }
}
