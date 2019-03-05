package study_190305;

interface Menu {
	String getDesc();
	int getPrice();
}

public class Manager {

	public static void printMenu(Menu m) {
		System.out.println(m.getDesc());
		System.out.println(m.getPrice());
	}
	
	public static void main(String[] args) {
		Coke c1 = new Coke(1000, "�ݶ�");
		printMenu(c1);
		
		Burger b1 = new Burger(3000, "�򸳹���");
		printMenu(b1);
		
		Fri f1 = new Fri(1500, "����Ƣ��");
		printMenu(f1);
		
		//�� ���� ��Ʈ
		BigRibBurgerSet brset = new BigRibBurgerSet
		(new Burger(2500, "�򸳹���"), new Coke(800, "�ݶ�"), new Fri(1000, "����Ƣ��"));
		
		System.out.println("�򸳹��ż�Ʈ");
		System.out.println(brset.getDesc());
		System.out.println(brset.getPrice());
	}

}
