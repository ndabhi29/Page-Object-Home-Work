package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Currency extends Util {
    private By _ClickCurrencyOption = By.id("customerCurrency");

    public void CurrencyBox() {
        ClickOnElement(_ClickCurrencyOption, 40);
        Select CurrencyBox = new Select(driver.findElement(By.id("customerCurrency")));
        CurrencyBox.selectByVisibleText("Euro");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        List<WebElement> ProductList = driver.findElements(By.className("prices"));
        for (WebElement product:ProductList )
            System.out.println(product.getText());
        }



     public void AssertForCurrency() {

         String expectedTitle = "€21.50";
         String actualText1 =getTextFromElement(By.xpath("//span[text()='€21.50']"));
         Assert.assertEquals(actualText1, expectedTitle);

        }


    }

