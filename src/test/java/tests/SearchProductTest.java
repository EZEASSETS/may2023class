package tests;

import generic.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchProductTest extends BaseTest {



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

    @Test
    public void addToCart(){
        System.out.println("add to cart");

    }

    @Test
    public void addToCart2(){
        System.out.println("add to cart");

    }

    @Test
    public void addToCart3(){
        System.out.println("add to cart");

    }

}
