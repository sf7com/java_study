package 인터페이스;

public interface Controllable {
	//추상 메서드 - 구현부가 없고 선언만 되어있는 메서드.
	void turnOn();
	void turnOff();
	
	//interface 내에서만 사용가능
	private void show(String s) {
		System.out.println(s);
	}
	
	//구현부가 있는 메섣, Java 8버전부터 사용가능
	default void repair() {
		show("장비를 수리합니다.");
	}
	
	static void reset() { //객체간 공유가능, 객체가 있어야 사용가능 
		System.out.println("장비를 초기화합니다.");
	}
}
