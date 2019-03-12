package study_190312;

import java.util.Scanner;
import org.junit.Test;


class Util {
	
	String pagenum = "0000000000";

	public void castTest() {

		
		
	}
	
	@Test
	public void numberingTest() {
		// 0. 00000000001
		// 1. int로 변경
		// 2. ++증가
		// 3. 다시 10자리 String으로 변경
		// 4. sysout 출력
		int intswap = Integer.parseInt(pagenum);
		intswap++;
		pagenum = String.format("%010d", intswap);
		System.out.println(pagenum);
		
	}
	
}


public class Collabo2 {
	
	private String[]    key;
	private String[]  value;
	private String[] domain;
	private String[]  gubun;
	private String[] params;
	private String[]  naver = {"sid1", "oid", "aid"};
	
	
	public void addressParsing(String address) {
		
		System.out.println("주          소 (address) : " +               domain[2]);
		System.out.println("분  야  번  호 (   sid1) : " + params[0].split("=")[1]);
		System.out.println("신 문 사 번 호 (    oid) : " + params[1].split("=")[1]);
		System.out.println("게 시 글 번 호 (    aid) : " + params[2].split("=")[1]);
		
	}
	
	
	public int paramCheck(String address) {
		
		int stateCode = 1;
		
		domain =   address.split  ("/");
		 gubun =   address.split("\\?");
		params =  gubun[1].split  ("&");
		
		for(int number = 0; number > params.length; number++) {
			key[number] = params[number].split("=")[0];
		}
		
		for(int number = 0; number > params.length; number++) {
			value[number] = params[number].split("=")[1];
		}
		
		for(int number = 0; number > params.length; number++) {
			if(!key[number].equals(naver[number])) {
				System.out.println(naver[number] + "값이 없습니다");
				stateCode = -1;
			}
		}
		
		try {
			for(int number = 0; number > params.length; number++) {
				Integer.parseInt(value[number]);
			}
		}catch(Exception e){
			System.out.println("숫자가 아닙니다");
			stateCode = -1;
		}

		if(params.length != naver.length) {
			System.out.println("값 갯수가 틀립니다");
			stateCode = -1;
		}
		
		return stateCode;
		
	}
	
	
	public static void main(String[] args) {
		
		Collabo2 co = new Collabo2();
		Util util = new Util();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(sc);
		System.out.println("주소를 입력하세요");
		
		try {
			String address = sc.nextLine();
			int stateCode = co.paramCheck(address);
			if(stateCode == 1) co.addressParsing(address);
		}catch (Exception e) {
			System.out.println("올바른 주소를 입력하세요");
		}
		
		util.numberingTest();
		util.numberingTest();
		util.numberingTest();
		util.numberingTest();
		util.numberingTest();
		
	}

}
