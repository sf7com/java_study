package ���;

import java.util.Random;
import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ȧ���� ���ڸ� ���
//		for(int i=0; i<10; i++) {
//			if(i%2==0)
//				continue;
//			System.out.println(i);
//		}
//		
		//1~100������ ���ڸ� ��� ���ڸ� ���ϴµ�
		//ù°�ڸ��� 3�� ���ڴ� ���� ���ϱ�
//		int total=0;
//		for(int i=1;i<=100;i++) {
//			if(i%10==3)
//				continue; //Ư���� �����Ͽ� �ݺ����� �������� ���ư�
//			total+=i;
//		}
//		System.out.println(total);
		
		//�ڹ� �� ���߱� ����
		//Up, Down
		//��ǻ�Ͱ� ���� ������ ���� ���߱�
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		//rand.nextInt(n) 0�̻� n�̸��� ������ ���� ����
		int comNum = rand.nextInt(101); //0~100���� ������ ����
		
		while(true) {
			//(1)����� ���� �Է� �޴´�.
			//(1-1) 0~100 �̿��� ���ڸ� �Է����� �� �ٽ� �Է¹޴´�.
			System.out.print("���ڸ� �Է��ϼ��� > ");
			int userNum = sc.nextInt();
			if(userNum<0 || userNum>100) {
				if(userNum==-1) {
					System.out.println("���������մϴ�.");
					break;
				}
				System.out.println("�߸��Է��Ͽ����ϴ�..");
				continue;
			}
			//(2) �Է��� ���ڿ� ��ǻ�� ���� ���� ��
			if(comNum > userNum) {
				System.out.println("Up~!");
			}else if(comNum < userNum){
				System.out.println("Down~!");
			}else {
				System.out.println("���ڸ� ������ϴ�.");
				comNum = rand.nextInt(101); //0~100���� ������ ����
			}
		}
	}

}
