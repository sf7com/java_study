package 예외처리;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)배열의 인덱스를 벗어나서 참조할 경우
		int[] array = {0,1,2};
		try {
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[2]);
			System.out.println(array[3]);			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스를 벗어나 참조하였습니다.");
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("계속 실행");
		
		//토큰화시 예외		
		String str = "Pen-is-mightier-than-sword";
		StringTokenizer token = new StringTokenizer(str,"-");//공백을 기준으로 단어를 가져옴
		
		try {
			System.out.println("토큰 개수 : "+token.countTokens());
			while(token.hasMoreTokens()) {
				System.out.println(token.nextToken());
			}
			
			//더이상 가져올 데이터가 없는 경우
			//java.util.NoSuchElementException
			token.nextToken();			
		} catch(NoSuchElementException e) {
			System.out.println("원소가 없습니다.");
		}
		System.out.println("계속 실행");
		
	}

}
