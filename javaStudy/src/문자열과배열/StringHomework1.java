package 문자열과배열;

public class StringHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)메서드 : 두 문자열을 입력받아서 두 문자열을 실수로 바꾸고
		//          두 실수의 곱을 출력하는 메서드
		//          가정 : 두 문자열은 숫자라고 생각
		System.out.println(stringTimes("100","91.2"));
		
		//(2)메서드 : 문자열을 입력받아서, 문자열의 첫글자만 대문자로 바꿧 출력해주는 메서드
		String str = "banana";
		System.out.println(strConv(str));
	}
	public static double stringTimes(String s1, String s2) {
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		return num1*num2;
	}
	public static String strConv(String s1) {
		//(1) 첫글자를 가져온다.
		String firstStr = s1.substring(0,1);//String 타입으로 첫글자
		//(2) 첫글자를 대문자로 바꾼다.
		firstStr = firstStr.toUpperCase();
		//(3) 대문자로 바꾼 첫글자와 나머지 글자를 결합한다.
		String result = firstStr+s1.substring(1);//인덱스 1부터 끝까지
		return result; //Banana
		
	}
}
