package 제어문;

public class LoopHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
