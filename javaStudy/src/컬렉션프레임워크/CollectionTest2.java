package �÷��������ӿ�ũ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CollectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> alphaList = new ArrayList<>();
		for (char ch='A';ch<='Z'; ch++) {
			alphaList.add(ch);
		}
		
//		//����Ʈ ��� ȸ��
//		Collections.rotate(alphaList, -5);
//		System.out.println(alphaList);
//		
//		//����Ʈ ��� ����
//		Collections.shuffle(alphaList);
//		System.out.println(alphaList);
		
		//���� : A-Z���� ���� ���ĺ� ã��
		//(1) A-Z ��� �������� ���
		//  (1-1) ������ ���ĺ� �ϳ��� ���������
		//(2) ����ڿ��� Ű����� �Է¹޾Ƽ� ���� ���ĺ��� ã���� ���� ���
		//  (2-1) �ð����� (�󸶳� ���� �������)
		
		Random rand = new Random();
		int randNum = rand.nextInt(26); //0~25, ����� �ȵ� ���ĺ� �ε���
		int cnt=0;
		Collections.shuffle(alphaList);
		for (int i=0;i<alphaList.size();i++) {
			if(i!=randNum) {
				System.out.print(alphaList.get(i)+" ");
				cnt++;
			}
			//����� 10����, ���� ���Ǵ� ���� 
			if(cnt%10 == 0) {
				System.out.println();
			}
			
		}
		System.out.println();
		long startTime = System.currentTimeMillis();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���� ���ĺ� > ");
			String chStr = sc.nextLine();
			if(chStr.charAt(0)==alphaList.get(randNum)) {
//				System.out.println("�����Դϴ�.");
				long endTime = System.currentTimeMillis();
				long sec = (endTime-startTime)/1000; //�� ȯ��
				System.out.println(sec + "�� ���� ������ϴ�.");
				break;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			
		}
		
	}	

}
