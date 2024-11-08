package Framework;

import Framework.Browser.DriverManager;
import Framework.Browser.TypeBrowser;
import Framework.Report.Report;
import Framework.Utils.FilesOperation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static Framework.Browser.DriverManager.quitDriver;

public class TestBase {
    private static WebDriver driver;
    private static FilesOperation filesOperation = new FilesOperation();

    public static WebDriver getDriver() {
        driver = DriverManager.getDriver(TypeBrowser.CHROME);
        return driver;
    }

    @BeforeEach
    public void setUp() throws IOException {
        String URL = filesOperation.getProperties("url").getProperty("url.index");
        getDriver().get(URL);
    }

    @AfterEach
    public void finish(){
        Report.close();
        quitDriver();
    }


}
