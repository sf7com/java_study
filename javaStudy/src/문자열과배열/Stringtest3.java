package ���ڿ����迭;

public class Stringtest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)3,6,9 - 1~100���� ������ 3,6,9 �� ���ڴ� ¦���� ���
		//ex)1,2,¦,4,5,¦,....(33,36���� ���ڵ��� ¦¦)
		//(1) 1~100������ ���� ������ �����.
		//(2) �� ���ں� 3 �Ǵ� 6 �Ǵ� 9�� ������ ��´�.
		//(3) ������ ���� ���ڸ� ����Ѵ�.
		// (3-1) ������ 0���� ũ�� ������ŭ ¦�� ����Ѵ�.
		// (3-1) ������ 0�̸� ���� �״�� ����Ѵ�.
		for (int i=1; i<=100; i++) {
			String tempStr1 = String.valueOf(i);
			int temp1=0;
			for(int j=0; j<tempStr1.length(); j++) {
				char curCh = tempStr1.charAt(j);
				if(curCh=='3'|| curCh=='6'||curCh=='9')
					temp1++;
				}
			if(temp1==1)
				System.out.print("¦");
			else if(temp1==2)
				System.out.print("¦¦");
			else
				System.out.print(i);
			System.out.print(",");
		}
		System.out.println();
		
		for(int num=1;num<=100;num++) {
			int cnt = 0;
			String numStr = String.valueOf(num);
			cnt = getCharSum(numStr,'3')+getCharSum(numStr,'6')+getCharSum(numStr,'9');
			if(cnt>0) {
				System.out.print("¦".repeat(cnt));//repeat ������ŭ "¦"�� �ݺ� ���
			}else 
				System.out.print(numStr);
			System.out.print(",");
		}
	}
	
	public static int getCharSum(String inStr, char inChr) {
		int result=0;
			for (int i=0;i<inStr.length();i++) {
				if(inStr.charAt(i) == inChr)
					result++;
			}
		return result;
	}
	
}
