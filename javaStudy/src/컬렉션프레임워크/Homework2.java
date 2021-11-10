package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) 리스트 활용 예제
		// 소수 찾기 - 2,3,5,7,11,... 1과 자기 자신으로 나눠지는 수
		//1~100까지 List에 저장한다.
		
		//소수가 아닌 수는 소수로 나누었을 때 나누어 떨어진다.
		//소수가 아닌 수는 소수로 나누었을 때 나누어 떨어지지 않는다.
		//ex) 50 숫자 50이하의 소수들로 50을 나눈다. 나누어 떨어지면 소수가 아니다.
		List<Integer> primeList = new ArrayList<>();
		primeList.add(2);
		
		for(int i=3; i<=100; i++) {
			boolean isPrime = true;
			//현재 i를 모든 소수리스트에 있는 소수로 나누어 본다.
			//나누어 떨어지는게 하나라도 있으면 소수가 아님.
			for(var prime : primeList) {
				if(i%prime == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				primeList.add(i);
		}
		System.out.println(primeList);
		System.out.println("1~100까지의 소수의 개수 : "+primeList.size());
		
		int[] primeArray = new int[100];
		primeArray[0] = 2;
		int curIdx = 1;//다음에 저장할 인덱스값
		
		for(int i=3; i<100;i++) {
			boolean isPrime = true;
			for(int j=0;j<curIdx;j++) {
				if(i%primeArray[j]==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primeArray[curIdx++] = i;
			}
		}
		System.out.println(Arrays.toString(primeArray));
		System.out.println("1~100까지 소수의 개수 : "+curIdx);
	}

}
