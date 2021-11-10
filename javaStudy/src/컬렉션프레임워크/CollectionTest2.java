package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CollectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> alphaList = new ArrayList<>();
		for (char ch='A';ch<='Z'; ch++) {
			alphaList.add(ch);
		}
		
//		//리스트 요소 회전
//		Collections.rotate(alphaList, -5);
//		System.out.println(alphaList);
//		
//		//리스트 요소 섞기
//		Collections.shuffle(alphaList);
//		System.out.println(alphaList);
		
		//게임 : A-Z까지 빠진 알파벳 찾기
		//(1) A-Z 모두 무작위로 출력
		//  (1-1) 임의의 알파벳 하나만 빼놓고출력
		//(2) 사용자에게 키보드로 입력받아서 빠진 알파벳을 찾으면 정답 출력
		//  (2-1) 시간측정 (얼마나 빨리 맞췄는지)
		
		Random rand = new Random();
		int randNum = rand.nextInt(26); //0~25, 출력이 안될 알파벳 인덱스
		int cnt=0;
		Collections.shuffle(alphaList);
		for (int i=0;i<alphaList.size();i++) {
			if(i!=randNum) {
				System.out.print(alphaList.get(i)+" ");
				cnt++;
			}
			//한행당 10글자, 많이 사용되는 형태 
			if(cnt%10 == 0) {
				System.out.println();
			}
			
		}
		System.out.println();
		long startTime = System.currentTimeMillis();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("빠진 알파벳 > ");
			String chStr = sc.nextLine();
			if(chStr.charAt(0)==alphaList.get(randNum)) {
//				System.out.println("정답입니다.");
				long endTime = System.currentTimeMillis();
				long sec = (endTime-startTime)/1000; //초 환산
				System.out.println(sec + "초 만에 맞췄습니다.");
				break;
			}else {
				System.out.println("틀렸습니다.");
			}
			
		}
		
	}	

}
