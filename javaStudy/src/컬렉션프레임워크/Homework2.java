package �÷��������ӿ�ũ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) ����Ʈ Ȱ�� ����
		// �Ҽ� ã�� - 2,3,5,7,11,... 1�� �ڱ� �ڽ����� �������� ��
		//1~100���� List�� �����Ѵ�.
		
		//�Ҽ��� �ƴ� ���� �Ҽ��� �������� �� ������ ��������.
		//�Ҽ��� �ƴ� ���� �Ҽ��� �������� �� ������ �������� �ʴ´�.
		//ex) 50 ���� 50������ �Ҽ���� 50�� ������. ������ �������� �Ҽ��� �ƴϴ�.
		List<Integer> primeList = new ArrayList<>();
		primeList.add(2);
		
		for(int i=3; i<=100; i++) {
			boolean isPrime = true;
			//���� i�� ��� �Ҽ�����Ʈ�� �ִ� �Ҽ��� ������ ����.
			//������ �������°� �ϳ��� ������ �Ҽ��� �ƴ�.
			for(var prime : primeList) {
				if(i%prime == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				primeList.add(i);
		}
		System.out.println(primeList);
		System.out.println("1~100������ �Ҽ��� ���� : "+primeList.size());
		
		int[] primeArray = new int[100];
		primeArray[0] = 2;
		int curIdx = 1;//������ ������ �ε�����
		
		for(int i=3; i<100;i++) {
			boolean isPrime = true;
			for(int j=0;j<curIdx;j++) {
				if(i%primeArray[j]==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primeArray[curIdx++] = i;
			}
		}
		System.out.println(Arrays.toString(primeArray));
		System.out.println("1~100���� �Ҽ��� ���� : "+curIdx);
	}

}
