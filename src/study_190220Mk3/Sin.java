package study_190220Mk3;

public class Sin implements Lamun {
	
	// Jin�̶�� �Լ�(������) ���� = String name
	// ������ �� �����������, �� �������
	// �������� new�Ҷ�, heap���� �����
	public Sin(String name) {
		this.name = name;
	}
	
	// �����ε�
	public Sin() {

	}
	

	String name;
	
	public void printName() {
		System.out.println(name);
		
	}

}