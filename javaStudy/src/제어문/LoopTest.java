package ���;

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
//		//1. 1~100���� Ȧ���� ��
//		i=1;
//		int total=0;
//		while(i<=100) {
//			if(i%2==1)
//				total+=i; //���ǹ��� ������ ������ 1���� �߰�ȣ {} ������ �� �ִ�.
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
//		//2. ������ ��� - 2~9�� ����
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
			System.out.println("0�̻� 100������ ���ڸ� �Է��ϼ���.");
			inNum = sc.nextInt();
		}while(inNum>100 || inNum<0);
		//////////////////////////////////////////////////////////////////////
//		System.out.println("0�̻� 100������ ���ڸ� �Է��ϼ���.");
//		inNum = sc.nextInt();
//		while(inNum<100 || inNum>0) {
//			System.out.println("0�̻� 100������ ���ڸ� �Է��ϼ���.");
//			inNum = sc.nextInt();
//		}
		
		
		
		
		
	}

}
