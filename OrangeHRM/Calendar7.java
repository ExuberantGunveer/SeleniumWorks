package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Scanner;

public class Calendar7 {
    static WebDriver driver ;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //String bookingdate = "21-November-2024";

        //String[] temp = bookingdate.split("-");

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter the Date in the desired format : DD-Month-YYYY : "+sc);
        String bDate = sc.nextLine();
        // String bookingDate = "21-November-2022";
        String[] temp = bDate.split("-");
        String date = temp[0];
        String month = temp[1];
        String year = temp[2];

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class='ui-datepicker-calendar']")));

        //ui-datepicker-title
        while(true){
            if(driver.findElement(By.className("ui-datepicker-title")).getText().split("\\ ")[0].equals(month) &&
                    driver.findElement(By.className("ui-datepicker-title")).getText().split("\\ ")[1].equals(year)) {
                driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
                break;
            }
            else {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Next']"))).click();
            }
        }
    }
}






