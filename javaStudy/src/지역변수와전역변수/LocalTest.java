package ������������������;

public class LocalTest {

	static int globalNum = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		numIncrement(num);
		System.out.println("Main �޼��忡���� num�� : " + num);
		globalNumIncrement();
		System.out.println("Main �޼��忡���� globalNum�� : " + globalNum);
	}
	//���� 1���������� ����� ���ϴ� �޼���
	public static void numIncrement(int num) {
		System.out.println("�޼��� ������ num�� : " + num);
		num++;
		System.out.println("�޼��� ������ num�� : " + num);
	}
	public static void globalNumIncrement() {
		System.out.println("�޼��� ������ globalNum�� : " + globalNum);
		globalNum++;
		System.out.println("�޼��� ������ globalNum�� : " + globalNum);
	}
	

}
