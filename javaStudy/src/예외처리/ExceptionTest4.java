package ����ó��;

public class ExceptionTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2};
		try {
//			int x = array[3];
			System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε����� ��� �����ϰ� �ֽ��ϴ�.");
		} catch (Exception e) {
			//��� ���ܸ� �� �޴´�. ������ ������ ������ ����ó�� �ȵ�.
			System.out.println("�𸣴� ���� �߻�");
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}

}
