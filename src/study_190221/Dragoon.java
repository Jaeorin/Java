package study_190221;

public class Dragoon implements ProtossUnit {
			
		String ProductSound = "I had returned";
		String Name = "Dragoon";
		int Shield = 100;
		int Health = 80;
		int Attack = 20;
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
