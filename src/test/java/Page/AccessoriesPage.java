package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccessoriesPage extends BasePage {
    @FindBy(css = "#menu-item-45487 > a")
    private WebElement accessoriesElement;
    @FindBy(css = "#menu-item-45488")
    private WebElement bagsandluggageElement;
    @FindBy(css = "#menu-item-45490")
    private WebElement womensBagsAndLuggage;
    @FindBy(css = "#menu-item-45487 > a")
    private WebElement accessoriesElement2;
    @FindBy(css = "#menu-item-45488")
    private WebElement bagsandluggageElement2;
    @FindBy(css = "#menu-item-45489")
    private WebElement mensBagsAndLuggage;

    public AccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public void goToAccessoriesWomenBags() {
        elementMethods.moveToElement(accessoriesElement);
        elementMethods.moveToElement(bagsandluggageElement);
        elementMethods.clickElement(womensBagsAndLuggage);
    }

    public void goToAccessoriesMenBags() {
        elementMethods.moveToElement(accessoriesElement2);
        elementMethods.moveToElement(bagsandluggageElement2);
        elementMethods.clickElement(mensBagsAndLuggage);
    }
}
