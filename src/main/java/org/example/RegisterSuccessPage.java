package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

public class RegisterSuccessPage extends Util {

    private By _RegisterSuccessMessage=By.cssSelector("div.result");
    String expectedRegisterSuccessMessage="Your registration completed";

    public void VerifyUserRegistrationSuccessfully(){
       // String actual=getTextFromElement(_RegisterSuccessMessage)
        Assert.assertEquals(getTextFromElement(_RegisterSuccessMessage),expectedRegisterSuccessMessage);
    }

}
