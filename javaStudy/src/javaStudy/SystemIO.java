package javaStudy;

import java.util.Scanner;

public class SystemIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)println : 내용출력 후 행을 바꾼다.
		System.out.println("Hello~!");
		//(2)print : 내용을 출력만 하고 행을 바꾸지 않는다.
		System.out.print("World~!");
		//(2-1) print : 행을 바꿀때는 '\n' 넣으면 됨.
		System.out.print("Java\n");
		System.out.println("System IO Study\n\n");
		//(3) 특수문자 : \t  탭만큼 문자를 띄운다
		System.out.println("Test\ttest2");
		//(4) printf : 포맷을 지정해서 출력한다.
		
		int num = 97;
		double pi = 3.141592;
		String str = "Java";
		
		//(4-1) %d : 정수 출력
		System.out.printf("정수 : %d\n",num);
		//(4-1-1) %자릿수d : 지정한 자릿수만큼 오른쪽 정렬 출력(공백포함)
		System.out.printf("정수 : %5d\n",num);
		//(4-1-2) %-자릿수d : 지정한 자릿수만큼 왼쪽 정렬 출력(공백포함)
		System.out.printf("정수 : %-5d끝\n",num);
		//(4-1-3) %0자릿수d : 자릿수를 0으로 채움 
		System.out.printf("정수 : %05d\n",num); //00097
		
		//(4-2) %o : 8진수, %x : 16진수 
		System.out.printf("8진수 : %o\n",num); //141
		System.out.printf("16진수 : %x\n",num); //61

		
		//(4-3) 문자 하나를 출력
		System.out.printf("문자 : %c\n", num); // ASCII 코드 기준 문자 출력
		char ch = 'b';
		System.out.printf("문자 : %3c\n", ch); // ch에 저장된 변수 출력
		
		//(4-4) 문자열 출력
		System.out.printf("문자열 : %s\n", str);
		
		//(4-5) 실수
		System.out.printf("실수 : %f\n", pi);
		System.out.printf("실수 지수표현: %e\n", pi);
		//(4-5) %전체 자릿수.소수점 자릿수f
		System.out.printf("실수 : %5.2f\n", pi);
		System.out.printf("실수 : %-5.2f\n", pi);
		System.out.printf("실수 : %05.2f\n", pi);
		
		////////////////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		
		//(1) 정수입력
//		System.out.print("정수 입력 > ");
//		int num1 = sc.nextInt();
//		System.out.printf("입력된 정수 : %d\n", num1); //자릿수 지정 가능
//		System.out.println("입력된 정수 : " + num1); //자릿수 지정 불가, num1 문자열 강제전환
		
		//(2) 실수입력
//		System.out.print("실수 입력 > ");
//		double doublenum = sc.nextDouble();
//		System.out.printf("입력된 실수 : %.3f\n", doublenum); 
		
		//(3) 문자열 입력
		//(3-1) next() : 공백, 스페이스 전까지 문자열을 읽는다.
//		System.out.print("문자열 입력 > ");
//		String inStr = sc.next();
//		System.out.printf("입력된 문자열 : %s\n", inStr); //입력 : apple pi 출력 : apple
		
		//(3-2) nextLine() : Enter 전까지 읽는다.
//		System.out.print("문자열 입력 > ");
//		String inStr = sc.nextLine();
//		System.out.printf("입력된 문자열 : %s\n", inStr); //입력 : apple pi 출력 : apple
		
		//(4) 입력 버퍼 비우기
		// apple pie hello
//		System.out.print("문자열 입력 > ");
//		String inStr = sc.next();
//		System.out.printf("입력된 문자열 : %s\n", inStr);
//		// 키보드버퍼 : apple\n
//		//(1)next : apple     키보드버퍼 : \n
//		//(2)nextlne : \n
//		
//		// 버퍼 비우기
//		sc. nextLine(); //키보드 버퍼에 저장된 모든 문자열 읽음
//		
//		System.out.print("문자열 입력2 > ");
//		String inStr2 = sc.nextLine();
//		System.out.printf("입력된 문자열2 : %s\n", inStr2);
		
		//두 번 키보드로 입력받는 것이 잘 되는 경우
//		System.out.print("이름을 입력하세요 >");
//		String name = sc.nextLine();
//		System.out.print("나이를 입력하세요 >");
//		int age = sc.nextInt();
//		System.out.printf("이름:%s, 나이:%d\n", name,age);
//		
//		//두 번 키보드로 입력받는 것이 잘 안되는 경우
//		System.out.print("나이을 입력하세요 >");
//		int age = sc.nextInt(); //키보드 버퍼에서 숫자만 가져와서 \n이 남아있음 
//
//		//버퍼 비우기
//		sc.nextLine();
//		
//		System.out.print("이름을 입력하세요 >");
//		String name = sc.nextLine();
//		System.out.printf("이름:%s, 나이:%d\n", name,age);
		
		//몸무게 입력 추가
		System.out.print("이름을 입력하세요 >");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 >");
		int age = sc.nextInt();
		System.out.print("몸무게를 입력하세요 >");
		int weight = sc.nextInt();
		System.out.printf("이름:%s, 나이:%d, 몸무게:%d\n", name,age,weight);
		
		
		
		
		
		
	}

}
