package ���;

import java.util.Scanner;

public class LoopHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//(1) ���� ���� �ﰢ��
//		//(1-1) ���� 10
//		System.out.print("�ﰢ���� ���̸� �Է��ϼ���>");
//		Scanner sc = new Scanner(System.in);
//		int height = sc.nextInt();
//		for(int i=0;i<height;i++) {
//			for(int j=0;j<i+1;j++) {
//				System.out.print("��");	
//			}
//			System.out.println();
//		}
//		
//		//(2) ������ ���� �ﰢ��
//		for(int i=0; i<height;i++) {
//			for(int j=0;j<-i+9;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i+1;j++) {
//				System.out.print("��");
//			}
//			System.out.println();
//		}
		int height=5;
		//(3) ���ﰢ��
		for(int i=0; i<height;i++) {
			for(int j=0;j<-i+height-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("��");
			}
			System.out.println();
		}
//		(4) �� ���ﰢ�� ���
		for(int i=height-2; i>=0; i--) {
			for(int j=0;j<-i+height-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("��");
			}
				System.out.println();
		}
		//(5) �簢�� ���
		//���̿� ���̸� �Է¹ް� �簢�� ���
		//���� 4, �ʺ� 5
		//������
		//������
		//������
		//������
		
		//����3, �ʺ� 3
		//����
		//����
		//����
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���̸� �Է��ϼ���>");
//		int height = sc.nextInt();
//		System.out.print("�ʺ� �Է��ϼ���>");
//		int width = sc.nextInt();
//		for(int i=1;i<=height;i++) {
//			for(int j=1;j<=width;j++) {
//				System.out.print("��");
//			}
//			System.out.println();
//		}
//		//���� 4, ���� 5
//		// ���� �迭�� ���
//		int seqVal = 0;
//		for(int i=1;i<=height;i++) {
//			for(int j=1;j<=width;j++) {
//				seqVal++;
//				System.out.printf("%02d ",seqVal);
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//		for(int row=0;row<height;row++) {
//			for(int col=0;col<width;col++) {
//				System.out.printf("%02d ",(row*width)+(col+1));
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
		//���� 4, ���� 5
//		//¦���� �Ųٷ� ���, Ȧ���� ���� ���
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���̸� �Է��ϼ���>");
//		int height = sc.nextInt();
//		System.out.print("�ʺ� �Է��ϼ���>");
//		int width = sc.nextInt();
//		
//		int seqVal = 0;
//		for(int i=1;i<=height;i++) {
//			seqVal=i*width;
//			if(seqVal%2!=0) {
//				for(int j=(seqVal-(width-1));j<=seqVal;j++) {
//				System.out.printf("%02d ",j);	
//				}
//			}
//			else {
//				for(int j=seqVal;j>=(seqVal-width)+1;j--) {
//					System.out.printf("%02d ",j);	
//				}			
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int row=0; row<height; row++) {
//			for(int col=0; col<width;col++) {
//				if(row%2==0)
//					System.out.printf("%02d ",(row*width+1)+col);
//				else
//					System.out.printf("%02d ",(row*width+width)-col);
//			}
//			System.out.println();
//		}
		
		
	}

}
