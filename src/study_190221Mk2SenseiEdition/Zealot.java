package study_190221Mk2SenseiEdition;

//Å¸ÀÔ!! »ó¼Ó
public class Zealot extends ProtossUnit {
	
	public Zealot() {
		System.out.println("My Life Aior");
	}
	
	String name = "Áú·µ";
	int st = 100; //Ã¼·Â
	int sh = 60; //½¯µå
	
	
	@Override
	public void getName() {
		System.out.println(name);
	}
	public void getSh() {
		System.out.println("½¯µå :" + sh);
	}
	public void getSt() {
		System.out.println("Ã¼·Â :" + st);
	}

}
