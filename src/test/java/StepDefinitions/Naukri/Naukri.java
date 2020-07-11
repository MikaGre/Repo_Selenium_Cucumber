package StepDefinitions.Naukri;

import Drivers.Web;
import Pages.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Naukri extends BasePage {
   String primWindow = null;

   @Given("^Launch www.naukri.com$")
    public void launch() {
        Web.initDriver("https://www.naukri.com");
    }

    @Given("^Print title of all windows$")
    public void print_title_of_all_windows(){
        primWindow = getCurrentWindowHandel();
        System.out.println(getPageTitle());
        for (String h:getAllWindowHandeles()) {
            if (!h.equals(primWindow)) {
                switchWindow(h);
            }
        }
        System.out.println(getPageTitle());
    }

    @Then("^Close all advertisements windows EXCEPT main window$")
    public void close_all_advertisements_windows_EXCEPT_main_window_naukri_com_window()  {
        Web.getDriver().close();
        switchWindow(primWindow);

    }


}
