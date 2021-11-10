package 클래스상속;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Circle c1 = new Circle(1,10);
		c1.printId(); // 부모의 메서드
		System.out.println(c1.getArea()); //부모의 메서드 재정의(오버라이드)
		
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
			//instance of 키워드 객체의 타입을 체크할 수 있는 명령어
			//True/false 로 리턴
			if(shapeArray[i] instanceof Cube) {
				System.out.println("큐브입니다.");
				//            (Cube)로 형변환 후 getVolume(); 가져올 수 있음. 
				double vol = ((Cube)shapeArray[i]).getVolume();
				System.out.println(vol);
			}
		}
		
		Circle c2 = new Circle(6, 10); //부모
		Ball b2 = new Ball(7, 11); //자식
		//자식 -> 부모 형변환
		double area = ((Circle) b2).getArea();
		System.out.println(area);
		b2.getArea();
		
		//부모 -> 자식 형변환 :자식에는 부모에 없는 개념이 있어서 형변환이 안된다. 
		//예외) 부모객체가 자식으로 할당된 경우.
		double volume = ((Ball) c2).getVolume();
		System.out.println(volume);
	}

}
