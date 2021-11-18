package 알고리즘문제;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GreedyANDSimul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)그리디 알고리즘:현재 상황에서 지금 당장 좋은 것만 고르는 방법
		//단순히 가장 좋아 보이는 것을 반복적으로 선택해서 최적의 해를 구할 수 있는지 검토
		
		//(1-1) 각 자리가 숫자(0~9)로만 이루어진 문자열 S가 주어졌을 때
		//왼쪽부터 오른쪽으로 하나씩 확인하며 'x'혹은 '+' 연산자를 넣어 결과적으로
		//가장 큰 수를 구하는 프로그램
		//ex) "02984"
		//"0"과 "1"은 더하고 나머지는 곱한다
		Scanner sc = new Scanner(System.in);
		System.out.println("0~9사이의 숫자를 입력하세요.(최대20자리)");
		String inStr = sc.nextLine();
		
		long result = Character.getNumericValue(inStr.charAt(0));
		for(int i=1;i<inStr.length();i++) {
			int num = Character.getNumericValue(inStr.charAt(i));
			if(num<=1 || result <=1) {
				result+=num;
			}else {
				result*=num;
			}
		}
		System.out.println(inStr+"로 나올 수 있는 최대 숫자 :"+result);
		
		//(2) 구현 : 시뮬레이션과 완전탐색
		//구현 : 풀이를 떠올리는 것은 쉽지만 소스코드로 옮기기 어려운 문제
		//ex) 알고리즘은 간단한데 코드가 지나치게 길어지는 문제
		//    실수 연산을 다루고, 특정 소수점까지 출력해야 하는 문제
		//    문자열을 특정한 기준에 따라 끊어 처리해야 하는 문제
		//    적절한 라이브러리를 사용해야 하는 문제
		//시뮬레이션(완전탐색) : 일련의 명령에 따라서 개체를 차례대로 이동시켜 해결
		//(2-1) 문자열 재정렬 : 알파벳 대문자와 숫자(0~9)로만 구성된 문자열이 입력
		//모든 알파벳을 오름차순 정렬하고 이어서 그 뒤에 모든 숫자를 더한 값을 출력
		//ex)K1KA5CB7 => ABCKK13
		System.out.println("숫자와 문자열 입력 >");
		String inStr2 = sc.nextLine();
		//문자열 -> 문자 하나씩 배열
		char[] charArray = inStr2.toCharArray();
		List<String> chList = new ArrayList<>();
		int sum = 0;
		for(var ch : charArray) {
			if(Character.isLetter(ch)) {
				chList.add(inStr2);
			}else {
				sum += Character.getNumericValue(ch);
			}
		}
		//chList 오름차순 정렬
		Collections.sort(chList);
		String resultStr = String.join("", chList)
				+String.valueOf(sum);
		System.out.println(resultStr);
	}

}
