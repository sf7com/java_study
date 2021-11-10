package 메서드;

public class MethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) 1~10까지의 합을 구해서 출력하는 코드를 작성
		//(2) 10~100까지의 합을 구해서 출력하는 코드를 작성
		//(3) 100~1000까지의 합을 구해서 출력하는 코드를 작성
		
		int result=0;
		for(int i=1;i<=10;i++) {
			result+=i;
		}
		System.out.printf("1~10까지 합은 %d 입니다.\n",result);
		int result1=0;
		for(int i=10;i<=100;i++) {
			result1+=i;
		}
		System.out.printf("1~100까지 합은 %d 입니다.\n",result1);
		int result2=0;
		for(int i=100;i<=1000;i++) {
			result2+=i;
		}
		System.out.printf("1~1000까지 합은 %d 입니다.\n",result2);
		
		//두 숫자를 입력 받아서 두 숫자 사이 모든 숫자들의 합을 구하는 메서드
		
		int num = sum(1,10);
		System.out.println(sum(1,10));
		System.out.println(sum(10,100));
		System.out.println(sum(100,1000));
	}
	public static int sum(int num1, int num2) {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			sum+=i;
		}
		return sum;
	}

}
