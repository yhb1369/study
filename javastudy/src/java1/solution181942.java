package java1;

import java.util.Scanner;

public class solution181942 {

	/*
	 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
	 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("str1 입력:");
		String str1=sc.next();
		System.out.print("str2 입력:");
		String str2=sc.next();
		
		String answer=solution(str1,str2);
		System.out.println(answer);
	}
	
	public static String solution(String str1, String str2) {
        String answer = "";

        for(int i=0; i<str1.length(); i++) {
            answer += "" + str1.charAt(i) + str2.charAt(i);
        }

        return answer;
    }

}
