package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class ResourcesPageTest extends BaseTest{
	
	
	
	@Test(priority = 1)
	public void clickShowCaseTab() {
	    obj.getLoginPage().loginPage();
	    obj.getResourcesPage().showCaseTab();
	}
	
	@Test(priority = 2)
	public void clickContactUsTab() {
//		obj.getLoginPage().loginPage();
		obj.getResourcesPage().contactUsTab();
	}
	
	@Test(priority = 3)
	public void clickOpenCartPartnersTab() {
//		obj.getLoginPage().loginPage();
		obj.getResourcesPage().opencartPartnersTab();
	}
	
	@Test(priority = 4)
	public void clickOpenCartBooksTab() {
//		obj.getLoginPage().loginPage();
		obj.getResourcesPage().opencartBooksTab();
	
	}
	
	
	
}
