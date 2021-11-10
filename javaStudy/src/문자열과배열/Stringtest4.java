package 문자열과배열;

public class Stringtest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 덧셈
		int num = 17;
		String str = "apple" + num;
		System.out.println(str);
		
		String str2 = 10+str+" banana"+num;
		System.out.println(str2);
		
		double pi = 3.141592;
		String str3 = "PI="+pi;
		System.out.println(str3);
		
		//오류
//		String Str4 = pi;
		String str4 = String.valueOf(pi);
		System.out.println(str4);
		str4 = ""+pi;
		System.out.println(str4);
		
		String str5 = String.valueOf(false);
		System.out.println(str5);
		str5 = String.valueOf(10);
		System.out.println(str5);
		str5 = String.valueOf('a');
		System.out.println(str5);
		
		//포맷을 지정해서 문자열을 만들고 싶은 경우
		String fruit = "apple";
		String s6;
		s6 = String.format("%s %.2f",fruit,pi);
		System.out.println(s6); // apple 3.14
		//format 매서드는 자릿수 지정시 많이 사용
	}

}
