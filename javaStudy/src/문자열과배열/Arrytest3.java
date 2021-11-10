package 문자열과배열;

public class Arrytest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3과목(국어,영어,수학)의 5명의 학생의 점수
		int[][] scores = {
			//    s1 s2 s3 s4 s5
				{100,90,50,98,43}, //국어
				{70,60,82,75,98},  //영어
				{30,77,65,23,80}}; //수학
		
		//s1학생의 평균점수
		int total1 = scores[0][0]+scores[1][0]+scores[2][0];
		double avg1 = total1/3;
		System.out.printf("s1 학생의 평균점수 : %.2f\n",avg1);
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		//각 학생들의 평균점수 출력
		double[] stuAvgAry = new double[scores[0].length];
		for(int col=0;col<scores[0].length;col++) {
			int total = 0;
			double avg = 0;
			for(int row=0;row<scores.length;row++) {
				total+=scores[row][col];
			}
			avg = total/scores.length;
			stuAvgAry[col]=avg;
			System.out.printf("%d번 학생의 평균점수는 %.2f입니다.\n",col+1,avg);
		}
		//반 평균
		double classTotal = 0;
		for(double avg : stuAvgAry) {
			classTotal += avg;
		}
		double classAvg = classTotal/stuAvgAry.length;
		System.out.printf("반평균값 : %.2f\n", classAvg);
		
		//과목별 평균
		double[] subAvgAry = new double[scores.length];
		for(int row=0;row<scores.length;row++) {
			int total = 0;
			double subAvg = 0;
			for(int col=0;col<scores[0].length;col++) {
				total+=scores[row][col];
			}
			subAvg = total/scores[0].length;
			subAvgAry[row]=subAvg;
			System.out.printf("%d번 과목의 평균점수는 %.2f입니다.\n",row+1,subAvgAry[row]);
		}
	}

}
