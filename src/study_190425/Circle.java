package study_190425;

public class Circle extends Shape {
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.paint();
	}
	
	public void paint() {
		super.draw();
		this.draw();
	}
	public void draw() {
		System.out.println("Circle");
	}
}
