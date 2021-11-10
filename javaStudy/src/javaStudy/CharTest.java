package javaStudy;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A'; //char 타입 문자 하나만 저장. 홀따옴표'' 값대입
		char c2 = 65;
		System.out.println(c1);
		System.out.println(c2);
		//char c3="A"; //오류, ""는 문자열(문자 여러개)
//		System.out.println(c1+1); //66
//		System.out.println((char)(c1+1)); //B
//		System.out.println((char)(c1+2)); //C
//		System.out.println((char)(c1+3)); //D
//		System.out.println((char)(c1+4)); //E
//		System.out.println((char)(c1+5)); //F
//		System.out.println((char)(c1+6)); //G
//		System.out.println((char)(c1+7)); //H
//		System.out.println((char)(c1+8)); //I
		String str1 = "apple";
		System.out.println(str1);
		String str2 = "pie";
		System.out.println(str1+str2);
		
		//반복문
//		for(int i=0; i<10; i++) {
//			System.out.println((char)(c1+i));
//		}
		// 대문자 A를 소문자 a로 바꾼다.
		System.out.println((char)(c1+32)); //a
	}

}
