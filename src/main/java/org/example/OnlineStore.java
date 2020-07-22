package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class OnlineStore extends Util{


        private By _leaveTittle = By.xpath("//input[@id=\"AddNewComment_CommentTitle\"]");
        private By _typeComment = By.xpath("//textarea[@class=\"enter-comment-text\"]");
        private By _clickOnCommentButton = By.xpath("//input[@name=\"add-comment\"]");
     //   private By _verifyNewComment = By.xpath("//div[@class=\"result\"]");
       // String expectedCommentMessage = "News comment is successfully added.";
        private By _ownComment = By.xpath("//div[@class=\"comments\"]/div[3]/div[2]/div[2]");
        String expectedOwmTitle = "Nilpari2029";


        public void AssertForOnlineURL(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/new-online-store-is-open");
}

    public void verifyLeaveYourComment(){

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);//wait for 40 seceonds
        TypeText(_leaveTittle,"Nilpari");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);//wait for 40 seceonds
        TypeText(_typeComment,"MAHINETI27");
        ClickOnElement(_clickOnCommentButton,20);
        System.out.println(_leaveTittle + "and" + _typeComment);
    }
    public void VerifyOwnComment() {
        Assert.assertEquals(getTextFromElement(_ownComment), expectedOwmTitle);

    }
    public void AssertforNewCommentMessageSuccesfully (){
        String expectedCommentMessage = "News comment is successfully added.";
        String actualCommentMessage = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(actualCommentMessage, expectedCommentMessage);

    }


    }


