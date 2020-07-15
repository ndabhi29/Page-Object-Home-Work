package org.example;


import org.testng.annotations.Test;

// All Test suits with all class page objectes and run in pri

public class TestSuit extends BaseTest {
    Homepage homepage = new Homepage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    Computer computer = new Computer();
    Desktops desktops = new Desktops();
     BookCart bookCart =new BookCart();

    @Test (priority = 1)
    public void VeriyfyUserShouldAbleToRegisterSuccessfully() {

        // click on register button
        homepage.ClickOnRegistrationButton();
        //user enters registration details
        registerPage.UserEnterRegistrationDetails();
        registerPage.UserClickOnRegisterSubmitButton();
       // registerSuccessPage.VerifyUserRegistrationSuccessfully();

    }

    @Test(priority = 2)
    public void UserShouldBeAbleToEmailAFriendSuccessfully() {

        // user on EmailFriendspage
        homepage.ClickOnRegistrationButton();
        registerPage.UserEnterRegistrationDetails();
        registerPage.UserClickOnRegisterSubmitButton();
        homepage.ClickOnComputerButton();
        computer.UserClickOnDesktop();
        desktops.ClickOnEmailFriend();
     }

        @Test(priority = 3)

        // User on shopping cart
        public void AddToCart () {
            homepage.ClickOnBookButton();
            bookCart.userEnterItemAddToCart();


        }


    }
