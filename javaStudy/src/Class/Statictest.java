package Class;

class Circle4{
	//인스턴스 변수 : static 키워드로 지정되지 않아 공유되지 않은 필드
	//인스턴스(객체)마다 자신의 필드 생성
	double radius;
	
	//정적변수 : static 키워드로 지정하여 모든 인스턴스가 공유하는 필드
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
	
	//static 메서드 유의사항
	//객체와 관련된 인스턴스 변수를 사용할 수 없다.
	//객체와 관련된 인스턴스 메서드를 호출할 수 없다.
	//객체 자신을 가리키는 this 키워드를 사용할 수 없다.
	static void utilMethod() {
//		numCircles = 3; //일반 필드 이므로 사용할 수 없음.
		//getArea();
		//this.
		System.out.println("원입니다.");
	}
	
	static int getCircleNum() {
		return numOfCircles;
	}
	
}
public class Statictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static 멤버들은 객체를 생성하지 않고 사용 가능
		System.out.println(Circle4.PI);
		System.out.println(Circle4.numOfCircles);
		Circle4.utilMethod();
		
		//정적변수는 모든 객체가 공유하는 필드값
		Circle4 c1 = new Circle4(10); //Circle4 c1; =>Circle4의 주소를 담을 수 있는 변수생성
									  // c1 = new Circle4(10); 클래스 객체가 만들어져서 메모리에 할당
		                              // 클래스 필드(변수), 메서드들이 활용가능
		Circle4 c2 = new Circle4(5);
		Circle4 c3 = new Circle4(9);
		System.out.println(Circle4.numOfCircles);
		System.out.println(Circle4.numOfCircles);
		System.out.println(c1.numOfCircles);
		System.out.println(c2.numOfCircles);
		System.out.println(c3.numOfCircles);
		
		//인스턴스 변수 : 공유되지 않음
		System.out.println(c1.numCircles);
		System.out.println(c2.numCircles);
		System.out.println(c3.numCircles);
		
		
	}

}
