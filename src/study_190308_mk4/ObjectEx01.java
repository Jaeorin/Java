package study_190308_mk4;

class Animal {
	
	@Override
	public String toString() {
		return "Animal ��ü�Դϴ�.";
	}
}

public class ObjectEx01 {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		// ��� Ŭ������ ������ ȣ�� �� �⺻������ toString�� ����Ǿ� ���´�
		System.out.println(a);
		System.out.println(a.toString());

		StringBuilder sb = new StringBuilder();
		sb.append("�ȳ�");
		String hello = sb.toString();
		System.out.println(hello);
		
		// ���ڿ� ���ڸ� ���ϸ� ���ڰ� ��(������ ����ȯ)
		int num = 1;
		String num2 = num + "";
		
		// ���ڸ� Integer.parseInt() �Լ��� �̿��� ���ڷ� ��ȯ����(����� ����ȯ)
		String data = "10";
		int data2 = Integer.parseInt(data);
		
		System.out.println(num2 + data2);
		
		String name1 = "��";
		String name2 = "��";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
	}
}
