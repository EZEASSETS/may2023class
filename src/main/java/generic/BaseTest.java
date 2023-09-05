package generic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ReadPropertyFile;

import java.io.IOException;
import java.util.Map;

public class BaseTest {

    public static WebDriver driver;
    public static Map<String, String> config;

    @BeforeMethod(alwaysRun = true)
    public void createDriver() throws IOException {
        loadConfig();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
options.setHeadless(true);
        driver = new ChromeDriver(options);
        System.out.println(" Before Method - Create Driver");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        driver.quit();
    }


    public static void loadConfig() throws IOException {
        String configFile = System.getProperty("config");

        ReadPropertyFile readPropertyFile = new ReadPropertyFile();
         config = readPropertyFile.getProperties(configFile);

    }
}
