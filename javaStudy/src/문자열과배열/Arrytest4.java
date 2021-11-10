package ���ڿ����迭;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrytest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ζ� 1~45���� 6��, ��ȣ �ߺ� ����� ��
		//��ǻ�ͱ� �ζ� ��ȣ ����
		Random rand = new Random();
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length; i++) {
			lotto[i]=rand.nextInt(45)+1; //1~45
			//�ߺ����� ���� ����
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					//�ߺ���
					i--;  //���α׷� ����� �ϳ���.�ߺ��� ó�� ���
					break;
				}
			}
		}
		System.out.println(lotto);//[I@28a418fc
		System.out.println(Arrays.toString(lotto));
		//[33, 38, 18, 3, 41, 26]
		
		//����ڰ� 6���� �ζǹ�ȣ�� �̴´�.
		//Ű���� ���� 6���� �Է¹޴´�.
		//�ߺ��� ������ �ٽ� �̵��� �Ѵ�.
		//�߰����� ) ������ 1~45�� ������ ����� �Է��ϸ� �ٽ� ���ڸ� �Է��ϵ��� �Ѵ�.
		int[] userLotto = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<userLotto.length; i++) {
			System.out.printf("%d��° ��ȣ�� �Է��ϼ���.> ",i+1);
			userLotto[i]=sc.nextInt(); //1~45
			if(userLotto[i]<=0 || userLotto[i]>45) {
				System.out.print("�ٽ� ��ȣ�� �Է��ϼ���.> ");
				userLotto[i]=sc.nextInt(); //1~45
			}
			//�ߺ����� ���� ����
			for(int j=0; j<i; j++) {
				if(userLotto[i]==userLotto[j]) {
					//�ߺ���
					System.out.println("�ٽ� ��ȣ�� �Է��ϼ���.> ");
					i--;  //���α׷� ����� �ϳ���.�ߺ��� ó�� ���
					break;
				}
			}
		}
		System.out.println(Arrays.toString(userLotto));
		
		//��ǻ�� �ζ� ��ȣ�� ����� �Է� �ζǰ��� ��
		int[] lucky = new int[6];
		int result = 0;
		for(int i=0;i<lucky.length;i++) {
			int process = lotto[i];
			for(int j=0; j<6; j++) {
				if(process==userLotto[j]) {
					//�ߺ���
					lucky[j]=userLotto[j];
					result++;
					
				}
			}
			
		}
		System.out.println(result);
		String grade="";
		if(result <3)
			grade="��";
		if(result ==3)
			grade="4��";
		if(result ==4)
			grade="3��";
		if(result ==5)
			grade="2��";
		if(result ==6)
			grade="1��";
		System.out.printf("����� �ζ� ��÷ ����� %s �Դϴ�.\n",grade);
		System.out.println("��÷ Ȯ�� ��� �Դϴ�."+Arrays.toString(lucky));
		
		//user�� lotto��ȣ ��� ��������� �����ȣ ���
		//(1)User�� ���� 6�� ��ȣ, Com�� ���� 6�� ��ȣ�� ������ ��
		//(1-1)User��ȣ ���� Com�� ���� 6���� ��ȣ�� ��� ��
		
		int correctNum = 0;
		int[] correctLotto = new int[6];
		System.out.print("User�� ���� ��ȣ�� : ");
		for(int userNum : userLotto) {
			for(int comNum : lotto) {
				if(userNum == comNum) {
					correctLotto[correctNum]=userNum;
					correctNum++;
				}
			}
		}
		System.out.println(Arrays.toString(correctLotto));
	
	}

}
