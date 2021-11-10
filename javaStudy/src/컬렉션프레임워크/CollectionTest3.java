package �÷��������ӿ�ũ;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(1,2,10,9,100,30);
		//���� ū ��
		System.out.println(Collections.max(numList));
		//���� ���� ��
		System.out.println(Collections.min(numList));
		
		//�� �����
		Collections.fill(numList, 0);
		System.out.println(numList);
		
		//���� ����
		List<String> fruitList = Arrays.asList("���","����","����","����");
		//�� ������ ����
		Set<String> fruitSet = new HashSet<>(fruitList);
		for(var val : fruitSet) {
			int cnt = Collections.frequency(fruitList, val);
			System.out.println(val + "�� ���� : " + cnt);
		}
	}

}
