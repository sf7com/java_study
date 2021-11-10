package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maptest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map은 키와 값으로 저장되어있는 자료구조
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Kim");
		map.put(2, "Park");
		map.put(3, "Joe");
		//key 중복되면 안됨, Value 중복되도 됨.
		System.out.println(map);
		
		Map<String, Integer> stuMap = new HashMap<>();
		stuMap.put("홍길동", 100);
		stuMap.put("임꺽정", 90);
		stuMap.put("김사랑", 88);
		stuMap.put("조한길", 92);
		
		System.out.println(stuMap);
		
		//(2) 값 얻기
		//홍길동의 점수
		Integer score = stuMap.get("홍길동");
		System.out.println("홍길동의 점수 : "+score);
		
		//(3) 키-값 삭제
		stuMap.remove("조한길");
		System.out.println(stuMap);
		
		//(4) Map 사이즈, 요소 갯수 얻기
		int size = stuMap.size();
		System.out.println(size);
		
		//(5) 키검색 - true/false
		boolean isVal = stuMap.containsKey("홍길동");
		System.out.println("홍길동이 있는지 여부 : "+isVal);
		
		//(6) 키검색 - true/false
		boolean isVal1 = stuMap.containsValue(100);
		System.out.println("100점 값 있는지 여부 : "+isVal1);
		
		//Map과 반복문
		//keySet() : Map의 모든 키값 반환, 인덱스번호가 for문을 이용한 인덱스번호로 키값확인 안됨.
		System.out.println(stuMap.keySet());
		
		for(String key : stuMap.keySet()) {
			System.out.printf("%s의 점수 : %d\n", key, stuMap.get(key));
		}
		
		//values() : Map의 모든 값을 반환
		System.out.println(stuMap.values());
		int total = 0;
		for(Integer val : stuMap.values()) {
			total +=val;
		}
		System.out.println("모든 요소의 합 : "+total);
			
		Map<String, List<String>> regionMap = new HashMap<>();
		List<String> guList = Arrays.asList("중구","동구","유성구");
		regionMap.put("중구", new ArrayList<>());
		regionMap.put("동구", new ArrayList<>());
		regionMap.put("대덕구", new ArrayList<>());
		for(String guName : guList) {
			regionMap.put(guName, new ArrayList<>());
		}
		regionMap.get("중구").add("선화동");
		regionMap.get("중구").add("은행동");
		regionMap.get("중구").add("태평동");
		System.out.println(regionMap);
		
		regionMap.get("동구").add("판암동");
		regionMap.get("유성구").add("궁동");
		
		//태평동이 어떤 구에 속해져 있는지 확인
		for(String key : regionMap.keySet()) {
			for(String dongName : regionMap.get(key)) {
				if(dongName.equals("태평동")) {
					System.out.println("태평동이 속한 구 : "+key);
				}
			}
		}
		System.out.println(regionMap);
	}

}
