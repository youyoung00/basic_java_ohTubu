package j1030_basic_java;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic_java_ArrayList {

	public static void main(String[] args) {
		
		// 0. Array(배열) 선언하여 바로 값을 넣어 초기화
		int[] months = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };
		System.out.println(months[0]);
		
		// 0-1 for문 사용하여 출력 확인. 
		for(int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}
		
		// 0-2 Array(배열) 선언만 하여 공간만 만들기. 
		int[] months1 = new int[3];
		System.out.println(months1);
		
		// 0-3 Array(배열) 선언만한 배열에 값 할당하기 
		months1[0] = 11;
		months1[1] = 22;
		months1[2] = 33;
		System.out.println(months1.length);
		
		// 0-4 for문 사용하여 출력 확인. 		
		for(int i = 0; i < months1.length; i++) {
			System.out.println(months1[i]);
		}
		
		// 0-5 배열의 길이 변수 대입 하여 출력 .
		int length = months.length;
		System.out.println(length);
		
		
		
		
		// 1. 정수 ArrayList 선언. 출력 형태 : []
		ArrayList<Integer> aList = new ArrayList<>();
		System.out.println(aList);
		
		// 2. 정수 ArrayList 선언 후 asList로 값을 넣어 바로 초기화.
		ArrayList<Integer> aList2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(aList2);
		
		// 3. 정수 ArrayList aList 에 값을 추가. add()
		aList.add(3);
		System.out.println(aList);
		
		// 3-1 정수 ArrayList aList2 의 세번째 인덱스 삭제 remove() 
		aList2.remove(2);
		System.out.println(aList2);
		
		// 3-2 정수 ArrayList aList2 의 값 출력 get()
		System.out.println(aList2.get(2));
		
		// 4. 정수 ArrayList aList2 에 값을 추가. add()
		aList2.add(88);
		System.out.println(aList2);
		
		// 4-1 정수 ArrayList aList2 의 크기(길이) 구하기 size() 
		System.out.println(aList2.size());
		
		
		

		// 5. 문자열 ArrayList2 선언. 출력 형태 : []
		ArrayList<String> strArList2 = new ArrayList<String>();
		System.out.println(strArList2);
		
		// 6. 문자열 ArrayList 선언 후 as.List로 값을 넣어 바로 초기화.  
		ArrayList<String> strArList = new ArrayList<String>(Arrays.asList("Hello", "World", "Korea"));
		System.out.println(strArList);
		
		// 7. 문자열 ArrayList 에 .add()로 리스트의 마지막 인덱스에 새 문자열을 추가함.
		strArList.add("Baduk");
		System.out.println(strArList);
		
		// 7-1 문자열 ArrayList strArList 에 2번째 인덱스 삭제 remove()
		strArList.remove(1);
		System.out.println(strArList);
		
		// 7-2 문자열 ArrayList strArList 의 크기(길이) 구하기 size() 
		System.out.println(strArList.size());
		
		// 7-3 문자열 ArrayList strArList 의 값 출력 get()
		System.out.println(strArList.get(1));
		
		// 7-4 문자열 ArrayList strArList의 값 검색 contains() - true / false로 반환해줌. 
		System.out.println(strArList.contains("Hello"));
		
		// 7-5 문자열 ArrayList strArList의 값 검색 인덱스번호를 알고싶다면 : indexOf()
		System.out.println(strArList.indexOf("Korea"));
		
		
	}

}
