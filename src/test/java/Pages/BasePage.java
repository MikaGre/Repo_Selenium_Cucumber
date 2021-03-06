package Pages;

import Drivers.Web;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

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
        Web.getDriver().findElement(locator).clear();
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

    public void switchToFrame (String iFrame) {
        Web.getDriver().switchTo().frame(iFrame);
    }

    public void switchToFrame (By iFrameLocator) {
        WebElement frame = Web.getDriver().findElement(iFrameLocator);
        Web.getDriver().switchTo().frame(frame);
    }

    public void switchToAlert(){
        Web.getDriver().switchTo().alert();
    }

    public void acceptAlert(){
        Web.getDriver().switchTo().alert().accept();
    }

    public void dismissAlert(){
        Web.getDriver().switchTo().alert().dismiss();
    }

    public String getTextAlert(){
       return Web.getDriver().switchTo().alert().getText();
    }

    public void typeToAlert(String text) {
        Alert alert = Web.getDriver().switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }

    public void waitForElementVisible(By locator, int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(Web.getDriver(),timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForPageTitle(String title, int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(Web.getDriver(),timeOutInSeconds);
        wait.until(ExpectedConditions.titleIs(title));
    }

    public WebElement findElementUsingFluentWait(By locator){
        Wait fluentWait = new FluentWait<>(Web.getDriver())
                .withTimeout(Duration.ofSeconds(25))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(ElementNotInteractableException.class)
                .withMessage("Element is not found within 25 seconds");

        WebElement e = (WebElement) fluentWait.until(new Function<WebDriver,WebElement>() {
            public WebElement apply (WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return e;
    }

    public List <WebElement> findElementsUsingFluentWait(By locator){
        Wait fluentWait = new FluentWait<>(Web.getDriver())
                .withTimeout(Duration.ofSeconds(25))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(ElementNotInteractableException.class)
                .withMessage("Element is not found within 25 seconds");

       List<WebElement> e = (List<WebElement>) fluentWait.until((Function<WebDriver, List<WebElement>>) driver -> driver.findElements(locator));
        return e;
    }

    public void selectDateFromCalendar(By locator, String userDate) {
        List<WebElement> allDates = findElementsUsingFluentWait(locator);
        for (WebElement date : allDates) {
            if (date.getText().equals(userDate) ) {
                clickThis(date);
                break;
            }
        }
    }

   /* public void selectMonthFromCalendar(By locator, String userMonth) {
        List<WebElement> allMonths = findElementsUsingFluentWait(locator);
        for (WebElement month : allMonths) {
            if (month.getText().contains(userMonth)) {
                clickThis(month);
                break;
            }
        }
    }*/
    public void selectMonthFromCalendar(By mLocator, By dLocator, By nextButton, String userMonth) {
        WebElement month;
        String[] m = userMonth.split(" ");
        boolean isMonthVis = true;
        do {
            month = findElementUsingFluentWait(mLocator);
            if (month.getText().contains(m[0])) {
                selectDateFromCalendar(dLocator,m[1]);
                isMonthVis = false;
            } else {
                clickThis(nextButton);
            }
        } while (isMonthVis);

    }

}