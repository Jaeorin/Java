package study_190215mk2;

public class StarApp {
	
	//ȭ�鿡 ���
	//�Ʒ� �ΰ� �Լ����� �������� ������ ���� �ʴ°��� ��ȣ ���� �Ű�����(���ڸ�) �ٸ��� �����ν� �ڹٿ��� �����ϴ� �޼ҵ� �����ε��� ����Ǳ� �����̴�
	public static void printUnit(Zealot z1) {
		System.out.println(z1.name);
		System.out.println("����� : " + z1.st);
		System.out.println("��ȣ�� : " + z1.sh);
		System.out.println("���ݷ� : " + z1.attack);
		System.out.println("���� : " + z1.armor);
	}
	
	public static void printUnit(Dragoon d1) {
		System.out.println(d1.name);
		System.out.println("����� : " + d1.st);
		System.out.println("��ȣ�� : " + d1.sh);
		System.out.println("���ݷ� : " + d1.attack);
		System.out.println("���� : " + d1.armor);
	}
	
	//�Ű����� 2��, (������, �ǰ���)
	public static void attack(Zealot z1, Dragoon d1) {

		d1.sh = d1.sh - (z1.attack - d1.armor);
		if(d1.sh <= 0) {
			d1.st = d1.st + d1.sh;
			d1.sh = 0;
			if(d1.st <= 0) {
				d1.sh = 0;
				d1.st = 0;
				System.out.println("������ ����� �����Ͽ���");
				System.out.println("����� ���� ��ȣ�� : " + d1.sh);
				System.out.println("����� ���� ����� : " + d1.st);
				System.out.println();
				System.out.println("������ ����� óġ�Ͽ���!");
			}
		}
		
		if(d1.st > 0) {
			System.out.println();
			System.out.println("������ ����� �����Ͽ���");
			System.out.println("����� ���� ��ȣ�� : " + d1.sh);
			System.out.println("����� ���� ����� : " + d1.st);
		}
		

	}
	
	public static void attack(Dragoon d1, Zealot z1) {
		z1.sh = z1.sh - (d1.attack - z1.armor);
		System.out.println("����� ������ �����Ͽ���");
		System.out.println("������ ���� ��ȣ�� : " + z1.sh);
	}

	public static void main(String[] args) {
		//���� ����
		//�⺻������ �����ڰ� �����Ǿ� �ִ�
		Gateway gate1 = new Gateway();

		System.out.println();
		Zealot z1 = gate1.makeZealot();
		printUnit(z1);

		System.out.println();
		Zealot z2 = gate1.makeZealot();
		printUnit(z2);
		
		System.out.println();
		Dragoon d1 = gate1.makeDragoon();
		printUnit(d1);

		//���� 1�� ��� 1�� ����
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		
		System.out.println();
		attack(d1, z1);


	}
	


}
