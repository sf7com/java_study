package ����ó��;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)�迭�� �ε����� ����� ������ ���
		int[] array = {0,1,2};
		try {
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[2]);
			System.out.println(array[3]);			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε����� ��� �����Ͽ����ϴ�.");
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("��� ����");
		
		//��ūȭ�� ����		
		String str = "Pen-is-mightier-than-sword";
		StringTokenizer token = new StringTokenizer(str,"-");//������ �������� �ܾ ������
		
		try {
			System.out.println("��ū ���� : "+token.countTokens());
			while(token.hasMoreTokens()) {
				System.out.println(token.nextToken());
			}
			
			//���̻� ������ �����Ͱ� ���� ���
			//java.util.NoSuchElementException
			token.nextToken();			
		} catch(NoSuchElementException e) {
			System.out.println("���Ұ� �����ϴ�.");
		}
		System.out.println("��� ����");
		
	}

}
