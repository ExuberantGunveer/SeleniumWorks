package OrangeHRM;

import org.openqa.selenium.By;

public class Recruitment extends AddUser{

    void rect(){


        driver.findElement(By.linkText("Recruitment")).click();
    }
}
