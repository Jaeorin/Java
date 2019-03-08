package study_190308;


class Researcher extends People{
	
	public Researcher() {
	}
	public void research() {
		System.out.println("research");
	}
	@Override
	public void sleep() {
		// super.sleep(); super : ºÎ¸ğÀÇ °´Ã¼
		System.out.println("don't sleep");
	}	
}


class Student extends People{
	
	public Student() {
	}
	public void study() {
		System.out.println("study");
	}
}

class People {
	
	public People() {
	}
	public void speak() {
		System.out.println("speak");
	}
	public void eat() {
		System.out.println("eat");
	}
	public void walk() {
		System.out.println("walk");
	}
	public void sleep() {
		System.out.println("sleep");
	}

}

public class MainApp{
	
	public static void main(String[] args) {

		Student student = new Student();
		student.eat();
		student.sleep();
		student.speak();
		student.study();
		student.walk();
		
		Researcher researcher = new Researcher();
		researcher.eat();
		researcher.sleep();
		researcher.speak();
		researcher.research();
		researcher.walk();
		
	}
}
