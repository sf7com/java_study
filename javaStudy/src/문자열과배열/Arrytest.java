package 문자열과배열;

public class Arrytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법1
		//인덱스          0, 1, 2, 3, 4
		int[] score = {100,90,50,95,85};
		//방법2
		int[] score1 = new int[] {100,90,50,95,85};
		//방법3
		int[] score2;
		score2 = new int[] {100,90,50,95,85};
		//방법4 오류
		int[] score3;
//		score3= {100,90,50,95,85};
		
		//인덱스
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		
		//배열 크기
		System.out.println(score.length); //5
		
		//배열 값 수정
		score[0] = 99;
		System.out.println(score[0]);
		
		//배열의 초기값을 넣지 않고 배열의 크기만 할당해서 선언
		int[] scores2 = new int[3];//0으로 초기화
		System.out.println(scores2[0]);
		System.out.println(scores2[1]);
		System.out.println(scores2[2]);
		//배열의 크기를 벗어나서 인덱스 참조는 오류
//		System.out.println(scores2[3]);//오류
		//배열은 선언시 크기가 고정이 됨.배열의 크기는 못바꾼다.
		System.out.println(scores2.length);
		
		scores2[0] = 10;
		scores2[1] = 60;
		scores2[2] = 88;
		int total=0;
		for(int i=0; i<scores2.length;i++) { //배열의 모든 값을 참조 한다.
			System.out.println(scores2[i]);
			total += scores2[i];
		}
		double avg = total/scores2.length;
		System.out.printf("scores2의 평균값은 %.2f 입니다.\n",avg);

		//(1) 배열의 짝수 인덱스의 값을 3만큼 더하시오.
		int[] ary1 = {10,20,30,40};
		for(int i=0; i<ary1.length;i++) { //4번반복, 인덱싱을 통한 접근
			if(i%2 == 0)
				ary1[i]+=3;
		}
		for(int i=0; i<ary1.length;i+=2) { //2번 반복
			ary1[i]+=3;
		}
		
		//for-each 구문 : 배열의 모든 요소를 참조할때 활용
		for(int val : ary1) {    // 배열을 편하게 이용하기 위해서 기능 생김,배열의 모든 요소의 값을 갖고 싶을때만 사용
			System.out.print(val+","); // 인덱싱이 불가함.
		}
		System.out.println();
		//for-each 구문으로 배열의 평균값을 구하기
		total = 0;
		for(int val : ary1) {
			total+=val;
		}
		avg = total/ary1.length;
		System.out.printf("score2의 평균값은 %.2f입니다.",avg);
	}
	

}
