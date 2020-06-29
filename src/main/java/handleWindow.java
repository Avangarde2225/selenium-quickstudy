import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class handleWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/popup.php");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        Set<String> windowHandle = driver.getWindowHandles();

        for(String window:windowHandle){
            driver.switchTo().window(window);
        }

        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("blabla@gmail.com");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
