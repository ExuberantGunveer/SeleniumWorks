package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class bokingDotCom {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webDriver.chrome.driver","C:\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String bookingDate = "21-November-2022";
        String[] temp = bookingDate.split("-");
        String date = temp[0];
        String month = temp[1];
        String year = temp[2];
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        driver.get("https://www.booking.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-mode,'checkin')]"))).click();

        
       /* while(true){
            if(driver.findElement(By.xpath("(//div[@class='bui-calendar__month'])[2]")).getText().split("\\ ")[0].equals(month) && driver.findElement(By.xpath("(//div[@class='bui-calendar__month'])[2]")).getText().split("\\ ")[1].equals(year)) {
                break;
            }
            else {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-bui-ref, 'calendar-next')]//*[name()='svg']"))).click();
                Thread.sleep(500);
            }
        }

        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='bui-calendar__month'])[2]"))).getText());
*/





    }
}
