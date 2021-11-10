package 메서드;

import java.util.Scanner;

public class MethodHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r1,r2;
		int num1,num2;
//		System.out.print("첫번째 저항값을 입력하세요. >");
//		r1 = sc.nextDouble();
//		System.out.print("두번째 저항값을 입력하세요. >");
//		r2 = sc.nextDouble();
//		System.out.printf("1번 저항:%.2f, 2번 저항:%.2f 의 병렬저항값은 %.2f 입니다.",r1,r2,getParallelR(r1, r2));

//		System.out.print("첫번째 정수를 입력하세요 >");
//		int i1 = sc.nextInt();
//		System.out.print("두번째 정수를 입력하세요 >");
//		int i2 = sc.nextInt();
//		System.out.print("세번째 정수를 입력하세요 >");
//		int i3 = sc.nextInt();
//		System.out.printf("%d,%d,%d 중 큰수는 %d 입니다.",i1,i2,i3,getMaxNum(i1,i2,i3));
		
		System.out.println(getLeapYear(2021));
	}
	//두개의 실수 병렬저항값을 받아서
	//합성저항의 값을 출력하는 메서드 만드시오.
	
	public static double getParallelR(double r1, double r2) {
		double result;
		//병렬저항 구하는 알고리즘
		result = 1/(1/r1+1/r2);
		return result;
	}
	//두 정수를 입력받아서 큰수를 출력하는 메서드
	public static int getLarge(int num1,int num2) {
//		int result;
//		if(num1<num2)
//			result=num2;
//		else
//			result=num1;
//		return result;
		return (num1 > num2)? num1:num2;
	}
	//위랑 함수이름이 같다.
	//입력타입과 출력타입이 다르다.
	//메서드 오버로딩 함수이름이 같더라도 타입이 다르면 가능.
	public static double getLarge(double num1,double num2) {
		return (num1 > num2)? num1:num2;
	}
	//메서드 명이 같더라도 입력타입이 하나라도 바뀌면 사용 가능
	public static double getLarge(int num1,double num2) {
		return (num1 > num2)? num1:num2;
	}
	//getMaxNum 메서드 만드는데 3개의 정수를 입력받아서
	//가장 큰 수를 출력하는 메서드 만드시오.
	public static int getMaxNum(int i1,int i2,int i3) {
		int maxNum;
//		if(i1>i2 && i1>i3)
//			maxNum = i1;
//		else if(i2>i1 && i2>i3)
//			maxNum = i2;
//			else
//				maxNum = i3; 
//		
//		return maxNum;
		
		maxNum = (i1>i2)? i1:i2;
		maxNum = (i3>maxNum)? i3:maxNum;
		return maxNum;
	}
	//년수를 입력받고 윤년,평년을 문자열로 출력하는 메서드를 만드시오.
	//두조건을 다 만족해야 윤년임
	//조건1) 년도를 4로 나누어 떨어져야 함
	//조건2) 년도를 100으로 나누어 떨어지지 않거나 년도를 400으로 나누어 떨어져야 함
	//ex) 4(윤년), 100(평년), 400(윤년)
	public static String getLeapYear(int year) {
		String result;
		if(year % 4 == 0 && (year%100!=0 || year%400==0 ) ) 
			result = "윤년";
		else
			result = "평년";
		return result;
	}
}
