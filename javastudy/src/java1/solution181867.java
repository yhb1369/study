package java1;

import java.util.Arrays;
import java.util.Scanner;

public class solution181867 {

	/*
	 * 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 
	 * 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세용:");
        String myString = sc.next();
        System.out.println(Arrays.toString(solution(myString)));

	}
	
	public static int[] solution(String myString) {
        String[] ms = myString.split("x");
        int[] answer = new int[ms.length];

        if (myString.charAt(myString.length()-1) == 'x') {
            answer = new int[ms.length+1];
        }

        for (int i=0; i<ms.length; i++) {
            answer[i] = ms[i].length();
        }

        return answer;
    }

}
