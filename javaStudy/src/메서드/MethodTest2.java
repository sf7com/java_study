package �޼���;

import java.util.Scanner;

public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		echo("�ȳ�",3);
//		echo("Java",5);
//		System.out.println(avg2(1,10));
//		System.out.println(avg2(1,100));
//		System.out.println(avg2(20,100));
		System.out.println(circle(4.2));
		System.out.println(quad(5.5,8.5));
		System.out.println(cube(4.5,5.8,6.7));
		
		//������ü�� ���Ǹ� ���ϴ� �κ�
//		Scanner sc=new Scanner(System.in);
//		System.out.println("������ü�� ���Ǹ� ���մϴ�.");
//		
//		System.out.print("���� >");
//		double w=sc.nextDouble();
//		
//		System.out.print("���� >");
//		double l=sc.nextDouble();
//		System.out.print("���� >");
//		double h=sc.nextDouble();
//		
//		System.out.printf("����:%.2f, ����:%.2f, ����:%.2f�� ���̴� %.2f",w,l,h,cube(w,l,h));
		
		sayMyself("������",42,true);
		sayMyself("������",28,false);
		
	}
	//���ڿ�, ������ �Է¹ް�,
	//�Է¹��� ���ڿ��� ��������ŭ �ݺ��ؼ� ����ϴ� �޼ҵ�
	public static void echo(String inStr, int num) {
		for(int i=0; i<num; i++) {
			System.out.println(inStr);
		}
	}
	//num1~num2 ������ ������ ��ȯ���ִ� �Լ�.
	public static int sum(int num1, int num2) {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			sum+=i;
		}
		return sum;
	}
	//num1~num2 ������ ��հ��� ��ȯ���ִ� �Լ�
	//num1=1, num2=10 1,2,3,4,5,6,7,8,9,10�� ��հ�
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
	//�Լ� Quiz1 : �Ǽ�Ÿ���� �������� �Է¹ް�, �Ǽ�Ÿ���� ���� ���̸� ����ϴ� �Լ�
	public static double circle(double r) {
		double pi = 3.141592;
		return pi*r*r;
	}
	//�Լ� Quiz2 : �Ǽ�Ÿ���� ����, ���� ���̸� �Է¹ް�, �簢���� ���̸� ����ϴ� �Լ������
	public static double quad(double w, double l) {
		return w*l;
	}
	//�Լ� Quiz3 : �Ǽ�Ÿ���� ����, ����, ���� �� �Է¹ް�, ������ü�� ���Ǹ� ����ϴ� �Լ������
	public static double cube(double w, double l, double h ) {
		return quad(w,l)*h;
	}
	//�̸�,����,������ �Է¹޾Ƽ� �ڱ�Ұ��� �ܼ�â ����ϴ� �Լ�
	public static void sayMyself(String name, int age, boolean man) {
		System.out.printf("���� �̸��� %s�Դϴ�.\n",name);
		System.out.printf("���� ���̴� %d�Դϴ�.\n",age);
		if (man) {
			System.out.printf("������ �����Դϴ�.\n",name);
		}else {
			System.out.printf("������ �����Դϴ�.\n",name);
		}
	}

}
