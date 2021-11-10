package 문자열과배열;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)두 문자열간의 비교
		String s1 = "Hi Java!";
		String s2 = new String("Hi Java!");
		String s3 = "Hi Python!";
		String s4 = "Hi java!";
		
		//s1==s2와 같이 문자열은 직접비교가 안됨.equals로 비교
		System.out.println("s1==s2 => "+ s1.equals(s2));
		System.out.println("s1==s3 => "+ s1.equals(s3));
		System.out.println("s1==s4 => "+ s1.equals(s4));
		//equalsIgnoreCase : 대소문자 구분없이 비교
		System.out.println("s1==s4 => "+ s1.equalsIgnoreCase(s4));
		
		//compareTo : 문자열을 사전 순으로 비교해 정수값으로 변환
		String char1 = "abc";
		String char2 = "abc";
		String char3 = "caa";
		System.out.println(char1.compareTo(char2));//0
		System.out.println(char1.compareTo(char3));//-2
		
		//문자열 길이
		System.out.printf("%s의 문자열의 길이 : %s\n",s1,s1.length());
		
		//s1글자의 두번째 글자를 가져오고 싶을때
		System.out.printf("%s의 2번째 문자 : %c\n",s1,s1.charAt(1));
		
		//s1에 "Java" 문자열이 있는지 검색
		System.out.printf("%s의 Java 포함되었는지 여부 : %b\n",s1,s1.contains("Java"));
		
		//s1에 "Java" 문자열이 있는지 검색 후 인덱스 반환
		System.out.printf("%s의 Java 포함되었는지 여부 : %b\n",s1,s1.indexOf("Java"));
		
		//s2가 공백으로 이루어져있거나 비어있는지 판단
		s2="   ";
		System.out.printf("s2 공백 혹은 빈값 판단 %b\n", s1.isBlank());
		
		//앞 뒤 공백제거
		s3 = "      apple";
		System.out.printf("s3 공백 제거 : %s\n",s3.trim());
		
		//문자열 반복
		s4 = "★☆";
		System.out.println(s4.repeat(10));
		
		//문자열 중간 값 가져오기
		System.out.printf("%s의 5부터 끝까지 값: %s\n",s1,s1.substring(5));
		
		System.out.printf("%s의 인덱스 0부터~5미만 까지 값: %s\n",s1,s1.substring(0,5));
		
		//문자열을 정수로 형변환
		s1 = "13";
		int num1 = Integer.parseInt(s1);
		System.out.println(num1);
		
		//문자열을 실수로 형변환
		s1 = "13.44";
		double num2 = Double.parseDouble(s1);
		System.out.println(num2);

		//정수를 문자열로 형변환
		String numStr1 = String.valueOf(num1);
		System.out.println(numStr1);
		
		//정수를 문자열로 형변환
		String numStr2 = String.valueOf(num2);
		System.out.println(numStr2);
	}

}
