package study_190220Mk3;

public class StartApp {
	
	static void makeLamun(Lamun a) {
		a.printName();
		System.out.println();
	}
	
	public static void main(String[] args) {

		Samyang samyang = new Samyang();
		samyang.name = "�����";
		makeLamun(samyang);
		
		Sin sin = new Sin();
		sin.name = "�Ŷ��";
		makeLamun(sin);
		
		Jin jin = new Jin();
		jin.name = "�����";
		makeLamun(jin);
		
	}

}
