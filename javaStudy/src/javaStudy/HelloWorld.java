package javaStudy;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World~!");
		// ���� ���� Ȱ�� ����
		//(1) �Ҹ��� 1�ð� ���� ���� �Ÿ� ���

//		int airSpeed = 340; //m/s
//		int distance = 0;
//		distance = airSpeed*60*60;//�Ÿ��� �ӵ�*�ð�
//		System.out.println("�Ҹ��� 1�ð� ���� ���� �Ÿ� : " + distance + "m");
//		
//		//(2) ������ 10�� ���� ���̸� ����Ͻÿ�.
//		//���� ���� ���� ���� = 3.141592*r*r
//		
//		double radius = 10;
//		final double PI=3.141592; //��� Ű���� final �Է��ؾ���.
//		double circleArea = radius * radius * PI;
//				
//		System.out.println("������ " + radius + "�� ���� ���̴� " + circleArea + "�Դϴ�.");
//		
		//(3) Ű����� �µ��� �ð��� �Է¹޾� �Ҹ��� �Ÿ� ���ϱ�
		// �Ҹ��� �ӵ� = 331.5 + 0.6 * �����µ�
//		System.out.println("���� �µ��� �Է��ϼ���.");
//		Scanner sc = new Scanner(System.in); //Ű����� �Է¹޴� ��ü(Ŭ����)
//		double temp = sc.nextDouble(); //Double Ÿ���� �Է� �޴´�.
//		System.out.println("�ð�(��)�� �Է��ϼ���.");
//		int second = sc.nextInt(); // IntŸ���� �Է¹޴´�.
//		double airSpeed = 331.5 + 0.6 * temp;
//		double distance = airSpeed*second;
//		System.out.println("�Ҹ���" + second + "�� ���� �� �Ÿ���" + distance + "m �Դϴ�.");
		
		//(4) ���� �ѳ��� ���
		// ���� �ѳ��� = 4*PI*r*r
		//(4-1) ������ �Է¹޴� �κ�
		System.out.println("�������� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		//(4-2) ���� �ѳ��� ��� �κ�
		final double PI=3.141592;
		double ballArea = 4*PI*radius*radius;
		//(4-3) ���� �ѳ��� ��� �κ�
		System.out.println("���� �ѳ��� ��� : " + ballArea + "�Դϴ�.");

	}

}
