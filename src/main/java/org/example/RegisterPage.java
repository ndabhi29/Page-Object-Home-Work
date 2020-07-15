package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class RegisterPage extends Util {

   //  User on register page with private class  locators

    private By _FirstName = By.xpath("//input[@id=\"FirstName\"]");
    private By _lastname = By.xpath("//input[@id=\"LastName\"]");
    private By _DateOfBirthday = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _DateOfBirthMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _DateOfBirthYear = By.name("DateOfBirthYear");
    private By _EmailField = By.name("Email");
    private By _CompanyName = By.id("Company");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _registerSubmitButton = By.id("register-button");



    public void UserEnterRegistrationDetails() {

        // User fill registration   details

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);// implicitlyWait for open the next button

        TypeText(_FirstName, "Nilpari");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        TypeText(_lastname, "Dabhi");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        selectFromDropDownByVisibleText(_DateOfBirthday, "14");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        selectFromDropDownByValue(_DateOfBirthMonth, "February");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        selectFromDropDownByValue(_DateOfBirthYear, "2006");
        TypeText(_EmailField, "Nilpari+" + timestamp() + "@gmail.com");
        TypeText(_CompanyName, "Mahineti27");
        TypeText(_Password, "123456");
        TypeText(_ConfirmPassword, "123456");
    }

   //  RegisterButton for cover all steps of user Registration details
        public void UserClickOnRegisterSubmitButton() {
            ClickOnElement(_registerSubmitButton, 40);


        }

    }





