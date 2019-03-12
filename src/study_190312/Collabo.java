package study_190312;

import java.util.Scanner;


public class Collabo {
	
	private String sid1; //sid1 = 분야 = 100(정치)
	private String oid; //oid = 신문사번호 = 001(연합뉴스)
	private String aid; //aid = 게시글번호 = 0000000001(10자리)
	
	private String[] domain;
	private String[] gubun;
	private String[] params;
	
	
	public void addressParsing(String address) {
		
		System.out.println("주          소 (address) : " +               domain[2]);
		System.out.println("분  야  번  호 (   sid1) : " + sid1);
		System.out.println("신 문 사 번 호 (    oid) : " + oid);
		System.out.println("게 시 글 번 호 (    aid) : " + aid);
		
	}
	
	
	public int paramCheck(String address) {
		int stateCode = 1;
		
		domain = address.split("/");
		gubun = address.split("\\?");
		params = gubun[1].split("&");
		sid1 = params[0].split("=")[1];
		oid  = params[1].split("=")[1];
		aid  = params[2].split("=")[1];
		
		String sid1_value = params[0].split("=")[1];
		String oid_value = params[1].split("=")[1];
		String aid_value = params[2].split("=")[1];
		
		String sid1_key = params[0].split("=")[0];
		String oid_key = params[1].split("=")[0];
		String aid_key = params[2].split("=")[0];
		
		// 값이 숫자형태인지 조사
		try {
			Integer.parseInt(sid1_value);
			Integer.parseInt(oid_value);
			Integer.parseInt(aid_value);
		}catch(Exception e){
			System.out.println("숫자가 아닙니다");
			stateCode = -1;
		}
				
		// 이름이 oid, sid1, aid인지 조사
		if(!sid1_key.equals("sid1")) {
			System.out.println("sid1값이 없습니다");
			stateCode = -1;
		}
		if(!oid_key.equals("oid")) {
			System.out.println("oid가 아닙니다");
			stateCode = -1;
		}
		if(!aid_key.equals("aid")) {
			System.out.println("aid가 아닙니다");
			stateCode = -1;
		}
		
		// 파라메터 개수가 3개인지 조사
		if(params.length != 3) {
			System.out.println("값 갯수가 틀립니다");
			stateCode = -1;
		}

		// 셋중에 하나라도 문제가 있으면  -1리턴, 정상이면 1리턴
		// 문제가 있는 메시지를 sysout으로 출력
		
		return stateCode;
		
	}
	
	
	public static void main(String[] args) {
	
		
// https://news.naver.com/main/read.nhn?sid1=100&oid=001&aid=0000000001
// https://news.naver.com/main/read.nhn?sad1=100&oad=001&aad=0000000001&aad=0000000001
		
		Collabo co = new Collabo();
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
		
	}

}
