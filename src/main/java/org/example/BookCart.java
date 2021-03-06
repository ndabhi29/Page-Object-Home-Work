package org.example;

import org.openqa.selenium.By;
// User on Book Cart for shopping

public class BookCart extends Util{
    private By _FirstPrize = By.xpath("//div[@class=\"item-grid\"]/div[2]/div/div[2]/div[3]/div[2]/input[1]");

    private By _Bradbury = By.linkText("Fahrenheit 451 by Ray Bradbury");
    private By _addToCart = By.xpath("//input[@id=\"add-to-cart-button-37\"]");
    private By _ShoppingCart = By.linkText("Shopping cart");


    //Making
    public void userEnterItemAddToCart(){
        ClickOnElement(_FirstPrize,20);
        ClickOnElement(_Bradbury,20);
        ClickOnElement(_addToCart,20);
        ClickOnElement(_ShoppingCart,20);
    }


}
