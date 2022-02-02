package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class FreeCRM {
    public static void main(String[] args) throws InterruptedException, IOException {
        //calendar icon
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://ui.cogmento.com/");

        Properties prop = new Properties();
        FileInputStream ip = new FileInputStream("C:\\Users\\GunveerSingh\\IdeaProjects\\SeleniumWorks\\OrangeHRM\\config.properties");
        prop.load(ip);
        System.out.println(prop.getProperty("Username"));
        driver.findElement(By.name("email")).sendKeys(prop.getProperty("Username"));
        driver.findElement(By.name("password")).sendKeys("50192Prince");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//i[@class='calendar icon']"))).build().perform();

       // WebElement cal = driver.findElement(By.className("calendar icon"));


    }
}
