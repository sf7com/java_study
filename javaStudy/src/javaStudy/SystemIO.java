package javaStudy;

import java.util.Scanner;

public class SystemIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)println : ������� �� ���� �ٲ۴�.
		System.out.println("Hello~!");
		//(2)print : ������ ��¸� �ϰ� ���� �ٲ��� �ʴ´�.
		System.out.print("World~!");
		//(2-1) print : ���� �ٲܶ��� '\n' ������ ��.
		System.out.print("Java\n");
		System.out.println("System IO Study\n\n");
		//(3) Ư������ : \t  �Ǹ�ŭ ���ڸ� ����
		System.out.println("Test\ttest2");
		//(4) printf : ������ �����ؼ� ����Ѵ�.
		
		int num = 97;
		double pi = 3.141592;
		String str = "Java";
		
		//(4-1) %d : ���� ���
		System.out.printf("���� : %d\n",num);
		//(4-1-1) %�ڸ���d : ������ �ڸ�����ŭ ������ ���� ���(��������)
		System.out.printf("���� : %5d\n",num);
		//(4-1-2) %-�ڸ���d : ������ �ڸ�����ŭ ���� ���� ���(��������)
		System.out.printf("���� : %-5d��\n",num);
		//(4-1-3) %0�ڸ���d : �ڸ����� 0���� ä�� 
		System.out.printf("���� : %05d\n",num); //00097
		
		//(4-2) %o : 8����, %x : 16���� 
		System.out.printf("8���� : %o\n",num); //141
		System.out.printf("16���� : %x\n",num); //61

		
		//(4-3) ���� �ϳ��� ���
		System.out.printf("���� : %c\n", num); // ASCII �ڵ� ���� ���� ���
		char ch = 'b';
		System.out.printf("���� : %3c\n", ch); // ch�� ����� ���� ���
		
		//(4-4) ���ڿ� ���
		System.out.printf("���ڿ� : %s\n", str);
		
		//(4-5) �Ǽ�
		System.out.printf("�Ǽ� : %f\n", pi);
		System.out.printf("�Ǽ� ����ǥ��: %e\n", pi);
		//(4-5) %��ü �ڸ���.�Ҽ��� �ڸ���f
		System.out.printf("�Ǽ� : %5.2f\n", pi);
		System.out.printf("�Ǽ� : %-5.2f\n", pi);
		System.out.printf("�Ǽ� : %05.2f\n", pi);
		
		////////////////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		
		//(1) �����Է�
//		System.out.print("���� �Է� > ");
//		int num1 = sc.nextInt();
//		System.out.printf("�Էµ� ���� : %d\n", num1); //�ڸ��� ���� ����
//		System.out.println("�Էµ� ���� : " + num1); //�ڸ��� ���� �Ұ�, num1 ���ڿ� ������ȯ
		
		//(2) �Ǽ��Է�
//		System.out.print("�Ǽ� �Է� > ");
//		double doublenum = sc.nextDouble();
//		System.out.printf("�Էµ� �Ǽ� : %.3f\n", doublenum); 
		
		//(3) ���ڿ� �Է�
		//(3-1) next() : ����, �����̽� ������ ���ڿ��� �д´�.
//		System.out.print("���ڿ� �Է� > ");
//		String inStr = sc.next();
//		System.out.printf("�Էµ� ���ڿ� : %s\n", inStr); //�Է� : apple pi ��� : apple
		
		//(3-2) nextLine() : Enter ������ �д´�.
//		System.out.print("���ڿ� �Է� > ");
//		String inStr = sc.nextLine();
//		System.out.printf("�Էµ� ���ڿ� : %s\n", inStr); //�Է� : apple pi ��� : apple
		
		//(4) �Է� ���� ����
		// apple pie hello
//		System.out.print("���ڿ� �Է� > ");
//		String inStr = sc.next();
//		System.out.printf("�Էµ� ���ڿ� : %s\n", inStr);
//		// Ű������� : apple\n
//		//(1)next : apple     Ű������� : \n
//		//(2)nextlne : \n
//		
//		// ���� ����
//		sc. nextLine(); //Ű���� ���ۿ� ����� ��� ���ڿ� ����
//		
//		System.out.print("���ڿ� �Է�2 > ");
//		String inStr2 = sc.nextLine();
//		System.out.printf("�Էµ� ���ڿ�2 : %s\n", inStr2);
		
		//�� �� Ű����� �Է¹޴� ���� �� �Ǵ� ���
//		System.out.print("�̸��� �Է��ϼ��� >");
//		String name = sc.nextLine();
//		System.out.print("���̸� �Է��ϼ��� >");
//		int age = sc.nextInt();
//		System.out.printf("�̸�:%s, ����:%d\n", name,age);
//		
//		//�� �� Ű����� �Է¹޴� ���� �� �ȵǴ� ���
//		System.out.print("������ �Է��ϼ��� >");
//		int age = sc.nextInt(); //Ű���� ���ۿ��� ���ڸ� �����ͼ� \n�� �������� 
//
//		//���� ����
//		sc.nextLine();
//		
//		System.out.print("�̸��� �Է��ϼ��� >");
//		String name = sc.nextLine();
//		System.out.printf("�̸�:%s, ����:%d\n", name,age);
		
		//������ �Է� �߰�
		System.out.print("�̸��� �Է��ϼ��� >");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� >");
		int age = sc.nextInt();
		System.out.print("�����Ը� �Է��ϼ��� >");
		int weight = sc.nextInt();
		System.out.printf("�̸�:%s, ����:%d, ������:%d\n", name,age,weight);
		
		
		
		
		
		
	}

}
