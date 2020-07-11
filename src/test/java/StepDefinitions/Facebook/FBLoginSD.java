package StepDefinitions.Facebook;

import Drivers.Web;
import Pages.Facebook.IncorrectLoginPage;
import Pages.Facebook.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class FBLoginSD {
LandingPage landingPage = new LandingPage();
IncorrectLoginPage incorrectLoginPage = new IncorrectLoginPage();


    @Given("^I am on Facebook landing Page$")
    public void iAmOnFacebookLandingPage () {
        Web.initDriver("https://www.facebook.com/");
    }

    @When("^I enter '(.*)' as username$")
    public void i_enter_username(String email) {
      landingPage.enterLoginEmail(email);
    }

    @When("^I enter '(.*)' as password$")
    public void i_enter_password(String password) {
        landingPage.enterLoginPassword(password);
    }

    @When("^I click on signin button$")
    public void i_click_on_signin_button() {
        landingPage.clickLoginButton();
    }

    @Then("^I verify invalid credentials error message$")
    public void i_verify_invalid_credentials_error_message() throws InterruptedException {
        Thread.sleep(1000);
        String actualmessage = incorrectLoginPage.getErrorMessage();
        String expectedMessage = "The email or phone number you’ve entered doesn’t match any account. Sign up for an account.";
        Assert.assertEquals(actualmessage,expectedMessage,"Error message did not match");
    }


    @Then("^I verify '(login|signup)' button is enabled$")
    public void iVerifyLoginOrSignupButtonIsEnabled (String button) {
        switch (button){
            case "login":
                landingPage.isLoginButtonEnabled();
                break;
            case "sign":
                landingPage.isSignUpButtonEnabled();
                break;

        }
    }
}
