package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOnePage {
    private WebDriver driver;
    private Waits wait;

    public CheckoutOnePage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(this.driver);
    }

    public WebElement getNameInput(){
        return wait.visibilityOfElement(By.id("first-name"));
    }

    public WebElement getInputLastName(){
        return wait.visibilityOfElement(By.id("last-name"));
    }

    public WebElement getZipCode(){
        return wait.visibilityOfElement(By.id("postal-code"));
    }

    public WebElement getContinueButton(){
        return wait.visibilityOfElement(By.id("continue"));
    }

    public WebElement getCancelButton(){
        return wait.visibilityOfElement(By.id("cancel"));
    }
}
