package java1;

import java.util.Scanner;

public class solution181847 {

	/**
	 * 정수로 이루어진 문자열 n_str이 주어질 때, 
	 * n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("입력값:");
		String answer=sc.next();
		System.out.println(solution(answer));

	}

	public static String solution(String n_str) {
        String answer = "";

        answer = Integer.parseInt(n_str) + "";

        return answer;
    }
}
