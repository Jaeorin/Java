package study_190220Mk2;

public class Cat implements Animal {
	String name;

	public void getName() {
		System.out.println(name);
	}

	@Override
	public void sound() {
		System.out.println("¾ß¿Ë");
	}
	
}
