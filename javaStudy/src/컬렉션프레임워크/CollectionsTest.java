package �÷��������ӿ�ũ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) ����
		List<Integer> numList = Arrays.asList(10,20,10,3,5,9,1,1);
		System.out.println("������ : " + numList);
		//�������� ����
		Collections.sort(numList);
		System.out.println("������ : " + numList);
		//�������� ����
		Collections.sort(numList,Collections.reverseOrder());
		System.out.println("�������� ������ : " + numList);
		
//		//�������� �˰���
		int[] intArray = {69,10,30,2,16,8,31,22};
//		//1�ܰ�
//		for(int i=0; i<intArray.length-1;i++) {
//			//i����:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//2�ܰ�
//		for(int i=0; i<intArray.length-2;i++) {
//			//i����:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//3�ܰ�
//		for(int i=0; i<intArray.length-3;i++) {
//			//i����:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//4�ܰ�
//		for(int i=0; i<intArray.length-4;i++) {
//			//i����:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//5�ܰ�
//		for(int i=0; i<intArray.length-5;i++) {
//			//i����:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//6�ܰ�
//		for(int i=0; i<intArray.length-6;i++) {
//			//i����:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		//7�ܰ� : intArray.length-1
//		for(int i=0; i<intArray.length-(intArray.length-1);i++) {
//			//i����:0~7
//			if(intArray[i]>intArray[i+1]) {
//				int temp = intArray[i+1];
//				intArray[i+1] = intArray[i];
//				intArray[i]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
		//��������
//		for(int step=1;step<=intArray.length-1; step++) {
//			for(int i=0; i<intArray.length-step;i++) {
//				//i����:0~7
//				if(intArray[i]>intArray[i+1]) {
//					int temp = intArray[i+1];
//					intArray[i+1] = intArray[i];
//					intArray[i]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(intArray));
//		
//		//��������
//		for(int step=1;step<=intArray.length-1; step++) {
//			for(int i=0; i<intArray.length-step;i++) {
//				//i����:0~7
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
		
		//���� String�� ������Ǿ� �޼��忡�� ����� ������ �ȵ�.
		String str="banana";
		
		
	}
	public static void convStr(String str) {
		str="apple";
	}
	
	
	public static void ArraySort(int[] intArray, boolean isAsc) {
		//void : �� ������ ������ Array�� ������������ ������ ���ص� main�� �ȿ� ������ ����ȴ�. 
		if(isAsc) {
			for(int step=1;step<=intArray.length-1; step++) {
				for(int i=0; i<intArray.length-step;i++) {
					//i����:0~7
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
					//i����:0~7
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
