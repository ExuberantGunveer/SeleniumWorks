package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.stream.ImageInputStream;
import java.time.Duration;
import java.util.List;

public class BBC {
   static WebDriver driver;

    public static void main(String[] args) {




        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.bbc.com/");

        List<WebElement> linktext = driver.findElements(By.tagName("a"));
        System.out.println(linktext.size());
        for (int i = 0; i < linktext.size(); i++) {
            String linktxt = linktext.get(i).getText();
            String linkurl = linktext.get(i).getAttribute("href");
            System.out.println(linktxt + "    " + linkurl);

        }
    }
}
