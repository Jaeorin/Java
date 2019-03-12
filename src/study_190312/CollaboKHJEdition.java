package study_190312;

import java.util.ArrayList;
import java.util.StringTokenizer;

//��Ʈ���Լ� ���� ����
//oid=ȸ���ȣ = 001(���մ���)
//sid1= �о� = 100 (��ġ)
//aid = �Խñ� ��ȣ = 0000000001(10�ڸ�)
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
      int stateCode = 1; // ����:1 ������:-1
      StringTokenizer addressnumber = new StringTokenizer(address, "?&=");

      while (addressnumber.hasMoreTokens()) {
         number.add(addressnumber.nextToken());// ����� �ܾ �迭�� �ֱ�
      }

      try {
         Integer.parseInt(number.get(2));
         Integer.parseInt(number.get(4));
         Integer.parseInt(number.get(6));

      } catch (Exception e) {
         System.out.println("�Ķ���� ���� ���ڰ� �ƴմϴ�.");
         stateCode = -1;
      }

      if(number.size() > 2) {
         if (!number.get(1).equals("sid1")) {
            System.out.println("�Ķ���� Ű(sid1)�� �߸� �Է��ϼ̽��ϴ�.");
            stateCode = -1;
         }
      }

      if(number.size() > 4) {
         if (!number.get(3).equals("oid")) {
            System.out.println("�Ķ���� Ű(oid)�� �߸� �Է��ϼ̽��ϴ�.");
            stateCode = -1;
         }
      }

      if(number.size() > 6 ) {
         if (!number.get(5).equals("aid")) {
            System.out.println("�Ķ���� Ű(aid)�� �߸� �Է��ϼ̽��ϴ�.");
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
      System.out.println("�о߹�ȣ : " + co.sid1);
      System.out.println("��л��ȣ : " + co.oid);
      System.out.println("�Խñ۹�ȣ : " + co.aid);
      System.out.println(co.numbersize);
      
   }

}
