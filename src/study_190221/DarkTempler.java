package study_190221;

public class DarkTempler implements ProtossUnit {

		String ProductSound = "Adun Toridas";
		String Name = "DarkTempler";
		int Shield = 40;
		int Health = 80;
		int Attack = 40;
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
