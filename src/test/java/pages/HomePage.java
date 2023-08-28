package pages;

import generic.Element;
import org.openqa.selenium.By;

public class HomePage extends  Element{

    By searchTextInput = By.id ("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");
    By searchResultFirstRow = By.xpath("(//div[@data-index='3']//a[contains(@class,'a-text-normal')])[1]/span");

   /// public±±±±


    public void searchProduct(String searchProductInput){
        enterText(searchTextInput,searchProductInput);
        click(searchButton);
    }

    public String getFirstResultData(){
       return getText(searchResultFirstRow);
    }

}
