package ���ڿ����迭;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = {1,2,3,4,5};
		// �ּ� ���� - ���� ���� 
		int[] intAry2 = intAry;
		System.out.println(Arrays.toString(intAry2));
		System.out.println(intAry2);
		intAry2[0]=10;
		System.out.println(Arrays.toString(intAry));
		
		//���� ���� - ���� ����
		
		int[] intAry3 = Arrays.copyOf(intAry2, intAry.length);
		System.out.println(Arrays.toString(intAry3));
		intAry3[0] = 20;
		System.out.println(Arrays.toString(intAry));
		System.out.println(Arrays.toString(intAry3));
		
		//�迭�� �������� ���� => �⺻�������� ���������� ����
		Arrays.sort(intAry3);
		System.out.println(Arrays.toString(intAry3));
		
		//�迭�� �������� ����
		//���ڿ� => ���ڷ�
		Integer[] integerAry = new Integer[intAry3.length]; //����Ŭ���� Interger
		for(int i=0 ; i<intAry3.length; i++) {
			integerAry[i]=intAry3[i];
		}
		Arrays.sort(integerAry, Collections.reverseOrder());
		System.out.println(Arrays.toString(integerAry));
		
	}

}
