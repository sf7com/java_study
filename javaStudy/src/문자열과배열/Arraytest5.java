package ���ڿ����迭;

public class Arraytest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = {1,2,3,10,10,20,30,10};
		int num=10;
		
		double[] doubleAry = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(getArrayTotal(doubleAry));
		System.out.println(getArrayAvg(doubleAry));
		
		int [] ary = {1,2,3,10,10,20,30,10};
		System.out.println(getAryNumCnt(ary,10));
		System.out.println(getAryNumCnt(intAry,1));
		
		
		
		
	}
	//�迭�� ��� ����� ���� ���ؼ� ����ϴ� �޼���
	public static int getArrayTotal(int[] intAry) {
		int result = 0;
		for(int val : intAry) {
			result+=val;
		}
//		for(int i=0;i<intAry.length;i++) {
//			result += intAry[i];
//		}
		return result;
	}
	
	public static double getArrayTotal(double[] intAry) { //�޼��� �����ε� > �޼��� �̸��� ����� ������ Ÿ���� �ٸ����
		int result = 0;
		for(double val : intAry) {
			result+=val;
		}
//		for(int i=0;i<intAry.length;i++) {
//			result += intAry[i];
//		}
		return result;
	}
	//(1) ������ �迭�� ��հ��� ���ϴ� �޼���
	public static double getArrayAvg(double[] intAry) {
		return getArrayTotal(intAry)/intAry.length;
	}
	//(2) ������ �迭���� Ư�� ����� ������ ����ϴ� �޼��� 
	//    �Է� : ������ �迭1��, ������ 1��
	//    ��� : �������� ���� �� ����
	// �Է� : {1,2,3,10,10,20,30,10}, 10
	// ��� : 3
	public static int getAryNumCnt(int[] ary, int num) {
		int cnt=0;
		for(int val : ary) {
			if(val==num) {
				cnt++;
			}
		}
		return cnt;
	}
}
