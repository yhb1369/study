package java1;

import java.util.*;

public class solution120826 {
    //문자열 my_string과 문자 letter이 매개변수로 주어집니다. 
	//my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String my_string=sc.next();
		String letter=sc.next();
		System.out.print(solution(my_string,letter));
		

	}
	
	public static String solution(String my_string, String letter) {
        String answer = "";
        answer=my_string.replaceAll(letter,"");
        return answer;
    }

}
