package ���׸�;

import java.util.ArrayList;
import java.util.List;

public class EntryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry<String, Integer> e1 = new Entry<String, Integer>("ȫ�浿", 30);
		Entry<String, Integer> e2 = new Entry<String, Integer>("�Ӳ���", 80);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		
		Entry<String, String> e3 = new Entry<String, String>("id01", "������");
		System.out.println(e3);
		System.out.println(e3.getKey());
		System.out.println(e3.getValue());
		
		///////////////////////////////////////////////////////////////////
		List<Entry<Integer, String>> stuList = new ArrayList<>();
		stuList.add(new Entry<>(1, "ȫ�浿"));
		stuList.add(new Entry<>(2, "�Ӳ���"));
		stuList.add(new Entry<>(3, "�嵿��"));
		stuList.add(new Entry<>(4, "������"));
		
		//¦����ȣ�� ���
		for(var stu : stuList) {
			if(stu.getKey() % 2 == 0)
				System.out.println(stu);
		}
		
		
	}

}
