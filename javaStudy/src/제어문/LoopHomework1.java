package 제어문;

import java.util.Scanner;

public class LoopHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//(1) 왼쪽 직각 삼각형
//		//(1-1) 높이 10
//		System.out.print("삼각형의 높이를 입력하세요>");
//		Scanner sc = new Scanner(System.in);
//		int height = sc.nextInt();
//		for(int i=0;i<height;i++) {
//			for(int j=0;j<i+1;j++) {
//				System.out.print("★");	
//			}
//			System.out.println();
//		}
//		
//		//(2) 오른쪽 직각 삼각형
//		for(int i=0; i<height;i++) {
//			for(int j=0;j<-i+9;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i+1;j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		int height=5;
		//(3) 정삼각형
		for(int i=0; i<height;i++) {
			for(int j=0;j<-i+height-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
//		(4) 역 정삼각형 출력
		for(int i=height-2; i>=0; i--) {
			for(int j=0;j<-i+height-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("★");
			}
				System.out.println();
		}
		//(5) 사각형 출력
		//높이와 넓이를 입력받고 사각형 출력
		//높이 4, 너비 5
		//□□□□□
		//□□□□□
		//□□□□□
		//□□□□□
		
		//높이3, 너비 3
		//□□□
		//□□□
		//□□□
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요>");
//		int height = sc.nextInt();
//		System.out.print("너비를 입력하세요>");
//		int width = sc.nextInt();
//		for(int i=1;i<=height;i++) {
//			for(int j=1;j<=width;j++) {
//				System.out.print("□");
//			}
//			System.out.println();
//		}
//		//높이 4, 높이 5
//		// 숫자 배열로 출력
//		int seqVal = 0;
//		for(int i=1;i<=height;i++) {
//			for(int j=1;j<=width;j++) {
//				seqVal++;
//				System.out.printf("%02d ",seqVal);
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//		for(int row=0;row<height;row++) {
//			for(int col=0;col<width;col++) {
//				System.out.printf("%02d ",(row*width)+(col+1));
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
		//높이 4, 높이 5
//		//짝수는 거꾸로 출력, 홀수는 순차 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요>");
//		int height = sc.nextInt();
//		System.out.print("너비를 입력하세요>");
//		int width = sc.nextInt();
//		
//		int seqVal = 0;
//		for(int i=1;i<=height;i++) {
//			seqVal=i*width;
//			if(seqVal%2!=0) {
//				for(int j=(seqVal-(width-1));j<=seqVal;j++) {
//				System.out.printf("%02d ",j);	
//				}
//			}
//			else {
//				for(int j=seqVal;j>=(seqVal-width)+1;j--) {
//					System.out.printf("%02d ",j);	
//				}			
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int row=0; row<height; row++) {
//			for(int col=0; col<width;col++) {
//				if(row%2==0)
//					System.out.printf("%02d ",(row*width+1)+col);
//				else
//					System.out.printf("%02d ",(row*width+width)-col);
//			}
//			System.out.println();
//		}
		
		
	}

}
