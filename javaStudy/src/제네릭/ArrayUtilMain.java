package ���׸�;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import �÷��������ӿ�ũ.Student;
import �÷��������ӿ�ũ.Student2;

public class ArrayUtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"���","����","����","�ٳ���"};
		ArrayUtil.printArray(strArray);
		System.out.println();
		System.out.println(ArrayUtil.getfirstVal(strArray));
		System.out.println(ArrayUtil.getLastVal(strArray));
		
		//total�޼���� NumberŸ������ ����
		//ArrayUtil.total(strArray);
		
		//�⺻Ÿ���� ���׸� Ÿ������ �� �� ����.
		int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		//ArrayUtil.total(intArray);
		
		Integer[] numArray = {1,2,3,4,5,6,7,8,9,10};
		double total = ArrayUtil.total(numArray);
		System.out.println(total);
		double avg = ArrayUtil.avg(numArray);
		System.out.println(avg);
		
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		System.out.println(ArrayUtil.total(doubleArray));
		System.out.println(ArrayUtil.avg(doubleArray));
		
		ArrayUtil.printArray(doubleArray);
		
		Student[] stuArray = new Student[3];
		stuArray[0] = new Student("ȫ�浿", 100);
		stuArray[1] = new Student("�Ӳ���", 84);
		stuArray[2] = new Student("�տ���", 59);
		
		ArrayUtil.printArray(stuArray);
		System.out.println(ArrayUtil.getLastVal(stuArray));
		
		//(1) Max�� �������ִ� �޼���
		Integer[] numArray2 = {1,3,3,3,5,4,10,9,10};
		
		Integer maxVal = numArray2[0];
		for(int i=1;i<numArray2.length;i++) {
			if(numArray2[i]>maxVal)
				maxVal = numArray2[i];
		}
		System.out.println(maxVal);
		System.out.println(ArrayUtil.max(numArray2));
		//(2) �߾Ӱ� - ���Ҹ� ������������ ������ �� �߾��ε����� ���� �߾Ӱ��̴�.
		//(2-1) �������� ����
		//[1,2,3,4,5] -> 3, ������ ������ Ȧ���� ��� �߾Ӱ� �ε��� : �迭ũ��/2
		//[1,2,3,4] => (2+3)/2  //¦���� ��� �ε��� : (�迭��ũ��/2)-1 + �迭��ũ��/2 ��հ� 
		Arrays.sort(numArray2);
		if(numArray2.length % 2 == 0) {
			//������ ������ ¦���� ���
			Double median = (numArray2[numArray2.length/2-1].doubleValue()+numArray2[numArray2.length/2].doubleValue())/2;
			System.out.println(median);
		}else {
			//Ȧ���� ���
			Double median = numArray2[numArray2.length/2].doubleValue();
			System.out.println(median);
		}
		
		System.out.println(ArrayUtil.median(numArray2));

		
		//(3) �ֺ� - ���� �󵵰� ���� ��
		//(3-1) �������� ����
		//ex) 1,3,4,5,6,1,1,2,3,4,1,1
		//�ֺ� 1
		String[] array = {"����","���","����","��","��","����","����"};
		Set<String> set = new HashSet<>(); //array -> Set ��ȯ(������ ������ ���� ������� ��ȯ)
		for(var val : array	) {
			set.add(val);
		}
		System.out.println(set);
		Map<Integer, String> map = new HashMap<>();
		int maxCnt=0;
		for(var setVal : set) {
			int cnt=0;
			for(var aryVal : array) {
				if(setVal.equals(aryVal))
					cnt++;
			}
			if(cnt > maxCnt)
				maxCnt = cnt;
			map.put(cnt, setVal);
		}
		System.out.println(maxCnt);	
		System.out.println(map.get(maxCnt));
		
		System.out.println(ArrayUtil.mode(array));
		Integer[] numArray3 = {1,1,1,2,2,2,3,3,3,3,3,3};
		System.out.println(ArrayUtil.mode(numArray3));
		
		
		
		
		
	}

}
