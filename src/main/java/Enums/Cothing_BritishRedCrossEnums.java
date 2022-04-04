package Enums;

public enum Cothing_BritishRedCrossEnums {
	CLOTHING_Name_TShirt("T-Shirts + Sweatshirts"),
	CLOTHING_Name_CyclingJersey("Cycling Jerseys"),
	CLOTHING_Name_Socks("Socks"),
	CLOTHING_Name_ToteBags("Tote Bags"),
	CLOTHING_Name_ShoppingBags("Shopping Bags"),
	CLOTHING_Name_Jewellery("Jewellery"),
	CLOTHING_Name_Umbrellas("Umbrellas");
	
	
	private String name ;
	
	private Cothing_BritishRedCrossEnums(String name) {
		this.name=name;
	}
	
	public String getResoucesName() {
		return name;
	}

}
