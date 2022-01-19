package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Amazon {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.amazon.in/");

       List<WebElement> linktext = driver.findElements(By.tagName("a"));
       System.out.println(linktext.size());
       for(int i = 0;i<linktext.size();i++){
           String linktxt = linktext.get(i).getText();
           String linkurl  = linktext.get(i).getAttribute("href");
           System.out.println(linktxt+"    "+linkurl);




       }



    }
}
