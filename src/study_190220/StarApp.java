package study_190220;

public class StarApp {

	//ȭ�鿡 ���
	public static void printUnit(Zealot z1) {
		System.out.println(z1.name);
		System.out.println("���ݷ� :" + z1.attack);
		System.out.println("���� :" + z1.armor);
		System.out.println("ü�� :" + z1.st);
		System.out.println("���� :" + z1.sh);
		System.out.println();
	}
	
	public static void printUnit(Dragoon d1) {
		System.out.println(d1.name);
		System.out.println("���ݷ� :" + d1.attack);
		System.out.println("���� :" + d1.armor);
		System.out.println("ü�� :" + d1.st);
		System.out.println("���� :" + d1.sh);
		System.out.println();
	}
	
	public static void printUnit(DarkTempler dk1) {
		System.out.println(dk1.name);
		System.out.println("���ݷ� :" + dk1.attack);
		System.out.println("���� :" + dk1.armor);
		System.out.println("ü�� :" + dk1.st);
		System.out.println("���� :" + dk1.sh);
		System.out.println();
	}
	
	//�Ű����� 2��, �ϳ��� ������, �ϳ��� �´³�
	public static void attack(Zealot z1, Dragoon d1) {
		d1.sh = d1.sh - (z1.attack - d1.armor);
		System.out.println("������ ���� ���� : "+d1.sh);
	}
	
	//���1 -> ����1 �� ������ �Լ� ����
	
	public static void main(String[] args) {
		//���� ����
		//�⺻������ �����ڰ� �����Ǿ� �ִ�.
		Gateway gate1 = new Gateway();
		Zealot z1 = gate1.makeZealot();
		printUnit(z1);

		Zealot z2 = gate1.makeZealot();
		printUnit(z2);
		
		Dragoon d1 = gate1.makeDragoon();
		printUnit(d1); 
		
		DarkTempler dk1 = gate1.makeDarkTempler();
		printUnit(dk1); 

	}

}
