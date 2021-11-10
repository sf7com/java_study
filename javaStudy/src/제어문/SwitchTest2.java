package 제어문;

import java.util.Random;
import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int com1Val, com2Val, userVal,resultVal,total,judge;
		String userStr,com1Str,com2Str,result;
		System.out.println("가위,바위,보 게임을 시작합니다.");
		while(true) {
			do{
				System.out.println("가위,바위,보를 입력해 주세요.");
				userStr = sc.nextLine();
				userVal = switch (userStr) {
				case "가위" -> 1;
				case "바위" -> 2;
				case "보" -> 4;
				default -> -1;
				};
				if (userVal == -1)
					System.out.println("잘못입력하였습니다.");
			}while(userVal == -1);
				com1Val = rand.nextInt(3);
				com2Val = rand.nextInt(3);
				com1Str = switch (com1Val) {
				case 1 -> "가위";
				case 2 -> "바위";
				case 4 -> "보";
				default -> "";
				};
				com2Str = switch (com2Val) {
				case 1 -> "가위";
				case 2 -> "바위";
				case 4 -> "보";
				default -> "";
				};	
				resultVal = ((userVal+com1Val+com2Val)%3);
				total=(((userVal+com1Val+com2Val)*2)+userVal);
				result = switch (resultVal) {
				case 0 -> "비겼습니다.";
				case 1 -> {
					if(total == 19 || total == 10 || total == 20)
						yield "이겼습니다.";
					else
						yield "패했습니다.";
						}
				case 2 -> {
					if(total == 11 || total == 22 || total == 16)
						yield "패습니다.";
					else
						yield "이겼습니다.";
						}
				default -> "";
				};
				
				if(resultVal == 0) {
					System.out.printf("User:%s, com1:%s, com2:%s 중 %s", userStr,com1Str,com2Str,result);
					continue;
				}else {
					System.out.printf("User:%s, com1:%s, com2:%s 중 %s", userStr,com1Str,com2Str,result);
					break;
					}

		}
	}

}
