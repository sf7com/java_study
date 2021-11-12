package ���ٽİ��Լ����������̽�;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Rect2 implements Comparable<Rect2>{
	int hSize,vSize;
	public Rect2(int hSize, int vSize) {
		super();
		this.hSize = hSize;
		this.vSize = vSize;
	}
	int getArea() {
		return hSize*vSize;
	}
	
	@Override
	public String toString() {
		return "�簢�� [����=" + hSize + ", ����=" + vSize + "]";
	}
	//�ΰ�ü �� �޼���(�������� ����)
	//����̸� �ڱ��ڽ� ��ü�� ũ��.(List�� �迭���� �ڸ��� �ٲ۴�.)
	//�����̸� �ٸ� ��ü�� ũ��.(List�� �迭���� �ڸ��� �ȹٲ۴�.)
	//0�̸� ��ü�� ũ�Ⱑ ����.(List�� �迭���� �ڸ��� �ȹٲ۴�.)
	@Override
	public int compareTo(Rect2 o) { //���� ������ �߰��� ������ ��� ���� �߰��ؾ� ��.
		return getArea()-o.getArea();
	}
}

public class ObjectSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect2 r1 = new Rect2(10,5);
		Rect2 r2 = new Rect2(3,8);
		Rect2 r3 = new Rect2(7,6);

		Rect2[] rects = {r1,r2,r3};
		
		//���� ��
		for(var r : rects) {
			System.out.println(r);
		}
		
		Arrays.sort(rects);
		System.out.println("-".repeat(30));
		//���� ��
		for(var r : rects) {
			System.out.print(r);
			System.out.println(r.getArea());
		}
		
		List<Rect2> rList = new ArrayList<>();
		rList.add(r1);
		rList.add(r2);
		rList.add(r3);
		System.out.println(rList);
		Collections.sort(rList);
		System.out.println(rList);
		
		
		
	}

}
