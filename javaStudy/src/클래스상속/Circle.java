package 클래스상속;

public class Circle extends Shape{

	double radius;
	public static final double PI = 3.141592; //protected 동일,동일,자식 클래스까지
	
	public Circle(int id, double radius) {
		super(id); //부모의 생성자 호출
		this.radius = radius;

	}
	
	@Override //메서드 재정리 하라는 의미
	public double getArea() {
		return PI*radius*radius;
	}
	
}
