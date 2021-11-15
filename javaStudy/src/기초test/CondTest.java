package 기초test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1) 조건문 숫자입력 사칙연산
		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력하세요.>");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자를 입력하세요.>");
//		int num2 = sc.nextInt();
//		sc.nextLine();
//		System.out.print("사칙연산 기호를 입력하세요>");
//		String char1 = sc.nextLine();
//		int result=0;
//		if(char1.equals("+"))
//			result=num1+num2;
//		else if(char1.equals("-"))
//			result=num1-num2;
//		else if(char1.equals("*"))
//			result=num1*num2;
//		else if(char1.equals("/"))
//			result=num1/num2;		
//		
//		System.out.printf("1번 숫자:%d %s 2번 숫자: %d = %d",num1,char1,num2,result );
//		System.out.println();
		//(2) 반복문 1~1000까지 합
		//(2-1-1) 5의 배수 합
//		int sum5=0;
//		for(int i=1; i<=1000;i++) {
//			if(i%5==0)
//			sum5 = sum5+i;
//		}
//		System.out.printf("1~1000까지 5의 배수 합 : %d",sum5);
//		System.out.println();
//		//(2-1-2) 5의 배수 이거나 7의 배수 합
//		int sum5or7=0;
//		for(int i=1; i<=1000;i++) {
//			if(i%5==0 || i%7==0)
//				sum5or7 = sum5or7+i;
//		}
//		System.out.printf("1~1000까지 5 or 7의 배수 합 : %d",sum5or7);
//		System.out.println();
//		//(2-1-3) 5와 7의 배수 합
//		int sum5n7=0;
//		for(int i=1; i<=1000;i++) {
//			if(i%5==0 && i%7==0)
//				sum5n7 = sum5n7+i;
//		}
//		System.out.printf("1~1000까지 5 or 7의 배수 합 : %d",sum5n7);
		
		//(2-2-1) 높이 9인 다이아몬드 출력
		int dia=9;
		int center=dia/2+1;
		int cnt=dia;
		for(int i=0;i<dia;i++) {
			if(i<center) {
				for (int j = 1; j < center-i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i * 2 + 1); j++) {
					System.out.print("★");
				}
				System.out.println();
			}
			if(i>=center) {
				cnt=cnt-2;
				for (int j = 0; j < i-(center-1); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j<cnt; j++) {
					System.out.print("★");
				}
				System.out.println();
			}
		}	
//			(2-2-2)속이 빈 다이아몬드 출력
		int dia2=9; //홀수의 단수 입력하면 다이아
		int center2=dia2/2+1;
		int cnt2=dia2;
		for(int i=0;i<dia2;i++) {
			if(i<center2) {
				for (int j = 1; j < center2-i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i * 2 + 1); j++) {
					if(j==0 || j==((i * 2 + 1)-1))
						System.out.print("★");
					else
						System.out.print(" ");
					
				}
				System.out.println();
			}
			if(i>=center2) {
				cnt2=cnt2-2;
				for (int j = 0; j < i-(center2-1); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j<cnt2; j++) {
					if(j==0 || j==cnt2-1)
						System.out.print("★");
					else
						System.out.print(" ");
				}
				System.out.println();
			}	
		}
		//(2-3)거스름돈 문제 : 9820원을 1000원, 500원, 100원, 10원으로 돌려주어야 한다.
		//1000원, 500원, 100원, 10원은 각각 몇 개 필요한지 출력하시오.
		//조건 : 1000원부터 각 단위의 돈을 최대 숫자가 되도록한다. 
		//     ex) 위 문제에서 1000원은 9개, 500원 1개, 100원 3개,50원 1개, 10원 2개 
		//int[] change[] = {1000,500,100,50,10};
