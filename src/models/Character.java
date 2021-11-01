package models;

// 추상 클래스(내용이 없을 경우) : abstract클래스. (단일 클래스 상속)
public abstract class Character extends Person {
	public abstract void attack(Hero hero) ;
}

// 인터페이스 : 추상클래스와 동일하게 서식의 사용을 강제할 수 있음.
// 추상클래스와의 차이점 : 복수의 인터페이스클래스를 상속하여 여러 클래스의 속성을 합쳐서 사용할 수 있음. 사용 폭 넓음. 

// 인터페이스를 별도의 java파일로 이동 생성. 
//interface ICharacter {
//	void attack(Person person);
//}
