package study_190220Mk3;

public class Samyang implements Lamun {
	
	// Jin�̶�� �Լ�(������) ���� = String name
	// ������ �� �����������, �� �������
	// �������� new�Ҷ�, heap���� �����
	public Samyang(String name) {
		this.name = name;
	}

	// �����ε�
	public Samyang() {

	}
	

	String name;
	
	public void printName() {
		System.out.println(name);
		
	}

}