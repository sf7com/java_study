package Class;

class Circle{
	//필드값
	double radius;
	final double PI=3.141592; //상수
	
	//메서드
	double getArea() {
		return PI*radius*radius;
	}
	
	void show() {
		System.out.printf("반지름 %.2f의 넓이는 %.2f입니다.\n", radius, getArea());
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		c1.radius = 5.5;
		c1.show();
		
		Circle c2 = new Circle();
		c2.radius = -5;
		c2.show();
	}

}
