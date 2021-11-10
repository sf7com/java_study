package 제네릭;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayUtil {
	//제네릭 메서드
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
	
	//제네릭 타입으로 숫자 타입만 받도록함
	//(1) Max값 리턴해주는 메서드 
	public static <T extends Number> T max(T[] array) { //double(기본클래스)은 null을 받을 수 없다.
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
	//(2) 최빈값 - 가장 빈도가 높은 값
	//ex) 1,3,4,5,6,1,1,2,3,4,1,1
	//최빈값 1
	public static <T> T mode(T[] array) {
		if(array == null || array.length == 0) {
			return null;
		}
		Set<T> set = new HashSet<>(); //array -> Set 변환(원소의 고유한 값을 얻기위해 변환)
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
	
	//(3) 중앙값 - 원소를 오름차순으로 정렬한 후 중앙인덱스의 값이 중앙값이다. 
	//[1,2,3,4,5] -> 3, 원소의 개수가 홀수인 경우 중앙값 인덱스 : 배열크기/2
	//[1,2,3,4] => (2+3)/2  //짝수인 경우 인덱스 : (배열의크기/2)-1 + 배열의크기/2 평균값 
	public static <T extends Number> Double median(T[] array) {
		if(array == null || array.length == 0) {
			return null;
		}
		Double result;
		Arrays.sort(array);
		if(array.length % 2 == 0) {
			//원소의 개수가 짝수인 경우
			result = (array[array.length/2-1].doubleValue()+array[array.length/2].doubleValue())/2;
		}else {
			//홀수인 경우
			result = array[array.length/2].doubleValue();
		}
		return result;
	}
}
