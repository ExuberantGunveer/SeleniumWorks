package Assignment;

import TestUtil.utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

public class DataProvider {

    static WebDriver driver ;
    @BeforeMethod
    public void launchBrowser(){

        WebDriverManager.chromedriver().setup();
        //  System.setProperty("webdriver.chrome.driver","C:\\SeleniumProject\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }


    @org.testng.annotations.DataProvider
    public Iterator<Object[]> getTestData(){
        ArrayList<Object[]> testOne = utils.getDataExcel();
        return (Iterator<Object[]>) testOne;



    }



    @Test
    public void Login(String username , String password ){

        driver.findElement(By.id("txtUsername")).clear();
        driver.findElement(By.id("txtUsername")).sendKeys(username);

        driver.findElement(By.id("txtPassword")).clear();
        driver.findElement(By.id("txtPassword")).sendKeys(password);

        driver.findElement(By.id("btnLogin")).click();

    }




}
