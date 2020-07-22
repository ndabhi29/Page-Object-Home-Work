package org.example;

import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util {
    BrowserManager browserManager = new BrowserManager();


    // This class control all Test cases in order

    @BeforeMethod
    public void OpenBrowser() {
        browserManager.InitialiseMethod();

    }

    public void CloseBrowser(ITestResult result) { //Method to close browser
        if (ITestResult.FAILURE == result.getStatus()) {
            ScreenShot(result.getName() + timestamp());

        }
        browserManager.CloseBrowser();
    }
}





