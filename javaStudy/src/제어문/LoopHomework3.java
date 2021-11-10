package 제어문;

import java.util.Scanner;

public class LoopHomework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//너비와 높이를 입력받아서 사각형 출력+
		//조건1) 사각형만 채워지는 열 : 첫행과 마지막행
		//조건2-1) 첫 행과 마지막행이 아닌 경우 첫 열과 마지막 열만 사각형이고 나머지는 공백

		//(1-1) 공백없이 사각형 출력
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		for(int row=0; row<h; row++) {
			//한 열의 사각형 출력
			//첫행 row=0, 마지막행 row==h-1
			if(row==0 || row==h-1) {
				for(int col=0; col<w; col++) {
					System.out.printf("%2s","□");
				}
			}else {
				for(int col=0; col<w; col++) {
					//첫열 col==0,마지막열 col==w-1
					if(col==0 || col==w-1)
						System.out.printf("%2s","□");
					else
						System.out.printf("%2s"," ");
				}			
			}
			System.out.println(); //개행
		}
		
		//조건1 □는 첫행과, 마지막행, 첫열과, 마지막 열에 출력된다.
		//조건2 조건1이 아닌 경우 공백을 출력한다.
		for(int row=0; row<h; row++) {
			//한 열의 사각형 출력
			//첫행 row=0, 마지막행 row==h-1
				for(int col=0; col<w; col++) {
					//첫열 col==0,마지막열 col==w-1
					if(row==0||row==h-1||col==0 || col==w-1)
						System.out.printf("%2s","□");
					else
						System.out.printf("%2s"," ");
				}
				System.out.println(); //개행
		}				
		
	}
}
