package ���ڿ����迭;

public class Stringtest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڿ� ����
		int num = 17;
		String str = "apple" + num;
		System.out.println(str);
		
		String str2 = 10+str+" banana"+num;
		System.out.println(str2);
		
		double pi = 3.141592;
		String str3 = "PI="+pi;
		System.out.println(str3);
		
		//����
//		String Str4 = pi;
		String str4 = String.valueOf(pi);
		System.out.println(str4);
		str4 = ""+pi;
		System.out.println(str4);
		
		String str5 = String.valueOf(false);
		System.out.println(str5);
		str5 = String.valueOf(10);
		System.out.println(str5);
		str5 = String.valueOf('a');
		System.out.println(str5);
		
		//������ �����ؼ� ���ڿ��� ����� ���� ���
		String fruit = "apple";
		String s6;
		s6 = String.format("%s %.2f",fruit,pi);
		System.out.println(s6); // apple 3.14
		//format �ż���� �ڸ��� ������ ���� ���
	}

}
