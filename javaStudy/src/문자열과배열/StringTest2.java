package ���ڿ����迭;

import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) ������ �� �ڸ����� ���� ���� ���ڿ� �Լ��� ���� �ذ�
		//ex) 1892 => 1+8+9+2
//		int num = 1892;
//		String numStr = String.valueOf(num); //"1892"
//		int total = 0;
//		for(int i=0;i<numStr.length();i++) {
//			System.out.println(numStr.charAt(i));
//			char ch = numStr.charAt(i);
//			total+= Character.getNumericValue(ch);
//		}
//		System.out.printf("%s�� �� �ڸ��� ������ %d�Դϴ�.\n",numStr,total);
//		//(2) ������ ���ڿ��� "a"�� � �ִ��� ����Ͻÿ�.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ڿ� �Է� >");
//		String inStr = sc.nextLine();
//		int sameNum=0;
//		for (int i=0;i<inStr.length();i++) {
//			if(inStr.charAt(i) == 'a')
//				sameNum++;
//		}
//		System.out.printf("�Էµ� ���� %s���� a�� %d�� �Դϴ�.",inStr,getCharSum(inStr, 'a'));
		
		//(2-1) String ���ڿ��� Char Ÿ���� ���ڸ� �Է¹ް�, 
		//      �ش� ���ڿ��� ���ڰ� � ������� ����� ����ϴ� �޼���
		//�Է� : "banana", 'n' => ��� 2
//		System.out.printf("�Էµ� ���� %s���� a�� %d�� �Դϴ�.",inStr,getCharSum(inStr, 'a'));
		
		//(3) 1~100���� �ܼ�â�� ����ϴµ�, 3�� �� ���ڴ� '*'�� ���
		//ex) 1,2,*,4,5,6,7,8,9,10,11,12,*,14....
		//3�� �� ���ڴ� * ���
		for(int i=1;i<=100;i++) {
			String tempStr = String.valueOf(i);
			if(tempStr.contains("3")==true)
				System.out.print("*");
			else
				System.out.print(i);
			System.out.print(",");
		}
		//3�� �� ���� �� 3�� * ���, �� ���ڿ� �ȿ��� ���� �ϳ��� �����ҽ� �Ʒ� ���·� ���� ��� ��.
		for (int i=1; i<=100; i++) {
			String tempStr1 = String.valueOf(i);
			for(int j=0; j<tempStr1.length(); j++) {
				char curCh = tempStr1.charAt(j);
				if(curCh=='3')
					System.out.print("*");
				else
					System.out.print(curCh);
			}
			System.out.print(",");
		}
	}
	
	public static int getCharSum(String inStr, char inChr) {
		int result=0;
			for (int i=0;i<inStr.length();i++) {
				if(inStr.charAt(i) == inChr)
					result++;
			}
		return result;
	}

}
