package ����ó��;

import java.util.StringTokenizer;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)�迭�� �ε����� ����� ������ ���
		int[] array = {0,1,2};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		//System.out.println(array[3]);
		
		//��ūȭ�� ����		
		String str = "Pen-is-mightier-than-sword";
		StringTokenizer token = new StringTokenizer(str,"-");//������ �������� �ܾ ������
		System.out.println("��ū ���� : "+token.countTokens());
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		//���̻� ������ �����Ͱ� ���� ���
		//java.util.NoSuchElementException
		token.nextToken();
		
	}

}
