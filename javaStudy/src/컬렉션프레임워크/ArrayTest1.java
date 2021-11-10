package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List에 들어갈 타입은 클래스 타입
		// Integer를 저장하는 List
		List<Integer> intList = new ArrayList<>(); //가장 많이 사용하는 형태
		//List<int> intList = new ArrayList<>();
		intList.add(1);
		intList.add(21);
		intList.add(25);
		intList.add(30);
		System.out.println(intList);
		
		//List 선언 - 값 할당
		List<Integer> intList2 = Arrays.asList(1,16,31,1,53);
		//위 처럼 선언한 경우 값 추가, 수정,삭제를 못함. 읽기 전용
		System.out.println(intList2);
		
		List<Integer> intList3 = new ArrayList<>(Arrays.asList(1,16,31,1,53));
		//위 처럼 선언한 경우 값 추가, 수정,삭제가 가능
		System.out.println(intList3);
		//////////////////////////////////////////////////////////////////////
		//Collect List 주요 메서드
		List<String> nameList = new ArrayList<>();
		
		//(1) 값 추가
		nameList.add("홍길동"); //index 0
		nameList.add("임꺽정"); //index 1
		nameList.add("김수정"); //index 2
		
		//(2) 리스트 사이즈
		System.out.println("리스트의 크기 : " + nameList.size());		
		nameList.add("박명수"); //index 3
		System.out.println("리스트의 크기 : " + nameList.size());
		
		//(3) 값 수정
		nameList.set(3, "유재석");
		System.out.println(nameList);
		
		//(4) 값 얻기
		String firstVal = nameList.get(0);
		System.out.println("인덱스 0의 값 : " + firstVal);
		
		//(5) 값 삭제
		nameList.remove(3); //3번째 인덱스 값 제거
		System.out.println(nameList);
		
		//(6) 값 검색 - true/false
		boolean isName = nameList.contains("임꺽정");
		System.out.println("임꺽정 이름 있는지 여부 : " + isName);
		
		//(7) 값 검색 - 인덱스 반환
		int idx = nameList.indexOf("임꺽정");
		System.out.println("임꺽정 이름의 인덱스 : " + idx);
		
		//값이 없는 경우 인덱스 값 -1로 반환
		int idx2 = nameList.indexOf("김태희");
		System.out.println("김태희 이름의 인덱스 : " + idx2);
		
		//////////////////////////////////////////////////////
		//리스트 값 정렬
		Collections.sort(nameList);
		System.out.println(nameList);
		
		//내림차순 정렬
		Collections.sort(nameList, Collections.reverseOrder());
		System.out.println(nameList);
		
		//////////////////////////////////////////////////////
		//List와 반복문
		for(int i=0;i<nameList.size();i++) {
			System.out.print(nameList.get(i)+",");
		}
		for(String val : nameList) {
			System.out.print(val+",");
		}
		
		//반복자를 통한 List값 참조
		Iterator<String> iter = nameList.iterator();
		while(iter.hasNext()) { //다음요소 있는지 true/false
			System.out.println(iter.next());
			//현재요소 가지고오면서 다음 데이터 가리킴, 가장 먼저 나온 개념
			//어떤 요소를 제거시 인덱스 주소를 참조해서 안정적으로 제거 가능
		}
		
	}

}
