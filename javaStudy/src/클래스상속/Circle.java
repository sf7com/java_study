package Ŭ�������;

public class Circle extends Shape{

	double radius;
	public static final double PI = 3.141592; //protected ����,����,�ڽ� Ŭ��������
	
	public Circle(int id, double radius) {
		super(id); //�θ��� ������ ȣ��
		this.radius = radius;

	}
	
	@Override //�޼��� ������ �϶�� �ǹ�
	public double getArea() {
		return PI*radius*radius;
	}
	
}
