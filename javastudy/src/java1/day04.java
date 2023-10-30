package java1;

import java.util.*;

public class day04 {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
//		 붙여서 출력하기
//	     String a = sc.next();
//	     String b = sc.next();
//	     System.out.println(a+b);
	     
	     String phone_number=sc.next();
	     phone(phone_number);
	     System.out.println(phone_number);
	}
	
	//핸드폰 번호 뒤에 4자리 빼고 가리기
	public static String phone(String phone_number) {
	      String phonenum = "";
	      
	        for (int i = 0;i < phone_number.length()-4;i++)
	        phonenum += "*";

	        phonenum+= phone_number.substring(phone_number.length() - 4);

	        return phonenum;
	  }

}
