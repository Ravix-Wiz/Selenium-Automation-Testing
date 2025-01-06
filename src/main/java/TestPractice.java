import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class TestPractice {

    public static void main(String[] args){

        System.setProperty("webdriver.edge.driver","C://edgedriver/msedgedriver.exe");
        WebDriver mydriver = new EdgeDriver();
        mydriver.get("https://practicetestautomation.com/practice-test-exceptions/");


        WebElement webpage_Linktext = mydriver.findElement(By.linkText("Selenium WebDriver with Java for beginners program"));
        WebElement webpage_PartialLinktext = mydriver.findElement(By.partialLinkText("Java for beginners"));

        WebElement inputBytag = mydriver.findElement(By.tagName("input"));
        WebElement inputByclass = mydriver.findElement(By.className("input-field"));
        WebElement inputByxpath = mydriver.findElement(By.xpath("//input[@class = 'input-field']"));
        WebElement inputBycssS = mydriver.findElement(By.cssSelector("input[class='input-field']"));

        List<WebElement> buttons = mydriver.findElements(By.tagName("button"));

        WebElement editButtonByid = mydriver.findElement(By.id("edit_btn"));
        WebElement editButtonByname = mydriver.findElement(By.name("Edit"));
        WebElement editButtonByxpath = mydriver.findElement(By.xpath("//button[@id = 'edit_btn']"));
        WebElement editButtonBycssS = mydriver.findElement(By.cssSelector("button[id='edit_btn']"));

        WebElement addButtonByid = mydriver.findElement(By.id("add_btn"));
        WebElement addButtonByname = mydriver.findElement(By.name("Add"));
        WebElement addButtonByxpath = mydriver.findElement(By.xpath("//button[@id = 'add_btn']"));
        WebElement addButtonBycssS = mydriver.findElement(By.cssSelector("button[id='add_btn']"));

        mydriver.quit();
    }
}

//test practice