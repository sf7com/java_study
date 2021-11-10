package ���׸�;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayUtil {
	//���׸� �޼���
	public static <T> void printArray(T[] array) {
		System.out.print("[");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]);
			if(i!=array.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	public static <T> T getLastVal(T[] array) {
		if(array == null || array.length == 0) {
			return null;
		}
		return array[array.length-1];
	}
	
	public static <T> T getfirstVal(T[] array) {
		if(array == null || array.length == 0) {
			return null;
		}
		return array[0];
	}
	
	public static <T extends Number> double total(T[] array) {
		double total = 0;
		for(T val : array) {
			total += val.doubleValue();
		}
		return total;
	}
	
	public static <T extends Number> double avg(T[] array) {
		return total(array)/array.length;
	}
	
	//���׸� Ÿ������ ���� Ÿ�Ը� �޵�����
	//(1) Max�� �������ִ� �޼��� 
	public static <T extends Number> T max(T[] array) { //double(�⺻Ŭ����)�� null�� ���� �� ����.
		if(array == null || array.length == 0) {
			return null;
		}
		T maxVal = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i].doubleValue() > maxVal.doubleValue())
				maxVal = array[i];
		}
		return maxVal;
	}	
	//(2) �ֺ� - ���� �󵵰� ���� ��
	//ex) 1,3,4,5,6,1,1,2,3,4,1,1
	//�ֺ� 1
	public static <T> T mode(T[] array) {
		if(array == null || array.length == 0) {
			return null;
		}
		Set<T> set = new HashSet<>(); //array -> Set ��ȯ(������ ������ ���� ������� ��ȯ)
		for(var val : array	) {
			set.add(val);
		}
		Map<Integer, T> map = new HashMap<>();
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
		return map.get(maxCnt);
	}
	
	//(3) �߾Ӱ� - ���Ҹ� ������������ ������ �� �߾��ε����� ���� �߾Ӱ��̴�. 
	//[1,2,3,4,5] -> 3, ������ ������ Ȧ���� ��� �߾Ӱ� �ε��� : �迭ũ��/2
	//[1,2,3,4] => (2+3)/2  //¦���� ��� �ε��� : (�迭��ũ��/2)-1 + �迭��ũ��/2 ��հ� 
	public static <T extends Number> Double median(T[] array) {
		if(array == null || array.length == 0) {
			return null;
		}
		Double result;
		Arrays.sort(array);
		if(array.length % 2 == 0) {
			//������ ������ ¦���� ���
			result = (array[array.length/2-1].doubleValue()+array[array.length/2].doubleValue())/2;
		}else {
			//Ȧ���� ���
			result = array[array.length/2].doubleValue();
		}
		return result;
	}
}
