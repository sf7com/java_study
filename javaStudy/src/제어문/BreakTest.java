package ���;

import java.util.Random;
import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<10;i++) {
//			if(i==7)
//				break;
//			System.out.println(i);
//		}
		//���� �ùٸ��� �Է¹����� �ݺ��� ����
		//Ű����� ���� 1~100���� ���� �ޱ�
		Scanner sc = new Scanner(System.in);
//		int num;
//		do {
//			System.out.print("0~100 ������ ������ �Է� > ");
//			num = sc.nextInt();
//			if(num>100 || num>0)
//				break;
//		}while(true);
//		System.out.printf("�Է¹��� ���� %d\n",num);
		
		//�ڹ� �� ���߱� ����
		//Up, Down
		//��ǻ�Ͱ� ���� ������ ���� ���߱�
		Random rand = new Random();
		//rand.nextInt(n) 0�̻� n�̸��� ������ ���� ����
		int comNum = rand.nextInt(100); //0~99���� ������ ����
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� > ");
			int userNum = sc.nextInt();
			if(userNum==-1) {
				System.out.println("���������մϴ�.");
				break;
			}
			if(comNum > userNum) {
				System.out.println("Up~!");
			}else if(comNum < userNum){
				System.out.println("Down~!");
			}else {
				System.out.println("���ڸ� ������ϴ�.");
				break;
			}
			
		}
		
		
	}

}
