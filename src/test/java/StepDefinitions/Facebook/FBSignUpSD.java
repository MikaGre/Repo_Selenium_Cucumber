package StepDefinitions.Facebook;

import Drivers.Web;
import Pages.Facebook.LandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class FBSignUpSD {
    LandingPage landingPage = new LandingPage();

    @And("^I enter '(.*)' as First name$")
    public void i_enter_Test_as_First_name(String firstName) {
        landingPage.enterSignUpFirstName(firstName);
    }

    @And("^I enter '(.*)' as Last name$")
    public void i_enter_test_as_Last_name(String lastName) {
       landingPage.enterSignUpLastName(lastName);
    }

    @And("^I enter '(.*)' as email$")
    public void i_enter_tttest_aol_com_as_email(String email){
       landingPage.enterSignUpEmail(email);
    }

    @And("^I enter '(.*)' for password$")
    public void i_enter_password_for_password(String password) {
       landingPage.enterSignUpPassword(password);
    }

    @And("^I select '(female|male|custom)' for Gender$")
    public void i_select_female_for_Gender(String gender) {
        landingPage.selectGender(gender);
    }

    @And("^I select '(.*)' for birthday$")
    public void i_select_for_birthday(String birthday) throws Throwable {
        String[] bday = birthday.split("\\.");
        landingPage.selectBirthdayMonth(bday[0]);
        landingPage.selectBirthdayDay(bday[1]);
        landingPage.selectBirthdayYear(bday[2]);
    }

    @Then("^I press the sign up button$")
    public void i_press_the_sign_up_button() throws Throwable {
       landingPage.clickSignUpSubmitButton();

    }

}
