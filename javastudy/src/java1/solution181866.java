package java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solution181866 {

	/*
	 * 문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 
	 * 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.단, 빈 문자열은 반환할 배열에 넣지 않습니다.
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String myString = sc.next();
		System.out.println(Arrays.toString(solution(myString)));

	}

	public static String[] solution(String myString) {
        String[] answer = myString.split("x");

        List<String> answerList = new ArrayList<>();
        for(int i = 0; i < answer.length; i++){
            if(answer[i].equals("")) continue;

            answerList.add(answer[i]);
        }


        Collections.sort(answerList);

        String[] returnArray = new String[answerList.size()];
        for(int i = 0; i < returnArray.length; i++){
            returnArray[i] = answerList.get(i);
        }


        return returnArray;
    }
}
