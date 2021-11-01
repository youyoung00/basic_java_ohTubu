package j1030_basic_java;

public class Basic_java_if {

	public static void main(String[] args) {
		// 1. if문 기본 예제
		int i = 5;
		
		if (i < 3) {
			System.out.println("참");
		} else if (i < 5) {
			System.out.println("거짓");
		} else {
			System.out.println("나머지");
		}
		
		
		// 2. 삼항 연산자 기본 예제
		boolean isMarried = true;
		String str;
		str = isMarried ? "결혼 했다" : "결혼 안 했다";
		System.out.println(str);
		
		// 3. if문 예제2
		boolean isMarried2 = false;
		boolean isMan = true;
		String str2;
		
		if (isMarried2 && isMan) {
			str2 = "결혼한 남자다";
		} else if (isMarried && !isMan) {
			str2 = "결혼한 여자다";
		} else if (!isMarried && isMan) {
			str2 = "미혼 남자다";
		} else {
			str2 = "미혼 여자다";
		}
		
		System.out.println(str2);
		
		
		// 4. switch 문 예제
		int month = 13;
		String monthString;
		
		switch (month) {
			case 1: monthString = "January";
				break;
			case 2: monthString = "February";
				break;
			case 3: monthString = "March";
				break;
			case 4: monthString = "April";
				break;
			case 5: monthString = "May";
				break;	
			case 6: monthString = "June";
				break;
			case 7: monthString = "July";
				break;
			case 8: monthString = "August";
				break;
			case 9: monthString = "September";
				break;
			case 10: monthString = "October";
				break;
			case 11: monthString = "November";
				break;	
			case 12: monthString = "December";
				break;	
			default: monthString = "Invalid month";
		}
		System.out.println(monthString);
	}
	
}
