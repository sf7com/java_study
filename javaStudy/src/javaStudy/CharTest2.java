package javaStudy;

public class CharTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double d;
		byte b;
		
		//정수 -> 정수
		i = 7/4; //7정수,4정수 정수끼리 사칙연산 => 정수로 결과 나옴
		System.out.println(i); //1
		
		//정수 -> 실수 *정수끼리 나눌경우 변수가 double 이더라도 정수 값 1이 실수로 대입 됨.
		d = 7/4; // 1 => 1.0
		System.out.println(d); //1.0		
		
		//정수와 실수 사칙연산 계산시 실수로 변환되어 계산
		d = 7/4.0; // 1.75 => 1.75
		System.out.println(d); //1.75
		d = 7.0/4; // 1.75 => 1.75
		System.out.println(d); //1.75
		d = 7.0/4.0; // 1.75 => 1.75
		System.out.println(d); //1.75
		d = (double)7/4.0; // 1.75 => 1.75
		System.out.println(d); //1.75
	}

}
