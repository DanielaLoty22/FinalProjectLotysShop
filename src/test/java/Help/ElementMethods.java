package Help;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethods {
    public WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element) {
        waitElement(element);
        element.click();
    }

    public void waitElement(WebElement element) {
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void fillElement(WebElement element, String value) {
        waitElement(element);
        element.sendKeys(value);
    }

    public void moveToElement(WebElement element) {
        waitElement(element);
        Actions Action = new Actions(driver);
        Action.moveToElement(element).perform();
    }

    public void validateElementText(WebElement element, String value) {
        waitElement(element);
        String actualErrorMessage = element.getText();
        Assert.assertEquals("Test passed", value, actualErrorMessage);
    }
}




