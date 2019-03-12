package study_190312_mk2;

import java.util.HashMap;

public class GenerixEx05 {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(0, "Red");
		hm.put(1, "Blue");
		hm.put(2, "Yellow");
		
		System.out.println(hm.get(0));
		hm.remove(1);
		System.out.println(hm.get(2));
		
		HashMap<String, String> hm2 = new HashMap<>();
		
		hm2.put("name", "choi");
		hm2.put("phone", "1234567890");
		hm2.put("address", "busan");
		
		System.out.println(hm2.get("phone"));
		System.out.println(hm2.get("name"));
		System.out.println(hm2.get("address"));
		
		System.out.println(hm2.containsKey("phone"));
		
	}

}
