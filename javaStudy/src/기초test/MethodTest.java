package ����test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1-1)�޼���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���.>");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���.>");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("��Ģ���� ��ȣ�� �Է��ϼ���>");
		String char1 = sc.nextLine();

		getCalculator(num1,num2,char1);
		///////////////////////////////////////////
		//(3-1)�迭�� ���ڿ� �޼��� ȭ
		//int[] array = {1,2,3,4,5};
		//(1) �� �迭�� ������ ���Ͻÿ�.
		//(2) �� �迭�� ��հ��� ���Ͻÿ�.
		//(3) �� �迭�� �л갪�� ���Ͻÿ�.    �л���� : ����Ҹ� ��հ����� ���� ������ ���� ��հ�
		//   ex) (1-avg)^2, (2-avg)^2, (3-avg)^2, (4-avg)^2, (5-avg)^2 ���� ��հ�
		int[] array = {1,2,3,4,5};

		System.out.printf("(3-1)�޼���ȭ �հ� : %d",sumNum(array));
		System.out.println();
		System.out.printf("(3-2)�޼���ȭ ��� : %.2f",avg(array));
		System.out.println();
		System.out.printf("(3-3)�޼���ȭ �л갪 : %.2f",value(array));
		
		//String[] strArray = {�������, �����⡱, ��������, ��������, ��������, �����"};
		//(4) ���������� �� �� �ִ��� ���ÿ�.
		String[] strArray = {"���", "����", "����", "����", "����", "���"};
		String word = "���";
		System.out.println();
		System.out.printf("(3-4)�޼���ȭ %s ���� : %d",word,wordCnt(word,strArray));
		
//		//(5) ��apple" �̶�� �ܾ �־����� �� �ձ��ڸ� �빮�ڷ� �ٲٵ��� �Ͻÿ�.
//		//==> ��Apple"
		String str1 = "apple";
		System.out.println();
		System.out.printf("(3-5)�޼���ȭ %s ù���� �빮�� ���� => : %s",str1,firstUpper(str1));
		System.out.println();
		//String[] strArray2 = {��apple��, ��grape��, ��mango��};
		//(6) ������ �迭�� �� �ܾ �ձ��ڸ� ��� �빮�ڷ� �ٲٵ��� �Ͻÿ�.
		//==> {��Apple��, ��Grape��, ��Mango��}
		String[] strArray2 = {"apple", "grape", "mango"};
		String upChStr1;
		String lowChStr1;
		String chStr1;
		List<String> upChStrArray = new ArrayList<>();
		
		for(int i=0;i<strArray2.length;i++) {
			upChStr1 = strArray2[i].toUpperCase();
			lowChStr1 = strArray2[i].toLowerCase();
			chStr1 = upChStr1.substring(0,1)+lowChStr1.substring(1);
			upChStrArray.add(chStr1);
		}
		System.out.println(upChStrArray);
	}
	public static void getCalculator(int num1, int num2, String char1) {
		int result=0;
		if(char1.equals("+"))
			result=num1+num2;
		else if(char1.equals("-"))
			result=num1-num2;
		else if(char1.equals("*"))
			result=num1*num2;
		else if(char1.equals("/"))
			result=num1/num2;		
		
		System.out.printf("1�� ����:%d %s 2�� ����: %d = %d",num1,char1,num2,result );
		System.out.println();
	}
	public static int sumNum(int[] array) {
		int sum = 0; 
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		return sum;
	}
	
	public static double avg(int[] array) {
		return sumNum(array)/array.length;
	}
	
	public static double value(int[] array) {
		double sum1 = 0;
		for(int i=0;i<array.length;i++) {
			sum1=sum1+((array[i]-avg(array))*(array[i]-avg(array)));
		}
		return sum1/array.length;
	}
	
	public static int wordCnt(String word,String[] strArray) {
		int fruitCnt=0;
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i] == word)
				fruitCnt++;
		}
		return fruitCnt;
	}
	
	public static String firstUpper(String str1) {
		String upStr = str1.toUpperCase();
		String lowStr = str1.toLowerCase();
		return upStr.substring(0,1)+lowStr.substring(1);
	}
	

}
