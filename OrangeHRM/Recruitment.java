package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Recruitment extends AddUser {

    void rect() {


        driver.findElement(By.linkText("Recruitment")).click();
        driver.findElement(By.linkText("Candidates")).click();

        driver.findElement(By.id("candidateSearch_fromDate")).click();
        String appdate = "20-Dec-2019";
        String[] temp = appdate.split("-");
        String date = temp[0];
        String month = temp[1];
        String year = temp[2];

        Select monthlist, yearlist;
        monthlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
        monthlist.selectByVisibleText(month);
        yearlist = new Select(driver.findElement(By.className("ui-datepicker-year")));
        yearlist.selectByVisibleText(year);

        WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
        List<WebElement> rows = cal.findElements(By.tagName("tr"));
        System.out.println(rows.size());
        boolean flag = false;
        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            for(int j = 0; j < cols.size(); j++) {
                String caldate = cols.get(j).getText();

                if (caldate.equals(date)) {
                    cols.get(j).click();
                    flag = true;
                    break;


                }
            }
            if (flag) {
                break;
            }
        }
    }
}