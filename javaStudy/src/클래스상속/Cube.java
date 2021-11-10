package Ŭ�������;

public class Cube extends Rect {

	double zSize; //����

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
