package ���ڿ����迭;

public class Arrytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���1
		//�ε���          0, 1, 2, 3, 4
		int[] score = {100,90,50,95,85};
		//���2
		int[] score1 = new int[] {100,90,50,95,85};
		//���3
		int[] score2;
		score2 = new int[] {100,90,50,95,85};
		//���4 ����
		int[] score3;
//		score3= {100,90,50,95,85};
		
		//�ε���
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		
		//�迭 ũ��
		System.out.println(score.length); //5
		
		//�迭 �� ����
		score[0] = 99;
		System.out.println(score[0]);
		
		//�迭�� �ʱⰪ�� ���� �ʰ� �迭�� ũ�⸸ �Ҵ��ؼ� ����
		int[] scores2 = new int[3];//0���� �ʱ�ȭ
		System.out.println(scores2[0]);
		System.out.println(scores2[1]);
		System.out.println(scores2[2]);
		//�迭�� ũ�⸦ ����� �ε��� ������ ����
//		System.out.println(scores2[3]);//����
		//�迭�� ����� ũ�Ⱑ ������ ��.�迭�� ũ��� ���ٲ۴�.
		System.out.println(scores2.length);
		
		scores2[0] = 10;
		scores2[1] = 60;
		scores2[2] = 88;
		int total=0;
		for(int i=0; i<scores2.length;i++) { //�迭�� ��� ���� ���� �Ѵ�.
			System.out.println(scores2[i]);
			total += scores2[i];
		}
		double avg = total/scores2.length;
		System.out.printf("scores2�� ��հ��� %.2f �Դϴ�.\n",avg);

		//(1) �迭�� ¦�� �ε����� ���� 3��ŭ ���Ͻÿ�.
		int[] ary1 = {10,20,30,40};
		for(int i=0; i<ary1.length;i++) { //4���ݺ�, �ε����� ���� ����
			if(i%2 == 0)
				ary1[i]+=3;
		}
		for(int i=0; i<ary1.length;i+=2) { //2�� �ݺ�
			ary1[i]+=3;
		}
		
		//for-each ���� : �迭�� ��� ��Ҹ� �����Ҷ� Ȱ��
		for(int val : ary1) {    // �迭�� ���ϰ� �̿��ϱ� ���ؼ� ��� ����,�迭�� ��� ����� ���� ���� �������� ���
			System.out.print(val+","); // �ε����� �Ұ���.
		}
		System.out.println();
		//for-each �������� �迭�� ��հ��� ���ϱ�
		total = 0;
		for(int val : ary1) {
			total+=val;
		}
		avg = total/ary1.length;
		System.out.printf("score2�� ��հ��� %.2f�Դϴ�.",avg);
	}
	

}
