package javaStudy;

public class CharTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double d;
		byte b;
		
		//���� -> ����
		i = 7/4; //7����,4���� �������� ��Ģ���� => ������ ��� ����
		System.out.println(i); //1
		
		//���� -> �Ǽ� *�������� ������� ������ double �̴��� ���� �� 1�� �Ǽ��� ���� ��.
		d = 7/4; // 1 => 1.0
		System.out.println(d); //1.0		
		
		//������ �Ǽ� ��Ģ���� ���� �Ǽ��� ��ȯ�Ǿ� ���
		d = 7/4.0; // 1.75 => 1.75
		System.out.println(d); //1.75
		d = 7.0/4; // 1.75 => 1.75
		System.out.println(d); //1.75
		d = 7.0/4.0; // 1.75 => 1.75
		System.out.println(d); //1.75
		d = (double)7/4.0; // 1.75 => 1.75
		System.out.println(d); //1.75
	}

}
