package j1030_basic_java;

public class Basic_java_variable {
	
	public Basic_java_variable() { // constructor
		
	}

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		// 상수 : 변하지 않는 값
		final int y = 33;
		System.out.println(y);
		
		// 변수2 : 정수(원시값, 데이터가 큰 타입부터 내림차순);
		long l = 30L; // 데이터 크기1. 
		int x = 30;
		short s = 30;
		byte b = 30;
		System.out.printf("long: %o, int: %o, short: %o, byte: %o\n"
				, l, x, s, b);
		
		// 변수2-1 정수의 형변환 : 큰타입을 작은타입에 담을 경우 사용. 
		int i = (int) 30L;
		
		// 변수 2-2 정수의 형변환: 작은 타입을 큰타입에 담을 경우 형변환 필요 없음.
		long ll = 30;  

		// 변수 3 소수(원시값, 데이터가 큰 타입부터 내림차순)
		double dd = 30.0;
		float ff = 30.0F;
		System.out.printf("double: %f, float: %f\n"
				, dd, ff);
		
		// 변수 3-1 소수의 형변환 : 작은 타입을 큰 타입에 넣을 경우 : 자동 형변환
		dd = ff; 
		
		// 변수 3-2 소수의 형변환 : 큰 타입을 작은 타입에 넣을 경우 : 형변환 필요.
		ff = (float) dd; 
		
		// 변수 4 불리언(원시값 0과 1을 true, false 로 분기 )
		boolean isMarried = true;
		System.out.println(isMarried);
		isMarried = false;
		System.out.println(isMarried);
		
		// 변수5 : 캐릭터(원시값, 거의 사용되지 않음. )
		char ch1 = 'a'; // 1. 문자1개 초기화 - 1byte 값
		char ch2 = '가'; // 1-1. 문자1개 초기화 - 2byte for Unicode 값
		char ch3 = 97; // 3. 정수값 넣어 초기화 //아스키 코드
		char ch4 = '\u0061'; // 4. 역슬레시u 뒤에 16진수 값 넣기 , 정규표현식에서 사용됨. 
		//System.out.println(ch3);
		System.out.printf("ch1: %c, ch2: %c, ch3: %c, ch4: %c\n"
				, ch1, ch2, ch3, ch4);
		
	    
		// 변수6 : 문자열 (객체참조형 값, 암묵적 객체생성)
		String str = "암묵적 객체생성 여러 글자";
		// 변수6-1 : 문자열 (명시적 객체생성 초기화 가능. 거의 쓰이지 않음. );
		String str2 = new String("명지적 객체셍성 여러 글자");
		// 변수6-2 : 문자열 (객체 생성이 되는데 property 가 빈 상태)
		String str3 = "";
		// 변수6-3 : 문자열 (객체 생성이 안된 상태)
		String str4 = null;
		
		// 변수의 출력1 : print(단순 출력. 개행을 위해선 \n 필요.)
		System.out.print(str + str2);
		
		// 변수의 출력2 : println(개행문자 \n 없어서 기본값으로 개행이 되어있음.)
		System.out.println(str + str2);
		
		// 변수의 출력3 : printf(C에서의 printf와 동일. %d, %s등을 쓰기위해 사용. 개행을 위해선 \n 필요.)
		// 사용법 : %b : boolan %d : 정수, %o : 8진수 정수, %x : 16진수 정수, %f : 소수 출력, %c : 문자 출력, %s : 문자열 출력, %n : 줄바꿈 기능, %e : 지수표현식 출력  
		System.out.printf("저는 %s 입니다. 나이는 %d살 이구요, 키는 %fcm입니다.\n", "홍길동", 20, 180.5F);
		
		// 변수의 출력4 : 변수에 직접 이름있는 생성자를 대입하고 println 하여 사용.
		String str5 = String.format("저는 %s 입니다. 나이는 %d살 이구요, 키는 %fcm입니다.%n", "홍길동", 20, 180.5F);
		System.out.println(str5);
		
	}	
}

