package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ProjectHRM {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
      //  System.setProperty("webdriver.chrome.driver","C:\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Properties prop = new Properties();
        FileInputStream ip = new FileInputStream("C:\\Users\\GunveerSingh\\IdeaProjects\\SeleniumWorks\\OrangeHRM\\config.properties");
        prop.load(ip);
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));



        driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
        driver.findElement(By.id("btnLogin")).click();

       /* Actions action = new Actions(driver);
        //WebElement we = driver.findElement(By.id("welcome"));
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.id("welcome"))).build().perform();*/

        driver.findElement(By.id("menu_admin_viewAdminModule")).click();

        driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
        driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Admin A");
        driver.findElement(By.id("systemUser_userName")).sendKeys("Rishav1255107");
        driver.findElement(By.id("systemUser_password")).sendKeys("123@Rishav");
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("123@Rishav");



        Thread.sleep(1000);
        driver.findElement(By.name("btnSave")).click();


        //String SearchNameXpath = "//a[contains(text(),'Rishav12557')]";
        //WebElement usernm = driver.findElement(By.xpath(String.format(SearchNameXpath,Username)));
        // Assert.isTrue(usernm.getText().equals(Username),"User Not Found");
        String Username = "Rishav1255107";
        WebElement usernm = driver.findElement(By.xpath("//a[contains(text(),'Helo8')]"));
        //org.junit.Assert.assertEquals(Username,usernm,"User Doesn't Match");

        Assert.assertEquals(Username,usernm,"User Doesn't Match");
        /*Thread.sleep(10000);
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();*/






    }
}
