package tests;

import generic.BaseTest;
import generic.Element;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchProduct extends BaseTest {



    @Test(dataProvider = "searchData", dataProviderClass = AmazonSearchData.class)
    public void validateSearch(String search) throws InterruptedException {
      //  driver.get("https://www.amazon.in");
       // driver.get("https://www.amazon.com");

        driver.get(config.get("url"));

        HomePage homePage = new HomePage();
        homePage.searchProduct(search);
        String expectedData = homePage.getFirstResultData();

        Assert.assertTrue(expectedData.toLowerCase().contains(search), "Search data not found");

    }




}
