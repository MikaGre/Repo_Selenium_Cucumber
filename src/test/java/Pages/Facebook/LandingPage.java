package Pages.Facebook;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {
    //Locators for web-element on Landing Page
    By loginEmailLocator = By.id("email");
    By loginPasswordLocator = By.id("pass");
    By loginButtonLocator = By.id("loginbutton");
    By signUpFirstName = By.xpath("//input[@name='firstname']");
    By signUpLastName = By.xpath("//input[@name='lastname']");
    By signUpEmail =  By.xpath("//input[@name='reg_email__']");
    By signUpPassword = By.xpath("//input[@name='reg_passwd__']");
    By signUpSubmitButton = By.xpath("//button[@name='websubmit']");
    By monthDropDown = By.id("month");
    By dayDropDown = By.id("day");
    By yearDropDown = By.id("year");
    String gender = null;
    String genderButtonXpath = "//label[text()='" + gender + "']/preceding-sibling::input";
    By genderRadioButton = By.xpath(genderButtonXpath);


    //methods to interact with Landing Page Elements
    public void getFacebookLandingPage() {
        Web.initDriver("https://www.facebook.com/");
    }

    public void enterLoginEmail (String email) {
        type(loginEmailLocator,email);
    }

    public void enterLoginPassword(String userPassword) {
        type(loginPasswordLocator,userPassword);
    }

    public void clickLoginButton(){
        clickThis(loginButtonLocator);
    }

    public void enterSignUpFirstName(String firstName){
        type(signUpFirstName,firstName);
    }

    public void enterSignUpLastName(String lastName){
        type(signUpLastName,lastName);
    }

    public void enterSignUpPassword(String password){
        type(signUpPassword,password);
    }

    public void clickSignUpSubmitButton(){
        clickThis(signUpSubmitButton);
    }

    public void enterSignUpEmail(String email){
        type(signUpEmail,email);
    }

    public void selectGender (String gender) {
        String genderButtonXpath = "//label[text()='" + gender + "']/preceding-sibling::input";
        clickThis(genderRadioButton);

    }

    public void selectBirthdayMonth(String month) {
        selectFromDropDownVisibleText(monthDropDown,month);
    }

    public void selectBirthdayDay(String day) {
        selectFromDropDownVisibleText(dayDropDown,day);
    }

    public void selectBirthdayYear(String year) {
        selectFromDropDownVisibleText(yearDropDown,year);
    }

    public boolean isLoginButtonEnabled(){
        return Web.getDriver().findElement(loginButtonLocator).isEnabled();
    }

    public boolean isSignUpButtonEnabled(){
        return Web.getDriver().findElement(signUpSubmitButton).isEnabled();
    }
}
