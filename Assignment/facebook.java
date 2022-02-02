package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class facebook {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver","C:\\SeleniumProject\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.co.in/");
        //driver.findElement(By.linkText("Create an account")).click();
        // driver.findElement(By.name("q")).sendKeys("Gunveer");


        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Gunveer Singh", Keys.ENTER);
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Google Search")).click();
        //Thread.sleep(5000);
        // driver.findElement(By.xpath("//input[contain(@type,'submit')]")).click();

        driver.navigate().to("https://www.facebook.com/");

        driver.findElement(By.linkText("Create New Account")).click();

      /*  Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();
        it.next();*/
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']//parent::div")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gunveer");
//        driver.findElement(By.name("lastname")).sendKeys("Singh");
//        driver.findElement(By.name("reg_email__")).sendKeys("999999999");
        // driver.findElement(By.xpath("//div[@id='password_field']/preceding::div[@class='mbm _a4y']")).sendKeys("123456@Singh");

        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));

        Select select = new Select(day);
        select.selectByVisibleText("5");

        Select select1 = new Select(month);
        select1.selectByVisibleText("Jan");
        Select select2 = new Select(year);
        select2.selectByVisibleText("1992");
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//input[starts-with(@id,'u_2_5_')]")).click();

        driver.findElement(By.xpath("//div[@id='password_field']//following-sibling::div[@class='_1lch']//button[starts-with(@id,'u_2_s_')]")).click();

        // WebElement radio =  driver.findElement(By.id("u_2_5_"));
        // radio.click();

        driver.navigate().to("https://www.google.co.in/");
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Java", Keys.ENTER);
        Thread.sleep(6000);
        //driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Java | Oracle')]")).click();
        //h3[contains(text(),'Java | Oracle')]




    }
}
