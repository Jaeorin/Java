package study_190215;

public class Champ {
	
	//로딩 - 초기화(생성자) = constructor

	public Champ(String name, String type, String spell, int armor, int mshield, int attack, int st, int mp) {

		this.name = name; //뒤의 name : 매개변수
		this.type = type;
		this.spell = spell;
		this.armor = armor;
		this.mshield = mshield;
		this.attack = attack;
		this.st = st;
		this.mp = mp;
		
		//this : 자기객체, 자기 class에 값을 전달해준다
		//method 내부에 있는 변수 : 지역변수
		
	}
	
	String name; // 케릭터명
	String type; // 암살자, 마법사, 원딜, 서포터, 탱커
	String spell; //유체화, 점멸, 점화, 텔포, 탈진, 강타
	int armor; //방어력
	int mshield; //마법저항력
	int attack; //공격력
	int st; //체력
	int mp; //마나
	
}
