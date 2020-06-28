import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class hoverOverMethod {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement jewelry = driver.findElement(By.xpath("//span[contains(text(),'Jewelry & Accessories')]"));

        Actions action = new Actions(driver);
        action.moveToElement(jewelry).perform();



    }
}
