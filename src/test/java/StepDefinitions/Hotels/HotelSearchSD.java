package StepDefinitions.Hotels;

import Drivers.Web;
import Pages.Hotels.HotelsLandingPage;
import Pages.Hotels.SelectionDetailsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HotelSearchSD {
    HotelsLandingPage hotelsLandPage = new HotelsLandingPage();
    SelectionDetailsPage detailsPage = new SelectionDetailsPage();
    String destinationSelection = null;

    @Given("^I am on hotels landing page$")
    public void i_am_on_hotels_landing_page() {
        Web.initDriver("https://www.hotels.com/");
        hotelsLandPage.closePopUpWindow();
    }


    @When("^I enter '(.*)' in search$")
    public void i_enter_string_in_search(String destination)  {
        hotelsLandPage.enterTextInSearchBox(destination);

    }

    @And("^I select '(.*)' from autosuggestions$")
    public void i_select_from_autosuggestions(String selection){
        destinationSelection = selection;

        hotelsLandPage.selectDestinationFromAutoSuggestion(selection);
    }

    @And("^I click on Search button$")
    public void i_click_on_Search_button() {
        hotelsLandPage.clickSearchButton();
    }

    @Then("^I verify search result header is the same as text selected from auto suggestion$")
    public void i_see_search_result_header_as_text_selected_from_auto_suggestion() {
        Assert.assertEquals(destinationSelection, detailsPage.getDestinationHeader(), "Search Result header didn't match");
    }

    @And("^I verify text under 'Destination, property, or landmark' as text selected from auto suggestion$")
    public void i_see_text_under_Destination_property_or_landmark_as_text_selected_from_auto_suggestion() {
        Assert.assertEquals(destinationSelection, detailsPage.getDestinationPropertyLandmarkText(), "Text under Destination, Property and Landmark didn't match   ");
    }

    @When("^I hover over Sort By Price and click Low to High$")
    public void i_hover_my_mouse_over_sort_by_Price() {
        detailsPage.hoverAndClickOnLowtoHigh();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Then("^^I verify the cheapest hotel is less than \\$'(\\d+)'$")
    public void i_verify_the_cheapest_hotel_is_less_than_$(int priceToCompare)  {
        WebDriverWait wait = new WebDriverWait(Web.getDriver(),10);
        String []valueOfLowestPrice = detailsPage.isLowestPriceFromResultsLessThan().split("\\$");

     int v = Integer.parseInt(valueOfLowestPrice[1]);
     Assert.assertTrue(priceToCompare > v,"The lowest price is higher than $100");
    }


}
