package 문자열과배열;

public class Arrytest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strAry = {"banana","apple","kiwi"};
		
		//문자형 배열의 첫글자를 대문자료 변환
		for(int i=0; i<strAry.length;i++) {
			String first = strAry[i].substring(0,1);
			first = first.toUpperCase();
			strAry[i]=first+strAry[i].substring(1);
		}
		
		for(String str : strAry) {
			System.out.println(str);
		}
		//피보나치 수열 구하기
		int[] fibo = new int[30];
		for(int i=0;i<fibo.length;i++) {
			if(i==0 || i==1)
				fibo[i]=1;
			else
				fibo[i]=fibo[i-1]+fibo[i-2];
		}
		for(int val : fibo) {
			System.out.print(val +",");
		}
//		double[] fiboRatio = new double[30];
//		for(int i=0;i<fiboRatio.length;i++) {
//			fiboRatio[i] = fibo[i+1]/fibo[i];
//			System.out.print(fiboRatio[i]+",");
//		}
	}

}
