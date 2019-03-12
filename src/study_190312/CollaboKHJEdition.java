package study_190312;

import java.util.ArrayList;
import java.util.StringTokenizer;

//스트링함수 쓰기 협업
//oid=회사번호 = 001(연합뉴스)
//sid1= 분야 = 100 (정치)
//aid = 게시글 번호 = 0000000001(10자리)
//
public class CollaboKHJEdition {

   private String sid1;
   private String oid;
   private String aid;
   private int numbersize;
   
   ArrayList<String> number = new ArrayList<String>();

   public void addressPasing(String address) {

      sid1 = number.get(2);
      oid = number.get(4);
      aid = number.get(6);
      numbersize = number.size();

   }

   public int paramCheck(String address) {
      int stateCode = 1; // 정상:1 비정상:-1
      StringTokenizer addressnumber = new StringTokenizer(address, "?&=");

      while (addressnumber.hasMoreTokens()) {
         number.add(addressnumber.nextToken());// 추출된 단어를 배열에 넣기
      }

      try {
         Integer.parseInt(number.get(2));
         Integer.parseInt(number.get(4));
         Integer.parseInt(number.get(6));

      } catch (Exception e) {
         System.out.println("파라메터 값이 숫자가 아닙니다.");
         stateCode = -1;
      }

      if(number.size() > 2) {
         if (!number.get(1).equals("sid1")) {
            System.out.println("파라메터 키(sid1)를 잘못 입력하셨습니다.");
            stateCode = -1;
         }
      }

      if(number.size() > 4) {
         if (!number.get(3).equals("oid")) {
            System.out.println("파라메터 키(oid)를 잘못 입력하셨습니다.");
            stateCode = -1;
         }
      }

      if(number.size() > 6 ) {
         if (!number.get(5).equals("aid")) {
            System.out.println("파라메터 키(aid)를 잘못 입력하셨습니다.");
            stateCode = -1;
         }
      }

      if (stateCode == 1)
         return 1;
      else
         return -1;
   }

   public static void main(String[] args) {
	   
      String address = "https://news.naver.com/main/read.nhn?sid1=100&oid=001&aid=0000000001";
      CollaboKHJEdition co = new CollaboKHJEdition();

      int statecode = co.paramCheck(address);

      if (statecode == 1)
         co.addressPasing(address);
      System.out.println("분야번호 : " + co.sid1);
      System.out.println("언론사번호 : " + co.oid);
      System.out.println("게시글번호 : " + co.aid);
      System.out.println(co.numbersize);
      
   }

}
