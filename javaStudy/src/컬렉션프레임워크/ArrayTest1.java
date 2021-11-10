package �÷��������ӿ�ũ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List�� �� Ÿ���� Ŭ���� Ÿ��
		// Integer�� �����ϴ� List
		List<Integer> intList = new ArrayList<>(); //���� ���� ����ϴ� ����
		//List<int> intList = new ArrayList<>();
		intList.add(1);
		intList.add(21);
		intList.add(25);
		intList.add(30);
		System.out.println(intList);
		
		//List ���� - �� �Ҵ�
		List<Integer> intList2 = Arrays.asList(1,16,31,1,53);
		//�� ó�� ������ ��� �� �߰�, ����,������ ����. �б� ����
		System.out.println(intList2);
		
		List<Integer> intList3 = new ArrayList<>(Arrays.asList(1,16,31,1,53));
		//�� ó�� ������ ��� �� �߰�, ����,������ ����
		System.out.println(intList3);
		//////////////////////////////////////////////////////////////////////
		//Collect List �ֿ� �޼���
		List<String> nameList = new ArrayList<>();
		
		//(1) �� �߰�
		nameList.add("ȫ�浿"); //index 0
		nameList.add("�Ӳ���"); //index 1
		nameList.add("�����"); //index 2
		
		//(2) ����Ʈ ������
		System.out.println("����Ʈ�� ũ�� : " + nameList.size());		
		nameList.add("�ڸ��"); //index 3
		System.out.println("����Ʈ�� ũ�� : " + nameList.size());
		
		//(3) �� ����
		nameList.set(3, "���缮");
		System.out.println(nameList);
		
		//(4) �� ���
		String firstVal = nameList.get(0);
		System.out.println("�ε��� 0�� �� : " + firstVal);
		
		//(5) �� ����
		nameList.remove(3); //3��° �ε��� �� ����
		System.out.println(nameList);
		
		//(6) �� �˻� - true/false
		boolean isName = nameList.contains("�Ӳ���");
		System.out.println("�Ӳ��� �̸� �ִ��� ���� : " + isName);
		
		//(7) �� �˻� - �ε��� ��ȯ
		int idx = nameList.indexOf("�Ӳ���");
		System.out.println("�Ӳ��� �̸��� �ε��� : " + idx);
		
		//���� ���� ��� �ε��� �� -1�� ��ȯ
		int idx2 = nameList.indexOf("������");
		System.out.println("������ �̸��� �ε��� : " + idx2);
		
		//////////////////////////////////////////////////////
		//����Ʈ �� ����
		Collections.sort(nameList);
		System.out.println(nameList);
		
		//�������� ����
		Collections.sort(nameList, Collections.reverseOrder());
		System.out.println(nameList);
		
		//////////////////////////////////////////////////////
		//List�� �ݺ���
		for(int i=0;i<nameList.size();i++) {
			System.out.print(nameList.get(i)+",");
		}
		for(String val : nameList) {
			System.out.print(val+",");
		}
		
		//�ݺ��ڸ� ���� List�� ����
		Iterator<String> iter = nameList.iterator();
		while(iter.hasNext()) { //������� �ִ��� true/false
			System.out.println(iter.next());
			//������ ��������鼭 ���� ������ ����Ŵ, ���� ���� ���� ����
			//� ��Ҹ� ���Ž� �ε��� �ּҸ� �����ؼ� ���������� ���� ����
		}
		
	}

}
