package org.example;


import org.openqa.selenium.By;

// Create Homepage for with click button
public class Homepage extends Util {
    private  By _registerButton=By.linkText("Register");
    private  By _Computers= By.linkText("Computers");
    private  By _Books= By.linkText("Books");





public void ClickOnRegistrationButton(){
        ClickOnElement(_registerButton,40);
}

public void ClickOnComputerButton(){

        ClickOnElement(_Computers,40);
   }


public void ClickOnBookButton(){
        ClickOnElement(_Books,20);
}

}











