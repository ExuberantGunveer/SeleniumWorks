package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAccountTest  {
	
	//a[@class='header__action-item-link hidden-pocket hidden-lap']

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver()  ;  	
    
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://giftshop.redcross.org.uk/");
    driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
    driver.findElement(By.xpath("//a[@class='header__action-item-link hidden-pocket hidden-lap']")).click();
}
}
