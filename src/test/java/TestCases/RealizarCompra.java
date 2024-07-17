package TestCases;

import Framework.TestBase;
import Tasks.LoginTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompra extends TestBase {
    private WebDriver driver = getDriver();
    private LoginTask loginTask = new LoginTask(driver);
    @Test
    public void realizarCompraDoisProdutos(){
        loginTask.efetuarLogin();

    }
}
