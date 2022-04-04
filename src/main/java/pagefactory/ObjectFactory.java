package pagefactory;



import pages.AccountEdit;
import pages.AccountPage;
import pages.BritishRedCrossPage;
import pages.LoginPage;
import pages.ResourcesPage;

public class ObjectFactory {
	
	private LoginPage loginPage;
	private AccountPage accPage;
	private AccountEdit accEdit;
	private ResourcesPage resoucesPage ;
	private BritishRedCrossPage redCrossPage ;
	
	
	public ResourcesPage getResourcesPage() {
		
		if (resoucesPage==null) {
			resoucesPage = new ResourcesPage();
		}
		return resoucesPage;
	}
	
	
	public LoginPage getLoginPage() {
		
		 if(loginPage==null){
	            loginPage = new LoginPage();
	        }
	        return  loginPage;
	}
	
	public AccountPage getAccountPage() {
		if(accPage==null) {
			accPage = new AccountPage();
		}
		return accPage;
	}

	public AccountEdit getAccountEdit() {
		if(accEdit==null) {
			accEdit = new AccountEdit();
		}
		return accEdit;
	}

	public BritishRedCrossPage getRedCrossPage() {
		if(redCrossPage ==null) {
			redCrossPage = new BritishRedCrossPage();
		}
		return redCrossPage;
	}


}
