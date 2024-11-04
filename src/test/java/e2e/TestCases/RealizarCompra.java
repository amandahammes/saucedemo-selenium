package e2e.TestCases;

import Framework.TestBase;
import e2e.Tasks.*;
import e2e.Validations.HomeValidation;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompra extends TestBase {
    private WebDriver driver = getDriver();
    private LoginTask loginTask = new LoginTask(driver);
    private HomeTask homeTask = new HomeTask(driver);
    private CartTask cartTask = new CartTask(driver);
    private HomeValidation homeValidation = new HomeValidation(driver);
    private CheckoutOneTask checkoutOneTask = new CheckoutOneTask(driver);
    private CheckoutTwoTask checkoutTwoTask = new CheckoutTwoTask(driver);
    @Test
    public void realizarCompraDeUmProduto(){
        loginTask.efetuarLogin();
        homeValidation.validationHomePage();
        homeTask.selecionarSauceLabBackPack();
        homeTask.irParaCarrinhoDeCompras();
        cartTask.fazerCheckout();
        checkoutOneTask.realizarCheckout();
        checkoutTwoTask.validarValoresCompra();
        checkoutTwoTask.compararTotalCompra();
    }
}
