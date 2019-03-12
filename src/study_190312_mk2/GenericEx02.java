package study_190312_mk2;

import java.util.ArrayList;
import java.util.List;

public class GenericEx02 {

	public static void main(String[] args) {

		// List 인터페이스로 생성
		List<String> array = new ArrayList<String>();
		array.add("빨강");
		array.add("파랑");
		array.add("노랑");
		
		// 배열크기 = length, 컬렉션크기 = size
		System.out.println(array.size());
		// 배열출력 = A[number], 컬렉션출력 = A.get(number)
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		System.out.println(array.get(2));
//		System.out.println(array.get(3)); // OutOfBound오류
		
//		array.clear();
//		System.out.println(array.size());
		
		array.set(1, "초록"); //업데이트
		System.out.println(array.get(1));
		
		array.remove(1); // 삭제(이후 자동으로 배열 크기가 줄어들고 1번지 값이 0번지로 들어감)
		System.out.println(array.get(1));
		
		System.out.println(array.contains("빨강")); // 배열에 있는 값 확인
		

	}

}
