package ���;

public class LoopHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ 3�ܱ��� �迭�� ���
//			for(int i=2; i<10; i+=3) {
//				for(int j=1; j<4; j++) {
//					for(int k=0; k<3; k++) {
//						if((i+k)!=10)
//						System.out.printf("%d X %d = %d\t",(i+k),j,(i+k)*j);	
//					}
//					System.out.println("");
//				}
//				System.out.println("");
//			}
				
		////////////////////////////////////////////////////////////////////
		//(1) ���� �ٱ� for�� - �������� ù��° ��
		for(int i=2; i<=8; i+=3) {
			//i ���� : 2,5,8
			//�� 3�� �ݺ�
			for(int k=1; k<=3; k++) {
				//k ���� : 1,2,3 ���ϱ� ���ڸ�
				//�� 3�� �ݺ�
				for(int j=i; j<=i+2; j++) {
					//j ���� : i, i+1, i+2 - ���ϱ��� ù°�ڸ�
					//�� 3�� �ݺ�
					if(j!=10)
					System.out.printf("%dX%d=%d\t",j,k,j*k);
				}
				System.out.println();
			}
			System.out.println();
		}
				
	}

}
