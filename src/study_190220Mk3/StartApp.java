package study_190220Mk3;

public class StartApp {
	
	static void makeLamun(Lamun lamun) {
		lamun.printName();
		System.out.println();
	}
	
	public static void main(String[] args) {

		Samyang samyang = new Samyang("�����");
		makeLamun(samyang);
		
		Sin sin = new Sin("�Ŷ��");
		makeLamun(sin);
		
		Jin jin = new Jin("�����");
		makeLamun(jin);
		
	}

}
