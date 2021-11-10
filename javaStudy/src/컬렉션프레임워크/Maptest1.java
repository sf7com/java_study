package �÷��������ӿ�ũ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maptest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map�� Ű�� ������ ����Ǿ��ִ� �ڷᱸ��
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Kim");
		map.put(2, "Park");
		map.put(3, "Joe");
		//key �ߺ��Ǹ� �ȵ�, Value �ߺ��ǵ� ��.
		System.out.println(map);
		
		Map<String, Integer> stuMap = new HashMap<>();
		stuMap.put("ȫ�浿", 100);
		stuMap.put("�Ӳ���", 90);
		stuMap.put("����", 88);
		stuMap.put("���ѱ�", 92);
		
		System.out.println(stuMap);
		
		//(2) �� ���
		//ȫ�浿�� ����
		Integer score = stuMap.get("ȫ�浿");
		System.out.println("ȫ�浿�� ���� : "+score);
		
		//(3) Ű-�� ����
		stuMap.remove("���ѱ�");
		System.out.println(stuMap);
		
		//(4) Map ������, ��� ���� ���
		int size = stuMap.size();
		System.out.println(size);
		
		//(5) Ű�˻� - true/false
		boolean isVal = stuMap.containsKey("ȫ�浿");
		System.out.println("ȫ�浿�� �ִ��� ���� : "+isVal);
		
		//(6) Ű�˻� - true/false
		boolean isVal1 = stuMap.containsValue(100);
		System.out.println("100�� �� �ִ��� ���� : "+isVal1);
		
		//Map�� �ݺ���
		//keySet() : Map�� ��� Ű�� ��ȯ, �ε�����ȣ�� for���� �̿��� �ε�����ȣ�� Ű��Ȯ�� �ȵ�.
		System.out.println(stuMap.keySet());
		
		for(String key : stuMap.keySet()) {
			System.out.printf("%s�� ���� : %d\n", key, stuMap.get(key));
		}
		
		//values() : Map�� ��� ���� ��ȯ
		System.out.println(stuMap.values());
		int total = 0;
		for(Integer val : stuMap.values()) {
			total +=val;
		}
		System.out.println("��� ����� �� : "+total);
			
		Map<String, List<String>> regionMap = new HashMap<>();
		List<String> guList = Arrays.asList("�߱�","����","������");
		regionMap.put("�߱�", new ArrayList<>());
		regionMap.put("����", new ArrayList<>());
		regionMap.put("�����", new ArrayList<>());
		for(String guName : guList) {
			regionMap.put(guName, new ArrayList<>());
		}
		regionMap.get("�߱�").add("��ȭ��");
		regionMap.get("�߱�").add("���ൿ");
		regionMap.get("�߱�").add("����");
		System.out.println(regionMap);
		
		regionMap.get("����").add("�Ǿϵ�");
		regionMap.get("������").add("�õ�");
		
		//������ � ���� ������ �ִ��� Ȯ��
		for(String key : regionMap.keySet()) {
			for(String dongName : regionMap.get(key)) {
				if(dongName.equals("����")) {
					System.out.println("������ ���� �� : "+key);
				}
			}
		}
		System.out.println(regionMap);
	}

}
