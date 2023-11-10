package java1;

import java.io.IOException;
import java.util.Scanner;

public class solution181882 {

	/**
	 * 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 
	 * 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이 입력: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "번째 숫자 입력: ");
            arr[i] = sc.nextInt();
        }

        arr = solution(arr);
        System.out.print("결과 배열: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	}
	
	public static int[] solution(int[] arr) {
		
        int[] answer = new int[arr.length];
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=50&&arr[i]%2==0) {
            	answer[i] = arr[i]/2;
            }else if(arr[i]<50&&arr[i]%2==1) { 
            	answer[i] = arr[i]*2;
            }else answer[i] = arr[i];
        }
        return answer;
    }

}
