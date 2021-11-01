package j1030_basic_java;

public class Main {

	public static void main(String[] args) {
		print("안녕");
		print(1);
		print(1.0);
		print(3L);
		print(true);
	}
	
	public static <T> void print(T type) {
		System.out.println(type);
	}

}
