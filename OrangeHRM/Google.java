package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Google {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.google.co.in/imghp?hl=en&tab=ri&ogbl");
        String Urlname =  driver.getCurrentUrl();
        System.out.println(Urlname);



        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.partialLinkText("Forgot")).click();

        if(driver.findElement(By.xpath("//input[@value='Reset Password']")).isDisplayed()){
            System.out.println("Forgot Password Link Working, Test Pass");
        }else
        {
            System.out.println("Forgot Password Link not Working, Test Fail");
        }






    }
}
