package study;

public class ArrayEx1_181219 {

	public static void main(String[] args) {

		//int eng = 90;
		//int math = 80;
		//int kor = 60;
		//int soc = 70;
		
		// 배열
		// 0번 김기역, 1번 남니은
		int score[] = {90, 80, 60, 70}; // 단점 : 1. 같은 타입만 넣을 수 있다  2. 주석 등이 없으면 무엇을 뜻하는지 알기 어렵다
		String name[] = {"영어 : ", "수학 : ", "국어 : ", "사회 : "}; 
		
		System.out.println(name[0] + score[0]);
		System.out.println(name[1] + score[1]);
		System.out.println(name[2] + score[2]);
		System.out.println(name[3] + score[3]);

	}

}
