package study_190308;

import java.util.ArrayList;

interface Humen {
	String getName();
}

class Friend implements Humen {
	String name;
	public Friend(String name) {
		this.name = name;
	}
	@Override
	public String getName() {	
		return name;
	}
}

class Enermy implements Humen {
	String name;
	public Enermy(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
}

public class Class404OR {

	public static void main(String[] args) {
		// �������̵�
		// E : ���׸�E
		ArrayList<Humen> list = new ArrayList<>();
		
		list.add(new Friend("�����"));
		list.add(new Friend("������"));
		System.out.println(list.get(0).getName());
		System.out.println(list.get(1).getName());
		
		list.add(new Enermy("�ּ���"));
		System.out.println(list.get(2).getName());
		
	}
}
