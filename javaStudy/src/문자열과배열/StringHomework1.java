package ���ڿ����迭;

public class StringHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)�޼��� : �� ���ڿ��� �Է¹޾Ƽ� �� ���ڿ��� �Ǽ��� �ٲٰ�
		//          �� �Ǽ��� ���� ����ϴ� �޼���
		//          ���� : �� ���ڿ��� ���ڶ�� ����
		System.out.println(stringTimes("100","91.2"));
		
		//(2)�޼��� : ���ڿ��� �Է¹޾Ƽ�, ���ڿ��� ù���ڸ� �빮�ڷ� �مf ������ִ� �޼���
		String str = "banana";
		System.out.println(strConv(str));
	}
	public static double stringTimes(String s1, String s2) {
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		return num1*num2;
	}
	public static String strConv(String s1) {
		//(1) ù���ڸ� �����´�.
		String firstStr = s1.substring(0,1);//String Ÿ������ ù����
		//(2) ù���ڸ� �빮�ڷ� �ٲ۴�.
		firstStr = firstStr.toUpperCase();
		//(3) �빮�ڷ� �ٲ� ù���ڿ� ������ ���ڸ� �����Ѵ�.
		String result = firstStr+s1.substring(1);//�ε��� 1���� ������
		return result; //Banana
		
	}
}
