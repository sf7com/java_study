package B31Game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import 문자열과배열.Arrytest;

//N명의 사용자 (N은 2~5 숫자로 제한한다.)
//최대 User0~User4 - User0(나), 나머지 컴퓨터

//조건
//각 유저는 전 유저의 숫자를 이어서 출력한다.
//각 유저는 숫자를 최대 3개까지 출력할 수 있다.
//마지막 31의 숫자를 출력할 수 밖에 없는 유저가 진다.

//프로그램 추가 조건
//(1) User0이 키보드로 입력받을 시 숫자를 잘못입력한 경우 다시 입력하도록 한다.
// (1-1) 3개 초과의 숫자를 부를 경우
// (1-2) 숫자가 아닌 문자를 입력할 경우
// (1-3) 숫자가 연속되지 않을 경우

//(2) 31근처의 숫자 예를 들어 29의 숫자 부터는 컴퓨터가 31을 (29,30,31)
//    스스로 지지 않도록 프로그램 구성한다.
//(3) 게임 리플레이가 되도록 한다. (게임 과정 저장 -> 게임 과정 보여주기)

public class B31Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNum=3; //게임 User수
		int curUser=0; //현재 User Idx
		int curNum=0; //user가 부른 마지막 숫자값		
//		String str = "1,2,3";
//		String[] strAry = str.split(","); //split "," 기준으로 나눠서 strAry에 저장하는 메서드
//		System.out.println(Arrays.toString(strAry));
		
		while(true) {		
		//(1) 현재 유저의 값을 입력받는다.
		curNum = getCurUserVal(curUser, curNum);
		//(2) 현재 유저의 값이 31이상이면 게임 종료
		if(curNum >= 31) {
			System.out.printf("User[%d]가 패배했습니다.\n",curUser);
			break;
		}
		//(3) 현재 유저를 다음 유저로 바꾸고 (1)을 반복한다.
		curUser++;
		if(curUser>=userNum)
			curUser=0;
		}
	}

	private static int getCurUserVal(int curUser, int curNum) {
		// TODO Auto-generated method stub
		// (1-1) 3개 초과의 숫자를 부를 경우
		// (1-2) 숫자가 아닌 문자를 입력할 경우
		// (1-3) 숫자가 연속되지 않을 경우
		String userValStr = "";
		if(curUser == 0) {
			//키보드 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("연속된 숫자 입력 >");
			String inStr = sc.nextLine(); //11,12,13
			var strArray = inStr.split(","); //[11,12,13], var=>String형 배열
			if(strArray.length >3) {
				System.out.print("입력된 숫자 개수 초과, 다시 연속된 숫자 3개 입력 >");
				inStr = sc.nextLine(); //11,12,13
			}
			try {
				int lastUserVal = Integer.parseInt(strArray[strArray.length-1]);
				userValStr = inStr;
				
			}catch
			System.out.printf("User[%d] : %s \n",curUser,userValStr);
			return lastUserVal;
		}else {
			//컴퓨터, 랜덤값
			//현재번호 28, 최대 2개 낼 수 있음.
			//현재번호 29, 최대 1개 낼 수 있음.
			//현재번호 30, 최대 1개 낼 수 있음.
			int rLimit = 3;
			if(curNum == 28) {
				rLimit = 2;				
			}else if(curNum == 29 || curNum==30) {
				rLimit = 1;
			}
			Random rand = new Random();
			int num = rand.nextInt(rLimit)+1; //1~3 값 생성
			for(int i=0; i<num; i++) {
				userValStr += (curNum+i+1)+"";
				if(i!=num-1)
					userValStr +=",";
			}
			System.out.printf("User[%d] : %s \n",curUser,userValStr);
			return curNum+num;
		}

	}

}
