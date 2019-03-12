package study_190312_mk2;

import java.util.ArrayList;


public class GenerixEx04 {
	
	private ArrayList<String> array = new ArrayList<>();

	
	public synchronized void myAdd(String value) {

		array.add(value);
	
	}
	
	
	public static void main(String[] args) {
		
	}

}
