package study_181218;

public class Var2 {
	public static void main(String[] args) {
		int num = 20;
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		
		String name = "ȫ�浿";
		System.out.println(name+"�Կ��� 1000���� �Ա��Ͽ����ϴ�.");
		System.out.println(name+"���� 1000���� �Աݹ޾ҽ��ϴ�.");
		
		//������ ����ȯ : ���� �ٸ� Ÿ���� ������ �� ũ�Ⱑ ū Ÿ������ �ڵ���ȯ
		int i = 1;
		System.out.println(i+10); //���� Ÿ�԰��� ���� ������ ���
		System.out.println(i+"10"); //�ٸ� Ÿ�԰��� ���� ������ ���
		System.out.println(i+9.5); //������ ����ȯ���� int(4����Ʈ)���� double(8����Ʈ)�� �ڵ���ȯ
		
		//������(+, -, /, *, %)
		System.out.println(6+4);
		System.out.println(6-4);
		System.out.println(6/4); //int Ÿ�� ������� ���� ����� 1.5���� �Ҽ����� ������
		System.out.println(6/4.0); //double Ÿ�� ������� ���� ������ ����ȯ���� �Ҽ��� ������ ���
		System.out.println(6*4);
		System.out.println(6*4.0);
		System.out.println(6%3); //% : ���� ���� �� ������ ���� ǥ��
		
		//�ε�ȣ�� �̿��� boolean Ÿ��(true, false) ���� ���
		//System.out.println(1==1); //== : �յ��� ���� ������ ����
		System.out.println(1==2);
		System.out.println(1<99);
		System.out.println(1>99);
		System.out.println(1<=1); //<= : ���� ���� ���� ������ �۰ų� ������ ����
		System.out.println(1>=1); //>= : ���� �ݴ�
		//System.out.println(1!=1); //!= : ���� ���� ���� �ٸ��� ����
		System.out.println(1!=99);
		System.out.println(!true); //�� �տ� ! : ��������
		System.out.println(!false);

	}

}
