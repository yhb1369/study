package java1;

import java.util.Arrays;
import java.util.Scanner;

public class solution181834 {

	/*
	 * 알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 
	 * 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String myString = sc.next();
		System.out.println(solution(myString));

	}
	
	public static String solution(String myString) {
        String answer = "";

        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) < 'l') {
                answer += "l";
            }else {
                answer += myString.charAt(i); 
            }
        }

        return answer;
    }

}
