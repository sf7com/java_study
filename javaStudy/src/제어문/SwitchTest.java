package 제어문;

import java.util.Random;
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1,2,3 숫자 중 하나를 입력하세요. > ");
//		int num = sc.nextInt();
//		switch(num) {
//		case 3 :
//			System.out.print("*");
//		case 2 :
//			System.out.print("*");
//		case 1 :
//			System.out.print("*");
//		}
//		///////////////////////
//		switch(num) {
//		case 3 :
//			System.out.print("3입니다.");
//			break;
//		case 2 :
//			System.out.print("2입니다.");
//			break;
//		case 1 :
//			System.out.print("1입니다.");
//			break;
//		default :
//			System.out.print("1,2,3이 아닌 숫자입니다.");
//		}
//		System.out.println();
//		////////////////////////////////
//		if(num==3) {
//			System.out.print("3입니다.");
//		}else if(num==2) {
//			System.out.print("2입니다.");
//		}else if(num==1) {
//			System.out.print("1입니다.");
//		}else {
//			System.out.print("1,2,3이 아닌 숫자입니다.");
//		}
		////////////////////////////////////////
		//Java 7버전부터 문자열 타입 사용가능
		//동물 이름을 입력받고 어떤 종인지 출력하는 예제
//		Scanner sc = new Scanner(System.in);
//		sc.nextLine(); //입력 버퍼 비우기(위에 있던 입력버퍼에서 '\n' 제거)
//		System.out.print("동물 이름을 입력해 주세요. >");
//		String animal = sc.nextLine();
//		String kind = "";
//		switch (animal) {
//		case "호랑이":
//		case "사자":
//			kind = "포유류";
//			break;
//		case "독수리":
//		case "참새":
//			kind = "조류";
//			break;
//		case "고등어":
//		case "연어":
//			kind = "어류";
//			break;
//		default:
//			System.out.println("알수없는 동물입니다.");
//			kind = "?";
//		}
//		System.out.printf("%s는 %s입니다.\n", animal, kind);
//		///////////////////////////////////////////////////
//		//Java 14 : Switch문 다중 레이블 가능
//		//          화살표 case 레이블 등등 업데이트
//		switch (animal) {
//		case "호랑이","사자" -> kind="포유류"; //자체 break 기능 포함, 실행할 문장 1개만 가능
//		case "독수리","참새" -> kind="조류";
//		case "고등어","연어" -> {            //{} 시 실행할 문장 여러개 가능
//			kind="어류";
//		}
//		default ->{
//			kind = "?";
//			System.out.println("알수없는 동물입니다.");
//		}
//		}
//		System.out.printf("%s는 %s입니다.\n",animal,kind);
//		/////////////////////////////////////////////////
//		//switch문으로 변수값을 할당시 default는 필수
//		kind = switch (animal) {
//		case "호랑이","사자" -> "포유류"; 
//		case "독수리","참새" -> "조류";
//		case "고등어","연어" -> "어류";
//		default -> "?"; 
//		};
//		System.out.printf("%s는 %s입니다.\n",animal,kind);
		////////////////////////////////////////////////
		//가위,바위,보 게임
		//컴퓨터와 User 대결
		//컴퓨터의 가위바위보 값은 랜덤값
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("가위,바위,보 게임을 시작합니다.");
		while(true) {
		String userStr;
		int userVal;
		do {
			// (1) 컴퓨터와 User로 부터 값을 입력받는다.(가위,바위,보)
			// (1-1) User의 값은 키보드로 가위,바위,보값을 받는다.
			// (1-1-1) User값을 숫자값으로 바꾼다.

			userStr = sc.nextLine();
			userVal = switch (userStr) {
			case "가위" -> 0;
			case "바위" -> 1;
			case "보" -> 2;
			default -> -1;
			};
			if(userVal==-1)
				System.out.println("잘못입력했습니다.");
			
		}while (userVal==-1);
			// (1-2) Com의 값을 랜덤값으로 입력받는다.(가위,바위,보)
			// (1-2-1) 랜덤값 0:가위, 1:바위, 2:보
			// (1-2-2) Com값을 문자열의 가위,바위,보 값을 만든다.

			int comVal = rand.nextInt(3);
			String comStr = switch (comVal) {
			case 0 -> "가위";
			case 1 -> "바위";
			case 2 -> "보";
			default -> "";
			};

			// (2) 컴퓨터와 User의 값을 비교한다.
			// (2-1) 비긴경우: User값과 Com값이 같을때
			// (2-1-1) 비긴 경우 다시 (1)로 돌아가 재경기를 한다.
			// (2-2) User가 이긴 경우:
			// (3) 승패 결과 출력한다.
			System.out.printf("User:%s, Com:%s\n", userStr, comStr);
			int judgeVal = userVal - comVal;
			if (judgeVal == 0) {
				System.out.println("비겼습니다.");
				continue;
				// 비긴경우
			} else if (judgeVal == 1 || judgeVal == -2) {
				// User 이긴경우
				System.out.println("이겼습니다.");
				break;
			} else {
				// User 진경우
				System.out.println("졌습니다.");
				continue;
			}
		}
	}

}
