package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login  {

    WebDriver driver ;
    void login(){
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumProject\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();



    }



    void logout() throws InterruptedException {

        driver.findElement(By.id("welcome")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

    }
}

