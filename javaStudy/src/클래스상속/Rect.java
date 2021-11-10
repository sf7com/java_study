package 클래스상속;

public class Rect extends Shape{
	double vSize; //수직길이
	double hSize; //수평길이
	
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
