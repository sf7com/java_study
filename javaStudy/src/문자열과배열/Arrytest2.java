package ���ڿ����迭;

public class Arrytest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strAry = {"banana","apple","kiwi"};
		
		//������ �迭�� ù���ڸ� �빮�ڷ� ��ȯ
		for(int i=0; i<strAry.length;i++) {
			String first = strAry[i].substring(0,1);
			first = first.toUpperCase();
			strAry[i]=first+strAry[i].substring(1);
		}
		
		for(String str : strAry) {
			System.out.println(str);
		}
		//�Ǻ���ġ ���� ���ϱ�
		int[] fibo = new int[30];
		for(int i=0;i<fibo.length;i++) {
			if(i==0 || i==1)
				fibo[i]=1;
			else
				fibo[i]=fibo[i-1]+fibo[i-2];
		}
		for(int val : fibo) {
			System.out.print(val +",");
		}
//		double[] fiboRatio = new double[30];
//		for(int i=0;i<fiboRatio.length;i++) {
//			fiboRatio[i] = fibo[i+1]/fibo[i];
//			System.out.print(fiboRatio[i]+",");
//		}
	}

}
