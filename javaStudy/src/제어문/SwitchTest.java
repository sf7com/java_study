package ���;

import java.util.Random;
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1,2,3 ���� �� �ϳ��� �Է��ϼ���. > ");
//		int num = sc.nextInt();
//		switch(num) {
//		case 3 :
//			System.out.print("*");
//		case 2 :
//			System.out.print("*");
//		case 1 :
//			System.out.print("*");
//		}
//		///////////////////////
//		switch(num) {
//		case 3 :
//			System.out.print("3�Դϴ�.");
//			break;
//		case 2 :
//			System.out.print("2�Դϴ�.");
//			break;
//		case 1 :
//			System.out.print("1�Դϴ�.");
//			break;
//		default :
//			System.out.print("1,2,3�� �ƴ� �����Դϴ�.");
//		}
//		System.out.println();
//		////////////////////////////////
//		if(num==3) {
//			System.out.print("3�Դϴ�.");
//		}else if(num==2) {
//			System.out.print("2�Դϴ�.");
//		}else if(num==1) {
//			System.out.print("1�Դϴ�.");
//		}else {
//			System.out.print("1,2,3�� �ƴ� �����Դϴ�.");
//		}
		////////////////////////////////////////
		//Java 7�������� ���ڿ� Ÿ�� ��밡��
		//���� �̸��� �Է¹ް� � ������ ����ϴ� ����
//		Scanner sc = new Scanner(System.in);
//		sc.nextLine(); //�Է� ���� ����(���� �ִ� �Է¹��ۿ��� '\n' ����)
//		System.out.print("���� �̸��� �Է��� �ּ���. >");
//		String animal = sc.nextLine();
//		String kind = "";
//		switch (animal) {
//		case "ȣ����":
//		case "����":
//			kind = "������";
//			break;
//		case "������":
//		case "����":
//			kind = "����";
//			break;
//		case "����":
//		case "����":
//			kind = "���";
//			break;
//		default:
//			System.out.println("�˼����� �����Դϴ�.");
//			kind = "?";
//		}
//		System.out.printf("%s�� %s�Դϴ�.\n", animal, kind);
//		///////////////////////////////////////////////////
//		//Java 14 : Switch�� ���� ���̺� ����
//		//          ȭ��ǥ case ���̺� ��� ������Ʈ
//		switch (animal) {
//		case "ȣ����","����" -> kind="������"; //��ü break ��� ����, ������ ���� 1���� ����
//		case "������","����" -> kind="����";
//		case "����","����" -> {            //{} �� ������ ���� ������ ����
//			kind="���";
//		}
//		default ->{
//			kind = "?";
//			System.out.println("�˼����� �����Դϴ�.");
//		}
//		}
//		System.out.printf("%s�� %s�Դϴ�.\n",animal,kind);
//		/////////////////////////////////////////////////
//		//switch������ �������� �Ҵ�� default�� �ʼ�
//		kind = switch (animal) {
//		case "ȣ����","����" -> "������"; 
//		case "������","����" -> "����";
//		case "����","����" -> "���";
//		default -> "?"; 
//		};
//		System.out.printf("%s�� %s�Դϴ�.\n",animal,kind);
		////////////////////////////////////////////////
		//����,����,�� ����
		//��ǻ�Ϳ� User ���
		//��ǻ���� ���������� ���� ������
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("����,����,�� ������ �����մϴ�.");
		while(true) {
		String userStr;
		int userVal;
		do {
			// (1) ��ǻ�Ϳ� User�� ���� ���� �Է¹޴´�.(����,����,��)
			// (1-1) User�� ���� Ű����� ����,����,������ �޴´�.
			// (1-1-1) User���� ���ڰ����� �ٲ۴�.

			userStr = sc.nextLine();
			userVal = switch (userStr) {
			case "����" -> 0;
			case "����" -> 1;
			case "��" -> 2;
			default -> -1;
			};
			if(userVal==-1)
				System.out.println("�߸��Է��߽��ϴ�.");
			
		}while (userVal==-1);
			// (1-2) Com�� ���� ���������� �Է¹޴´�.(����,����,��)
			// (1-2-1) ������ 0:����, 1:����, 2:��
			// (1-2-2) Com���� ���ڿ��� ����,����,�� ���� �����.

			int comVal = rand.nextInt(3);
			String comStr = switch (comVal) {
			case 0 -> "����";
			case 1 -> "����";
			case 2 -> "��";
			default -> "";
			};

			// (2) ��ǻ�Ϳ� User�� ���� ���Ѵ�.
			// (2-1) �����: User���� Com���� ������
			// (2-1-1) ��� ��� �ٽ� (1)�� ���ư� ���⸦ �Ѵ�.
			// (2-2) User�� �̱� ���:
			// (3) ���� ��� ����Ѵ�.
			System.out.printf("User:%s, Com:%s\n", userStr, comStr);
			int judgeVal = userVal - comVal;
			if (judgeVal == 0) {
				System.out.println("�����ϴ�.");
				continue;
				// �����
			} else if (judgeVal == 1 || judgeVal == -2) {
				// User �̱���
				System.out.println("�̰���ϴ�.");
				break;
			} else {
				// User �����
				System.out.println("�����ϴ�.");
				continue;
			}
		}
	}

}
