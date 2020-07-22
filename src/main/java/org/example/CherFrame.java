package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CherFrame extends Util {

    private By _TypeTopicName = By.xpath("//input[@type=\"text\"]");
    private By _ClickCheckBox = By.xpath("//input[@type=\"checkbox\"]");
    private By _ClickAnimals = By.xpath("//select");

    public void OpenBrowser() {

        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.manage().window().maximize();

    }

    public void SwitchtoIframes() {

        WebElement _iframe1 = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
        driver.switchTo().frame(_iframe1);
        TypeText(_TypeTopicName, "This is Title");

        WebElement _iframe3 = driver.findElement(By.xpath("//iframe[@id=\"frame3\"]"));
        driver.switchTo().frame(_iframe3);
        ClickOnElement(_ClickCheckBox, 20);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");

        Select select = new Select(driver.findElement(_ClickAnimals));
        select.selectByVisibleText("Avatar");
    }

    public void verifyURL() {

        String URL = driver.getCurrentUrl();


        }
    }




















