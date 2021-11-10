package 제어문;

import java.util.Scanner;

public class CondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(1) 숫자를 입력받아서 짝수, 홀수 출력 예제
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력 하세요 >");
//		int num = sc.nextInt();
		
		//짝수인 경우
//		if(num % 2 == 0) {
//			System.out.println(num + "은 짝수입니다.");
//		}
//		if(num % 2 == 1) {
//			System.out.println(num + "은 홀수입니다.");
//		}
//		
//		if(num % 2 == 0) {
//			System.out.println(num + "은 짝수입니다.");
//		} else {
//			System.out.println(num + "은 홀수입니다.");
//		}
		
		
		//(2) 점수에 따라서 등급을 매기는 예제
//		Scanner sc = new Scanner(System.in);
//		String grade = "";
//		System.out.print("점수를 입력 하세요 >");
//		int score = sc.nextInt();
//		
//		if(score >= 90) {
//			grade = "A";
//		}else if(score >=80) {
//			grade = "B";
//		}else if(score >=70) {
//			grade = "C";
//		}else if(score >=60 ) {
//			grade = "D";
//		}else {
//			grade = "F";
//		}
//		System.out.printf("당신의 등급은 %s입니다.\n", grade);
		
		//(1) 두 수를 입력받아서 큰 수를 출력하는 예제
//		Scanner sc = new Scanner(System.in);
//		int max;
//		System.out.print("첫번째 숫자를 입력하세요>");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자를 입력하세요>");
//		int num2 = sc.nextInt();
//		
//		if(num1 > num2) {
//			System.out.printf("두개의 숫자 중 큰수는 %d 입니다.",num1);
//		}else {
//			System.out.printf("두개의 숫자 중 큰수는 %d 입니다.",num2);
//		}
//		
//		max = (num1>num2)? num1:num2;
		
		
		//(2) 정수 하나를 입력 받아서 0보다 작거나 100보다 크면 "입력오류!!" 출력
		//정수를 0~100까지만 입력받을 수 있도록 함.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요>");
//		int num = sc.nextInt();
//		
//		if(0<=num && num<=100) {
//			System.out.printf("입력된 숫자는 %d 입니다.",num);
//		} else {
//			System.out.println("입력오류!!");
//		}
		
		
		//(3) 년도를 입력 받아서 윤년/평년을 구하는 프로그램
		//윤년 조건 : 아래 두 조건을 모두 만족해야 윤년이다.
		//조건1 : 년도를 4로 나누어서 0이어야함(나누어 떨어져야 함)
		//조건2 : 년도를 100으로 나누어 떨어지지 않거나, 년도를 400으로 나누어 떨어져야 함
		//ex) 4(윤년),100(평년),400(윤년)
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요>");
		int year = sc.nextInt();
		if(year % 4 == 0 && (year%100!=0 || year%400==0 ) ) {
			System.out.printf("입력된 년도 %d는 윤년입니다.",year);
		}else{
			System.out.println("입력된 년도는 평년입니다.");
		}
		
		
	}

}
