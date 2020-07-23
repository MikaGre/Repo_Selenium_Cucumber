package StepDefinitions.Facebook;

import Drivers.Web;
import Pages.Facebook.LandingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class FBLinksSD {
LandingPage landingPage = new LandingPage();

    @When("^I click on Terms link$")
    public void i_click_on_Terms_link(){
        landingPage.clickOnTermsLink();
    }

    @Then("^I verify user is on 'Terms of Service' page title$")
    public void i_verify_user_is_on_Terms_of_Service_page_title() {
        landingPage.switchToNextPage();
        String actualTermsTitle = landingPage.getPageTitle();
        String expectedTermsTitle = "Terms of Service";
        System.out.println(actualTermsTitle);
        Assert.assertEquals(actualTermsTitle,expectedTermsTitle);
    }

    @Then("^I verify facebook landing page is open$")
    public void i_verify_facebook_landing_page_is_open(){
        Assert.assertTrue(landingPage.getAllWindowHandeles().size() <= 2);
    }

    @When("^I click on Data Policy link$")
    public void i_click_on_Data_Policy_link() {
        landingPage.clickOnDataLink();
    }


    @Then("^I verify user is on 'Data Policy' page title$")
    public void i_verify_user_is_on_Data_Policy_page_title(){
        landingPage.switchToNextPage();
        String dataTitle = landingPage.getPageTitle();
        Assert.assertEquals(dataTitle,"Data Policy");
    }

    @When("^I click on Cookie Policy link$")
    public void i_click_on_Cookie_Policy_link() {
        landingPage.clickOnCookiePolicyLink();
    }

    @Then("^I verify user is on 'Cookie Policy' page title$")
    public void i_verify_user_is_on_Cookie_Policy_page_title(){
        landingPage.switchToNextPage();
        String cookieTitle = landingPage.getPageTitle();
        Assert.assertEquals(cookieTitle,"Cookies Policy");
    }
}
