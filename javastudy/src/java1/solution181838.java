package java1;

import java.util.Scanner;

public class solution181838 {

	/*
	 * 정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 
	 * 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
	 * 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int[] date1 = new int[3];
        int[] date2 = new int[3];
        for (int i = 0; i < date1.length; i++) {
        	if(i==0) {
        		System.out.print("date1 년도 입력:");
        	}else if(i==1) {
        		System.out.print("date1 월 입력:");
        	}else if(i==2) {
        		System.out.print("date1 일 입력:");
        	}
        	date1[i] = sc.nextInt();
        }
        
        for (int i = 0; i < date2.length; i++) {
        	if(i==0) {
        		System.out.print("date2 년도 입력:");
        	}else if(i==1) {
        		System.out.print("date2 월 입력:");
        	}else if(i==2) {
        		System.out.print("date2 일 입력:");
        	}
        	date2[i] = sc.nextInt();
        }

        int answer = solution(date1,date2);
        System.out.println(answer);
	}

	
	public static int solution(int[] date1, int[] date2) {
        int answer = 0;

        for(int i=0; i < date1.length; i++) {
            if(date1[i] < date2[i]) {
                answer = 1;
                break;
            }else if(date1[i] > date2[i]){
                answer = 0;
                break;
            }
        }

        return answer;
    }
}
