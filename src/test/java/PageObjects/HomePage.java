package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private Waits wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(this.driver);
    }

    public WebElement getSauceLabsBackpack() {
        return wait.visibilityOfElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getSauceLabsBikeLight(){
        return wait.visibilityOfElement(By.id("add-to-cart-sauce-labs-bike-light"));
    }

    public WebElement getSauceLabsBoltTshirt(){
        return wait.visibilityOfElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    }

    public WebElement getSauceLabsFleeceJacket(){
        return wait.visibilityOfElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    }

    public WebElement getSauceLabsOnesie(){
        return wait.visibilityOfElement(By.id("add-to-cart-sauce-labs-onesie"));
    }

    public WebElement getTestTshitRed(){
        return wait.visibilityOfElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    }

    public WebElement getCartButton(){
        return wait.visibilityOfElement(By.className("shopping_cart_link"));
    }
}
