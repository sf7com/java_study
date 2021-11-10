package Class;

class Circle3{
	private double radius;
	private String color;
	//������ �Լ� : ��ü�� ������ �ɶ� ȣ��Ǵ� �޼���
	//Ŭ���� �̸��� ������ �޼����� �̸��� ����
	
	public Circle3(double radius, String color) {
		//super();
		setRadius(radius);
		setColor(color);
//		this.radius = radius;
//		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}
	
	public Circle3(double radius) {
		//super();
		this(radius,"red");
	}
	
	public Circle3(String color) {
		//super();
		this(0,color);
	}
	
	public Circle3() {
		//super();
		this(0,"red");
	}

	public void setRadius(double radius) {
		if(radius>=0)
			this.radius = radius;
		else
			this.radius = 0;
	}
		
	public void setColor(String color) {
		//red,blue,green
		//���ڿ� ���� ������ ���Ҷ� equals�޼��� ���
		if(color.equals("red")||color.equals("blue")||color.equals("green"))
			this.color = color;
		else
			this.color="red";
	}


	public void draw() {
		System.out.printf("������ %.2f�� %s������ ���� �׸��ϴ�.\n",radius,color);
	}
}

public class CircleDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3 c1 = new Circle3(10, "red");
		c1.draw();
		Circle3 c2 = new Circle3(5, "blue");
		c2.draw();
		c2.setColor("yello");
		c2.draw();
		
		System.out.println(c2.getColor());
		System.out.println(c2.getRadius());
		
		Circle3 c3 = new Circle3(1, "red");
		Circle3 c4 = new Circle3(5);
		Circle3 c5 = new Circle3("blue");
		Circle3 c6 = new Circle3();
		System.out.print("C3:"); c3.draw();
		System.out.print("C4:"); c4.draw();
		System.out.print("C5:"); c5.draw();
		System.out.print("C6:"); c6.draw();
		
		Circle3 c7 = new Circle3(-5,"black");
		System.out.print("C7:"); c7.draw();
	}

}
