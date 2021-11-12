package 인터페이스;

//인터페이스의 상수필드
interface Coin{
	int PENNY=1, NICKEL=5, DIME=10, QUARTER=25;
}

interface Color{
	int red=0xff0000;
	int green=0x00ff00;
	int blue=0x0000ff;
}

public class CoinMain {
	public static final int PENNUY=1;
	public static final int NICKEL=5;
	public static final int DIME=10;
	public static final int QUARTER=25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DIME은" + Coin.DIME + "센트입니다.");
		System.out.println("DIME은" + DIME + "센트입니다.");
		
		System.out.println("PENNY은" + Coin.PENNY + "센트입니다.");
		
		System.out.printf("Red는 0x%x입니다.\n",Color.red); // 16진수 표시 %x
		
		
	}

}
