package Ŭ�������;

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
		return 4*super.PI*super.radius*super.radius; //super. ���� ��. �θ� Ŭ���� ����� ǥ��
	}

}
