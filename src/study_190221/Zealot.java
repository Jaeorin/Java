package study_190221;

//Ÿ��!! ���
public class Zealot implements ProtossUnit {

	String ProductSound = "My Life Aior";
	String Name = "Zealot";
	int Shield = 100;
	int Health = 60;
	int Attack = 16;
	int Armor = 1;
	
	public void getProductSound() {
		System.out.println(ProductSound);
	}
	public void getName() {
		System.out.println("�̡��� : " + Name);
	}
	public void getShield() {
		System.out.println("��ȣ�� : " + Shield);
	}
	public void getHealth() {
		System.out.println("����� : " + Health);
	}
	public void getAttack() {
		System.out.println("���ݷ� : " + Attack);
	}
	public void getArmor() {
		System.out.println("���� : " + Armor);
	}
	
}
