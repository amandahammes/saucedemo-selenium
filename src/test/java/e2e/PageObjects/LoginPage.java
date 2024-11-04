package e2e.PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private Waits wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new Waits(this.driver);
    }

    public WebElement getUserNameTextField() {
        return wait.visibilityOfElement(By.id("user-name"));
    }

    public WebElement getPasswordTextField(){
        return wait.visibilityOfElement(By.id("password"));
    }

    public WebElement getLoginButton(){
        return wait.visibilityOfElement(By.id("login-button"));
    }

}
