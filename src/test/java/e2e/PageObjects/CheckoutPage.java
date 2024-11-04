package e2e.PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private WebDriver driver;
    private Waits wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(this.driver);
    }

    public WebElement removerBackPack(){
        return wait.visibilityOfElement(By.id("remove-sauce-labs-backpack"));
    }
}
