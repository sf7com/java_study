package �÷��������ӿ�ũ;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڷḦ �ߺ����� �����ϴ� �ڷᱸ��, �������� ������ ����.
		Set<Integer> numSet = new HashSet<>();
		numSet.add(1);
		numSet.add(2);
		numSet.add(3);
		numSet.add(3);
		numSet.add(3);
		numSet.add(3);
		numSet.add(3);
		numSet.add(4);
		System.out.println(numSet);
		
		//(1) List -> Set
		List<Integer> intList = Arrays.asList(1,1,3,3,5,5,5);
		Set<Integer> intSet = new HashSet<>(intList);
		System.out.println(intList);//[1, 1, 3, 3, 5, 5, 5]
		System.out.println(intSet);//[1, 3, 5]
		
		//(2) �迭 -> set (�ٷ� ��ȯ�� �Ұ���, �迭�� List�� �ٲ�� ��)
		Integer[] intArray = new Integer[] {1,1,2,2,3,3,3};
		intList = Arrays.asList(intArray);
		intSet = new HashSet<>(intList);
		System.out.println(intSet);
		
		//////////////////////////////////////////////////////
		Set<String> nameSet = new HashSet<>();
		//(1) �� �߰�
		nameSet.add("ȫ�浿");
		nameSet.add("�Ӳ���");
		nameSet.add("��â��");
		nameSet.add("���ϳ�");
		System.out.println(nameSet);
		
		//(2) �� ����
		nameSet.remove("���ϳ�");
		System.out.println(nameSet);
		
		//(3) Set ������, ��� ��
		int size = nameSet.size();
		System.out.println("Set ������ : "+size);
		
		//(4) �� �˻� - true/false
		boolean isName = nameSet.contains("��â��");
		System.out.println("��â�� �̸� ���翩�� : "+isName);
		
		//set�� �ݺ���
		for(String name : nameSet) {
			System.out.println(name);
		}
		//////////////////////////////////////////
		List<String> fruitList = Arrays.asList("���","���","����","����","����","��","�ٳ���");
		Set<String> fruitSet = new HashSet<>(fruitList);
		System.out.println(fruitSet);
		
		Map<String, Integer> fruitMap = new HashMap<>();
		//�����̸� key, value ���� ����
		//��� : 2, ����:3,��:1,�ٳ���:1
		//�˰���
		//(1) ���Ϻ��� ������ ������ ����.(�ݺ���)
		//(2) �����̸��� key��, ���ϰ����� Value�� fruitMap�� �����Ѵ�.
		for(String fruitName : fruitSet) {
			int qty = 0;
			for(String fruitVal : fruitList) {
				if(fruitVal.equals(fruitName))
					qty++;
			}
			fruitMap.put(fruitName,qty);
		}
		System.out.println(fruitMap);
		
		for(String fruitName : fruitSet) {
			int qty = Collections.frequency(fruitList,fruitName);
			fruitMap.put(fruitName,qty);
		}
		System.out.println(fruitMap);
		
		
		
	}

}
