package 기초test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> lastDayMap = new HashMap<>();
		lastDayMap.put(1, 31);lastDayMap.put(2, 28);lastDayMap.put(3, 31);
		lastDayMap.put(4, 30);lastDayMap.put(5, 31);lastDayMap.put(6, 30);
		lastDayMap.put(7, 31);lastDayMap.put(8, 31);lastDayMap.put(9, 30);
		lastDayMap.put(10, 31);lastDayMap.put(11, 30);lastDayMap.put(12, 31);
		
		List<String> dayOfWeek = new ArrayList<>(Arrays.asList("일","월","화","수","목","금","토")); 
		Scanner sc= new Scanner(System.in);
		System.out.print("년도를 입력하시오. > ");
		int year = sc.nextInt();
		System.out.print("월을 입력하시오. > ");
		int mon = sc.nextInt();
		int day = lastDayMap.get(mon);
				
		System.out.println();
		
		System.out.printf("     <%d년도 %d월>",year,mon);
		System.out.println();
		for(var dow : dayOfWeek) {
			System.out.printf("%s",dow);
			if(dow != "토")
				System.out.print("  ");		
		}
		System.out.println(getWeek(year,mon,day));
		
	}

	public static int getWeek(int year, int mon, int day) {
		//제라의 공식
		int a,b; //a는 년도의 앞2자리, b는 연도의 뒷2자리
		if(mon <= 2) {
			year--;
			mon+=12;
		}
		a = year/100; //2014/100 = 20.14 -> 20
		b = year%100; //2014 나머지가 14임 
		int week = ((21*a/4)+(5*b/4)+26*(mon+1)/10+day-1)%7;
		//0:일, 1:월, 2:화,....
		return week;
	}
	
	public static boolean isLeapYear(int year) {
		boolean result = false;
		if(year%4==0 && (year%100!=0 || year%400==0)) 
			result = true;
		return result;
	}

	
	
}
