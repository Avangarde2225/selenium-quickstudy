import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tulipInt {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("http://s3.amazonaws.com/co.tulip.cdn/memtracking/index.html");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#filterPageHome")).click();
        driver.findElement(By.cssSelector("#filterPageData")).click();
        driver.findElement(By.cssSelector("#filterPageAnalytics")).click();
        driver.findElement(By.cssSelector("#filterPagePlayer")).click();

        WebElement Stats = driver.findElement(By.xpath("//h3[contains(text(),'Stats')]"));

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView();", Stats);


        List<WebElement> stats = driver.findElements(By.xpath("//h3[contains(text(),'Stats')]"));
        List<WebElement> tableRows =driver.findElements(By.xpath("//body//tr[1]"));

        for(int i=0; i<tableRows.size(); i++){
            WebElement row  = tableRows.get(i);
            System.out.println(row.toString());
        }



    }
}
