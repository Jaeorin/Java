package study_190305;

//���������� public  : ��𿡼��� ã�� �� ����
//���������� private : �ڱ� �۷��� �������� ã�� �� ����
//���������� ����         : ��Ű�� �������� ã�� �� ����
public class Coke implements Menu {
	//����
	private int price;
	private String desc;
	
	public Coke() {
		
	}
	
	//Ÿ���� ����, ������ �ٸ��� �����ε� ����
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
