package study_190221;

//타입!! 상속
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
		System.out.println("이　름 : " + Name);
	}
	public void getShield() {
		System.out.println("보호막 : " + Shield);
	}
	public void getHealth() {
		System.out.println("생명력 : " + Health);
	}
	public void getAttack() {
		System.out.println("공격력 : " + Attack);
	}
	public void getArmor() {
		System.out.println("방어력 : " + Armor);
	}
	
}
