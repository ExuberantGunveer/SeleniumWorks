package Enums;

public enum ResoucesPageEnums {

	RESOURCES_Name_ShowCase("Showcase"),
	RESOUCES_Name_ContactUs("Contact Us"),
	RESOUCES_Name_OpenCartPartners("OpenCart Partners"),
	RESOUCES_Name_OPenCartBooks("OpenCart Books");
	
	private String name ;
	
	private ResoucesPageEnums(String name) {
		this.name=name;
	}
	public String getResoucesName() {
		return name;
	}
}
