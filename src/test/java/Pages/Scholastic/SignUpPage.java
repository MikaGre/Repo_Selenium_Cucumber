package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class SignUpPage extends BasePage {
    By fnameLocator = By.xpath("//input[contains(@placeholder,'First name')]");
    By lnameLocator = By.xpath("//input[contains(@placeholder,'Last name')]");
    By emailLocator = By.xpath("//input[contains(@placeholder,'Email address')]");
    By nextButtonLocator = By.id("nextButton");
    By passwordLocator = By.name("password");
    By confirmPasswordLocator = By.name("confirmPassword");
    By termsOfUseLocator = By.xpath("//div[contains(@class,'mysch-input-checkbox')]//label");

    public void enterFname(String fName){
        type(fnameLocator,fName);
    }

    public void enterLname(String lName){
        type(lnameLocator,lName);
    }

    public void enterEmail(String email){
        type(emailLocator,email);
    }

    public void enterPassword(String password){
        type(passwordLocator,password);
    }

    public void enterConfirmPassword(String confirmPassword){
        type(confirmPasswordLocator, confirmPassword);
    }

    public void clickNext () {
        clickThis(nextButtonLocator);
    }

    public void clickTermsOfUse () {
        clickThis(termsOfUseLocator);
    }

}
