package 클래스상속;

public class Cube extends Rect {

	double zSize; //높이

	public Cube(int id, double vSize, double hSize, double zSize) {
		super(id, vSize, hSize);
		this.zSize = zSize;
	}
	
	public double getVolume() {
		return super.getArea()*zSize;
		//         vSize*hSize*zSize;
	}
	
	@Override
	public double getArea() {
		return 2*(hSize*vSize + hSize*zSize + vSize*zSize);
	}
}
