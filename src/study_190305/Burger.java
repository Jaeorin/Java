package study_190305;

public class Burger implements Menu {
	private int price;
	private String desc;
	
	public Burger() {
		
	}

	public Burger(int price, String desc) {
		this.price = price;
		this.desc = desc;
	}

	public int getPrice() {
		return price;
	}

	public String getDesc() {
		return desc;
	}
	
}
