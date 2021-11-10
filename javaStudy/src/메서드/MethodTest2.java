package 메서드;

import java.util.Scanner;

public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		echo("안녕",3);
//		echo("Java",5);
//		System.out.println(avg2(1,10));
//		System.out.println(avg2(1,100));
//		System.out.println(avg2(20,100));
		System.out.println(circle(4.2));
		System.out.println(quad(5.5,8.5));
		System.out.println(cube(4.5,5.8,6.7));
		
		//직육면체의 부피를 구하는 부분
//		Scanner sc=new Scanner(System.in);
//		System.out.println("직육면체의 부피를 구합니다.");
//		
//		System.out.print("가로 >");
//		double w=sc.nextDouble();
//		
//		System.out.print("세로 >");
//		double l=sc.nextDouble();
//		System.out.print("높이 >");
//		double h=sc.nextDouble();
//		
//		System.out.printf("가로:%.2f, 세로:%.2f, 높이:%.2f의 넓이는 %.2f",w,l,h,cube(w,l,h));
		
		sayMyself("김진태",42,true);
		sayMyself("김태희",28,false);
		
	}
	//문자열, 정수를 입력받고,
	//입력받은 문자열을 정수값만큼 반복해서 출력하는 메소드
	public static void echo(String inStr, int num) {
		for(int i=0; i<num; i++) {
			System.out.println(inStr);
		}
	}
	//num1~num2 까지의 총합을 반환해주는 함수.
	public static int sum(int num1, int num2) {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			sum+=i;
		}
		return sum;
	}
	//num1~num2 까지의 평균값을 반환해주는 함수
	//num1=1, num2=10 1,2,3,4,5,6,7,8,9,10의 평균값
	public static int avg(int num1, int num2) {
		int sum=0;
		double avg;
		for(int i=num1; i<=num2; i++) {
			sum+=i;
		}
		return sum/(num2-num1+1);
	}
	public static int avg2(int num1, int num2) {
		return sum(num1,num2)/(num2-num1+1);
	}
	//함수 Quiz1 : 실수타입의 반지름을 입력받고, 실수타입의 원의 넓이를 출력하는 함수
	public static double circle(double r) {
		double pi = 3.141592;
		return pi*r*r;
	}
	//함수 Quiz2 : 실수타입의 가로, 세로 길이를 입력받고, 사각형의 넓이를 출력하는 함수만들기
	public static double quad(double w, double l) {
		return w*l;
	}
	//함수 Quiz3 : 실수타입의 가로, 세로, 높이 를 입력받고, 직육면체의 부피를 출력하는 함수만들기
	public static double cube(double w, double l, double h ) {
		return quad(w,l)*h;
	}
	//이름,나이,성별을 입력받아서 자기소개를 콘솔창 출력하는 함수
	public static void sayMyself(String name, int age, boolean man) {
		System.out.printf("나의 이름은 %s입니다.\n",name);
		System.out.printf("나의 나이는 %d입니다.\n",age);
		if (man) {
			System.out.printf("성별은 남자입니다.\n",name);
		}else {
			System.out.printf("성별은 여자입니다.\n",name);
		}
	}

}
