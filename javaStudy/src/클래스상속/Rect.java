package Ŭ�������;

public class Rect extends Shape{
	double vSize; //��������
	double hSize; //�������
	
	public Rect(int id, double vSize, double hSize) {
		super(id);
		this.vSize = vSize;
		this.hSize = hSize;

	}

	@Override
	public double getArea() {
		return vSize*hSize;
	}
	
	
	
}
