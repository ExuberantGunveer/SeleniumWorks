package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calender2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://orangehrm.qedgetech.com");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.linkText("Recruitment")).click();
        driver.findElement(By.linkText("Candidates")).click();

        driver.findElement(By.id("candidateSearch_fromDate")).click();
        String validdate = "16-Dec-2022";
        String[] temp = validdate.split("-");
        String date = temp[0];
        String month = temp[1];
        String year = temp[2];
        Select monthlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
        monthlist.selectByVisibleText(month);
        Select yearlist = new Select(driver.findElement(By.className("ui-datepicker-year")));
        yearlist.selectByVisibleText(year);




    }
}
