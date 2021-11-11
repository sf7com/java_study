package B31Game;

import java.util.Arrays;
import java.util.Scanner;

public class B31Cond1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//User입력받을때
		//12,13,14
		//(1-1) 3개 초과의 숫자를 부를때
		int curNum=10; //전 유저의 마지막 숫자
		boolean isRe = false;
		do {
			isRe = false;
			Scanner sc = new Scanner(System.in);
			System.out.print("User[0] 연속된 숫자 입력");
			String inStr = sc.nextLine(); //12,13,14
			String[] strArray = inStr.split(","); //[12,13,14]
			System.out.println(Arrays.toString(strArray));
			
			//(1-1) 3개 초과의 숫자를 부를때
			if(strArray.length > 3 || strArray.length == 0) {
				//다시 입력받아야 함
				isRe = true;
				System.out.println("숫자를 1~3개 사이로 입력하세요.");
				continue;
			}
			//(1-2) 숫자가 아닌 문자를 입력할 경우
			int[] numArray = new int[strArray.length];
			try {
				for(int i=0;i<strArray.length; i++) {
					numArray[i] = Integer.parseInt(strArray[i]);
				}			
			}catch(NumberFormatException e) {
				//다시 입력받아야 한다.
				isRe = true;
				System.out.println("숫자가 아닌 문자를 입력하였습니다.");
				continue;
			}
			//(1-3) 숫자가 연속되지 않을 경우
			//전 숫자 +1이 다음 숫자와 같아야 한다
			int beforeNum = curNum; //10
			for(int val : numArray) { //numArray {11,12,15}
				if((beforeNum+1) != val) {
					//연속되지 않은 경우
					isRe = true;
					System.out.println("연속되지 않은 숫자를 입력하였습니다.");
					break;
				}
				beforeNum = val;
			}
		}while(isRe);
		
	
	}

}
