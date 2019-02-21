package report_190221;

public class SiegeTank extends TerranUnit{
	
	String name = "SiegeTank";
	String Range = "Range";
	int health = 150;

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
