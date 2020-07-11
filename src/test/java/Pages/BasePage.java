package Pages;

import Drivers.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class BasePage {


    //generic method to write to/on web element
    public void type (By locator, String data) {
        Web.getDriver().findElement(locator).sendKeys(data);
    }

    public void typeJS (By locator, String text) {
        WebElement element = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("arguments[0].values='%s';", element, text);
    }

    //generic method to click web element
    public void clickThis (By locator) {
        Web.getDriver().findElement(locator).click();
    }

    public void clickThis (WebElement locator) {
        locator.click();
    }

    public void clickThisJS (By locator) {
        WebElement element = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    //generic method to get text from element
    public String getTextFromElement (By locator) {
        return Web.getDriver().findElement(locator).getText();
    }

    //generic method to get attribute value from web element
    public String getAttributeValueFromElement (By locator, String attributeName) {
        return Web.getDriver().findElement(locator).getAttribute(attributeName);
    }

    //generic method to select any value from dropdown using selectByVisible Text

    public void selectFromDropDownVisibleText (By locator, String visibleText) {
        WebElement dropDownElement = Web.getDriver().findElement(locator);
        Select dropDown = new Select(dropDownElement);
        dropDown.selectByVisibleText(visibleText);
    }

    public void isEnabled (By locator) {
        Web.getDriver().findElement(locator).isEnabled();
    }

    public void isDisplayed (By locator) {
        Web.getDriver().findElement(locator).isDisplayed();
    }

    public void mouseHoverOverElement (By locator) {
        WebElement element = Web.getDriver().findElement(locator);
        Actions actions = new Actions(Web.getDriver());
        actions.moveToElement(element).build().perform();
    }

    public void mouseHoverOverElementAndClick (By targetToHover, By targetToClick) {
        WebElement element = Web.getDriver().findElement(targetToHover);
        WebElement clickOnElement = Web.getDriver().findElement(targetToClick);
        Actions actions = new Actions(Web.getDriver());
        actions.moveToElement(element).moveToElement(clickOnElement).click().build().perform();
    }

    public void dragAndDropElement (By sourceLocator, By targetLocator) {
        Actions actions = new Actions(Web.getDriver());
        WebElement sourceElement = Web.getDriver().findElement(sourceLocator);
        WebElement targetElement = Web.getDriver().findElement(targetLocator);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
    }

    public void rightClickOnElement (By locator) {
        Actions actions = new Actions(Web.getDriver());
        WebElement rightClickOnElement = Web.getDriver().findElement(locator);
        actions.contextClick(rightClickOnElement).build().perform();
        actions.release().build().perform();
    }

    public void selectFromAutoSuggestions (By locator, String textToSelect) {
        List<WebElement> autoSuggestions = Web.getDriver().findElements(locator);
        for (WebElement e : autoSuggestions) {
            String text = e.getText();
            if (text.equalsIgnoreCase(textToSelect)) {
                clickThis(e);
                break;
            }
        }
    }

    public void clearField (By locator) {
        Web.getDriver().findElement(locator).click();
    }

    public String getFirstNumberFromListOfResults (By locator) {
        String value = null;
        List<WebElement> results = Web.getDriver().findElements(locator);
        for (WebElement e : results) {
            value = e.getText();
            break;
        }
        return value;
    }

    public void scrollByPixelHorziontally (int x) {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("scrollBy(" + x + ",0)");
    }

    public void scrollByPixelVertically (int y) {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("scrollBy(0," + y + ")");
    }

    public void scrollToElement (By locator) {
        WebElement element = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollToBottom () {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public String getCurrentWindowHandel () {
        return Web.getDriver().getWindowHandle();
    }

    public Set<String> getAllWindowHandeles () {
        return Web.getDriver().getWindowHandles();
    }

    public void switchWindow (String windowHandle) {
        Web.getDriver().switchTo().window(windowHandle);
    }

    public String getPageTitle () {
        return Web.getDriver().getTitle();
    }
}