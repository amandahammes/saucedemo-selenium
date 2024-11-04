package e2e.PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutTwoPage {
    private WebDriver driver;
    private Waits wait;

    public CheckoutTwoPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(this.driver);
    }

    public List<WebElement> valorItem(){
        return wait.waitForElementsPresence(By.cssSelector("[data-test='inventory-item-price']"));
    }

    public WebElement valorTotal(){
        return wait.waitForElementPresence(By.className("summary_total_label"));
    }

    public WebElement itemTotal(){
        return wait.waitForElementPresence(By.className("summary_subtotal_label"));
    }

    public WebElement valorTaxa(){
        return wait.waitForElementPresence(By.className("summary_tax_label"));
    }
}