//		System.out.print("거스름돈을 입력하세요.>");
//		int money = sc.nextInt();
//		int calculator = 0;
//		int changeMoney = money;
//		int[] change= {1000,500,100,50,10};
//		List<Integer> chMoneyArry = new ArrayList<>();
//		for(int i=0; i<5;i++) {
//			calculator = changeMoney/change[i];
//			changeMoney = changeMoney%change[i];
//			chMoneyArry.add(calculator);			
//		}		
//		System.out.println();
//		System.out.printf("1000원:%d개, 500원:%d개, 100원:%d개, 50원:%d개, 10원:%d개",
//				chMoneyArry.get(0),chMoneyArry.get(1),chMoneyArry.get(2),chMoneyArry.get(3),chMoneyArry.get(4));

		//(3)배열과 문자열
		//int[] array = {1,2,3,4,5};
		//(1) 위 배열의 총합을 구하시오.
		//(2) 위 배열의 평균값을 구하시오.
		//(3) 위 배열의 분산값을 구하시오.    분산공식 : 각요소를 평균값으로 뺀후 제곱한 것의 평균값
		//              ex) (1-avg)^2, (2-avg)^2, (3-avg)^2, (4-avg)^2, (5-avg)^2 들의 평균값
		int[] array = {1,2,3,4,5};
		int sum = 0; 
		double sum1 = 0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		double avg = sum/array.length;
		for(int i=0;i<array.length;i++) {
			sum1=sum1+((array[i]-avg)*(array[i]-avg));
		}
		double value = sum1/array.length;
		System.out.printf("분산값 : %.2f",value);
		System.out.println();
//		//String[] strArray = {“사과”, “딸기”, “포도”, “포도”, “포도”, “사과"};
//		//(4) “포도”가 몇 개 있는지 세시오.
//		String[] strArray = {"사과", "딸기", "포도", "포도", "포도", "사과"};
//		int fruitCnt=0;
//		for(int i=0;i<strArray.length;i++) {
//			if(strArray[i] == "포도")
//				fruitCnt++;
//		}
//		System.out.printf("포도의 개수 :%d개 ",fruitCnt);
//		System.out.println();
//		//(5) “apple" 이라는 단어가 주어졌을 때 앞글자만 대문자로 바꾸도록 하시오.
//		//==> “Apple"
//		String fruitStr = "apple";
//		String upStr = fruitStr.toUpperCase();
//		String lowStr = fruitStr.toLowerCase();
//		String upchStr = upStr.substring(0,1)+lowStr.substring(1);
//		System.out.println(upchStr);
//		
//		//String[] strArray2 = {“apple”, “grape”, “mango”};
//		//(6) 문자형 배열의 각 단어별 앞글자만 모두 대문자로 바꾸도록 하시오.
//		//==> {“Apple”, “Grape”, “Mango”}
//		String[] strArray2 = {"apple", "grape", "mango"};
//		String upChStr1;
//		String lowChStr1;
//		String chStr1;
//		List<String> upChStrArray = new ArrayList<>();
//		
//		for(int i=0;i<strArray2.length;i++) {
//			upChStr1 = strArray2[i].toUpperCase();
//			lowChStr1 = strArray2[i].toLowerCase();
//			chStr1 = upChStr1.substring(0,1)+lowChStr1.substring(1);
//			upChStrArray.add(chStr1);
//		}
//		System.out.println(upChStrArray);
		
		//(7) 달력 출력 문제
		Map<Integer, Integer> lastDayMap = new HashMap<>();
		lastDayMap.put(1, 31);lastDayMap.put(2, 28);lastDayMap.put(3, 31);
		lastDayMap.put(4, 30);lastDayMap.put(5, 31);lastDayMap.put(6, 30);
		lastDayMap.put(7, 31);lastDayMap.put(8, 31);lastDayMap.put(9, 30);
		lastDayMap.put(10, 31);lastDayMap.put(11, 30);lastDayMap.put(12, 31);
		
		int lastday=0;
		for(Integer mon : lastDayMap.keySet()) {
			lastday = lastDayMap.get(mon);
			System.out.printf("%d월 - ",mon);
			for(int i=1;i<=lastday;i++) {
				System.out.printf("%d일",i);
				if(i!=lastday)
					System.out.print(",");
			}
			System.out.println();
		}
		
	}
}
