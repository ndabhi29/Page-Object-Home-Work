package org.example;

import org.openqa.selenium.By;

public class Desktops extends Util {

    // User on Email friend page with private class and locators

   private By _digitalStorm = By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");
   private  By _emailFriend = By.xpath("//input[@value=\"Email a friend\"]");
   private  By _typeFriendEmil = By.xpath("//input[@id=\"FriendEmail\"]");
   private  By _typeYourEmail=By.xpath("//input[@id=\"YourEmailAddress\"]");
   private  By _typeText= By.xpath("//textarea[@id=\"PersonalMessage\"]");
   private  By _sendEmail=By.xpath("//input[@name=\"send-email\"]");


   public void ClickOnEmailFriend(){

       //All EmailFriend page's text and details

       ClickOnElement(_digitalStorm,20);
       ClickOnElement(_emailFriend,20);
       TypeText(_typeFriendEmil,"Mahineti27@yahoo.com");
       TypeText(_typeYourEmail,"Nilpari2929@gmail.com");
       TypeText(_typeText,"DAS NA DAS BANAVSOJI");
       ClickOnElement(_sendEmail,20);
   }















}






//  String expectedText1 = "Your message has been sent.";
      //  String actualText1 = getTextFromElement(By.xpath("//div[@class=\"result\"]"));

      //  Assert.assertEquals(actualText1, expectedText1);












