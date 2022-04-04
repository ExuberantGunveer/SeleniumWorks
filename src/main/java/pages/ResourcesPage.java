package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Enums.ResoucesPageEnums;
import base.BaseTest;
import opencart_interface.Resources_Interface;

public class ResourcesPage extends BaseTest implements Resources_Interface {
	
//	//img[@title='British Red Cross']

	
	private String dropDownTab = "//ul[@class='dropdown-menu']//a[contains(text(),'%s')]";
	
		@FindBy(xpath = "//a[contains(text(),'Resources')]")
	    WebElement resoucesTab;
	
	
	public ResourcesPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void showCaseTab() {
		
		resoucesTab.click();
		driver.findElement(By.xpath(String.format(dropDownTab, ResoucesPageEnums.RESOURCES_Name_ShowCase.getResoucesName()))).click();
		
	}

	public void contactUsTab() {
		resoucesTab.click();
		driver.findElement(By.xpath(String.format(dropDownTab, ResoucesPageEnums.RESOUCES_Name_ContactUs.getResoucesName()))).click();
		
	}

	public void opencartPartnersTab() {
		resoucesTab.click();
		driver.findElement(By.xpath(String.format(dropDownTab, ResoucesPageEnums.RESOUCES_Name_OpenCartPartners.getResoucesName()))).click();
		
	}

	public void opencartBooksTab() {
		resoucesTab.click();
		driver.findElement(By.xpath(String.format(dropDownTab, ResoucesPageEnums.RESOUCES_Name_OPenCartBooks.getResoucesName()))).click();
		
	}


}
