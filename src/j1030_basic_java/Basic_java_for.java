package j1030_basic_java;

public class Basic_java_for {

	public static void main(String[] args) {
		
		// 1. for문 기본 형태 : 0~9까지 반복. 
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println(); // 한줄 띄움
		
		// 1-2. for문 + if문 break : 반복 중, 6을 만나면 멈춤 
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 6) {
				break;
			}
		}
		
		System.out.println(); // 한줄 띄움
		
		// 1-3. for문 + if문 continue: 반복 중, 6만 수행하지 않 다음 반복 넘어감.
		for(int i = 0; i < 10; i++) {
			if (i == 6) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println(); // 한줄 띄움
		
		// 2. while문 기본 형태 : 0~9까지 반복.
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(); // 한줄 띄움
		
		// 3. do while문 기본 형태 : 0~9까지 반복.
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);

	}

}
