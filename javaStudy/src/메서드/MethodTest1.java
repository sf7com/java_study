package �޼���;

public class MethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) 1~10������ ���� ���ؼ� ����ϴ� �ڵ带 �ۼ�
		//(2) 10~100������ ���� ���ؼ� ����ϴ� �ڵ带 �ۼ�
		//(3) 100~1000������ ���� ���ؼ� ����ϴ� �ڵ带 �ۼ�
		
		int result=0;
		for(int i=1;i<=10;i++) {
			result+=i;
		}
		System.out.printf("1~10���� ���� %d �Դϴ�.\n",result);
		int result1=0;
		for(int i=10;i<=100;i++) {
			result1+=i;
		}
		System.out.printf("1~100���� ���� %d �Դϴ�.\n",result1);
		int result2=0;
		for(int i=100;i<=1000;i++) {
			result2+=i;
		}
		System.out.printf("1~1000���� ���� %d �Դϴ�.\n",result2);
		
		//�� ���ڸ� �Է� �޾Ƽ� �� ���� ���� ��� ���ڵ��� ���� ���ϴ� �޼���
		
		int num = sum(1,10);
		System.out.println(sum(1,10));
		System.out.println(sum(10,100));
		System.out.println(sum(100,1000));
	}
	public static int sum(int num1, int num2) {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			sum+=i;
		}
		return sum;
	}

}
