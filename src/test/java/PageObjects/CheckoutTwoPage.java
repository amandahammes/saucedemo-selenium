package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.WebDriver;

public class CheckoutTwoPage {
    private WebDriver driver;
    private Waits wait;

    public CheckoutTwoPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(this.driver);
    }


}
