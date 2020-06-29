import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class handleAlert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("bla bla");
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        driver.switchTo().alert().accept();

        String textAlert = driver.switchTo().alert().getText();

        System.out.println(textAlert);

        driver.switchTo().alert().accept();

    }
}
