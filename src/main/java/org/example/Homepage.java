package org.example;


import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

// Create Homepage for with click button
public class Homepage extends Util {
    private By _registerButton = By.linkText("Register");
    private By _Computers = By.linkText("Computers");
    private By _Books = By.linkText("Books");
    private By _SearchBoxButton = By.xpath("//input[@class='button-1 search-box-button']");
    private By _facebook = By.linkText("Facebook");
    private By _newsDetailButton = By.xpath("//div[@class=\"news-list-homepage\"]//div[1]/div[3]/a[1]");
    private By _ClickCurrencyOption = By.id("CustomerCurrency");


    public void ClickOnRegistrationButton() {
        ClickOnElement(_registerButton, 40);
    }

    public void ClickOnComputerButton() {

        ClickOnElement(_Computers, 40);
    }


    public void ClickOnBookButton() {
        ClickOnElement(_Books, 20);
    }


    public void ClickOnSearchBoxButton() {
        ClickOnElement(_SearchBoxButton, 40);
    }

    public void UserGetAlert() {

        String alertMessage = driver.switchTo().alert().getText();
        String Expected = "Please enter some search keyword";
        assertEquals(alertMessage, Expected);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.switchTo().alert().accept();
    }

    public void ClickOnFaceBook() {
        ClickOnElement(_facebook, 20);
    }

    public void clickOnDetailButton() {
        ClickOnElement(_newsDetailButton, 40);

    }



}


/*
package org.example;

        import java.io.File;

public class FileUtils {
    public static void copyFile(File scrFile, File file) {
    }
}
*/

