package 컬렉션프레임워크;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) 정렬
		List<Integer> numList = Arrays.asList(10,20,10,3,5,9,1,1);
		System.out.println("정렬전 : " + numList);
		//오름차순 정렬
		Collections.sort(numList);
		System.out.println("정렬후 : " + numList);
		//내림차순 정렬
		Collections.sort(numList,Collections.reverseOrder());
		System.out.println("내림차순 정렬후 : " + numList);
		
//		//버블정렬 알고리즘
		int[] intArray = {69,10,30,2,16,8,31,22};
//		//1단계
//		for(int i=0; i<intArray.length-1;i++) {
//			//i범위:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//2단계
//		for(int i=0; i<intArray.length-2;i++) {
//			//i범위:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//3단계
//		for(int i=0; i<intArray.length-3;i++) {
//			//i범위:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//4단계
//		for(int i=0; i<intArray.length-4;i++) {
//			//i범위:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//5단계
//		for(int i=0; i<intArray.length-5;i++) {
//			//i범위:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//6단계
//		for(int i=0; i<intArray.length-6;i++) {
//			//i범위:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//7단계 : intArray.length-1
//		for(int i=0; i<intArray.length-(intArray.length-1);i++) {
//			//i범위:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
		//오름차순
//		for(int step=1;step<=intArray.length-1; step++) {
//			for(int i=0; i<intArray.length-step;i++) {
//				//i범위:0~7
//				if(intArray[i]>intArray[i+1]) {
//					int temp = intArray[i+1];
//					intArray[i+1] = intArray[i];
//					intArray[i]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		
//		//내림차순
//		for(int step=1;step<=intArray.length-1; step++) {
//			for(int i=0; i<intArray.length-step;i++) {
//				//i범위:0~7
//				if(intArray[i]<intArray[i+1]) {
//					int temp = intArray[i+1];
//					intArray[i+1] = intArray[i];
//					intArray[i]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		
		ArraySort(intArray, false);
		System.out.println(Arrays.toString(intArray));
		
		//예외 String은 값복사되어 메서드에서 변경시 변경이 안됨.
		String str="banana";
		
		
	}
	public static void convStr(String str) {
		str="apple";
	}
	
	
	public static void ArraySort(int[] intArray, boolean isAsc) {
		//void : 값 리턴이 없으나 Array는 참조형변수라 리턴을 안해도 main문 안에 변수가 변경된다. 
		if(isAsc) {
			for(int step=1;step<=intArray.length-1; step++) {
				for(int i=0; i<intArray.length-step;i++) {
					//i범위:0~7
					if(intArray[i]>intArray[i+1]) {
						int temp = intArray[i+1];
						intArray[i+1] = intArray[i];
						intArray[i]=temp;
					}
				}
			}
		}else {
			for(int step=1;step<=intArray.length-1; step++) {
				for(int i=0; i<intArray.length-step;i++) {
					//i범위:0~7
					if(intArray[i]<intArray[i+1]) {
						int temp = intArray[i+1];
						intArray[i+1] = intArray[i];
						intArray[i]=temp;
					}
				}
			}			
		}
	}

}
