package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class bokingDotCom {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        String bDate = sc.nextLine();
                // String bookingDate = "21-November-2022";
        String[] temp = bDate.split("-");
        String date = temp[0];
        String month = temp[1];
        String year = temp[2];
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();

        driver.get("https://www.booking.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-mode,'checkin')]"))).click();


        while(true){
            if(driver.findElement(By.xpath("(//div[@class='bui-calendar__month'])[2]")).getText().split("\\ ")[0].equals(month) && driver.findElement(By.xpath("(//div[@class='bui-calendar__month'])[2]")).getText().split("\\ ")[1].equals(year)) {
                driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
                break;
            }
            else {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-bui-ref, 'calendar-next')]//*[name()='svg']"))).click();

            }
        }

        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='bui-calendar__month'])[2]"))).getText());






    }
}
