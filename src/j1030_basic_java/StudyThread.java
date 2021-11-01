package j1030_basic_java;

import java.util.ArrayList;

public class StudyThread {

	public static void main(String[] args) {
		
		System.out.println("1");
		
		new Thread(new Runnable() {
			@Override
			public void run() {
               for (int i = 0; i < 5; i++) { 
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + ":" + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
               }
				//System.out.println("3");		
			}
			
		}).start();
		
		
		// 추상메서드가 하나인 인터페이스 에서는 자바8 제공의 람다식 표현법을 쓸 수 있음. 위와 동일 코드.   
		new Thread(() -> {
	
           for (int i = 0; i < 5; i++) { 
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + ":" + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//System.out.println("3");		
			}
			
		}).start();
		
		System.out.println("2");
		
	} 

}
	