package B31Game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import ���ڿ����迭.Arrytest;

//N���� ����� (N�� 2~5 ���ڷ� �����Ѵ�.)
//�ִ� User0~User4 - User0(��), ������ ��ǻ��

//����
//�� ������ �� ������ ���ڸ� �̾ ����Ѵ�.
//�� ������ ���ڸ� �ִ� 3������ ����� �� �ִ�.
//������ 31�� ���ڸ� ����� �� �ۿ� ���� ������ ����.

//���α׷� �߰� ����
//(1) User0�� Ű����� �Է¹��� �� ���ڸ� �߸��Է��� ��� �ٽ� �Է��ϵ��� �Ѵ�.
// (1-1) 3�� �ʰ��� ���ڸ� �θ� ���
// (1-2) ���ڰ� �ƴ� ���ڸ� �Է��� ���
// (1-3) ���ڰ� ���ӵ��� ���� ���

//(2) 31��ó�� ���� ���� ��� 29�� ���� ���ʹ� ��ǻ�Ͱ� 31�� (29,30,31)
//    ������ ���� �ʵ��� ���α׷� �����Ѵ�.
//(3) ���� ���÷��̰� �ǵ��� �Ѵ�. (���� ���� ���� -> ���� ���� �����ֱ�)

public class B31Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNum=3; //���� User��
		int curUser=0; //���� User Idx
		int curNum=0; //user�� �θ� ������ ���ڰ�		
//		String str = "1,2,3";
//		String[] strAry = str.split(","); //split "," �������� ������ strAry�� �����ϴ� �޼���
//		System.out.println(Arrays.toString(strAry));
		
		while(true) {		
		//(1) ���� ������ ���� �Է¹޴´�.
		curNum = getCurUserVal(curUser, curNum);
		//(2) ���� ������ ���� 31�̻��̸� ���� ����
		if(curNum >= 31) {
			System.out.printf("User[%d]�� �й��߽��ϴ�.\n",curUser);
			break;
		}
		//(3) ���� ������ ���� ������ �ٲٰ� (1)�� �ݺ��Ѵ�.
		curUser++;
		if(curUser>=userNum)
			curUser=0;
		}
	}

	private static int getCurUserVal(int curUser, int curNum) {
		// TODO Auto-generated method stub
		// (1-1) 3�� �ʰ��� ���ڸ� �θ� ���
		// (1-2) ���ڰ� �ƴ� ���ڸ� �Է��� ���
		// (1-3) ���ڰ� ���ӵ��� ���� ���
		String userValStr = "";
		if(curUser == 0) {
			//Ű���� �Է�
			Scanner sc = new Scanner(System.in);
			System.out.print("���ӵ� ���� �Է� >");
			String inStr = sc.nextLine(); //11,12,13
			var strArray = inStr.split(","); //[11,12,13], var=>String�� �迭
			if(strArray.length >3) {
				System.out.print("�Էµ� ���� ���� �ʰ�, �ٽ� ���ӵ� ���� 3�� �Է� >");
				inStr = sc.nextLine(); //11,12,13
			}
			try {
				int lastUserVal = Integer.parseInt(strArray[strArray.length-1]);
				userValStr = inStr;
				
			}catch
			System.out.printf("User[%d] : %s \n",curUser,userValStr);
			return lastUserVal;
		}else {
			//��ǻ��, ������
			//�����ȣ 28, �ִ� 2�� �� �� ����.
			//�����ȣ 29, �ִ� 1�� �� �� ����.
			//�����ȣ 30, �ִ� 1�� �� �� ����.
			int rLimit = 3;
			if(curNum == 28) {
				rLimit = 2;				
			}else if(curNum == 29 || curNum==30) {
				rLimit = 1;
			}
			Random rand = new Random();
			int num = rand.nextInt(rLimit)+1; //1~3 �� ����
			for(int i=0; i<num; i++) {
				userValStr += (curNum+i+1)+"";
				if(i!=num-1)
					userValStr +=",";
			}
			System.out.printf("User[%d] : %s \n",curUser,userValStr);
			return curNum+num;
		}

	}

}
