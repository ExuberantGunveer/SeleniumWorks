package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class BritishRedCrossPageTest extends BaseTest {
	
	

	@Test(priority = 1)
	public void clickCreateAccount()  
	{
		obj.getRedCrossPage().openLink();
		obj.getRedCrossPage().createAccount();

		
	}	
	
	@Test(priority = 2)
	public void checkBritishRedCrossMenuList() {

		obj.getRedCrossPage().clickClothingTab();
		obj.getRedCrossPage().clickStationeryTab();
		obj.getRedCrossPage().clickHomewareTab();
	}

	
}
