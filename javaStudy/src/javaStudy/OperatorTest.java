package javaStudy;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) 증감 연산자 : ++, --
		int num1 = 10;
		num1++;
		System.out.println(num1); //11
		num1--;
		num1--;
		System.out.println(num1); //9
		num1 = num1 +1; //num1++;
		num1 = num1 -1; //num1--;
		
		int num2 = 10;
		System.out.println(++num2); //11 먼저 더하고 출력
		System.out.println(num2++); //11 먼저 출력하고 나중에 더하기
		System.out.println(num2); //12
		
		/////////////////////////////////////////////////
		
		//대입 연산자
		int a = 45;
		a += 10;
		System.out.println(a); //55
		
		a -= 10;
		System.out.println(a); //45

		a *= 10;
		System.out.println(a); //450
		
		a /= 10;
		System.out.println(a); //45
		
		// 산술연산자 : +,-,*,/,%(나머지 연산자)
		int modNum1 = 10;
		int modNum2 = 3;
		System.out.println(modNum1 % modNum2); //
		//짝수, 홀수 판별 알고리즘을 제시하시오.
		modNum1 = 111;
		System.out.println(modNum1%2);
		
		System.out.println(14 % 7);
		System.out.println(15 % 7);
		System.out.println(19 % 7);
		//0이면 배수, 배수 구할때
		
		// 192 숫자의 자리수만 따로 가져와 출력하시오.
		int num = 192;
		System.out.println("백의 자리 : " + num%1000 / 100);
		System.out.println("십의 자리 : " + num%100 / 10);
		System.out.println("일의 자리 : " + num%10);
		
		int numPos0 = num % 10; //192%==2
		int numPos1 = (num/10) % 10; //19%10==9
		int numPos2 = (num/100) % 10; //1%10==1
		System.out.println("백의 자리 : " + numPos2);
		System.out.println("십의 자리 : " + numPos1);
		System.out.println("일의 자리 : " + numPos0);
		
		// 삼항연산자
		// (조건식)? x:y
		// 조건식이 참이면 x값을 대입, 거짓이면 y값을 대입
		System.out.println((10%2==1)? true:false);
		
		num = (111>50)? 1:0;
		System.out.println(num);
		
		//어떤 숫자가 7의 배수이면 참, 거짓
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int numSeven = sc.nextInt();
		boolean isSevenTimes = (numSeven%7==0)? true:false;
		System.out.println(isSevenTimes);
		
		boolean isTwoTimes = (numSeven%2==0)? true:false;
		System.out.println(isSevenTimes&&isTwoTimes);
		
		boolean condUnion = (numSeven%7==0)? ((numSeven%2==0)? true:false):false;
		System.out.println("다중 조건" + condUnion);
		
		
		
	}

}
