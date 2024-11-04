package e2e.Tasks;

import e2e.PageObjects.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeTask {

    private WebDriver driver;
    private HomePage homePage;

    public String descricaoSauceLabBackPack;

    public HomeTask(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(this.driver);
    }

    public void selecionarSauceLabBackPack() {
        homePage.getSauceLabsBackpack().click();
    }

    public void selecionarSauceLabsFleeceJacket() {
        homePage.getSauceLabsFleeceJacket().click();
    }

    public void irParaCarrinhoDeCompras() {
        homePage.getCartButton().click();
    }
}
