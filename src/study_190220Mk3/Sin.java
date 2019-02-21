package study_190220Mk3;

public class Sin implements Lamun {
	
	// Jin이라는 함수(생성자) 스택 = String name
	// 아직은 안 만들어졌지만, 곧 만들어짐
	// 누군가가 new할때, heap으로 저장됨
	public Sin(String name) {
		this.name = name;
	}
	
	// 오버로딩
	public Sin() {

	}
	

	String name;
	
	public void printName() {
		System.out.println(name);
		
	}

}