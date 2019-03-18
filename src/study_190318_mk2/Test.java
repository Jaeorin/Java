package study_190318_mk2;

public class Test {

	public static void main(String[] args) {

		Power robot1 = new Power();
		Power robot2 = new Power(30, 80);
		
		System.out.println(robot1.getKick());
		System.out.println(robot1.getPunch());
		System.out.println(robot2.getKick());
		System.out.println(robot2.getPunch());
		
	}
}

class Power{
	private int kick;
	private int punch;
	
	public Power() {
		this(10, 20);
	}
	
	public Power(int a, int b) {
		this.kick = a;
		this.punch = b;
	}

	public int getKick() {
		return kick;
	}

	public void setKick(int kick) {
		this.kick = kick;
	}

	public int getPunch() {
		return punch;
	}

	public void setPunch(int punch) {
		this.punch = punch;
	}
	
	
	
}