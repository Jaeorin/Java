package study_190220Mk3;

public class Jin implements Lamun {
	
	// Jin�̶�� �Լ�(������) ���� = String name
	// ������ �� �����������, �� �������
	// �������� new�Ҷ�, heap���� �����
	public Jin(String name) {
		this.name = name;
	}
	
	// �����ε�
	public Jin() {

	}

	String name;
	
	public void printName() {
		System.out.println(name);
		
	}

}
