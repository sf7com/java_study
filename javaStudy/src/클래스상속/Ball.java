package 클래스상속;

public class Ball extends Circle {
	
	public Ball(int id, double radius) {
		super(id, radius);
	}

	public double getVolume() {
		return 4/3*PI*radius*radius*radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 4*super.PI*super.radius*super.radius; //super. 빼도 됨. 부모 클래스 명시적 표기
	}

}
