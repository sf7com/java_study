package ���;

import java.util.Random;
import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int com1Val, com2Val, userVal,resultVal,total,judge;
		String userStr,com1Str,com2Str,result;
		System.out.println("����,����,�� ������ �����մϴ�.");
		while(true) {
			do{
				System.out.println("����,����,���� �Է��� �ּ���.");
				userStr = sc.nextLine();
				userVal = switch (userStr) {
				case "����" -> 1;
				case "����" -> 2;
				case "��" -> 4;
				default -> -1;
				};
				if (userVal == -1)
					System.out.println("�߸��Է��Ͽ����ϴ�.");
			}while(userVal == -1);
				com1Val = rand.nextInt(3);
				com2Val = rand.nextInt(3);
				com1Str = switch (com1Val) {
				case 1 -> "����";
				case 2 -> "����";
				case 4 -> "��";
				default -> "";
				};
				com2Str = switch (com2Val) {
				case 1 -> "����";
				case 2 -> "����";
				case 4 -> "��";
				default -> "";
				};	
				resultVal = ((userVal+com1Val+com2Val)%3);
				total=(((userVal+com1Val+com2Val)*2)+userVal);
				result = switch (resultVal) {
				case 0 -> "�����ϴ�.";
				case 1 -> {
					if(total == 19 || total == 10 || total == 20)
						yield "�̰���ϴ�.";
					else
						yield "���߽��ϴ�.";
						}
				case 2 -> {
					if(total == 11 || total == 22 || total == 16)
						yield "�н��ϴ�.";
					else
						yield "�̰���ϴ�.";
						}
				default -> "";
				};
				
				if(resultVal == 0) {
					System.out.printf("User:%s, com1:%s, com2:%s �� %s", userStr,com1Str,com2Str,result);
					continue;
				}else {
					System.out.printf("User:%s, com1:%s, com2:%s �� %s", userStr,com1Str,com2Str,result);
					break;
					}

		}
	}

}
