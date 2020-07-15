package org.example;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {

//

    public void InitialiseMethod() {

        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();//open chrome driver
        driver.manage().window().maximize();// Maximize the screen
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicitlyWait
        driver.get("https://demo.nopcommerce.com/");// opens demo nop commerce URL
    }


    public void CloseBrowser() {
        driver.close();

    }

}


