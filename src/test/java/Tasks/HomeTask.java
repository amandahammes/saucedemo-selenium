package Tasks;

import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeTask {

    private WebDriver driver;
    private HomePage homePage;

    public HomeTask(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(this.driver);
    }

    public void selecionarSauceLabBackPack(){
        homePage.getSauceLabsBackpack().click();
        homePage.getCartButton().click();
    }
}
