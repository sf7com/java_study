package ����ó��;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(var str : args) {
			System.out.println(str);
		}
		System.out.println("-------------------------");
		
		int num = 10;
		try {
			int divisor = Integer.parseInt(args[0]); //���ڿ��� �ִ� ���� ���� int�� ��ȯ
			System.out.println((double)num/divisor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�Էµ� ���� �����ϴ�.");
			return;
		} catch (NumberFormatException e) {
			System.out.println("���ڰ� �ƴ� ���� �Է��Ͽ����ϴ�.");			
			return;
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return;		
		}finally {
			System.out.println("�׻� ����˴ϴ�.");
		}
		System.out.println("���α׷� ����");
	}

}
