package ���ڿ����迭;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)�� ���ڿ����� ��
		String s1 = "Hi Java!";
		String s2 = new String("Hi Java!");
		String s3 = "Hi Python!";
		String s4 = "Hi java!";
		
		//s1==s2�� ���� ���ڿ��� �����񱳰� �ȵ�.equals�� ��
		System.out.println("s1==s2 => "+ s1.equals(s2));
		System.out.println("s1==s3 => "+ s1.equals(s3));
		System.out.println("s1==s4 => "+ s1.equals(s4));
		//equalsIgnoreCase : ��ҹ��� ���о��� ��
		System.out.println("s1==s4 => "+ s1.equalsIgnoreCase(s4));
		
		//compareTo : ���ڿ��� ���� ������ ���� ���������� ��ȯ
		String char1 = "abc";
		String char2 = "abc";
		String char3 = "caa";
		System.out.println(char1.compareTo(char2));//0
		System.out.println(char1.compareTo(char3));//-2
		
		//���ڿ� ����
		System.out.printf("%s�� ���ڿ��� ���� : %s\n",s1,s1.length());
		
		//s1������ �ι�° ���ڸ� �������� ������
		System.out.printf("%s�� 2��° ���� : %c\n",s1,s1.charAt(1));
		
		//s1�� "Java" ���ڿ��� �ִ��� �˻�
		System.out.printf("%s�� Java ���ԵǾ����� ���� : %b\n",s1,s1.contains("Java"));
		
		//s1�� "Java" ���ڿ��� �ִ��� �˻� �� �ε��� ��ȯ
		System.out.printf("%s�� Java ���ԵǾ����� ���� : %b\n",s1,s1.indexOf("Java"));
		
		//s2�� �������� �̷�����ְų� ����ִ��� �Ǵ�
		s2="   ";
		System.out.printf("s2 ���� Ȥ�� �� �Ǵ� %b\n", s1.isBlank());
		
		//�� �� ��������
		s3 = "      apple";
		System.out.printf("s3 ���� ���� : %s\n",s3.trim());
		
		//���ڿ� �ݺ�
		s4 = "�ڡ�";
		System.out.println(s4.repeat(10));
		
		//���ڿ� �߰� �� ��������
		System.out.printf("%s�� 5���� ������ ��: %s\n",s1,s1.substring(5));
		
		System.out.printf("%s�� �ε��� 0����~5�̸� ���� ��: %s\n",s1,s1.substring(0,5));
		
		//���ڿ��� ������ ����ȯ
		s1 = "13";
		int num1 = Integer.parseInt(s1);
		System.out.println(num1);
		
		//���ڿ��� �Ǽ��� ����ȯ
		s1 = "13.44";
		double num2 = Double.parseDouble(s1);
		System.out.println(num2);

		//������ ���ڿ��� ����ȯ
		String numStr1 = String.valueOf(num1);
		System.out.println(numStr1);
		
		//������ ���ڿ��� ����ȯ
		String numStr2 = String.valueOf(num2);
		System.out.println(numStr2);
	}

}
