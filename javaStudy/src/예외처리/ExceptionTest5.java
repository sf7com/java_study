package ����ó��;

import java.util.Scanner;

public class ExceptionTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("�����Է�>");
			square(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
	public static void square(String s) { //throws NumberFormatException
		int n = Integer.parseInt(s);
		System.out.println(n*n);
	}
}
