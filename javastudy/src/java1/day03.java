package java1;

import java.util.*;

public class day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="";
		
		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
			
		String str2="";
		for(int i = str1.length(); i > 0; i--){
			str2 += str1.charAt(i-1);
		}
			
		if(str1.equals(str2)){
			System.out.println(str1+ "은 회문수 입니다.");
		}
		else{
			System.out.println(str1+ "은 회문수가 아닙니다.");
		}	
	}

}
