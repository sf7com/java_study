package ���;

import java.util.Scanner;

public class LoopHomework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ʺ�� ���̸� �Է¹޾Ƽ� �簢�� ���+
		//����1) �簢���� ä������ �� : ù��� ��������
		//����2-1) ù ��� ���������� �ƴ� ��� ù ���� ������ ���� �簢���̰� �������� ����

		//(1-1) ������� �簢�� ���
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		for(int row=0; row<h; row++) {
			//�� ���� �簢�� ���
			//ù�� row=0, �������� row==h-1
			if(row==0 || row==h-1) {
				for(int col=0; col<w; col++) {
					System.out.printf("%2s","��");
				}
			}else {
				for(int col=0; col<w; col++) {
					//ù�� col==0,�������� col==w-1
					if(col==0 || col==w-1)
						System.out.printf("%2s","��");
					else
						System.out.printf("%2s"," ");
				}			
			}
			System.out.println(); //����
		}
		
		//����1 ��� ù���, ��������, ù����, ������ ���� ��µȴ�.
		//����2 ����1�� �ƴ� ��� ������ ����Ѵ�.
		for(int row=0; row<h; row++) {
			//�� ���� �簢�� ���
			//ù�� row=0, �������� row==h-1
				for(int col=0; col<w; col++) {
					//ù�� col==0,�������� col==w-1
					if(row==0||row==h-1||col==0 || col==w-1)
						System.out.printf("%2s","��");
					else
						System.out.printf("%2s"," ");
				}
				System.out.println(); //����
		}				
		
	}
}
