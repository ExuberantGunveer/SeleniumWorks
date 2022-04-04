package Enums;

public enum CreateAccount_BritishRedCrossPageEnums {
	
	CREATEACCOUNT_Name_FirstName("customer[first_name]"),
	CREATEACCOUNT_Name_LastName("customer[last_name]"),
	CREATEACCOUNT_Name_Email("register-customer[email]"),
	CREATEACCOUNT_Name_Password("register-customer[password]")
;
	
	
	private String name ;
	
	private CreateAccount_BritishRedCrossPageEnums(String name) {
		this.name=name;
	}
	
	public String getResoucesName() {
		return name;
	}

	
}
