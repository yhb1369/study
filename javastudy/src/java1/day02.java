package java1;

import java.util.*;

public class day02 {

	public static void main(String[] args) {
		System.out.println("정수 : ");
		Scanner sc = new Scanner(System.in);
		String n = "";
		
		try {
			n = sc.next();
			int num = Integer.parseInt(n);
			System.out.println("결과: " + num);
		}
		catch(Exception e) {
		System.out.println("결과: " + n + "은 정수가 아닙니다.");
		}

		
		String str;
		int count = 0;
			
		System.out.print("입력 : ");
		sc = new Scanner(System.in);
		str = sc.next();
			
		for(int i = 0; i < str.length(); i++){
				
			if(str.charAt(i) == 'a'){
				count++;
			}
		}
			
		System.out.println("a의 갯수 : " + count);

	}

	
	
}
