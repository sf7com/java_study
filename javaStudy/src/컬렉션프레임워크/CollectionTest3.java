package 컬렉션프레임워크;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(1,2,10,9,100,30);
		//가장 큰 값
		System.out.println(Collections.max(numList));
		//가장 작은 값
		System.out.println(Collections.min(numList));
		
		//값 덮어쓰기
		Collections.fill(numList, 0);
		System.out.println(numList);
		
		//개수 세기
		List<String> fruitList = Arrays.asList("사과","딸기","딸기","포도");
		//각 과일의 개수
		Set<String> fruitSet = new HashSet<>(fruitList);
		for(var val : fruitSet) {
			int cnt = Collections.frequency(fruitList, val);
			System.out.println(val + "의 개수 : " + cnt);
		}
	}

}
