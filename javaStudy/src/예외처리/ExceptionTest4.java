package 예외처리;

public class ExceptionTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2};
		try {
//			int x = array[3];
			System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스를 벗어나 참조하고 있습니다.");
		} catch (Exception e) {
			//모든 예외를 다 받는다. 맨위에 있으면 순차적 예외처리 안됨.
			System.out.println("모르는 예외 발생");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
