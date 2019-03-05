package study_190305;

public class BigRibBurgerSet {
	
	//3개의 상태값이 필요
	private Burger burger;
	private Coke coke;
	private Fri fri;
	
	public BigRibBurgerSet(Burger burger, Coke coke, Fri fri) {
		this.burger = burger;
		this.coke = coke;
		this.fri = fri;
	}
	
	public int getPrice() {
		return burger.getPrice() + coke.getPrice() + fri.getPrice();
	}
	
	public String getDesc() {
		//+= : 자신에게 값을 더함
//		String desc = "";
//		desc += burger.getDesc();
//		desc += coke.getDesc();
//		desc += fri.getDesc();
//		return desc;
		
		StringBuilder sb = new StringBuilder();
		sb.append(burger.getDesc());
		sb.append(coke.getDesc());
		sb.append(fri.getDesc());
		
		return sb.toString();
	}

	public Burger getBurger() {
		return burger;
	}

	public Coke getCoke() {
		return coke;
	}

	public Fri getFri() {
		return fri;
	}

}
