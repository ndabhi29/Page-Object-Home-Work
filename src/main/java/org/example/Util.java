package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Util extends BasePage{

    // All reusable Methods so we can use on all class

    public static void ClickOnElement(By by , int time) {
        driver.findElement(by).click();
    }
    public static void TypeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        return (System.currentTimeMillis());
    }

    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void  selectFromDropDownByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);}

        public static void selectFromDropDownByVisibleIndex(By by, int n){
            Select select = new Select(driver.findElement(by));
            select.selectByIndex(n);


    }

    protected void closeBrowser() {

    }
}







