package ���;

import java.util.Scanner;

public class LoopTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Quiz1 - ������ �Է¹޾Ƽ� �� �ڸ����� ���� ���Ͻÿ�.
		//ex) 12345 => 1+2+3+4+5 => 15
		//ex) 679 => 6+7+9 => 22
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��Ͻÿ�.");
//		int num = sc.nextInt();
//		int total = 0;
//		while(num>0) {
//			total += num%10; //num�� 1�� �ڸ� ��������
//			num /=10; //���� num�� 10���� ����
//		}
//		System.out.println(total);
		
		//Quiz2 00:00:00 ~ 23:59:59
		//���ð� ���
		for(int i=0; i<24;i++) {
			for(int j=0; j<60; j++) {
				for(int x=0; x<60; x++) {
					System.out.printf("%02d:%02d:%02d\n",i,j,x);
				}
			}
		}
		//��� �ð��ȿ� 3�� ���� �ִ��� ����Ͻÿ�.
		//00:00:03 => 1
		//13:33:34 => 4
		int count3 = 0;
		for(int hour=0; hour<24;hour++) {
			for(int min=0; min<60; min++) {
				for(int sec=0; sec<60; sec++) {
					int tempHour = hour;
					int tempMin = min;
					int tempSec = sec;
					while(tempHour>0) {
						if(tempHour%10==3)
							count3++;
						tempHour /=10;						
					}
					while(tempMin>0) {
						if(tempMin%10==3)
							count3++;
						tempMin /=10;
					}
					while(tempSec>0) {
						if(tempSec%10==3)
							count3++;
						tempSec /=10;
					}
				}
			}
		}
		System.out.println(count3);
		
		
	}

}
