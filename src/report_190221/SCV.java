package report_190221;

public class SCV extends TerranUnit{
	
	String name = "S C V";
	String Range = "Meele";
	int health = 60;

	@Override
	public void getName() {
		System.out.println(name);
		
	}

	@Override
	public void range() {
		System.out.println(Range);
		
	}
	
	@Override
	public void health() {
		System.out.println("health :" + health);
		
	}

	@Override
	public void shield() {
		
	}
	
}
