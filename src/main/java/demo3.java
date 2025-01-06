import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class demo3 {

    public static void main(String[] args){

        System.setProperty("webdriver.edge.driver","C://edgedriver/msedgedriver.exe");
        WebDriver mydriver = new EdgeDriver();
        mydriver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = mydriver.findElement(By.id("username"));
        username.sendKeys("anyUsername");

        WebElement password = mydriver.findElement(By.id("password"));
        password.sendKeys("anyPassword");

        WebElement submitButton = mydriver.findElement(By.className("btn"));
        submitButton.click();



    }
}
