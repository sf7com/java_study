package 래퍼클래스;

class Test{
	int intVal;
	Integer num;
	
}

public class WrapperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int -> Integer
		// char -> Charater
		// double -> Double
		// boolean -> Boolean
		// 기본클래스를 감싸는 클래스(확장?)
		
		//(1) 래퍼클래스의 대표적인 상수 (SIZE,BYTES,MIN_VALUE,MAX_VALUE 모든 상수값에 있음
		System.out.println("Size : " + Integer.SIZE); // 비트수
		System.out.println("Size : " + Integer.BYTES); // 비트수
		System.out.println("Size : " + Integer.MIN_VALUE); // 최소값
		System.out.println("Size : " + Integer.MAX_VALUE); // 최대값
		
		//(2) 기본형과 래퍼클래스간 값 변환
		//(2-1) int -> Integer
		Integer num1 = new Integer(10); //비효율 - 새로운 객체를 만들고 할당 (중간줄)
		Integer num2 = 10;
		Integer num3 = Integer.valueOf(10);
		System.out.println(num1);
		
		//(2-2) Integer -> int
		int intVal1 = num1.intValue();
		int intVal2 = num2; // 주로 사용
		System.out.println(intVal2);
		
		//(2-3) String -> Integer
		String strNum = "100"; // 1*2^2+0*2^1+0*2^0 =4
		Integer num4 = new Integer(strNum);
		Integer num5 = Integer.valueOf(strNum); // 주로 사용
		Integer num6 = Integer.valueOf(strNum,2); //진수 지정
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		//(2-4) Integer -> String
		String numStr2 = num5.toString();
		String numStr3 = Integer.toString(4,2); //숫자, 진수
		System.out.println(numStr3); //4를 2진수로 표현 => 100
		
		//(2-5) int -> String
		String numStr4 = String.valueOf(5); //정수타입 문자열로 변환
		String numStr5 = Integer.toString(5);
		
		//(2-6) String -> int
		int intNum2 = Integer.parseInt(numStr5);
		
		//(3) 래퍼클래스와 기본타입간의 값 비교
		int intNum3 = 100;
		Integer num03 = 100;
		Integer num04 = new Integer(100);
		//래퍼클래스와 기본타입
		// Java 5.0부터 자동형변환
		//!=,>,< 비교연산자
		System.out.println("래퍼클래스 == 기본타입 : " + (intNum3==num03)); //Integer는 클래스라 주소를 저장하지만 자동형변환으로 비교 가능
		System.out.println("래퍼클래스.equals(기본타입) : " + (num03.equals(intNum3)));
		System.out.println("래퍼클래스==래퍼클래스 : " + (num03==num04)); // 주소를 비교하기 때문에 false
		System.out.println("래퍼클래스.equals(래퍼클래스) : " + (num3.equals(num04)));
		
		//(4) 래퍼클래스와 기본형간의 초기값 차이
		Test t1 = new Test();
		System.out.println(t1.intVal); // 0 : 실제할당된 값인지 아닌지 구분이 안됨.
		System.out.println(t1.num); //null : 값을 할당했는지 안했는지 확인이 가능함.
		
		t1.num = 10;
		System.out.println(t1.num); //null : 값을 할당했는지 안했는지 확인이 가능함.
		
		
	}

}
