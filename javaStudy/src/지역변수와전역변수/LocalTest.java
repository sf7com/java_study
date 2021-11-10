package 지역변수와전역변수;

public class LocalTest {

	static int globalNum = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		numIncrement(num);
		System.out.println("Main 메서드에서의 num값 : " + num);
		globalNumIncrement();
		System.out.println("Main 메서드에서의 globalNum값 : " + globalNum);
	}
	//숫자 1증가하지만 출력을 안하는 메서드
	public static void numIncrement(int num) {
		System.out.println("메서드 시작히 num값 : " + num);
		num++;
		System.out.println("메서드 끝날때 num값 : " + num);
	}
	public static void globalNumIncrement() {
		System.out.println("메서드 시작히 globalNum값 : " + globalNum);
		globalNum++;
		System.out.println("메서드 끝날때 globalNum값 : " + globalNum);
	}
	

}
