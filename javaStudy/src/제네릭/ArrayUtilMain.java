package 제네릭;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import 컬렉션프레임워크.Student;
import 컬렉션프레임워크.Student2;

public class ArrayUtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"사과","딸기","포도","바나나"};
		ArrayUtil.printArray(strArray);
		System.out.println();
		System.out.println(ArrayUtil.getfirstVal(strArray));
		System.out.println(ArrayUtil.getLastVal(strArray));
		
		//total메서드는 Number타입으로 제한
		//ArrayUtil.total(strArray);
		
		//기본타입은 제네릭 타입으로 들어갈 수 없다.
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
		stuArray[0] = new Student("홍길동", 100);
		stuArray[1] = new Student("임꺽정", 84);
		stuArray[2] = new Student("손오공", 59);
		
		ArrayUtil.printArray(stuArray);
		System.out.println(ArrayUtil.getLastVal(stuArray));
		
		//(1) Max값 리턴해주는 메서드
		Integer[] numArray2 = {1,3,3,3,5,4,10,9,10};
		
		Integer maxVal = numArray2[0];
		for(int i=1;i<numArray2.length;i++) {
			if(numArray2[i]>maxVal)
				maxVal = numArray2[i];
		}
		System.out.println(maxVal);
		System.out.println(ArrayUtil.max(numArray2));
		//(2) 중앙값 - 원소를 오름차순으로 정렬한 후 중앙인덱스의 값이 중앙값이다.
		//(2-1) 오름차순 정렬
		//[1,2,3,4,5] -> 3, 원소의 개수가 홀수인 경우 중앙값 인덱스 : 배열크기/2
		//[1,2,3,4] => (2+3)/2  //짝수인 경우 인덱스 : (배열의크기/2)-1 + 배열의크기/2 평균값 
		Arrays.sort(numArray2);
		if(numArray2.length % 2 == 0) {
			//원소의 개수가 짝수인 경우
			Double median = (numArray2[numArray2.length/2-1].doubleValue()+numArray2[numArray2.length/2].doubleValue())/2;
			System.out.println(median);
		}else {
			//홀수인 경우
			Double median = numArray2[numArray2.length/2].doubleValue();
			System.out.println(median);
		}
		
		System.out.println(ArrayUtil.median(numArray2));

		
		//(3) 최빈값 - 가장 빈도가 높은 값
		//(3-1) 오름차순 정렬
		//ex) 1,3,4,5,6,1,1,2,3,4,1,1
		//최빈값 1
		String[] array = {"딸기","사과","포도","배","배","포도","포도"};
		Set<String> set = new HashSet<>(); //array -> Set 변환(원소의 고유한 값을 얻기위해 변환)
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
