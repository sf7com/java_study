package ���ٽİ��Լ����������̽�;

//�Լ��� �������̽� : �߻�޼��尡 1���� �������̽�
interface Negative{
	int neg(int x);
}
interface Printable{
	void print();
}

public class LamdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Negative n;
		// �Լ��� �������̽� �����θ� ���ٽ����� ����
		//   ����Ÿ��    ������
		n = (int x)->{return -x;};
		System.out.println(n.neg(10));
		//�Է�Ÿ�� ���� ����
		n = (x)->{return -x;};
		System.out.println(n.neg(10));
		//�Է��� 1����� ��ȣ�� ���� ����
		n = x->{return -x;};
		System.out.println(n.neg(10));
		//�����ο� return�ĸ� �ִٸ� {} �� return�� ���� ����
		n = x->-x;
		System.out.println(n.neg(10));
		//////////////////////////////////////////
		Printable p;
		
		p = ()->{System.out.println("�ȳ�!");};
		p.print();
		
		//�����ο� ���� �ϳ���� {} ���� ����
		p = ()->System.out.println("�ȳ�!");
		p.print();
		

	}

}
