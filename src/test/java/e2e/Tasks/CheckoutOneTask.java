package e2e.Tasks;

import com.github.javafaker.Faker;
import e2e.PageObjects.CheckoutOnePage;
import org.openqa.selenium.WebDriver;

public class CheckoutOneTask {
    private WebDriver driver;
    private CheckoutOnePage checkoutOnePage;
    public CheckoutOneTask(WebDriver driver) {
        this.driver = driver;
        checkoutOnePage = new CheckoutOnePage(driver);
    }

    public void realizarCheckout(){
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String postalCode = faker.address().zipCode();

        checkoutOnePage.getNameInput().sendKeys(firstName);
        checkoutOnePage.getInputLastName().sendKeys(lastName);
        checkoutOnePage.getZipCode().sendKeys(postalCode);
        checkoutOnePage.getContinueButton().click();
    }

}
