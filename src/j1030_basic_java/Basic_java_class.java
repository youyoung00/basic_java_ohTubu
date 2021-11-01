package j1030_basic_java;

import java.util.Random;
import java.util.Scanner;

public class Basic_java_class {

	public static void main(String[] args) {
		
		// 유용한 클래스1 : Math.max()두 수 중, 더 큰 수를 표시
		System.out.println(Math.max(10, 30));
		
		// 유용한 클래스1-1 : Math.min()두 수 중, 더 작은 수를 표시
		System.out.println(Math.min(10, 30));

		// 유용한 클래스1-2 : 절대값 표시
		System.out.println(Math.abs(-30));
		
		// 유용한 클래스2 : Integer.parseInt() 문자열을 숫자로 형변환 
		String str = "100";
		int i = Integer.parseInt(str);
		// long l = Long.parseLong(str); // long 으로도 형변환 가능. 
		System.out.printf("문자열 => 정수 : %o\n", i);
		
		// 유용한 클래스3 : String.valueOf(i) : 정수를 문자열로 형변환
		String str2 = String.valueOf(i);
		System.out.printf("정수 => 문자열 : %o\n", i);
		
		// 유용한 클래스4 : new Random();
		Random random = new Random();
		
		// 0 ~ 9 까지 랜덤
		int rand = random.nextInt(10);
		System.out.println(rand);
		// 5 ~ 9 까지 랜덤
		int rand2 = random.nextInt(4) + 5;
		System.out.println(rand2);
		
		// 유용한 클래스5 : 문자열 입력 받기 new Scanner();
		Scanner scanner = new Scanner(System.in); 
		
		// 문자열, 정수, 롱으로 입력받을 수 있음.
		String str3 = scanner.next();
//		int in = scanner.nextInt();
//		long l = scanner.nextLong();
		
		System.out.println(scanner.next());
//		System.out.println(scanner.nextInt());
//		System.out.println(scanner.nextLong());
		
		
	}

}
 