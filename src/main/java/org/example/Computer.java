package org.example;

import org.openqa.selenium.By;

// create computer class for click on desktop

public class Computer extends Util{
    private By _desktop = By.linkText("Desktops");


    public void UserClickOnDesktop(){

        ClickOnElement(_desktop,30);
    }
}
