package ����test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1) ���ǹ� �����Է� ��Ģ����
		Scanner sc = new Scanner(System.in);
//		System.out.print("ù��° ���ڸ� �Է��ϼ���.>");
//		int num1 = sc.nextInt();
//		System.out.print("�ι�° ���ڸ� �Է��ϼ���.>");
//		int num2 = sc.nextInt();
//		sc.nextLine();
//		System.out.print("��Ģ���� ��ȣ�� �Է��ϼ���>");
//		String char1 = sc.nextLine();
//		int result=0;
//		if(char1.equals("+"))
//			result=num1+num2;
//		else if(char1.equals("-"))
//			result=num1-num2;
//		else if(char1.equals("*"))
//			result=num1*num2;
//		else if(char1.equals("/"))
//			result=num1/num2;		
//		
//		System.out.printf("1�� ����:%d %s 2�� ����: %d = %d",num1,char1,num2,result );
//		System.out.println();
		//(2) �ݺ��� 1~1000���� ��
		//(2-1-1) 5�� ��� ��
//		int sum5=0;
//		for(int i=1; i<=1000;i++) {
//			if(i%5==0)
//			sum5 = sum5+i;
//		}
//		System.out.printf("1~1000���� 5�� ��� �� : %d",sum5);
//		System.out.println();
//		//(2-1-2) 5�� ��� �̰ų� 7�� ��� ��
//		int sum5or7=0;
//		for(int i=1; i<=1000;i++) {
//			if(i%5==0 || i%7==0)
//				sum5or7 = sum5or7+i;
//		}
//		System.out.printf("1~1000���� 5 or 7�� ��� �� : %d",sum5or7);
//		System.out.println();
//		//(2-1-3) 5�� 7�� ��� ��
//		int sum5n7=0;
//		for(int i=1; i<=1000;i++) {
//			if(i%5==0 && i%7==0)
//				sum5n7 = sum5n7+i;
//		}
//		System.out.printf("1~1000���� 5 or 7�� ��� �� : %d",sum5n7);
		
		//(2-2-1) ���� 9�� ���̾Ƹ�� ���
		int dia=9;
		int center=dia/2+1;
		int cnt=dia;
		for(int i=0;i<dia;i++) {
			if(i<center) {
				for (int j = 1; j < center-i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i * 2 + 1); j++) {
					System.out.print("��");
				}
				System.out.println();
			}
			if(i>=center) {
				cnt=cnt-2;
				for (int j = 0; j < i-(center-1); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j<cnt; j++) {
					System.out.print("��");
				}
				System.out.println();
			}
		}	
//			(2-2-2)���� �� ���̾Ƹ�� ���
		int dia2=9; //Ȧ���� �ܼ� �Է��ϸ� ���̾�
		int center2=dia2/2+1;
		int cnt2=dia2;
		for(int i=0;i<dia2;i++) {
			if(i<center2) {
				for (int j = 1; j < center2-i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i * 2 + 1); j++) {
					if(j==0 || j==((i * 2 + 1)-1))
						System.out.print("��");
					else
						System.out.print(" ");
					
				}
				System.out.println();
			}
			if(i>=center2) {
				cnt2=cnt2-2;
				for (int j = 0; j < i-(center2-1); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j<cnt2; j++) {
					if(j==0 || j==cnt2-1)
						System.out.print("��");
					else
						System.out.print(" ");
				}
				System.out.println();
			}	
		}
		//(2-3)�Ž����� ���� : 9820���� 1000��, 500��, 100��, 10������ �����־�� �Ѵ�.
		//1000��, 500��, 100��, 10���� ���� �� �� �ʿ����� ����Ͻÿ�.
		//���� : 1000������ �� ������ ���� �ִ� ���ڰ� �ǵ����Ѵ�. 
		//     ex) �� �������� 1000���� 9��, 500�� 1��, 100�� 3��,50�� 1��, 10�� 2�� 
		//int[] change[] = {1000,500,100,50,10};
