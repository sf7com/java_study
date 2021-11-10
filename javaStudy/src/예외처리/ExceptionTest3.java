package 예외처리;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(var str : args) {
			System.out.println(str);
		}
		System.out.println("-------------------------");
		
		int num = 10;
		try {
			int divisor = Integer.parseInt(args[0]); //문자열에 있는 값을 숫자 int로 변환
			System.out.println((double)num/divisor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력된 값이 없습니다.");
			return;
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닌 수를 입력하였습니다.");			
			return;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;		
		}finally {
			System.out.println("항상 실행됩니다.");
		}
		System.out.println("프로그램 종료");
	}

}
