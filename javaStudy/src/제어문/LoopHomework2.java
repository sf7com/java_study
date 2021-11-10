package 제어문;

public class LoopHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 3단까지 배열로 출력
//			for(int i=2; i<10; i+=3) {
//				for(int j=1; j<4; j++) {
//					for(int k=0; k<3; k++) {
//						if((i+k)!=10)
//						System.out.printf("%d X %d = %d\t",(i+k),j,(i+k)*j);	
//					}
//					System.out.println("");
//				}
//				System.out.println("");
//			}
				
		////////////////////////////////////////////////////////////////////
		//(1) 가장 바깥 for문 - 구구단의 첫번째 값
		for(int i=2; i<=8; i+=3) {
			//i 범위 : 2,5,8
			//총 3번 반복
			for(int k=1; k<=3; k++) {
				//k 범위 : 1,2,3 곱하기 뒷자리
				//총 3번 반복
				for(int j=i; j<=i+2; j++) {
					//j 범위 : i, i+1, i+2 - 곱하기의 첫째자리
					//총 3번 반복
					if(j!=10)
					System.out.printf("%dX%d=%d\t",j,k,j*k);
				}
				System.out.println();
			}
			System.out.println();
		}
				
	}

}
