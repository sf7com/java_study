package javaStudy;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A'; //char Ÿ�� ���� �ϳ��� ����. Ȧ����ǥ'' ������
		char c2 = 65;
		System.out.println(c1);
		System.out.println(c2);
		//char c3="A"; //����, ""�� ���ڿ�(���� ������)
//		System.out.println(c1+1); //66
//		System.out.println((char)(c1+1)); //B
//		System.out.println((char)(c1+2)); //C
//		System.out.println((char)(c1+3)); //D
//		System.out.println((char)(c1+4)); //E
//		System.out.println((char)(c1+5)); //F
//		System.out.println((char)(c1+6)); //G
//		System.out.println((char)(c1+7)); //H
//		System.out.println((char)(c1+8)); //I
		String str1 = "apple";
		System.out.println(str1);
		String str2 = "pie";
		System.out.println(str1+str2);
		
		//�ݺ���
//		for(int i=0; i<10; i++) {
//			System.out.println((char)(c1+i));
//		}
		// �빮�� A�� �ҹ��� a�� �ٲ۴�.
		System.out.println((char)(c1+32)); //a
	}

}
