package e2e.Tasks;

import e2e.PageObjects.CheckoutTwoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.Double.parseDouble;

public class CheckoutTwoTask {
    private WebDriver driver;
    private CheckoutTwoPage checkoutTwoPage;
    public CheckoutTwoTask(WebDriver driver) {
        this.driver = driver;
        checkoutTwoPage = new CheckoutTwoPage(driver);
    }

    public double validarValoresCompra(){
        List<WebElement> itemPrices = checkoutTwoPage.valorItem();
        double totalSum = 0.0;
        for (WebElement priceElement : itemPrices) {
            String priceText = priceElement.getText().replace("$", "");
            double priceValue = parseDouble(priceText);
            totalSum += priceValue;
        }
        return totalSum;
    }

    public boolean compararTotalCompra(){
        String valorItens = checkoutTwoPage.itemTotal().getText().replace("Item total: $", "");
        String priceTextFinal = checkoutTwoPage.valorTotal().getText().replace("Total: $", "");
        String valorTaxa = checkoutTwoPage.valorTaxa().getText().replace("Tax: $", "");
        double priceFinalDouble = parseDouble(priceTextFinal);
        double valorItensDouble = parseDouble(valorItens);
        double valorTaxaDouble = parseDouble(valorTaxa);
        double itensMaisTaxa = valorItensDouble + valorTaxaDouble;

        return priceFinalDouble == itensMaisTaxa;

    }
}
