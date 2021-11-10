package 문자열과배열;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = {1,2,3,4,5};
		// 주소 복사 - 얕은 복수 
		int[] intAry2 = intAry;
		System.out.println(Arrays.toString(intAry2));
		System.out.println(intAry2);
		intAry2[0]=10;
		System.out.println(Arrays.toString(intAry));
		
		//값을 복사 - 깊은 복사
		
		int[] intAry3 = Arrays.copyOf(intAry2, intAry.length);
		System.out.println(Arrays.toString(intAry3));
		intAry3[0] = 20;
		System.out.println(Arrays.toString(intAry));
		System.out.println(Arrays.toString(intAry3));
		
		//배열의 오름차순 정렬 => 기본형에서는 오름차순만 지원
		Arrays.sort(intAry3);
		System.out.println(Arrays.toString(intAry3));
		
		//배열의 내림차순 정렬
		//문자열 => 숫자로
		Integer[] integerAry = new Integer[intAry3.length]; //래퍼클래스 Interger
		for(int i=0 ; i<intAry3.length; i++) {
			integerAry[i]=intAry3[i];
		}
		Arrays.sort(integerAry, Collections.reverseOrder());
		System.out.println(Arrays.toString(integerAry));
		
	}

}
