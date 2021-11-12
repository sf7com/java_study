package 기초test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1-1)메서드
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요.>");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요.>");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("사칙연산 기호를 입력하세요>");
		String char1 = sc.nextLine();

		getCalculator(num1,num2,char1);
		///////////////////////////////////////////
		//(3-1)배열과 문자열 메서드 화
		//int[] array = {1,2,3,4,5};
		//(1) 위 배열의 총합을 구하시오.
		//(2) 위 배열의 평균값을 구하시오.
		//(3) 위 배열의 분산값을 구하시오.    분산공식 : 각요소를 평균값으로 뺀후 제곱한 것의 평균값
		//   ex) (1-avg)^2, (2-avg)^2, (3-avg)^2, (4-avg)^2, (5-avg)^2 들의 평균값
		int[] array = {1,2,3,4,5};

		System.out.printf("(3-1)메서드화 합계 : %d",sumNum(array));
		System.out.println();
		System.out.printf("(3-2)메서드화 평균 : %.2f",avg(array));
		System.out.println();
		System.out.printf("(3-3)메서드화 분산값 : %.2f",value(array));
		
		//String[] strArray = {“사과”, “딸기”, “포도”, “포도”, “포도”, “사과"};
		//(4) “포도”가 몇 개 있는지 세시오.
		String[] strArray = {"사과", "딸기", "포도", "포도", "포도", "사과"};
		String word = "사과";
		System.out.println();
		System.out.printf("(3-4)메서드화 %s 개수 : %d",word,wordCnt(word,strArray));
		
//		//(5) “apple" 이라는 단어가 주어졌을 때 앞글자만 대문자로 바꾸도록 하시오.
//		//==> “Apple"
		String str1 = "apple";
		System.out.println();
		System.out.printf("(3-5)메서드화 %s 첫글자 대문자 변경 => : %s",str1,firstUpper(str1));
		System.out.println();
		//String[] strArray2 = {“apple”, “grape”, “mango”};
		//(6) 문자형 배열의 각 단어별 앞글자만 모두 대문자로 바꾸도록 하시오.
		//==> {“Apple”, “Grape”, “Mango”}
		String[] strArray2 = {"apple", "grape", "mango"};
		String upChStr1;
		String lowChStr1;
		String chStr1;
		List<String> upChStrArray = new ArrayList<>();
		
		for(int i=0;i<strArray2.length;i++) {
			upChStr1 = strArray2[i].toUpperCase();
			lowChStr1 = strArray2[i].toLowerCase();
			chStr1 = upChStr1.substring(0,1)+lowChStr1.substring(1);
			upChStrArray.add(chStr1);
		}
		System.out.println(upChStrArray);
	}
	public static void getCalculator(int num1, int num2, String char1) {
		int result=0;
		if(char1.equals("+"))
			result=num1+num2;
		else if(char1.equals("-"))
			result=num1-num2;
		else if(char1.equals("*"))
			result=num1*num2;
		else if(char1.equals("/"))
			result=num1/num2;		
		
		System.out.printf("1번 숫자:%d %s 2번 숫자: %d = %d",num1,char1,num2,result );
		System.out.println();
	}
	public static int sumNum(int[] array) {
		int sum = 0; 
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		return sum;
	}
	
	public static double avg(int[] array) {
		return sumNum(array)/array.length;
	}
	
	public static double value(int[] array) {
		double sum1 = 0;
		for(int i=0;i<array.length;i++) {
			sum1=sum1+((array[i]-avg(array))*(array[i]-avg(array)));
		}
		return sum1/array.length;
	}
	
	public static int wordCnt(String word,String[] strArray) {
		int fruitCnt=0;
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i] == word)
				fruitCnt++;
		}
		return fruitCnt;
	}
	
	public static String firstUpper(String str1) {
		String upStr = str1.toUpperCase();
		String lowStr = str1.toLowerCase();
		return upStr.substring(0,1)+lowStr.substring(1);
	}
	

}
