package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util {
    BrowserManager browserManager = new BrowserManager();


    // This class control all Test cases in order

    @BeforeMethod
    public void OpenBrowser() {
        browserManager.InitialiseMethod();

    }
    @AfterMethod
     public  void closeBrowser() {
        browserManager.closeBrowser();
    }

}




