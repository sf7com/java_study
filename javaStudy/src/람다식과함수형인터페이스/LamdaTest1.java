package ���ٽİ��Լ����������̽�;

import java.util.Arrays;

class Rect{
	int hSize,vSize;
	public Rect(int hSize, int vSize) {
		super();
		this.hSize = hSize;
		this.vSize = vSize;
	}
	int getArea() {
		return hSize*vSize;
	}
}

public class LamdaTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect(10,5);
		Rect r2 = new Rect(3,8);
		Rect r3 = new Rect(7,6);
		Rect[] rArray = {r1,r2,r3};
		
		//������ - �迭 ��ü ����
		for(var r : rArray) {
			System.out.println(r.hSize);
		}
		
		Arrays.sort(rArray,(o1, o2)->o1.getArea()-o2.getArea());//������ ���� ������ �ȵ�, ���� �߰� Arrays.sort(rArray); ->
		//rArray o1,o2 �ҷ��ͼ� o1-o2�� ���� ����̸� ��ġ �����Ѵ�
//		Arrays.sort(rArray,(o1, o2)->o1.hSize-o2.hSize);//������ ���� ������ �ȵ�, ���� �߰� Arrays.sort(rArray); ->
		//rArray o1,o2 �ҷ��ͼ� o1-o2�� ���� ����̸� ��ġ �����Ѵ� (int���� ���;� ��)
		Arrays.sort(rArray,(o1, o2)->o2.hSize-o1.hSize);//������ ���� ������ �ȵ�, ���� �߰� Arrays.sort(rArray); ->
		//rArray o1,o2 �ҷ��ͼ� o1-o2�� ���� ����̸� ��ġ �����Ѵ� (int���� ���;� ��) ��������
		System.out.println("-".repeat(30));
		//���� �� - �迭 ��ü�� ����
		for(var r : rArray) {
			System.out.println(r.hSize);
		}
	}

}
