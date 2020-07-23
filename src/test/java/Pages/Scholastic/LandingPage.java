package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {
    By accountIconLocator = By.className("desktop-only");

    public void clickOnAccountIcon () {
        clickThis(accountIconLocator);
    }


}
