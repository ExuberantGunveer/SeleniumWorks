package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Calender3 {

    static WebDriver driver ;
    public static void main(String[] args) {
      //  System.setProperty("webdriver.gecko.driver","C:\\SeleniumProject\\geckodriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        new WebDriverWait(driver,Duration.ofSeconds(5))
        .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-title")));

        selectDate("16","December","2026");

    }

    public static String[] getMonthYear(String monthyearval ){
        return monthyearval.split(" ");

    }

    public static void selectDate(String exDay , String exMonth , String exYear){
        String monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();

        while(!(getMonthYear(monthyearval)[0].equals(exMonth)
                &&
                getMonthYear(monthyearval)[1].equals(exYear))){

            driver.findElement(By.xpath("//a[@title='Next']")).click();
            break;


        }
        driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();


    }
}
