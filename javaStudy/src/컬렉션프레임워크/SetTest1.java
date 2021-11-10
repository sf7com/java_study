package 컬렉션프레임워크;

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
		//자료를 중복없이 저장하는 자료구조, 데이터의 순서가 없다.
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
		
		//(2) 배열 -> set (바로 변환은 불가능, 배열을 List로 바꿔야 함)
		Integer[] intArray = new Integer[] {1,1,2,2,3,3,3};
		intList = Arrays.asList(intArray);
		intSet = new HashSet<>(intList);
		System.out.println(intSet);
		
		//////////////////////////////////////////////////////
		Set<String> nameSet = new HashSet<>();
		//(1) 값 추가
		nameSet.add("홍길동");
		nameSet.add("임꺽정");
		nameSet.add("임창정");
		nameSet.add("김하나");
		System.out.println(nameSet);
		
		//(2) 값 삭제
		nameSet.remove("김하나");
		System.out.println(nameSet);
		
		//(3) Set 사이즈, 요소 수
		int size = nameSet.size();
		System.out.println("Set 사이즈 : "+size);
		
		//(4) 값 검색 - true/false
		boolean isName = nameSet.contains("임창정");
		System.out.println("임창정 이름 존재여부 : "+isName);
		
		//set과 반복문
		for(String name : nameSet) {
			System.out.println(name);
		}
		//////////////////////////////////////////
		List<String> fruitList = Arrays.asList("사과","사과","딸기","딸기","딸기","배","바나나");
		Set<String> fruitSet = new HashSet<>(fruitList);
		System.out.println(fruitSet);
		
		Map<String, Integer> fruitMap = new HashMap<>();
		//과일이름 key, value 과일 갯수
		//사과 : 2, 딸기:3,배:1,바나나:1
		//알고리즘
		//(1) 과일별로 과일의 개수를 센사.(반복문)
		//(2) 과일이름을 key값, 과일개수를 Value로 fruitMap에 저장한다.
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
