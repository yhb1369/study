package java1;

import java.util.*;

public class solution181877 {

	/*
	 * 알파벳으로 이루어진 문자열 myString이 주어집니다. 
	 * 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("입력값:");
		String myString=sc.next();
		System.out.println(solution(myString));

	}
	
	public static String solution(String myString) {
        return myString.toUpperCase();
    }

}
