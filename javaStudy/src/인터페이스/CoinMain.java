package �������̽�;

//�������̽��� ����ʵ�
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
		System.out.println("DIME��" + Coin.DIME + "��Ʈ�Դϴ�.");
		System.out.println("DIME��" + DIME + "��Ʈ�Դϴ�.");
		
		System.out.println("PENNY��" + Coin.PENNY + "��Ʈ�Դϴ�.");
		
		System.out.printf("Red�� 0x%x�Դϴ�.\n",Color.red); // 16���� ǥ�� %x
		
		
	}

}
