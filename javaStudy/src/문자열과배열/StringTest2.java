package 문자열과배열;

import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) 정수의 각 자리수의 총합 문제 문자열 함수를 통해 해결
		//ex) 1892 => 1+8+9+2
//		int num = 1892;
//		String numStr = String.valueOf(num); //"1892"
//		int total = 0;
//		for(int i=0;i<numStr.length();i++) {
//			System.out.println(numStr.charAt(i));
//			char ch = numStr.charAt(i);
//			total+= Character.getNumericValue(ch);
//		}
//		System.out.printf("%s의 각 자리수 총합은 %d입니다.\n",numStr,total);
//		//(2) 임의의 문자열에 "a"가 몇개 있는지 출력하시오.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열 입력 >");
//		String inStr = sc.nextLine();
//		int sameNum=0;
//		for (int i=0;i<inStr.length();i++) {
//			if(inStr.charAt(i) == 'a')
//				sameNum++;
//		}
//		System.out.printf("입력된 문자 %s에서 a는 %d개 입니다.",inStr,getCharSum(inStr, 'a'));
		
		//(2-1) String 문자열과 Char 타입의 문자를 입력받고, 
		//      해당 문자열에 문자가 몇개 들었는지 결과를 출력하는 메서드
		//입력 : "banana", 'n' => 출력 2
//		System.out.printf("입력된 문자 %s에서 a는 %d개 입니다.",inStr,getCharSum(inStr, 'a'));
		
		//(3) 1~100까지 콘솔창에 출력하는데, 3이 들어간 숫자는 '*'로 출력
		//ex) 1,2,*,4,5,6,7,8,9,10,11,12,*,14....
		//3이 들어간 숫자는 * 출력
		for(int i=1;i<=100;i++) {
			String tempStr = String.valueOf(i);
			if(tempStr.contains("3")==true)
				System.out.print("*");
			else
				System.out.print(i);
			System.out.print(",");
		}
		//3이 들어간 숫자 중 3만 * 출력, ★ 문자열 안에서 문자 하나씩 접근할시 아래 형태로 많이 사용 됨.
		for (int i=1; i<=100; i++) {
			String tempStr1 = String.valueOf(i);
			for(int j=0; j<tempStr1.length(); j++) {
				char curCh = tempStr1.charAt(j);
				if(curCh=='3')
					System.out.print("*");
				else
					System.out.print(curCh);
			}
			System.out.print(",");
		}
	}
	
	public static int getCharSum(String inStr, char inChr) {
		int result=0;
			for (int i=0;i<inStr.length();i++) {
				if(inStr.charAt(i) == inChr)
					result++;
			}
		return result;
	}

}
