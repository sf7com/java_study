package 문자열과배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrytest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로또 1~45까지 6개, 번호 중복 없어야 함
		//컴퓨터까 로또 번호 생성
		Random rand = new Random();
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length; i++) {
			lotto[i]=rand.nextInt(45)+1; //1~45
			//중복없이 랜덤 추출
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					//중복됨
					i--;  //프로그램 기법중 하나임.중복시 처리 방법
					break;
				}
			}
		}
		System.out.println(lotto);//[I@28a418fc
		System.out.println(Arrays.toString(lotto));
		//[33, 38, 18, 3, 41, 26]
		
		//사용자가 6개의 로또번호를 뽑는다.
		//키보드 정수 6개를 입력받는다.
		//중복이 있으면 다시 뽑도록 한다.
		//추가조건 ) 정수를 1~45의 범위를 벗어나서 입력하면 다시 숫자를 입력하도록 한다.
		int[] userLotto = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<userLotto.length; i++) {
			System.out.printf("%d번째 번호를 입력하세요.> ",i+1);
			userLotto[i]=sc.nextInt(); //1~45
			if(userLotto[i]<=0 || userLotto[i]>45) {
				System.out.print("다시 번호를 입력하세요.> ");
				userLotto[i]=sc.nextInt(); //1~45
			}
			//중복없이 랜덤 추출
			for(int j=0; j<i; j++) {
				if(userLotto[i]==userLotto[j]) {
					//중복됨
					System.out.println("다시 번호를 입력하세요.> ");
					i--;  //프로그램 기법중 하나임.중복시 처리 방법
					break;
				}
			}
		}
		System.out.println(Arrays.toString(userLotto));
		
		//컴퓨터 로또 번호와 사용자 입력 로또값과 비교
		int[] lucky = new int[6];
		int result = 0;
		for(int i=0;i<lucky.length;i++) {
			int process = lotto[i];
			for(int j=0; j<6; j++) {
				if(process==userLotto[j]) {
					//중복됨
					lucky[j]=userLotto[j];
					result++;
					
				}
			}
			
		}
		System.out.println(result);
		String grade="";
		if(result <3)
			grade="꽝";
		if(result ==3)
			grade="4등";
		if(result ==4)
			grade="3등";
		if(result ==5)
			grade="2등";
		if(result ==6)
			grade="1등";
		System.out.printf("당신의 로또 당첨 결과는 %s 입니다.\n",grade);
		System.out.println("당첨 확인 결과 입니다."+Arrays.toString(lucky));
		
		//user가 lotto번호 몇개를 맞췄는지와 맞춘번호 출력
		//(1)User가 뽑은 6개 번호, Com이 뽑은 6개 번호와 같은지 비교
		//(1-1)User번호 별로 Com이 뽑은 6개의 번호와 모두 비교
		
		int correctNum = 0;
		int[] correctLotto = new int[6];
		System.out.print("User가 맞춘 번호는 : ");
		for(int userNum : userLotto) {
			for(int comNum : lotto) {
				if(userNum == comNum) {
					correctLotto[correctNum]=userNum;
					correctNum++;
				}
			}
		}
		System.out.println(Arrays.toString(correctLotto));
	
	}

}
