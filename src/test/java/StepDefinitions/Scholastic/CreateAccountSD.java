package StepDefinitions.Scholastic;

import Drivers.Web;
import Pages.Scholastic.LandingPage;
import Pages.Scholastic.LoginPage;
import Pages.Scholastic.SignUpPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateAccountSD {
    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();


    @Given("^User is on Scholastic home page$")
    public void user_is_on_Scholastic_home_page(){
        Web.initDriver("https://www.scholastic.com/");
    }

    @Given("^User selects Account icon$")
    public void user_selects_Account_icon() {
        landingPage.clickOnAccountIcon();
    }

    @Given("^User Clicks Register$")
    public void user_Clicks_Register() {
        loginPage.clickOnRegisterButton();
    }

    @Then("^User enters '(.+)','(.+)','(.+@.+\\.com)'$")
    public void user_enters_Test_seamore_tsea_gmail_com(String fName, String lName, String email) {
        signUpPage.enterFname(fName);
        signUpPage.enterLname(lName);
        signUpPage.enterEmail(email);

    }

    @Then("^User clicks next button$")
    public void user_clicks_next_button() {
        signUpPage.clickNext();
    }


    @Then("^User enters '(.+)' and confirms password$")
    public void userEntersPasswordAndConfrimsPassword (String password) {
        signUpPage.enterPassword(password);
        signUpPage.enterConfirmPassword(password);
    }

    @Then("^User clicks on terms Of User check box$")
    public void user_clicks_on_terms_Of_User_check_box() {
        signUpPage.clickTermsOfUse();
    }


}
