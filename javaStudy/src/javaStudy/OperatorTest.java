package javaStudy;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) ���� ������ : ++, --
		int num1 = 10;
		num1++;
		System.out.println(num1); //11
		num1--;
		num1--;
		System.out.println(num1); //9
		num1 = num1 +1; //num1++;
		num1 = num1 -1; //num1--;
		
		int num2 = 10;
		System.out.println(++num2); //11 ���� ���ϰ� ���
		System.out.println(num2++); //11 ���� ����ϰ� ���߿� ���ϱ�
		System.out.println(num2); //12
		
		/////////////////////////////////////////////////
		
		//���� ������
		int a = 45;
		a += 10;
		System.out.println(a); //55
		
		a -= 10;
		System.out.println(a); //45

		a *= 10;
		System.out.println(a); //450
		
		a /= 10;
		System.out.println(a); //45
		
		// ��������� : +,-,*,/,%(������ ������)
		int modNum1 = 10;
		int modNum2 = 3;
		System.out.println(modNum1 % modNum2); //
		//¦��, Ȧ�� �Ǻ� �˰����� �����Ͻÿ�.
		modNum1 = 111;
		System.out.println(modNum1%2);
		
		System.out.println(14 % 7);
		System.out.println(15 % 7);
		System.out.println(19 % 7);
		//0�̸� ���, ��� ���Ҷ�
		
		// 192 ������ �ڸ����� ���� ������ ����Ͻÿ�.
		int num = 192;
		System.out.println("���� �ڸ� : " + num%1000 / 100);
		System.out.println("���� �ڸ� : " + num%100 / 10);
		System.out.println("���� �ڸ� : " + num%10);
		
		int numPos0 = num % 10; //192%==2
		int numPos1 = (num/10) % 10; //19%10==9
		int numPos2 = (num/100) % 10; //1%10==1
		System.out.println("���� �ڸ� : " + numPos2);
		System.out.println("���� �ڸ� : " + numPos1);
		System.out.println("���� �ڸ� : " + numPos0);
		
		// ���׿�����
		// (���ǽ�)? x:y
		// ���ǽ��� ���̸� x���� ����, �����̸� y���� ����
		System.out.println((10%2==1)? true:false);
		
		num = (111>50)? 1:0;
		System.out.println(num);
		
		//� ���ڰ� 7�� ����̸� ��, ����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int numSeven = sc.nextInt();
		boolean isSevenTimes = (numSeven%7==0)? true:false;
		System.out.println(isSevenTimes);
		
		boolean isTwoTimes = (numSeven%2==0)? true:false;
		System.out.println(isSevenTimes&&isTwoTimes);
		
		boolean condUnion = (numSeven%7==0)? ((numSeven%2==0)? true:false):false;
		System.out.println("���� ����" + condUnion);
		
		
		
	}

}
