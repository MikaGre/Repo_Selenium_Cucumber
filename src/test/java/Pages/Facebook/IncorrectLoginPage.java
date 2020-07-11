package Pages.Facebook;


import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;

public class IncorrectLoginPage extends BasePage {
    By errorMessageLocator = By.xpath("//div[@role='alert']");

    public String getErrorMessage(){
       return getTextFromElement(errorMessageLocator);
    }
}
