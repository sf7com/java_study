package 제어문;

import java.util.Random;
import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//홀수인 숫자만 출력
//		for(int i=0; i<10; i++) {
//			if(i%2==0)
//				continue;
//			System.out.println(i);
//		}
//		
		//1~100까지의 숫자를 모든 숫자를 더하는데
		//첫째자리가 3인 숫자는 빼고 더하기
//		int total=0;
//		for(int i=1;i<=100;i++) {
//			if(i%10==3)
//				continue; //특정한 조건하에 반복문의 조건으로 돌아감
//			total+=i;
//		}
//		System.out.println(total);
		
		//자바 숫 맞추기 게임
		//Up, Down
		//컴퓨터가 정한 랜덤한 숫자 맞추기
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		//rand.nextInt(n) 0이상 n미만의 랜덤한 정수 리턴
		int comNum = rand.nextInt(101); //0~100사이 랜덤한 정수
		
		while(true) {
			//(1)사용자 숫자 입력 받는다.
			//(1-1) 0~100 이외의 숫자를 입력했을 때 다시 입력받는다.
			System.out.print("숫자를 입력하세요 > ");
			int userNum = sc.nextInt();
			if(userNum<0 || userNum>100) {
				if(userNum==-1) {
					System.out.println("강제종료합니다.");
					break;
				}
				System.out.println("잘못입력하였습니다..");
				continue;
			}
			//(2) 입력한 숫자와 컴퓨터 랜덤 숫자 비교
			if(comNum > userNum) {
				System.out.println("Up~!");
			}else if(comNum < userNum){
				System.out.println("Down~!");
			}else {
				System.out.println("숫자를 맞췄습니다.");
				comNum = rand.nextInt(101); //0~100사이 랜덤한 정수
			}
		}
	}

}
