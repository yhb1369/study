package java1;

public class day01 {

	public static void main(String[] args) throws Exception{
		
		String name="홍길동";
		int age=20;
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("이\t름:"+name+"\n");
		System.out.println("나\t이:"+age+"\n");
		System.out.printf("이름%s\n:",name);
		System.out.printf("나이%s\n:",age);
		System.out.format("이름%s\n:",name);
		System.out.format("나이%s\n:",age);
		System.out.println();
		
		System.out.print("첫번째 수:");
		int num1=System.in.read();
		System.in.skip(2);
		
		System.out.print("두번째 수:");
		int num2=System.in.read();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}

}
