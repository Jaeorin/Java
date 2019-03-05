package study_190305;

//접근지정자 public  : 어디에서든 찾을 수 있음
//접근지정자 private : 자기 글래스 내에서만 찾을 수 있음
//접근지정자 없음         : 패키지 내에서만 찾을 수 있음
public class Coke implements Menu {
	//상태
	private int price;
	private String desc;
	
	public Coke() {
		
	}
	
	//타입의 갯수, 성질이 다르면 오버로딩 가능
	public Coke(int price, String desc) {
		this.price = price;
		this.desc = desc;
	}

	public int getPrice() {
		return price;
	}

	public String getDesc() {
		return desc;
	}
	
	
	
}
