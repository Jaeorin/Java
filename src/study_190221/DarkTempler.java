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
