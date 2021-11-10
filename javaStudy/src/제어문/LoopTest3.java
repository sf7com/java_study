package 제어문;

import java.util.Scanner;

public class LoopTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Quiz1 - 정수를 입력받아서 각 자리수의 합을 구하시오.
		//ex) 12345 => 1+2+3+4+5 => 15
		//ex) 679 => 6+7+9 => 22
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오.");
//		int num = sc.nextInt();
//		int total = 0;
//		while(num>0) {
//			total += num%10; //num의 1의 자리 가져오기
//			num /=10; //기존 num을 10으로 나눔
//		}
//		System.out.println(total);
		
		//Quiz2 00:00:00 ~ 23:59:59
		//모든시간 출력
		for(int i=0; i<24;i++) {
			for(int j=0; j<60; j++) {
				for(int x=0; x<60; x++) {
					System.out.printf("%02d:%02d:%02d\n",i,j,x);
				}
			}
		}
		//모든 시간안에 3이 몇개들어 있는지 출력하시오.
		//00:00:03 => 1
		//13:33:34 => 4
		int count3 = 0;
		for(int hour=0; hour<24;hour++) {
			for(int min=0; min<60; min++) {
				for(int sec=0; sec<60; sec++) {
					int tempHour = hour;
					int tempMin = min;
					int tempSec = sec;
					while(tempHour>0) {
						if(tempHour%10==3)
							count3++;
						tempHour /=10;						
					}
					while(tempMin>0) {
						if(tempMin%10==3)
							count3++;
						tempMin /=10;
					}
					while(tempSec>0) {
						if(tempSec%10==3)
							count3++;
						tempSec /=10;
					}
				}
			}
		}
		System.out.println(count3);
		
		
	}

}
