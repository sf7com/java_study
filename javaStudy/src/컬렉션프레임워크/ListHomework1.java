package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) 정수 리스트의 모든 요소의 합을 구하는 알고리즘
		//   클래스타입만
		List<Integer> numList = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			numList.add(i);
		}
		//값 추가,수정,삭제 불가능 - 읽기 전용
		List<Integer> numList2 = Arrays.asList(1,2,3,4,5);
		
		//값 추가,수정,삭제 가능
		List<Integer> numList3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		//배열 -> 리스트
		Integer[] intArray = {1,2,3,4,5,6};
		List<Integer> numList4 = Arrays.asList(intArray);
		
		//(1-1) for문 활용
		int total = 0;
		//numList.size() : 리스트내의 데이터 개수, 요소 수
		for(int i=0;i<numList.size(); i++) {
			total+=numList.get(i); //get() 인덱스를 통해 값 얻음
		}
		System.out.println("numList의 총합 : " + total);
		System.out.println("numList의 평균 : " + (double)total/numList.size()); //int->double 타입변환(double)
		System.out.println("numList의 평균 : " + 1.0*total/numList.size()); //실수와 정수간 곱해주면 실수로 형변환 됨.
		
		//(1-2) for-each문
		total = 0;
		for(Integer val : numList) {
			total += val;
		}
		System.out.println("numList의 총합 : " + total);
		System.out.println("numList의 총합 : " + (double)total/numList.size());
		System.out.println("numList의 평균 : " + 1.0*total/numList.size());
		
		//(1-3) 반복자
		Iterator<Integer> iter = numList.iterator();
		total=0;
		while(iter.hasNext()){
			total += iter.next();
		}
		System.out.println("numList의 총합 : " + total);
		System.out.println("numList의 총합 : " + (double)total/numList.size());
		System.out.println("numList의 평균 : " + 1.0*total/numList.size());
		
		//(2) numList의 짝수 요소를 삭제
		var iter2 = numList.iterator();
		while(iter2.hasNext()) {
			if(iter2.next()%2==0) {
				iter2.remove();
			}
		}
		System.out.println(numList);
		
		///////////////////////////////////////////////////////
		//(3) 달력 예제
//		int[] cld = {31,28,31,30,31,30,31,31,30,31,30,31};//12개
//		int mon = 0;
//		for(int i=0; i<cld.length;i++) {
//			System.out.printf("%d월 - ,",i+1);
//			
//			for(int day=1;day<=cld[mon];day++) {
//				System.out.printf("%d일", day);
//				if(day!=cld[mon]) {
//					System.out.print(",");
//				}
//			}
//			System.out.println();
//		}
		//메서드 문제 : 년도와 달을 입력을 받고 문자열로 달력을 출력
		//2020년 1월 - 1일,2일,3일,4일,5일,6일,7일,8일,9일,10일,11일,12일,13일,14일,15일,16일,17일,18일,19일,20일,21일,22일,23일,24일,25일,26일,27일,28일,29일,30일,31일
		//2월의 경우 윤년을 적용해서 마지막 일을 다르게 한다.(윤년인 경우 2월29일, 아닌경우 28일)
		
		//(공식) ①,② 두조건을 다 만족해야 윤녀임
		// ① 년도를 4로 나누어 떨어져야 함.
		// ② 년도를 100으로 나누어 떨어지지 않거나 년도를 400으로 나누어 떨어져야 함.
		//(참고) 4(윤년), 100(평년), 400(윤년)임
		
	System.out.println(getCalender(2021, 11));
	System.out.println(getWeekStr(2021, 11,9));
	
	}
	
	
	public static String getCalender(int year, int mon) {
		//Map 초기화 10까지만 초기화 가능
//		Map<Integer, Integer> lastDayMap = Map.of(
//			1,31, 2,28, 3,31, 4,30, 5,31, 6,30, 7,31, 8,31, 9,30, 10,31);
//		lastDayMap.put(11, 30);
//		lastDayMap.put(12, 31);
		String result;
		Map<Integer, Integer> lastDayMap = new HashMap<>();
		lastDayMap.put(1, 31);lastDayMap.put(2, 28);lastDayMap.put(3, 31);
		lastDayMap.put(4, 30);lastDayMap.put(5, 31);lastDayMap.put(6, 30);
		lastDayMap.put(7, 31);lastDayMap.put(8, 31);lastDayMap.put(9, 30);
		lastDayMap.put(10, 31);lastDayMap.put(11, 30);lastDayMap.put(12, 31);
		
		//3항연산자
		//변수 = (조건)? a:b
		//조건이 참이면 변수에 a값 대입, 조건이 거짓이면 변수에 b값이 대입
//		int lastDay = (mon==2 && isLeapYear(year))?lastDayMap.get(mon)+1 : lastDayMap.get(mon); //3항 연산자
		
		int lastDay;
		boolean isLeap = isLeapYear(year);
		if(mon == 2 && isLeap) {
			lastDay = lastDayMap.get(mon)+1;
		}else {
			lastDay = lastDayMap.get(mon);
		}
		
		result = String.format("%04d년도 %02d월-",year,mon);
		for (int day=1;day<=lastDay;day++) {
			result += String.format("%02d일(%s)",day,getWeekStr(year,mon,day));
			if(day!=lastDay)
				result +=",";					
			
		}
		return result;
	}
		
	public static boolean isLeapYear(int year) {
		boolean result = false;
		if(year % 4 == 0 && (year%100!=0 || year%400==0 )) 
			result = true;
		return result;
		
	}
	
	public static String getWeekStr(int year, int mon, int day) {
		int a,b; //a는 년도의 앞2자리, b는 연도의 뒷2자리
		
		if(mon <= 2) {
			year--;
			mon+=12;
		}
		a = year/100; //ex) 2014/100 = 20.14 ->20
		b = year%100; //ex) 2014 나머지 14
		
		int week = ((21*a/4)+(5*b/4)+26*(mon+1)/10+day-1)%7;
		//0:d일, 1:월, 2:화......
		String weekStr = switch(week) {
		case 0 -> "일";
		case 1 -> "월";
		case 2 -> "화";
		case 3 -> "수";
		case 4 -> "목";
		case 5 -> "금";
		case 6 -> "토";
		default -> "";		
		};
		return weekStr;
	}

}
