package �˰�����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GreedyANDSimul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)�׸��� �˰���:���� ��Ȳ���� ���� ���� ���� �͸� ���� ���
		//�ܼ��� ���� ���� ���̴� ���� �ݺ������� �����ؼ� ������ �ظ� ���� �� �ִ��� ����
		
		//(1-1) �� �ڸ��� ����(0~9)�θ� �̷���� ���ڿ� S�� �־����� ��
		//���ʺ��� ���������� �ϳ��� Ȯ���ϸ� 'x'Ȥ�� '+' �����ڸ� �־� ���������
		//���� ū ���� ���ϴ� ���α׷�
		//ex) "02984"
		//"0"�� "1"�� ���ϰ� �������� ���Ѵ�
		Scanner sc = new Scanner(System.in);
		System.out.println("0~9������ ���ڸ� �Է��ϼ���.(�ִ�20�ڸ�)");
		String inStr = sc.nextLine();
		
		long result = Character.getNumericValue(inStr.charAt(0));
		for(int i=1;i<inStr.length();i++) {
			int num = Character.getNumericValue(inStr.charAt(i));
			if(num<=1 || result <=1) {
				result+=num;
			}else {
				result*=num;
			}
		}
		System.out.println(inStr+"�� ���� �� �ִ� �ִ� ���� :"+result);
		
		//(2) ���� : �ùķ��̼ǰ� ����Ž��
		//���� : Ǯ�̸� ���ø��� ���� ������ �ҽ��ڵ�� �ű�� ����� ����
		//ex) �˰����� �����ѵ� �ڵ尡 ����ġ�� ������� ����
		//    �Ǽ� ������ �ٷ��, Ư�� �Ҽ������� ����ؾ� �ϴ� ����
		//    ���ڿ��� Ư���� ���ؿ� ���� ���� ó���ؾ� �ϴ� ����
		//    ������ ���̺귯���� ����ؾ� �ϴ� ����
		//�ùķ��̼�(����Ž��) : �Ϸ��� ��ɿ� ���� ��ü�� ���ʴ�� �̵����� �ذ�
		//(2-1) ���ڿ� ������ : ���ĺ� �빮�ڿ� ����(0~9)�θ� ������ ���ڿ��� �Է�
		//��� ���ĺ��� �������� �����ϰ� �̾ �� �ڿ� ��� ���ڸ� ���� ���� ���
		//ex)K1KA5CB7 => ABCKK13
		System.out.println("���ڿ� ���ڿ� �Է� >");
		String inStr2 = sc.nextLine();
		//���ڿ� -> ���� �ϳ��� �迭
		char[] charArray = inStr2.toCharArray();
		List<String> chList = new ArrayList<>();
		int sum = 0;
		for(var ch : charArray) {
			if(Character.isLetter(ch)) {
				chList.add(inStr2);
			}else {
				sum += Character.getNumericValue(ch);
			}
		}
		//chList �������� ����
		Collections.sort(chList);
		String resultStr = String.join("", chList)
				+String.valueOf(sum);
		System.out.println(resultStr);
	}

}
