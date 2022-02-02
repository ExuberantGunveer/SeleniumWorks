package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StockAccounting {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        driver.get("http://projects.qedgetech.com/webapp/login.php");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']"))).clear();
       // driver.findElements(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();
        Thread.sleep(5000);

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("master");
        Thread.sleep(5000);
        driver.findElement(By.id("btnsubmit")).click();


        driver.findElement(By.xpath("//a[@id='logout']")).click();
        String textt = driver.findElement(By.className("ajs-content")).getText();

        System.out.println(textt);
        Assert.assertEquals(textt,"Are you sure you want to logout?","Mesage Doesn't Match");

        String expected = "Are you sure you want to logout?";
        if(expected.equalsIgnoreCase(textt)){
            System.out.println("Logout Link Works Properly");
        }else {
            System.out.println("Logout Link Doesn't Work Properly");
        }

        driver.findElement(By.xpath("//button[contains(text()='OK!')]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']"))).clear();
        driver.findElement(By.id("password")).clear();

    }
}
