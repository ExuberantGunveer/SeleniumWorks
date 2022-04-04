package Enums;

public enum Homeware_BritishRedCrossEnums {
	
	Homeware_Name_ArtPrints("Art + Prints "),
	Homeware_Name_Kitchenware("Kitchenware"),
	Homeware_Name_Home("Home"),
	Homeware_Name_Books("Books"),
	Homeware_Name_Candles("Candles ");
	
private String name ;
	
	private Homeware_BritishRedCrossEnums(String name) {
		this.name=name;
	}
	
	public String getResoucesName() {
		return name;
	}

}
