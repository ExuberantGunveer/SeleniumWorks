package config;

public enum CreateRegisterValueEnum {
	
	COMPANY_Name_Infostride("Infostride"),
	COMPANY_Name_TCS("TCS"), 
	COMPANY_Name_Amazon("Amazon"), COMPANY_Name_Infostrided("Infostride"),
	ADMIN("Admin"), CUSTOMER("Customer");
	
	
	
	private String name;
	

	CreateRegisterValueEnum(String name) {
		this.name=name;
	}

	public String getCompanyName() {
		return name;
	}
}
