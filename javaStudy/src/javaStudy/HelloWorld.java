package javaStudy;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World~!");
		// 숫자 변수 활용 기초
		//(1) 소리가 1시간 동안 가는 거리 출력

//		int airSpeed = 340; //m/s
//		int distance = 0;
//		distance = airSpeed*60*60;//거리는 속도*시간
//		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");
//		
//		//(2) 반지름 10인 원의 넓이를 출력하시오.
//		//원의 넓이 공식 넓이 = 3.141592*r*r
//		
//		double radius = 10;
//		final double PI=3.141592; //상수 키워드 final 입력해야함.
//		double circleArea = radius * radius * PI;
//				
//		System.out.println("반지름 " + radius + "인 원의 넓이는 " + circleArea + "입니다.");
//		
		//(3) 키보드로 온도와 시간을 입력받아 소리의 거리 구하기
		// 소리의 속도 = 331.5 + 0.6 * 섭씨온도
//		System.out.println("섭씨 온도를 입력하세요.");
//		Scanner sc = new Scanner(System.in); //키보드로 입력받는 객체(클래스)
//		double temp = sc.nextDouble(); //Double 타입을 입력 받는다.
//		System.out.println("시간(초)을 입력하세요.");
//		int second = sc.nextInt(); // Int타입을 입력받는다.
//		double airSpeed = 331.5 + 0.6 * temp;
//		double distance = airSpeed*second;
//		System.out.println("소리가" + second + "초 동안 간 거리는" + distance + "m 입니다.");
		
		//(4) 구의 겉넓이 출력
		// 구의 겉넓이 = 4*PI*r*r
		//(4-1) 반지름 입력받는 부분
		System.out.println("반지름을 입력하세요");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		//(4-2) 구의 겉넓이 계산 부분
		final double PI=3.141592;
		double ballArea = 4*PI*radius*radius;
		//(4-3) 구의 겉넓이 출력 부분
		System.out.println("구의 겉넓이 출력 : " + ballArea + "입니다.");

	}

}
