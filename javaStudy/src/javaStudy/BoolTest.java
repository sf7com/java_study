package javaStudy;

public class BoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true; //1
		boolean b2 = false; //0
		System.out.println(b1);
		System.out.println(b2);
		// ! : ���� ����
		System.out.println(!b1); //false
		System.out.println(!b2); //true
		
		//&& : AND ���� ��� ��, �ϳ��� �����̸� ����
		System.out.println(b1&&b2); //false
		System.out.println(b1&&b1); //true
		//|| : OR ���� �ϳ��� ���̸� ��, ��� �����̸� ����
		System.out.println(b1||b2); //true
		System.out.println(b1||b1); //true
		System.out.println(b2||b2); //false
		
		//�� ������
		// == : ������ ����
		boolean isSameNum = 3==4;
		boolean isSameNum1 = 3==3;
		System.out.println(isSameNum); //false
		System.out.println(isSameNum1); //true
		
		//��Ұ��� : >,<,>=,<=
		boolean b3 = 10>5;
		boolean b4 = 10<5;
		boolean b5 = 10>=10;
		System.out.println(b3); //true
		System.out.println(b4); //false
		System.out.println(b5); //true
	}

}
