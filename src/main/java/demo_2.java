import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class demo_2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C://edgedriver/msedgedriver.exe");
        WebDriver mydriver = new EdgeDriver();
        mydriver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = mydriver.findElement(By.id("username"));
        WebElement password = mydriver.findElement(By.name("password"));
        WebElement submitButton = mydriver.findElement(By.className("btn"));

        List<WebElement> inputFields = mydriver.findElements(By.tagName("input"));

        WebElement linkText = mydriver.findElement(By.linkText("Practice Test Automation."));
        WebElement p_linkText = mydriver.findElement(By.partialLinkText("Practice"));

        //find the input field below username using relative locators

        WebElement  pwBelowusername = mydriver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
        WebElement privacypolicyLink = mydriver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.linkText("Practice Test Automation.")));


        mydriver.quit();


    }
}
