package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;
    private Waits wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(this.driver);
    }

    public WebElement removerBackPack(){
        return wait.visibilityOfElement(By.id("remove-sauce-labs-backpack"));
    }

    public WebElement fazerCheckout(){
        return wait.visibilityOfElement(By.id("checkout"));
    }

    public WebElement continuarComprando(){
        return wait.visibilityOfElement(By.id("continue-shopping"));
    }

    public WebElement irParaMenu() {
        return wait.visibilityOfElement(By.id("react-burger-menu-btn"));
    }

    public WebElement visualizarListaItens() {
        return wait.visibilityOfElement(By.id("inventory_sidebar_link"));
    }

    public WebElement visualizarSobreSauceDemo() {
        return wait.visibilityOfElement(By.id("about_sidebar_link"));
    }

    public WebElement fazerLogout() {
        return wait.visibilityOfElement(By.id("logout_sidebar_link"));
    }

    public WebElement resetarCompras() {
        return wait.visibilityOfElement(By.id("reset_sidebar_link"));
    }
}
