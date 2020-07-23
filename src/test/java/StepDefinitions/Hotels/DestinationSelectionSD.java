package StepDefinitions.Hotels;

import Drivers.Web;
import Pages.Hotels.HotelsLandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DestinationSelectionSD {
    HotelsLandingPage landingPage = new HotelsLandingPage();
    String numOfNights = null;

    @And("^I enter check in '(\\d+)/(\\d+)/(\\d+)' and check out '(\\d+)/(\\d+)/(\\d+)'$")
    public void iEnterCheckInAndCheckOut (int monthIN, int dayIN, int yearIN, int monthOut, int dayOut, int yearOut) {
        landingPage.enterCheckInDate(monthIN,dayIN,yearIN);
        landingPage.enterCheckOutDate(monthOut,dayOut,yearOut);


       // String checkInDate = "" + monthIN + "-" + dayIN + "-" + yearIN + "";
       // String checkOutDate = "" + monthOut + "-" + dayOut + "-" + yearOut + "";

        //LocalDate in = LocalDate.parse(checkInDate);
        //LocalDate out = LocalDate.parse(checkOutDate);

        //long nights = ChronoUnit.DAYS.between(in,out);
       // numOfNights = String.valueOf(nights);

    }

    @Then("^I verify the days icon is accurate$")
    public void iVerifyTheDaysIconIsAccurate () {
      String numNightsIcon = landingPage.getTextFromNumNightsIcon();
        Assert.assertEquals(numOfNights,numNightsIcon,"The number of nights are not equal");
    }

    @And("^I close the popup window$")
    public void iCloseThePopupWindow () {
        landingPage.closePopUpWindow();
    }
}
