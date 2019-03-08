package report_190308;

public class StringPractice01 {
	
	public static String braceParse(String string, int a) {
		String sub = string.replace("{", "brace");
		String[] answer = sub.split("brace");
		return answer[a];
	}
	
	public static String quotesParse(String string, int a) {
		String[] answer = string.split("\"");
		return answer[a];
	}
	
	public static int intParse(String string, int a) {
		String[] sub1 = string.split("\"");
		String sub2 = sub1[a];
		int answer = Integer.parseInt(sub2);
		return answer;
	}
	
	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		for(int num = 0; num < numbers.length; num++) {
			System.out.print(numbers[num]);
			if(numbers.length == numbers[num]){
				break;
			}
			System.out.print("-");
		}
		
		System.out.println();
		
		String str = new String("data{\"number\":\"10\"}");
		System.out.println(str);
		
		String key = braceParse(str, 0); // data
		System.out.println(key);
		
		String subkey = quotesParse(str, 1); // number
		System.out.println(subkey);

		int value = intParse(str, 3); // 10
		System.out.println(value);

//		String key[] = str.split(" "); // data
//		System.out.println(key[0]);
//		
//		String subkey = str.substring(7, 13); // number
//		System.out.println(subkey);
//
//		int value = parse3(str); // 10
//		System.out.println(value);
		
	}

}
