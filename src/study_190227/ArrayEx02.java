package study_190227;

public class ArrayEx02 {
	
	public static void main(String[] args) {

		int num[] = new int[3];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		// int arr[] = num; //���� ����
		
		int array[] = new int[num.length];
		
		for (int i = 0; i < num.length; i++) { // 3�� ����
			array[i] = num[i];
		}
	}
}