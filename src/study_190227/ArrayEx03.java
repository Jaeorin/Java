package study_190227;

public class ArrayEx03 {
	
	public static void main(String[] args) {

		int num[] = new int[3];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		int number[] = new int[3];
		number[0] = 4;
		number[1] = 5;
		number[2] = 6;
		
		int len = num.length + number.length;		
		int array[] = new int[len];
		
		for(int i = 0; i < len; i++) {
			if(i < num.length) {
				array[i] = num[i];
			}else {
				array[i] = number[i-number.length];
			}
		}
			
		for(int i = 0; i < len; i++) {
			System.out.println(array[i] + " ");	
		}
		
	}
}