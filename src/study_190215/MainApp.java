package study_190215;

public class MainApp {

	public static void main(String[] args) {

/*		
		Animal a = new Animal();
		a.name = "호랑이";
		a.age = 2;
		a.sound();
*/

		Champ allistar = new Champ(
				"알리스타",
				"서포터",
				"점화",
				30,
				28,
				65,
				680,
				450
				);

		//호출할 때 넣는 값 : 인수
		
		System.out.println(allistar.name);
		System.out.println(allistar.type);
		System.out.println(allistar.spell);
		System.out.println(allistar.armor);
		System.out.println(allistar.mshield);
		System.out.println(allistar.attack);
		System.out.println(allistar.st);
		System.out.println(allistar.mp);
		
		Champ allistar2 = new Champ(
				"알리스타",
				"암살자",
				"강타",
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
		
		//레넥톤
		
		Champ Renekton = new Champ(
				"레넥톤",
				"암살자",
				"점화",
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
