package ���;

import java.util.Scanner;

public class CondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(1) ���ڸ� �Է¹޾Ƽ� ¦��, Ȧ�� ��� ����
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ڸ� �Է� �ϼ��� >");
//		int num = sc.nextInt();
		
		//¦���� ���
//		if(num % 2 == 0) {
//			System.out.println(num + "�� ¦���Դϴ�.");
//		}
//		if(num % 2 == 1) {
//			System.out.println(num + "�� Ȧ���Դϴ�.");
//		}
//		
//		if(num % 2 == 0) {
//			System.out.println(num + "�� ¦���Դϴ�.");
//		} else {
//			System.out.println(num + "�� Ȧ���Դϴ�.");
//		}
		
		
		//(2) ������ ���� ����� �ű�� ����
//		Scanner sc = new Scanner(System.in);
//		String grade = "";
//		System.out.print("������ �Է� �ϼ��� >");
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
//		System.out.printf("����� ����� %s�Դϴ�.\n", grade);
		
		//(1) �� ���� �Է¹޾Ƽ� ū ���� ����ϴ� ����
//		Scanner sc = new Scanner(System.in);
//		int max;
//		System.out.print("ù��° ���ڸ� �Է��ϼ���>");
//		int num1 = sc.nextInt();
//		System.out.print("�ι�° ���ڸ� �Է��ϼ���>");
//		int num2 = sc.nextInt();
//		
//		if(num1 > num2) {
//			System.out.printf("�ΰ��� ���� �� ū���� %d �Դϴ�.",num1);
//		}else {
//			System.out.printf("�ΰ��� ���� �� ū���� %d �Դϴ�.",num2);
//		}
//		
//		max = (num1>num2)? num1:num2;
		
		
		//(2) ���� �ϳ��� �Է� �޾Ƽ� 0���� �۰ų� 100���� ũ�� "�Է¿���!!" ���
		//������ 0~100������ �Է¹��� �� �ֵ��� ��.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ���>");
//		int num = sc.nextInt();
//		
//		if(0<=num && num<=100) {
//			System.out.printf("�Էµ� ���ڴ� %d �Դϴ�.",num);
//		} else {
//			System.out.println("�Է¿���!!");
//		}
		
		
		//(3) �⵵�� �Է� �޾Ƽ� ����/����� ���ϴ� ���α׷�
		//���� ���� : �Ʒ� �� ������ ��� �����ؾ� �����̴�.
		//����1 : �⵵�� 4�� ����� 0�̾����(������ �������� ��)
		//����2 : �⵵�� 100���� ������ �������� �ʰų�, �⵵�� 400���� ������ �������� ��
		//ex) 4(����),100(���),400(����)
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ���>");
		int year = sc.nextInt();
		if(year % 4 == 0 && (year%100!=0 || year%400==0 ) ) {
			System.out.printf("�Էµ� �⵵ %d�� �����Դϴ�.",year);
		}else{
			System.out.println("�Էµ� �⵵�� ����Դϴ�.");
		}
		
		
	}

}
