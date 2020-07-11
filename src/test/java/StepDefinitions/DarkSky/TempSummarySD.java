package StepDefinitions.DarkSky;

import Drivers.Web;
import Pages.Darksky.LandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TempSummarySD {
    LandingPage landingPage = new LandingPage();
    int feelsLikeTemp;
    int lowTemp;
    int highTemp;

    @Given("^I am on darksky landing page$")
    public void i_am_on_darksky_landing_page() {
        Web.initDriver("https://darksky.net/");
    }

    @Then("^I verify feelsLike, low and high temp values are displayed$")
    public void i_verify_feelsLike_low_and_high_temp_values_are_displayed() {
        landingPage.isFeelsLikeTempisDisplayed();
        landingPage.isLowTempisDisplayed();
        landingPage.isHighTempisDisplayed();
        feelsLikeTemp = landingPage.getFeelsLikeTemp();
        lowTemp = landingPage.getLowTemp();
        highTemp = landingPage.getHighTemp();

    }

    @When("^I select ˚C, mph temp unit from dropdown$")
    public void i_select_from_temp_unit_dropdown() {
    landingPage.selectCTempFromNavDropDown();
    }

    @Then("^I verify feelsLike, low and high temp values changed as per unit selected$")
    public void i_verify_feelsLike_low_and_high_temp_values_changed_as_per_unit_selected() {
        Assert.assertNotEquals(landingPage.getFeelsLikeTemp(), feelsLikeTemp);
        Assert.assertNotEquals(landingPage.getLowTemp(), lowTemp);
        Assert.assertNotEquals(landingPage.getHighTemp(), highTemp);
    }

}
