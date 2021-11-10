package Class;

class Circle4{
	//�ν��Ͻ� ���� : static Ű����� �������� �ʾ� �������� ���� �ʵ�
	//�ν��Ͻ�(��ü)���� �ڽ��� �ʵ� ����
	double radius;
	
	//�������� : static Ű����� �����Ͽ� ��� �ν��Ͻ��� �����ϴ� �ʵ�
	static final double PI = 3.141592;
	static int numOfCircles = 0;
	int numCircles = 0;
	
	public Circle4(double radius) {
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}
	public double getArea() {
		return radius*radius*PI;
	}
	
	//static �޼��� ���ǻ���
	//��ü�� ���õ� �ν��Ͻ� ������ ����� �� ����.
	//��ü�� ���õ� �ν��Ͻ� �޼��带 ȣ���� �� ����.
	//��ü �ڽ��� ����Ű�� this Ű���带 ����� �� ����.
	static void utilMethod() {
//		numCircles = 3; //�Ϲ� �ʵ� �̹Ƿ� ����� �� ����.
		//getArea();
		//this.
		System.out.println("���Դϴ�.");
	}
	
	static int getCircleNum() {
		return numOfCircles;
	}
	
}
public class Statictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static ������� ��ü�� �������� �ʰ� ��� ����
		System.out.println(Circle4.PI);
		System.out.println(Circle4.numOfCircles);
		Circle4.utilMethod();
		
		//���������� ��� ��ü�� �����ϴ� �ʵ尪
		Circle4 c1 = new Circle4(10); //Circle4 c1; =>Circle4�� �ּҸ� ���� �� �ִ� ��������
									  // c1 = new Circle4(10); Ŭ���� ��ü�� ��������� �޸𸮿� �Ҵ�
		                              // Ŭ���� �ʵ�(����), �޼������ Ȱ�밡��
		Circle4 c2 = new Circle4(5);
		Circle4 c3 = new Circle4(9);
		System.out.println(Circle4.numOfCircles);
		System.out.println(Circle4.numOfCircles);
		System.out.println(c1.numOfCircles);
		System.out.println(c2.numOfCircles);
		System.out.println(c3.numOfCircles);
		
		//�ν��Ͻ� ���� : �������� ����
		System.out.println(c1.numCircles);
		System.out.println(c2.numCircles);
		System.out.println(c3.numCircles);
		
		
	}

}
