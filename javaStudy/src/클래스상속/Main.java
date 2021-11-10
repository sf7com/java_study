package Ŭ�������;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Circle c1 = new Circle(1,10);
		c1.printId(); // �θ��� �޼���
		System.out.println(c1.getArea()); //�θ��� �޼��� ������(�������̵�)
		
		Ball b1 = new Ball(2,5);
		b1.printId();
		System.out.println(b1.getVolume());
		System.out.println(b1.getArea());
		
		Rect r1 = new Rect(3,2,7);
		r1.printId();
		System.out.println(r1.getArea());
		
		Cube cube1 = new Cube(4, 5,6,7);
		cube1.printId();
		System.out.println(cube1.getArea());
		System.out.println(cube1.getVolume());

		Shape[] shapeArray = new Shape[5];
		shapeArray[0] = c1;
		shapeArray[1] = b1;
		shapeArray[2] = r1;
		shapeArray[3] = cube1;
		shapeArray[4] = new Cube(5, 10,20,30);
		
		for(int i=0;i<shapeArray.length; i++) {
			shapeArray[i].printId();
			System.out.println(shapeArray[i].getArea());
			//instance of Ű���� ��ü�� Ÿ���� üũ�� �� �ִ� ��ɾ�
			//True/false �� ����
			if(shapeArray[i] instanceof Cube) {
				System.out.println("ť���Դϴ�.");
				//            (Cube)�� ����ȯ �� getVolume(); ������ �� ����. 
				double vol = ((Cube)shapeArray[i]).getVolume();
				System.out.println(vol);
			}
		}
		
		Circle c2 = new Circle(6, 10); //�θ�
		Ball b2 = new Ball(7, 11); //�ڽ�
		//�ڽ� -> �θ� ����ȯ
		double area = ((Circle) b2).getArea();
		System.out.println(area);
		b2.getArea();
		
		//�θ� -> �ڽ� ����ȯ :�ڽĿ��� �θ� ���� ������ �־ ����ȯ�� �ȵȴ�. 
		//����) �θ�ü�� �ڽ����� �Ҵ�� ���.
		double volume = ((Ball) c2).getVolume();
		System.out.println(volume);
	}

}
