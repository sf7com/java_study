package 제어문;

import java.util.Random;
import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<10;i++) {
//			if(i==7)
//				break;
//			System.out.println(i);
//		}
		//값을 올바르게 입력받으면 반복문 종료
		//키보드로 정수 1~100사이 값을 받기
		Scanner sc = new Scanner(System.in);
//		int num;
//		do {
//			System.out.print("0~100 사이의 정수를 입력 > ");
//			num = sc.nextInt();
//			if(num>100 || num>0)
//				break;
//		}while(true);
//		System.out.printf("입력받은 숫자 %d\n",num);
		
		//자바 숫 맞추기 게임
		//Up, Down
		//컴퓨터가 정한 랜덤한 숫자 맞추기
		Random rand = new Random();
		//rand.nextInt(n) 0이상 n미만의 랜덤한 정수 리턴
		int comNum = rand.nextInt(100); //0~99사이 랜덤한 정수
		
		while(true) {
			System.out.print("숫자를 입력하세요 > ");
			int userNum = sc.nextInt();
			if(userNum==-1) {
				System.out.println("강제종료합니다.");
				break;
			}
			if(comNum > userNum) {
				System.out.println("Up~!");
			}else if(comNum < userNum){
				System.out.println("Down~!");
			}else {
				System.out.println("숫자를 맞췄습니다.");
				break;
			}
			
		}
		
		
	}

}
