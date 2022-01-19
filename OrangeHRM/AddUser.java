package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUser extends Login {



    void adduser() throws InterruptedException {
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();

        driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
        driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Admin A");
        driver.findElement(By.id("systemUser_userName")).sendKeys("Rishav1255720");
        driver.findElement(By.id("systemUser_password")).sendKeys("123@Rishav");
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("123@Rishav");


        Thread.sleep(4000);

        driver.findElement(By.name("btnSave")).click();
    }
}
