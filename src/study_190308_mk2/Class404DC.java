package study_190308_mk2;

import java.util.ArrayList;

interface Humen {
}


class Friend implements Humen {
	String name;
	public Friend(String name) {
		this.name = name;
	}
}

class Enermy implements Humen {
	String name;
	public Enermy(String name) {
		this.name = name;
	}
}

public class Class404DC {

	public static void main(String[] args) {
		// �ٿ�ĳ����
		// E : ���׸�E
		ArrayList<Humen> list = new ArrayList<>();
		
		try {
			list.add(new Friend("�����"));
			list.add(new Friend("������"));
			
			Friend f1 = (Friend) list.get(0);
			Friend f2 = (Friend) list.get(1);
			
			System.out.println(f1.name);
			System.out.println(f2.name);
			
			list.add(new Enermy("�ּ���"));
			
			Enermy e1 = (Enermy) list.get(2);
			System.out.println(e1.name);
		} catch (Exception e) {
			System.out.println("Casting Fail");
			
		}
	}
}
