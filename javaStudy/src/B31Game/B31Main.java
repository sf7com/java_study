package B31Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

class GameData{ // ������ ���� �뵵�� Ŭ���� Ȱ��
	int userIdx; //���� ID ex) 0
	String userValStr; //������ �� ��, ex) 11,12,13
	int lastVal; //������ �� ������ ��, ex) 13
	
	public GameData(int userIdx, String userValStr, int lastVal) {
		super();
		this.userIdx = userIdx;
		this.userValStr = userValStr;
		this.lastVal = lastVal;
	}
	
}

public class B31Main {
	static List<GameData> gameDataList = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("B31 ������ �����մϴ�.");
		System.out.print("�÷��̾�� �Է�>");
		int userNum= sc.nextInt(); //���� User��
		int curUser=0; //���� User Idx
		int curNum=0; //user�� �θ� ������ ���ڰ�		
//		String str = "1,2,3";
//		String[] strAry = str.split(","); //split "," �������� ������ strAry�� �����ϴ� �޼���
//		System.out.println(Arrays.toString(strAry));
		
		while(true) {		
			// (1) ���� ������ ���� �Է¹޴´�.
			curNum = getCurUserVal(curUser, curNum);
			// (2) ���� ������ ������ ���� 31�̻��̸� ���� ����
			if (curNum >= 31) {
				System.out.printf("User[%d]�� �й��߽��ϴ�.\n", curUser);
				break;
			}
			// (3) ���� ������ ���� ������ �ٲٰ� (1)�� �ݺ��Ѵ�.
			curUser++;
			if (curUser >= userNum)
				curUser = 0;
		}
		System.out.println("< ���� ���÷��̸� ���ðڽ��ϱ�? 1)��, 2)�ƴϿ� >");

		int reNum = sc.nextInt();
		if(reNum == 1) {
			for(var gameData : gameDataList) {
				int userIdx = gameData.userIdx;
				String userValStr = gameData.userValStr;
				int lastVal = gameData.lastVal;
				System.out.printf("User[%d] : %s\n",userIdx,userValStr);
				if(lastVal >=31) {
					System.out.printf("User[%d]�� �й��Ͽ����ϴ�.\n",userIdx);
				}
				
			}
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
			boolean isRe = false;
			int lastUserVal=0;
			do {
				isRe = false;
				Scanner sc = new Scanner(System.in);
				System.out.print("User[0] ���ӵ� ���� �Է�");
				String inStr = sc.nextLine(); //12,13,14
				String[] strArray = inStr.split(","); //[12,13,14]
				System.out.println(Arrays.toString(strArray));
				userValStr = inStr;
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
				lastUserVal = numArray[numArray.length-1];
			}while(isRe);
			
			System.out.printf("User[%d] : %s \n",curUser,userValStr);
			
			gameDataList.add(new GameData(curUser,userValStr,lastUserVal));
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
			gameDataList.add(new GameData(curUser,userValStr,curNum+num));
			return curNum+num;
		}

	}

}
