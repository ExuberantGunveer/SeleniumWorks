package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class RandomDG {
    static WebDriver driver ;
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(2000, 2100);
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        System.out.println(gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));
        String YY = String.valueOf(gc.get(gc.YEAR));
        String day = String.valueOf(gc.get(gc.DAY_OF_MONTH));
        int month2 = (gc.get(gc.MONTH) + 1);
        String MM=null;
        switch(month2) {
            case 1:
                MM = "January";
                break;
            case 2:
                MM = "February";
                break;
            case 3:
                MM = "March";
                break;
            case 4:
                MM = "April";
                break;
            case 5:
                MM = "May";
                break;
            case 6:
                MM = "June";
                break;
            case 7:
                MM = "July";
                break;
            case 8:
                MM = "August";
                break;
            case 9:
                MM = "September";
                break;
            case 10:
                MM = "October";
                break;
            case 11:
                MM = "November";
                break;
            case 12:
                MM = "December";
                break;
            default:
                MM = "Invalid month";
                break;
        }
        System.out.println(gc.get(gc.YEAR) + "-" + MM + "-" + gc.get(gc.DAY_OF_MONTH));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc);
//        String bDate = sc.nextLine();
      // String bDate = "21-November-2022";


        //String[] temp = bDate.split("-");
//        String date = temp[0];
//        String month1 = temp[1];
//        String year1 = temp[2];
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class='ui-datepicker-calendar']")));


        //ui-datepicker-title
        while(true){
            if(driver.findElement(By.className("ui-datepicker-title")).getText().split("\\ ")[0].equals(MM)
                    &&
                    driver.findElement(By.className("ui-datepicker-title")).getText().split("\\ ")[1].equals(YY)) {
                driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
                break;
            }
            else {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Next']"))).click();

            }


        }




    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }



}

