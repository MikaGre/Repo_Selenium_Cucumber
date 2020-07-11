package Pages.Darksky;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LandingPage extends BasePage {
    By feelsLikeTempDegreesLocator = By.xpath("//span[@class='feels-like-text']");
    By lowTempDegreesLocator = By.xpath("//span[@class='low-temp-text']");
    By highTempDegreesLocator = By.xpath("//span[@class='high-temp-text']");
    By mapTempUnitsLocator = By.id("map_units");
    By tempUnitLocator = By.xpath("//div[@class='selectric-wrapper selectric-units selectric-below selectric-open']//b[@class='button']");
    String tUnit = null;
    By unitMPHSelection = By.xpath("//div[@class='selectric-wrapper selectric-units selectric-below selectric-open']//li[@class='last'][contains(text(),'" + tUnit + "')]");

    public boolean isFeelsLikeTempisDisplayed(){
         return Web.getDriver().findElement(feelsLikeTempDegreesLocator).isDisplayed();
    }

    public boolean isLowTempisDisplayed(){
         return Web.getDriver().findElement(lowTempDegreesLocator).isDisplayed();
    }

    public boolean isHighTempisDisplayed(){
         return Web.getDriver().findElement(highTempDegreesLocator).isDisplayed();
    }

    public int getFeelsLikeTemp(){
        String feelsLikeTempDegrees = Web.getDriver().findElement(feelsLikeTempDegreesLocator).getText();
        String[] feelsLikeTemp = feelsLikeTempDegrees.split("\\W");
        return Integer.parseInt(feelsLikeTemp[0]);
    }

    public int getLowTemp(){
        String lowTempDegrees = Web.getDriver().findElement(lowTempDegreesLocator).getText();
        String[] lowTemp = lowTempDegrees.split("\\W");
        return Integer.parseInt(lowTemp[0]);
    }

    public int getHighTemp(){
        String highTempDegrees = Web.getDriver().findElement(highTempDegreesLocator).getText();
        String[] highTemp = highTempDegrees.split("\\W");
        return Integer.parseInt(highTemp[0]);
    }

    public void selectTempUnitFromMapDropDown (String tempUnit){
        Select tempUnitsDropDown = new Select((WebElement) mapTempUnitsLocator);
        tempUnitsDropDown.selectByVisibleText(tempUnit.toUpperCase());
    }

    public void selectTempFromNavDropDown(String tempUnit) throws InterruptedException {
         tUnit = tempUnit;
         clickThis(Web.getDriver().findElement(tempUnitLocator));
         Thread.sleep(1000);
         clickThis(Web.getDriver().findElement(unitMPHSelection));
    }
}
