package e2e.Tasks;

import e2e.PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }

    public void efetuarLogin(){
        loginPage.getUserNameTextField().sendKeys("standard_user");
        loginPage.getPasswordTextField().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();
    }
}
