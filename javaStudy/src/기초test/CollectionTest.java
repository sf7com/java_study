package ����test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)�Ʒ��� �迭�� List�� �ٲٽÿ�.
		int[] array = {1,2,2,3,3,2,4,4,2,4,5,7,8};
		List<Integer> numList = new ArrayList<>();
		for(var val : array) {
			numList.add(val);
		}
		
		System.out.println(numList);
		//(2)(1)���� ���� List���� �� array�� ��հ� �̻��� ���ڸ� ����Ͻÿ�.
		int sum=0;
		for(int i=0;i<numList.size();i++) {
			sum += numList.get(i);
		}
		double avg = sum/numList.size();
		for(int i=0;i<numList.size();i++) {
			if((double)numList.get(i)>avg) {
				System.out.print(numList.get(i));
				if(i==numList.size()-1)
					break;
				else
					System.out.print(",");
			}
		}
		
		
		//numList�� �ִ� ���� 2 ��� ����
//		for (int i=0; i<numList.size();i++) {
//			if(numList.get(i)==2) {
//				numList.remove(i);
//				i--;
//			}
//		}
//		System.out.println(numList);
		
		var iter = numList.iterator();
		while(iter.hasNext()) {
			if(iter.next()==2) {
				iter.remove();
			}
		}
		System.out.println(numList);
		
			
	}

}
