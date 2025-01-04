import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class demo_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C://edgedriver/msedgedriver.exe");
        WebDriver mydriver = new EdgeDriver();
        mydriver.get("https://www.mygreatlearning.com/");
        System.out.println("got to the link");
        mydriver.close();

    }
}