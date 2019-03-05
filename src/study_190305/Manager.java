package study_190305;

interface Menu {
	String getDesc();
	int getPrice();
}

public class Manager {

	public static void printMenu(Menu m) {
		System.out.println(m.getDesc());
		System.out.println(m.getPrice());
	}
	
	public static void main(String[] args) {
		Coke c1 = new Coke(1000, "ÄÝ¶ó");
		printMenu(c1);
		
		Burger b1 = new Burger(3000, "ºò¸³¹ö°Å");
		printMenu(b1);
		
		Fri f1 = new Fri(1500, "°¨ÀÚÆ¢±è");
		printMenu(f1);
		
		//ºò¸³ ¹ö°Å ¼¼Æ®
		BigRibBurgerSet brset = new BigRibBurgerSet
		(new Burger(2500, "ºò¸³¹ö°Å"), new Coke(800, "ÄÝ¶ó"), new Fri(1000, "°¨ÀÚÆ¢±è"));
		
		System.out.println("ºò¸³¹ö°Å¼¼Æ®");
		System.out.println(brset.getDesc());
		System.out.println(brset.getPrice());
	}

}
