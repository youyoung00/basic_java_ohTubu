package models;

	// java의 클래스 생성. 보통 내부변수는 private로 많이 사용함
	// 모델 클래스라고 할 수 있음. 
	public class Person {
		private String name;
		private int age;
		
		// 클래스 이름과 동일한 기본 생성자. 
		public Person() {
			
		}
		
		// 클래스의 이름과 동일한 오버로드 생성자.
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		// getter, setter 자동 생성 => 내 맥북에서 단축키가 고장. cmd + 3으로 검색해서 생성해야 함. 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		// toString() 메쏘드로 보기 쉬운 형태로 형변환 해야 함. 
		// 내 맥북에서 단축키가 고장. cmd + 3으로 검색해서 생성해야 함. 
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
		
	}

