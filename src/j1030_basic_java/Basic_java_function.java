package j1030_basic_java;
import java.util.ArrayList;

import models.Character;
import models.Hero;
import models.IChatacter;
import models.Magician;
import models.Person;

public class Basic_java_function {

	public static void main(String[] args) {
		add(50, 10);
		add(30, 10);
		
		System.out.println(rAdd(30, 10));
		System.out.println(rAdd(30, 10, 40));
		System.out.println(rAdd(1, 2, 3, 4, 5, 6, 7, 8));
		
		Person person = new Person();
		Person person2 = new Person("안녕하세요", 10);
		System.out.println(person);
		System.out.println(person2);
		
//		Hero hero = new Hero();
//		hero.getName();
//		hero.getAge();
//		hero.isFlyng();
		
		Hero hero1 = new Hero("슈퍼맨");
		Hero hero2 = new Hero("배트맨");
		hero1.attack(hero2);
		
		// 추상클래스 이기 때문에 일반적인 생성자로 생성불가능.
		// Character character = new Character();  
		
		// 하지만 자식클래스의 생성자로 생성 가능. 
		Character character = new Hero("name");
		
		// magician 클래스는 interface클래스, 부모클래스, 자신의 클래스로 생성자를 만들 수 있다. (다형성) 
		Magician magician = new Magician();
		Character magician2 = new Magician();
		IChatacter magicion3 = new Magician();
		
		if(magician2 instanceof Magician) {
			
		}
		
		ArrayList<Character> characterArrayList = new ArrayList<>();
		characterArrayList.add(magician);
		characterArrayList.add(magician2);
		characterArrayList.add(hero1);
		
		// magician3는 add 불가.Character클래스의 범위내에서만 add 가능.
		// characterArrayList.add(magician3);
		

	}
	
	// 함수의 분리 사용 - main 코드가 길어질 경우, 유용
	
	// void 함수. print구문은 함수내에서 사용.(return 값이 없기 때문)  
	public static void add(int x, int y) {
		System.out.println(x + y);
	}
	
	// return 이 있는 함수. print구문은 호출부에서 사용. 
	public static int rAdd(int x, int y) {
		return x + y;
	}
	
	// 오버로드 메서드1 : Dart 옵셔널파라미터 처럼 사용가능. 
	public static int rAdd(int x, int y, int z) {
		return x + y + z;
	}
	
	
	// 오버로드 메서드2 : 호출부에서 원하는 형태의 변수를 모두 사용하고 싶을 경우.
	// ...메서드는 0개 ~ 원하는 개수까지 호출할때 넣어서 사용 가능. 
	// 배열의 형태로 변수를 저장함. 
	public static int rAdd(int ... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + i;
		}
		return sum;
	}


}
