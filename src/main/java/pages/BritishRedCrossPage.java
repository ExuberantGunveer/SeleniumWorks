package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Enums.Cothing_BritishRedCrossEnums;
import Enums.CreateAccount_BritishRedCrossPageEnums;
import Enums.Homeware_BritishRedCrossEnums;
import Enums.Stationery_BritishRedCrossEnums;
import base.BaseTest;
import opencart_interface.BritishRedCrossPage_Interface;

public class BritishRedCrossPage extends BaseTest implements BritishRedCrossPage_Interface {
	
	private String createAccountDetails = "//input[@id='%s']";
	
//	private String menuTabs = "//li[@class='nav-bar__item']//a[contains(text(),'%s')]";
	
	private String clothingOption = "//li[@class='nav-dropdown__item ']//a[contains(text(),'%s')]";
	
	private String productLink = "//a[contains(text(),'%s')]";
	
	private String stationery = "//li[@class='nav-dropdown__item ']//a[contains(text(),'%s')]";
	
	private String homeware = "//li[@class='nav-dropdown__item ']//a[contains(text(),'%s')]";
	
	@FindBy(xpath = "//img[@title='British Red Cross']")
	WebElement redCrossLink ;
	
	@FindBy(xpath="//a[@class='header__action-item-link hidden-pocket hidden-lap']")
	WebElement myAccountTab;
	
	@FindBy(xpath="//form[@id='header_customer_login']//following-sibling::div[@class='popover__secondary-action']//button[@class='link link--accented']")
	WebElement createAccountLink;
	
	@FindBy(xpath="//button[contains(text(),'Create my account')]")
	WebElement createMyAccountTab ;
	
	@FindBy(xpath="//li[@class='nav-bar__item']//a[contains(text(),'Clothing')]")
	WebElement clothingTab ;
	
	@FindBy(xpath = "//li[@class='nav-bar__item']//a[contains(text(),'Stationery')]")
	WebElement stationeryTab;
	
	@FindBy(xpath = "//li[@class='nav-bar__item']//a[contains(text(),'Homeware')]")
	WebElement homewareTab ;
	
	@FindBy(xpath = "//input[@class='search-bar__input']")
	WebElement searchBar ;
	

	
	public BritishRedCrossPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void openLink() {
		driver.navigate().to("https://giftshop.redcross.org.uk/"); 
	}
	
	
	public void createAccount() {
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		myAccountTab.click();
		createAccountLink.click();
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishRedCrossPageEnums.CREATEACCOUNT_Name_FirstName.getResoucesName()))).sendKeys("Gunveer");
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishRedCrossPageEnums.CREATEACCOUNT_Name_LastName.getResoucesName()))).sendKeys("Singh");
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishRedCrossPageEnums.CREATEACCOUNT_Name_Email.getResoucesName()))).sendKeys("ekomkar500@gmail.com");
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishRedCrossPageEnums.CREATEACCOUNT_Name_Password.getResoucesName()))).sendKeys("HelloWorld@123");
		
	}
	
	
	public void clickClothingTab()  {
//		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click(); // Cookies Msg Click
		
		for(Cothing_BritishRedCrossEnums c : Cothing_BritishRedCrossEnums.values()) {
			Actions action = new Actions(driver);
			action.moveToElement(clothingTab).build().perform();
			driver.findElement(By.xpath(String.format(clothingOption, c.getResoucesName()))).click();
		
		}				
	}
	
	public void clickStationeryTab() {
//		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click(); // Cookies Msg Click
		
		for(Stationery_BritishRedCrossEnums s : Stationery_BritishRedCrossEnums.values()) {
			Actions action = new Actions(driver);
			action.moveToElement(stationeryTab).build().perform();
			driver.findElement(By.xpath(String.format(stationery, s.getResoucesName()))).click();
		}
		
		
	}
	
	public void clickHomewareTab() {
		
		for(Homeware_BritishRedCrossEnums h : Homeware_BritishRedCrossEnums.values()) {
			Actions action = new Actions(driver);
			action.moveToElement(homewareTab).build().perform();
			driver.findElement(By.xpath(String.format(homeware, h.getResoucesName()))).click();
			
		}
	}
	
	public void addProductToCart() {
		
		
		
	}



	

}
