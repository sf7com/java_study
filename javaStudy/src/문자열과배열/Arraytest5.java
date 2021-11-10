package 문자열과배열;

public class Arraytest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = {1,2,3,10,10,20,30,10};
		int num=10;
		
		double[] doubleAry = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(getArrayTotal(doubleAry));
		System.out.println(getArrayAvg(doubleAry));
		
		int [] ary = {1,2,3,10,10,20,30,10};
		System.out.println(getAryNumCnt(ary,10));
		System.out.println(getAryNumCnt(intAry,1));
		
		
		
		
	}
	//배열의 모든 요소의 합을 구해서 출력하는 메서드
	public static int getArrayTotal(int[] intAry) {
		int result = 0;
		for(int val : intAry) {
			result+=val;
		}
//		for(int i=0;i<intAry.length;i++) {
//			result += intAry[i];
//		}
		return result;
	}
	
	public static double getArrayTotal(double[] intAry) { //메서드 오버로드 > 메서드 이름과 기능은 같으나 타입이 다른경우
		int result = 0;
		for(double val : intAry) {
			result+=val;
		}
//		for(int i=0;i<intAry.length;i++) {
//			result += intAry[i];
//		}
		return result;
	}
	//(1) 정수형 배열의 평균값을 구하는 메서드
	public static double getArrayAvg(double[] intAry) {
		return getArrayTotal(intAry)/intAry.length;
	}
	//(2) 정수형 배열에서 특정 요소의 개수를 출력하는 메서드 
	//    입력 : 정수형 배열1개, 정수값 1개
	//    출력 : 정수값과 같은 수 갯수
	// 입력 : {1,2,3,10,10,20,30,10}, 10
	// 출력 : 3
	public static int getAryNumCnt(int[] ary, int num) {
		int cnt=0;
		for(int val : ary) {
			if(val==num) {
				cnt++;
			}
		}
		return cnt;
	}
}