//		System.out.print("�Ž������� �Է��ϼ���.>");
//		int money = sc.nextInt();
//		int calculator = 0;
//		int changeMoney = money;
//		int[] change= {1000,500,100,50,10};
//		List<Integer> chMoneyArry = new ArrayList<>();
//		for(int i=0; i<5;i++) {
//			calculator = changeMoney/change[i];
//			changeMoney = changeMoney%change[i];
//			chMoneyArry.add(calculator);			
//		}		
//		System.out.println();
//		System.out.printf("1000��:%d��, 500��:%d��, 100��:%d��, 50��:%d��, 10��:%d��",
//				chMoneyArry.get(0),chMoneyArry.get(1),chMoneyArry.get(2),chMoneyArry.get(3),chMoneyArry.get(4));

		//(3)�迭�� ���ڿ�
		//int[] array = {1,2,3,4,5};
		//(1) �� �迭�� ������ ���Ͻÿ�.
		//(2) �� �迭�� ��հ��� ���Ͻÿ�.
		//(3) �� �迭�� �л갪�� ���Ͻÿ�.    �л���� : ����Ҹ� ��հ����� ���� ������ ���� ��հ�
		//              ex) (1-avg)^2, (2-avg)^2, (3-avg)^2, (4-avg)^2, (5-avg)^2 ���� ��հ�
		int[] array = {1,2,3,4,5};
		int sum = 0; 
		double sum1 = 0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		double avg = sum/array.length;
		for(int i=0;i<array.length;i++) {
			sum1=sum1+((array[i]-avg)*(array[i]-avg));
		}
		double value = sum1/array.length;
		System.out.printf("�л갪 : %.2f",value);
		System.out.println();
//		//String[] strArray = {�������, �����⡱, ��������, ��������, ��������, �����"};
//		//(4) ���������� �� �� �ִ��� ���ÿ�.
//		String[] strArray = {"���", "����", "����", "����", "����", "���"};
//		int fruitCnt=0;
//		for(int i=0;i<strArray.length;i++) {
//			if(strArray[i] == "����")
//				fruitCnt++;
//		}
//		System.out.printf("������ ���� :%d�� ",fruitCnt);
//		System.out.println();
//		//(5) ��apple" �̶�� �ܾ �־����� �� �ձ��ڸ� �빮�ڷ� �ٲٵ��� �Ͻÿ�.
//		//==> ��Apple"
//		String fruitStr = "apple";
//		String upStr = fruitStr.toUpperCase();
//		String lowStr = fruitStr.toLowerCase();
//		String upchStr = upStr.substring(0,1)+lowStr.substring(1);
//		System.out.println(upchStr);
//		
//		//String[] strArray2 = {��apple��, ��grape��, ��mango��};
//		//(6) ������ �迭�� �� �ܾ �ձ��ڸ� ��� �빮�ڷ� �ٲٵ��� �Ͻÿ�.
//		//==> {��Apple��, ��Grape��, ��Mango��}
//		String[] strArray2 = {"apple", "grape", "mango"};
//		String upChStr1;
//		String lowChStr1;
//		String chStr1;
//		List<String> upChStrArray = new ArrayList<>();
//		
//		for(int i=0;i<strArray2.length;i++) {
//			upChStr1 = strArray2[i].toUpperCase();
//			lowChStr1 = strArray2[i].toLowerCase();
//			chStr1 = upChStr1.substring(0,1)+lowChStr1.substring(1);
//			upChStrArray.add(chStr1);
//		}
//		System.out.println(upChStrArray);
		
		//(7) �޷� ��� ����
		Map<Integer, Integer> lastDayMap = new HashMap<>();
		lastDayMap.put(1, 31);lastDayMap.put(2, 28);lastDayMap.put(3, 31);
		lastDayMap.put(4, 30);lastDayMap.put(5, 31);lastDayMap.put(6, 30);
		lastDayMap.put(7, 31);lastDayMap.put(8, 31);lastDayMap.put(9, 30);
		lastDayMap.put(10, 31);lastDayMap.put(11, 30);lastDayMap.put(12, 31);
		
		int lastday=0;
		for(Integer mon : lastDayMap.keySet()) {
			lastday = lastDayMap.get(mon);
			System.out.printf("%d�� - ",mon);
			for(int i=1;i<=lastday;i++) {
				System.out.printf("%d��",i);
				if(i!=lastday)
					System.out.print(",");
			}
			System.out.println();
		}
		
	}
}
