package study;

public class ArrayEx1_181219 {

	public static void main(String[] args) {

		//int eng = 90;
		//int math = 80;
		//int kor = 60;
		//int soc = 70;
		
		// �迭
		// 0�� ��⿪, 1�� ������
		int score[] = {90, 80, 60, 70}; // ���� : 1. ���� Ÿ�Ը� ���� �� �ִ�  2. �ּ� ���� ������ ������ ���ϴ��� �˱� ��ƴ�
		String name[] = {"���� : ", "���� : ", "���� : ", "��ȸ : "}; 
		
		System.out.println(name[0] + score[0]);
		System.out.println(name[1] + score[1]);
		System.out.println(name[2] + score[2]);
		System.out.println(name[3] + score[3]);

	}

}
