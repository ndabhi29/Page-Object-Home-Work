package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccessPage extends Util {

    private By _RegisterSuccessMessage=By.cssSelector("div.result");
    String expectedRegisterSuccessMessage="Your registration completed";

    public void VerifyUserRegistrationSuccessfully(){
       // String actual=getTextFromElement(_RegisterSuccessMessage)
        Assert.assertEquals(getTextFromElement(_RegisterSuccessMessage),expectedRegisterSuccessMessage);
    }

}
