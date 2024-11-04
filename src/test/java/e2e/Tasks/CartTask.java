package e2e.Tasks;

import e2e.PageObjects.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartTask {
    private WebDriver driver;
    private CartPage cartPage;

    public CartTask(WebDriver driver) {
        this.driver = driver;
        cartPage = new CartPage(this.driver);
    }

    public void fazerCheckout(){
        cartPage.fazerCheckout().click();
    }
}
