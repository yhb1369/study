package java1;

public class day05 {

	public static void main(String[] args) {
		//영어로 표기되어 있는 수를 정수로 바꾸어 return
		String numbers="fivetwoonesevennine";
		System.out.println(solution(numbers));
		
		//문자열 안의 자연수들을 모두 더한 값을 return
		String my_string="2ji30ujfdsji4our802u0";
		System.out.println(solution2(my_string));

	}
	
	 public static long solution(String numbers) {
	        return Long.parseLong(
	                numbers.replaceAll("zero", "0")
	                        .replaceAll("one", "1")
	                        .replaceAll("two", "2")
	                        .replaceAll("three", "3")
	                        .replaceAll("four", "4")
	                        .replaceAll("five", "5")
	                        .replaceAll("six", "6")
	                        .replaceAll("seven", "7")
	                        .replaceAll("eight", "8")
	                        .replaceAll("nine", "9")
	        );
	 }
	 
	 public static int solution2(String my_string) {
	        int result = 0;
	        String[] str = my_string.replaceAll("[a-zA-Z]"," ").split(" ");

	        for(String s : str){
	            if(!s.equals("")){
	                result += Integer.parseInt(s);
	            }
	        }
	        return result;
	    }

}
