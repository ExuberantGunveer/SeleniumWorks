package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ProjectHRM {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

       /* Actions action = new Actions(driver);
        //WebElement we = driver.findElement(By.id("welcome"));
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.id("welcome"))).build().perform();*/

        driver.findElement(By.id("menu_admin_viewAdminModule")).click();

        driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
        driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Rishikesh Sampat chavan");
        driver.findElement(By.id("systemUser_userName")).sendKeys("Rishav125");
        driver.findElement(By.id("systemUser_password")).sendKeys("123@Rishav");
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("123@Rishav");

        Thread.sleep(1000);
        driver.findElement(By.name("btnSave")).click();

        /*Thread.sleep(10000);
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();*/






    }
}
