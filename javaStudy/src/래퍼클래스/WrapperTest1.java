package ����Ŭ����;

class Test{
	int intVal;
	Integer num;
	
}

public class WrapperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int -> Integer
		// char -> Charater
		// double -> Double
		// boolean -> Boolean
		// �⺻Ŭ������ ���δ� Ŭ����(Ȯ��?)
		
		//(1) ����Ŭ������ ��ǥ���� ��� (SIZE,BYTES,MIN_VALUE,MAX_VALUE ��� ������� ����
		System.out.println("Size : " + Integer.SIZE); // ��Ʈ��
		System.out.println("Size : " + Integer.BYTES); // ��Ʈ��
		System.out.println("Size : " + Integer.MIN_VALUE); // �ּҰ�
		System.out.println("Size : " + Integer.MAX_VALUE); // �ִ밪
		
		//(2) �⺻���� ����Ŭ������ �� ��ȯ
		//(2-1) int -> Integer
		Integer num1 = new Integer(10); //��ȿ�� - ���ο� ��ü�� ����� �Ҵ� (�߰���)
		Integer num2 = 10;
		Integer num3 = Integer.valueOf(10);
		System.out.println(num1);
		
		//(2-2) Integer -> int
		int intVal1 = num1.intValue();
		int intVal2 = num2; // �ַ� ���
		System.out.println(intVal2);
		
		//(2-3) String -> Integer
		String strNum = "100"; // 1*2^2+0*2^1+0*2^0 =4
		Integer num4 = new Integer(strNum);
		Integer num5 = Integer.valueOf(strNum); // �ַ� ���
		Integer num6 = Integer.valueOf(strNum,2); //���� ����
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		//(2-4) Integer -> String
		String numStr2 = num5.toString();
		String numStr3 = Integer.toString(4,2); //����, ����
		System.out.println(numStr3); //4�� 2������ ǥ�� => 100
		
		//(2-5) int -> String
		String numStr4 = String.valueOf(5); //����Ÿ�� ���ڿ��� ��ȯ
		String numStr5 = Integer.toString(5);
		
		//(2-6) String -> int
		int intNum2 = Integer.parseInt(numStr5);
		
		//(3) ����Ŭ������ �⺻Ÿ�԰��� �� ��
		int intNum3 = 100;
		Integer num03 = 100;
		Integer num04 = new Integer(100);
		//����Ŭ������ �⺻Ÿ��
		// Java 5.0���� �ڵ�����ȯ
		//!=,>,< �񱳿�����
		System.out.println("����Ŭ���� == �⺻Ÿ�� : " + (intNum3==num03)); //Integer�� Ŭ������ �ּҸ� ���������� �ڵ�����ȯ���� �� ����
		System.out.println("����Ŭ����.equals(�⺻Ÿ��) : " + (num03.equals(intNum3)));
		System.out.println("����Ŭ����==����Ŭ���� : " + (num03==num04)); // �ּҸ� ���ϱ� ������ false
		System.out.println("����Ŭ����.equals(����Ŭ����) : " + (num3.equals(num04)));
		
		//(4) ����Ŭ������ �⺻������ �ʱⰪ ����
		Test t1 = new Test();
		System.out.println(t1.intVal); // 0 : �����Ҵ�� ������ �ƴ��� ������ �ȵ�.
		System.out.println(t1.num); //null : ���� �Ҵ��ߴ��� ���ߴ��� Ȯ���� ������.
		
		t1.num = 10;
		System.out.println(t1.num); //null : ���� �Ҵ��ߴ��� ���ߴ��� Ȯ���� ������.
		
		
	}

}
