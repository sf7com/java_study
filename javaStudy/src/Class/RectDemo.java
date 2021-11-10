package Class;

class Rect{
	double width,height;
	
	public Rect(double width,double height) {
//		setRect(width,height);
		super();
		this.width=width;
		this.height=height;
		
	}
	
	double getArea() {
		return width*height;
	}
	
	void draw() {
		System.out.printf("가로:%.2f, 세로:%.2f 사각형의 넓이는 %.2f 입니다.\n",width,height,getArea());
	}
}
public class RectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect(3.0,4.1);
		Rect r2 = new Rect(4.1,2.2);
		Rect r3 = new Rect(1.5,5.3);
		
		r1.draw();
		r2.draw();
		r3.draw();
		
		//3개의 사각형 중에 넓이가 가장 큰 값을 구하시오.
		double maxArea;
		if(r1.getArea() > r2.getArea())
			maxArea = r1.getArea();
		else
			maxArea = r2.getArea();
		
		if(r3.getArea() > maxArea)
			maxArea = r3.getArea();
		
		System.out.printf("3개의 사각형중 넓이가 가장 큰 값은 %.2f입니다.\n",maxArea);
	}

}
