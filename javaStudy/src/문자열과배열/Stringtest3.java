package 문자열과배열;

public class Stringtest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)3,6,9 - 1~100까지 숫자중 3,6,9 간 숫자는 짝으로 출력
		//ex)1,2,짝,4,5,짝,....(33,36같은 숫자들은 짝짝)
		//(1) 1~100까지의 숫자 범위를 만든다.
		//(2) 각 수자별 3 또는 6 또는 9의 개수를 얻는다.
		//(3) 개수에 따라 숫자를 출력한다.
		// (3-1) 개수가 0보다 크면 개수만큼 짝을 출력한다.
		// (3-1) 개수가 0이면 숫자 그대로 출력한다.
		for (int i=1; i<=100; i++) {
			String tempStr1 = String.valueOf(i);
			int temp1=0;
			for(int j=0; j<tempStr1.length(); j++) {
				char curCh = tempStr1.charAt(j);
				if(curCh=='3'|| curCh=='6'||curCh=='9')
					temp1++;
				}
			if(temp1==1)
				System.out.print("짝");
			else if(temp1==2)
				System.out.print("짝짝");
			else
				System.out.print(i);
			System.out.print(",");
		}
		System.out.println();
		
		for(int num=1;num<=100;num++) {
			int cnt = 0;
			String numStr = String.valueOf(num);
			cnt = getCharSum(numStr,'3')+getCharSum(numStr,'6')+getCharSum(numStr,'9');
			if(cnt>0) {
				System.out.print("짝".repeat(cnt));//repeat 개수만큼 "짝"을 반복 출력
			}else 
				System.out.print(numStr);
			System.out.print(",");
		}
	}
	
	public static int getCharSum(String inStr, char inChr) {
		int result=0;
			for (int i=0;i<inStr.length();i++) {
				if(inStr.charAt(i) == inChr)
					result++;
			}
		return result;
	}
	
}
