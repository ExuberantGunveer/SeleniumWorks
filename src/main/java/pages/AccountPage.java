package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;
import config.CreateRegisterValueEnum;
import opencart_interface.AccountDetails_Interface;

public class AccountPage extends BaseTest implements AccountDetails_Interface {
	
//	private String tabName = "(//a[contains(text(), '%s')])[1]";

	
	@FindBy(xpath= "//input[@name='pin']")
	WebElement PINValue;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtn;
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginPage() {
		obj.getLoginPage().loginPage();
	}
	public void enterPINValue() {
	
	PINValue.sendKeys(prop.getProperty("PIN"));
	submitBtn.click();
		
	}
	
//	public void swichTab() {
//		driver.findElement(By.xpath(String.format(tabName, CreateRegisterValueEnum.ADMIN.getCompanyName())));
//		driver.findElement(By.xpath(String.format(tabName, CreateRegisterValueEnum.CUSTOMER.getCompanyName())));
//	}
//	
//	public void swichTab2() {
//		driver.findElement(By.xpath(String.format(tabName, CreateRegisterValueEnum.ADMIN.getCompanyName())));
//		driver.findElement(By.xpath(String.format(tabName, CreateRegisterValueEnum.CUSTOMER.getCompanyName())));
//	}
 
}
