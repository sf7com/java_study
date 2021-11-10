package 제어문;

public class LoopTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<5; i++) {
//			System.out.println(i);
//		}
//		
		//(1) 1~100까지의 홀수의 합
//		int total = 0;
//		for(int i=1; i<=100; i++) {
//			if(i % 2 ==1)
//				total+=i;
//		}
//		System.out.println(total);
//		
//		total = 0;
//		for(int i=1; i<=100; i+=2) {
//				total+=i;
//		}
//		System.out.println(total);
//		
//		//Quiz 0~1000까지의 5의 배수이거나 3의 배수인 숫자들의 합을 구하시오.
//		int sum = 0;
//		for(int i=0; i<=1000; i++) {
//			if((i%3==0)||(i%5==0))
//				sum+=i;
//		}
//		System.out.println(sum);
//		//구구단 출력
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				System.out.printf("%d X %d = %d\n", i,j,i*j);	
//			}
//			System.out.println("------------------------");
//		}
		
		//구구단 3단까지 배열로 출력
		for(int i=2; i<10; i+=3) {
			for(int j=1; j<4; j++) {
				for(int k=0; k<3; k++) {
					if((i+k)!=10)
					System.out.printf("%d X %d = %d\t",(i+k),j,(i+k)*j);	
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
		
	}

}
