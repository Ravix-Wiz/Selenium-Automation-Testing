package com.practicetestautomation.tests.com.practicetestautomation.tests.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests {
    @Test
    public void incorrectUsernameTest(){

        System.setProperty("webdriver.edge.driver","C://edgedriver/msedgedriver.exe");
        WebDriver mydriver = new EdgeDriver();

        //Open page
        mydriver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username incorrectUser into Username field
        WebElement username = mydriver.findElement(By.id("username"));
//        username.sendKeys("incorrectUser");
        username.sendKeys("incorrectUser");

        //Type password Password123 into Password field
        WebElement password = mydriver.findElement(By.id("password"));
        password.sendKeys("Password123");

        //Push Submit button
        WebElement submitButton = mydriver.findElement(By.className("btn"));
        submitButton.click();

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);

        }

        //Verify error message is displayed
        WebElement errorMessage = mydriver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed());


        //Verify error message text is Your username is invalid!
        String expectedErrormessage = "Your username is invalid!";
        String actualErrormessage = errorMessage.getText();
        Assert.assertEquals(actualErrormessage,expectedErrormessage);

        mydriver.quit();


    }

    @Test
    public void incorrectPasswordTest(){

        System.setProperty("webdriver.edge.driver","C://edgedriver/msedgedriver.exe");
        WebDriver mydriver = new EdgeDriver();

        //Open page
        mydriver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field
        WebElement username = mydriver.findElement(By.id("username"));
        username.sendKeys("student");

        //Type password incorrectPassword into Password field
        WebElement password = mydriver.findElement(By.id("password"));
//        password.sendKeys("incorrectPassword");
        password.sendKeys("incorrectPassword");

        //Push Submit button
        WebElement submitButton = mydriver.findElement(By.className("btn"));
        submitButton.click();

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);

        }

        //Verify error message is displayed
        WebElement errorMessage = mydriver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed());

        //Verify error message text is Your password is invalid!
        String expectedErrormessage = "Your password is invalid!";
        String actualErrormessage = errorMessage.getText();
        Assert.assertEquals(actualErrormessage,expectedErrormessage);

        mydriver.quit();

    }


}
