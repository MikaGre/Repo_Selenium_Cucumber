package Pages.Hotels;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HotelsLandPage extends BasePage {
    By searchBoxLocator = By.id("qf-0q-destination");
    By searchButtonLocator = By.xpath("//button[@type='submit']");
    By autoSuggestionLocator = By.xpath("//div[@class='autosuggest-category-result']");


    public void enterTextInSearchBox(String place){
        type(searchBoxLocator,place);
    }

    public void clickSearchButton(){
        clickThis(searchButtonLocator);
    }

    public void selectDestinationFromAutoSuggestion(String value){
        selectFromAutoSuggestions(autoSuggestionLocator,value);
    }


}
