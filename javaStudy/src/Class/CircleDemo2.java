package Class;

class Circle2{
	//필드값
	private double radius;
	final double PI=3.141592; //상수
	
	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}
	
	//메서드
	double getArea() {
		return PI*radius*radius;
	}
	
	void show() {
		System.out.printf("반지름 %.2f의 넓이는 %.2f입니다.\n", radius, getArea());
	}
}

public class CircleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle2 c1 = new Circle2();
		//c1.radius = 5.5;
		c1.setRadius(5.5);
		c1.show();
		
		Circle2 c2 = new Circle2();
		//c2.radius = -5;
		c2.setRadius(-5);
		c2.show();
	}

}
