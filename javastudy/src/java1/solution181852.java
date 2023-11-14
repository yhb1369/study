package java1;

import java.util.Arrays;

public class solution181852 {

/*
 * 정수로 이루어진 리스트 num_list가 주어집니다. 
 * num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
	public static void main(String[] args) {

		int[] num_list= {23,34,11,54,21,22,66};
		num_list=solution(num_list);
		
		System.out.println(Arrays.toString(num_list));
	}
	

	    public static int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length - 5];
	        Arrays.sort(num_list);
	        for(int i = 5 ; i < num_list.length ; i++) {
	            answer[i-5] = num_list[i];
	        }
	        return answer;
	    }

}
