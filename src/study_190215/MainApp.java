package study_190215;

public class MainApp {

	public static void main(String[] args) {

/*		
		Animal a = new Animal();
		a.name = "ȣ����";
		a.age = 2;
		a.sound();
*/

		Champ allistar = new Champ(
				"�˸���Ÿ",
				"������",
				"��ȭ",
				30,
				28,
				65,
				680,
				450
				);

		//ȣ���� �� �ִ� �� : �μ�
		
		System.out.println(allistar.name);
		System.out.println(allistar.type);
		System.out.println(allistar.spell);
		System.out.println(allistar.armor);
		System.out.println(allistar.mshield);
		System.out.println(allistar.attack);
		System.out.println(allistar.st);
		System.out.println(allistar.mp);
		
		Champ allistar2 = new Champ(
				"�˸���Ÿ",
				"�ϻ���",
				"��Ÿ",
				40,
				35,
				75,
				700,
				450
				);
		System.out.println();
		System.out.println(allistar2.name);
		System.out.println(allistar2.type);
		System.out.println(allistar2.spell);
		System.out.println(allistar2.armor);
		System.out.println(allistar2.mshield);
		System.out.println(allistar2.attack);
		System.out.println(allistar2.st);
		System.out.println(allistar2.mp);
		
		//������
		
		Champ Renekton = new Champ(
				"������",
				"�ϻ���",
				"��ȭ",
				35,
				31,
				69,
				572,
				100
				);
		System.out.println();
		System.out.println(Renekton.name);
		System.out.println(Renekton.type);
		System.out.println(Renekton.spell);
		System.out.println(Renekton.armor);
		System.out.println(Renekton.mshield);
		System.out.println(Renekton.attack);
		System.out.println(Renekton.st);
		System.out.println(Renekton.mp);

	}

}
