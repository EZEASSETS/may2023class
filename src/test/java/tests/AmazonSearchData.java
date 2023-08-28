package tests;

import org.testng.annotations.DataProvider;

public class AmazonSearchData {


    @DataProvider(name = "searchData")
    public Object[][] searchData() {
        Object[][] searchTestData = new Object[][]{
                {"macbook"}, {"samsung"}
        };

        return searchTestData;

    }
}