package e2e.Validations;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import com.aventstack.extentreports.Status;
import e2e.PageObjects.HomePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class HomeValidation {
    private WebDriver driver;
    private HomePage homePage;
    private Waits waits;

    public HomeValidation(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
        waits = new Waits(driver);
    }

    public void validationHomePage() {
        try {
            waits.loadElement(homePage.getPageTitle());
            String welcomeText = homePage.getPageTitle().getText();
            Assertions.assertEquals("Products", welcomeText);
            Report.log(Status.PASS, "Acessou a página home com sucesso", Screenshot.capture(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }
}
