package ���ڿ����迭;

public class Arrytest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3����(����,����,����)�� 5���� �л��� ����
		int[][] scores = {
			//    s1 s2 s3 s4 s5
				{100,90,50,98,43}, //����
				{70,60,82,75,98},  //����
				{30,77,65,23,80}}; //����
		
		//s1�л��� �������
		int total1 = scores[0][0]+scores[1][0]+scores[2][0];
		double avg1 = total1/3;
		System.out.printf("s1 �л��� ������� : %.2f\n",avg1);
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		//�� �л����� ������� ���
		double[] stuAvgAry = new double[scores[0].length];
		for(int col=0;col<scores[0].length;col++) {
			int total = 0;
			double avg = 0;
			for(int row=0;row<scores.length;row++) {
				total+=scores[row][col];
			}
			avg = total/scores.length;
			stuAvgAry[col]=avg;
			System.out.printf("%d�� �л��� ��������� %.2f�Դϴ�.\n",col+1,avg);
		}
		//�� ���
		double classTotal = 0;
		for(double avg : stuAvgAry) {
			classTotal += avg;
		}
		double classAvg = classTotal/stuAvgAry.length;
		System.out.printf("����հ� : %.2f\n", classAvg);
		
		//���� ���
		double[] subAvgAry = new double[scores.length];
		for(int row=0;row<scores.length;row++) {
			int total = 0;
			double subAvg = 0;
			for(int col=0;col<scores[0].length;col++) {
				total+=scores[row][col];
			}
			subAvg = total/scores[0].length;
			subAvgAry[row]=subAvg;
			System.out.printf("%d�� ������ ��������� %.2f�Դϴ�.\n",row+1,subAvgAry[row]);
		}
	}

}
