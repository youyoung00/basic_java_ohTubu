package models;

public class Hero extends Character {
	
	// Hero클래스 생성자. 
	public Hero(String name) {
		//super(name, 0);
		setName(name);
	}
	
	private boolean isFlyng;

	public boolean isFlyng() {
		return isFlyng;
	}

	public void setFlyng(boolean isFlyng) {
		this.isFlyng = isFlyng;
	}
	
	// attack 기능이 필요할 경우 추가 사용 가능. 
	// => Character클래스로 이동 후 abstract로 상속받은 클래스들은 강제 사용으로 변경.
//	public void attack(Hero hero) {
//		System.out.println(this.getName() + "은 " + hero.getName() + "과 싸움을 했다.");
//	}
	
	@Override
	public void attack(Hero hero) {
		System.out.println(this.getName() + "은 " + hero.getName() + "과 싸움을 했다.");
	
	}
}
