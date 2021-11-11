package B31Game;

import java.util.Arrays;
import java.util.Scanner;

public class B31Cond1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//User�Է¹�����
		//12,13,14
		//(1-1) 3�� �ʰ��� ���ڸ� �θ���
		int curNum=10; //�� ������ ������ ����
		boolean isRe = false;
		do {
			isRe = false;
			Scanner sc = new Scanner(System.in);
			System.out.print("User[0] ���ӵ� ���� �Է�");
			String inStr = sc.nextLine(); //12,13,14
			String[] strArray = inStr.split(","); //[12,13,14]
			System.out.println(Arrays.toString(strArray));
			
			//(1-1) 3�� �ʰ��� ���ڸ� �θ���
			if(strArray.length > 3 || strArray.length == 0) {
				//�ٽ� �Է¹޾ƾ� ��
				isRe = true;
				System.out.println("���ڸ� 1~3�� ���̷� �Է��ϼ���.");
				continue;
			}
			//(1-2) ���ڰ� �ƴ� ���ڸ� �Է��� ���
			int[] numArray = new int[strArray.length];
			try {
				for(int i=0;i<strArray.length; i++) {
					numArray[i] = Integer.parseInt(strArray[i]);
				}			
			}catch(NumberFormatException e) {
				//�ٽ� �Է¹޾ƾ� �Ѵ�.
				isRe = true;
				System.out.println("���ڰ� �ƴ� ���ڸ� �Է��Ͽ����ϴ�.");
				continue;
			}
			//(1-3) ���ڰ� ���ӵ��� ���� ���
			//�� ���� +1�� ���� ���ڿ� ���ƾ� �Ѵ�
			int beforeNum = curNum; //10
			for(int val : numArray) { //numArray {11,12,15}
				if((beforeNum+1) != val) {
					//���ӵ��� ���� ���
					isRe = true;
					System.out.println("���ӵ��� ���� ���ڸ� �Է��Ͽ����ϴ�.");
					break;
				}
				beforeNum = val;
			}
		}while(isRe);
		
	
	}

}
