package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Element extends  BaseTest{


    public WebElement findElement(By elementBy){
        return driver.findElement(elementBy);
    }

    public void click(By elementBy){
        waitForElement(elementBy,10);
        driver.findElement(elementBy).click();
    }

    public  void enterText(By elementBy, String inputText){
        waitForElement(elementBy,10);
        driver.findElement(elementBy).sendKeys(inputText);
    }


    public String getText(By elementBy){
        waitForElement(elementBy,10);
        return   driver.findElement(elementBy).getText();
    }

    public void waitForElement(By elementBy, int sec){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }


}
