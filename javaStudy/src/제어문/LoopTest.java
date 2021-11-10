package 제어문;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;
//		while(i<5) {
//			System.out.println(i);
//			i++;
//		}
//		
//		//1. 1~100까지 홀수의 합
//		i=1;
//		int total=0;
//		while(i<=100) {
//			if(i%2==1)
//				total+=i; //조건문에 실행할 문장이 1개면 중괄호 {} 생략할 수 있다.
//			i++;
//		}
//		System.out.println(total);
//		
//		i=1;
//		total=0;
//		while(i<=100) {
//			total+=i;
//			i+=2;
//		}
//		System.out.println(total);
//		
//		//2. 구구단 출력 - 2~9단 까지
//		int danNum = 2;
//		while(danNum <=9) {
//			int num=1;
//			while(num <=9) {
//				System.out.printf("%d X %d = %d\n", danNum, num, danNum*num);
//				num++;
//			}
//			danNum++;
//		}
//		//////////////////////////////////////////////////////////////////////
//		i=1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<5);
		
		//////////////////////////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		int inNum;
		do {
			System.out.println("0이상 100이하의 숫자를 입력하세요.");
			inNum = sc.nextInt();
		}while(inNum>100 || inNum<0);
		//////////////////////////////////////////////////////////////////////
//		System.out.println("0이상 100이하의 숫자를 입력하세요.");
//		inNum = sc.nextInt();
//		while(inNum<100 || inNum>0) {
//			System.out.println("0이상 100이하의 숫자를 입력하세요.");
//			inNum = sc.nextInt();
//		}
		
		
		
		
		
	}

}
