package StepDefinitions.Hotels;
import Pages.Hotels.HotelsLandingPage;
import Utils.DateHelper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CalenderSD  {
    HotelsLandingPage landingPage = new HotelsLandingPage();
    String date = null;

    @Then("^I verify (.+) count on the briefcase$")
    public void iVerifyCountOnTheBriefcase (String days) {
        Assert.assertEquals(landingPage.getTextFromNumNightsIcon(),days);
    }

    @And("^I enter (\\d+) days from '(tomorrow|today)' as checkout$")
    public void iEnterDaysFromTomorrowAsCheckout (int days, String t) {
        landingPage.clickCheckOutCalendarIcon();
        if (t.equalsIgnoreCase("tomorrow")) {
           landingPage.selectCheckOutDate(landingPage.selectDateXamountOfDaysFromTomorrow(days));
        } else if (t.equalsIgnoreCase("today")){
            landingPage.selectCheckOutDate(landingPage.selectDateXamountOfDaysFromToday(days));
        }
    }

    @When("^I enter (.+) as check in$")
    public void iEnterCheckInAsCheckIn (String checkInDate){
        String[] ch = checkInDate.split(" ");
        date = ch[1];
        landingPage.clickCheckInCalendarIcon();
        if (checkInDate.equalsIgnoreCase("today")) {
            landingPage.selectCheckInDate(DateHelper.getCurrentDateValue());
        } else if (checkInDate.equalsIgnoreCase("tomorrow")) {
            landingPage.selectCheckInDate(DateHelper.getTomorrowDateValue());
        } else {
            landingPage.selectMonthFromCalender(checkInDate);
        }
    }


    @And("^I enter (.+) days from check in date$")
    public void iEnterDaysDaysFromCheckInDate ( int days) {
        landingPage.clickCheckOutCalendarIcon();
        System.out.println(DateHelper.getDateValueXDaysFromXDate(date,days));
        landingPage.selectCheckOutDate(DateHelper.getDateValueXDaysFromXDate(date,days));
    }
}
