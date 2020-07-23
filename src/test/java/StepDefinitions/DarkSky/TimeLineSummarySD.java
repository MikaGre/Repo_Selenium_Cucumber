package StepDefinitions.DarkSky;

import Drivers.Web;
import Pages.Darksky.LandingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TimeLineSummarySD {
LandingPage landingPage = new LandingPage();

    @Then("^I scroll to Today timeline$")
    public void i_scroll_to_Today_timeline(){
        landingPage.scrollToTodayTimeline();
        landingPage.clickOnTodayTimeLine();
    }

    @When("^I verify the temp values on timeline is same as detail section$")
    public void i_verify_the_temp_values_on_timeline_is_same_as_detail_section(){
        String lowTemp = landingPage.getMinTempFromTodayTimeLine();
        String highTemp = landingPage.getMaxTempFromTodayTimeLine();
        String lowTempDetails = landingPage.getTodayTimeLineDetailsLowTemp();
        String highTempDetails = landingPage.getTodayTimeLineDetailsHighTemp();

        Assert.assertEquals(lowTemp,lowTempDetails,"lowTemp:" + lowTemp + "DetailsLow:" + lowTempDetails);
        Assert.assertEquals(highTemp,highTempDetails,"HighTemp:" + highTemp + "DetailsHigh:" + highTempDetails);
    }
}
