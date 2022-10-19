package assignments.VM;

public enum Items
{
	PZ("(1)", "Pizza", 150), BG("(2)", "Burger", 120), SW("(3)", "Sandwich", 100), CK("(4)", "Coke", 80), WT("(5)", "Water", 40);
	private String itemNo, name;
	private int price;
	   
	private Items(String itemNo, String name, int price)
	{
		this.itemNo = itemNo;
		this.name = name;
		this.price = price;
	}
	
	public String getNum()
	{
		return itemNo;
	}
	
	public String getName()
	{
		return name;
	}
	   
	public int getPrice()
	{
		return price;
	}
		
}