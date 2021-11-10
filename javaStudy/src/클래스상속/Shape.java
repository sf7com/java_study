package 클래스상속;
//추상 메서드가 하나라도 있으면 추상 클래스가 된다.
public abstract class Shape { //abstract 추상클래스
	//도형 id
	private int id;
	
	public Shape(int id) {
		super();
		this.id = id;
	}

	//면적
	//추상 메서드 : 구현부를 바로 안만들어도 된다.
	public abstract double getArea(); //abstract 추상 메서드
	
	public void printId() {
		System.out.println("ID[" + id + "]");
	}
}
