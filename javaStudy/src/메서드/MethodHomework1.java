package �޼���;

import java.util.Scanner;

public class MethodHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r1,r2;
		int num1,num2;
//		System.out.print("ù��° ���װ��� �Է��ϼ���. >");
//		r1 = sc.nextDouble();
//		System.out.print("�ι�° ���װ��� �Է��ϼ���. >");
//		r2 = sc.nextDouble();
//		System.out.printf("1�� ����:%.2f, 2�� ����:%.2f �� �������װ��� %.2f �Դϴ�.",r1,r2,getParallelR(r1, r2));

//		System.out.print("ù��° ������ �Է��ϼ��� >");
//		int i1 = sc.nextInt();
//		System.out.print("�ι�° ������ �Է��ϼ��� >");
//		int i2 = sc.nextInt();
//		System.out.print("����° ������ �Է��ϼ��� >");
//		int i3 = sc.nextInt();
//		System.out.printf("%d,%d,%d �� ū���� %d �Դϴ�.",i1,i2,i3,getMaxNum(i1,i2,i3));
		
		System.out.println(getLeapYear(2021));
	}
	//�ΰ��� �Ǽ� �������װ��� �޾Ƽ�
	//�ռ������� ���� ����ϴ� �޼��� ����ÿ�.
	
	public static double getParallelR(double r1, double r2) {
		double result;
		//�������� ���ϴ� �˰���
		result = 1/(1/r1+1/r2);
		return result;
	}
	//�� ������ �Է¹޾Ƽ� ū���� ����ϴ� �޼���
	public static int getLarge(int num1,int num2) {
//		int result;
//		if(num1<num2)
//			result=num2;
//		else
//			result=num1;
//		return result;
		return (num1 > num2)? num1:num2;
	}
	//���� �Լ��̸��� ����.
	//�Է�Ÿ�԰� ���Ÿ���� �ٸ���.
	//�޼��� �����ε� �Լ��̸��� ������ Ÿ���� �ٸ��� ����.
	public static double getLarge(double num1,double num2) {
		return (num1 > num2)? num1:num2;
	}
	//�޼��� ���� ������ �Է�Ÿ���� �ϳ��� �ٲ�� ��� ����
	public static double getLarge(int num1,double num2) {
		return (num1 > num2)? num1:num2;
	}
	//getMaxNum �޼��� ����µ� 3���� ������ �Է¹޾Ƽ�
	//���� ū ���� ����ϴ� �޼��� ����ÿ�.
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
	//����� �Է¹ް� ����,����� ���ڿ��� ����ϴ� �޼��带 ����ÿ�.
	//�������� �� �����ؾ� ������
	//����1) �⵵�� 4�� ������ �������� ��
	//����2) �⵵�� 100���� ������ �������� �ʰų� �⵵�� 400���� ������ �������� ��
	//ex) 4(����), 100(���), 400(����)
	public static String getLeapYear(int year) {
		String result;
		if(year % 4 == 0 && (year%100!=0 || year%400==0 ) ) 
			result = "����";
		else
			result = "���";
		return result;
	}
}
