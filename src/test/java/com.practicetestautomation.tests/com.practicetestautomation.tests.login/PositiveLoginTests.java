package com.practicetestautomation.tests.com.practicetestautomation.tests.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class PositiveLoginTests {

    public void testLoginFunctionality(){

        System.setProperty("webdriver.edge.driver","C://edgedriver/msedgedriver.exe");
        WebDriver mydriver = new EdgeDriver();

        //Open page
        mydriver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field
        WebElement username = mydriver.findElement(By.id("username"));
        username.sendKeys("student");

        //Type password Password123 into Password field
        WebElement password = mydriver.findElement(By.id("password"));
        password.sendKeys("Password123");

        //Push Submit button
        WebElement submitButton = mydriver.findElement(By.id("submit"));
        submitButton.click();

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        String expectURL = "https://practicetestautomation.com/logged-in-successfully/";
        String actualURL = mydriver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectURL);


        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        String expectedMessage = "Congratulations student. You successfully logged in!";
        String pageSource = mydriver.getPageSource();
        Assert.assertTrue(pageSource.contains(expectedMessage));


        //Verify button Log out is displayed on the new page
        WebElement logoutButton = mydriver.findElement(By.linkText("Log out"));
        Assert.assertTrue(logoutButton.isDisplayed());

        mydriver.quit();




    }
}
