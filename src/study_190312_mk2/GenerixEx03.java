package study_190312_mk2;

import java.util.Vector;

public class GenerixEx03 {

	public static void main(String[] args) {
		
		Vector<String> vc = new Vector<String>();
		vc.add("Red");
		vc.add("Blue");
		vc.add("Yellow");
		
		System.out.println(vc.size());
		System.out.println(vc.contains("Red"));
		
		vc.remove(1);
		
		System.out.println(vc.contains("Blue"));
		
		vc.clear();
		
		System.out.println(vc.size());

		// ArrayList를 Vector 와 같이 동기화로 작동하게 하는 함수
//		List<String> list = Collections.synchronizedList(new ArrayList<String>());

	}

}
