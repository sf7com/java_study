package 람다식과함수형인터페이스;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;



public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s1 = ()->"apple";
		System.out.println(s1.get());
		
		Random rand = new Random();
		Supplier<Integer> s2 = ()->rand.nextInt(100);
		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println(s2.get());
		
		//날짜관련한 클래스 - 날짜 포맷 지정
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(dateForm.format(new Date())); //new Date(); 현재 날짜와 시각객체
		
		Supplier<String> today = ()->dateForm.format(new Date());
		System.out.println(today.get());
		
		DoubleSupplier s3 = ()->Math.random(); //Math.random() 0~1사이 랜덤한 실수
		System.out.println(s3.getAsDouble());
		System.out.println(s3.getAsDouble());
		
		int num = 0;
		//함수형 인터페이스는 외부 변수의 값을 못바꾼다.
		//외부변수의 값을 참조만 할 수 있다.
//		IntSupplier s4 = ()->num++;
		IntSupplier s4 = ()->num+1;
		System.out.println(s4.getAsInt());
		System.out.println(s4.getAsInt());
		
		//우회적으로 외부변수의 값을 바꿀 수 있다.
		int[] x = {0};
		IntSupplier s5= ()->x[0]++;
		System.out.println(s5.getAsInt());
		System.out.println(s5.getAsInt());
		System.out.println(s5.getAsInt());
		System.out.println(s5.getAsInt());
		
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		IntSupplier s6 = ()->{
			int num2 = numList.get(0);
			numList.set(0,++num2);
			return num2;
		};
		System.out.println(s6.getAsInt());
		System.out.println(s6.getAsInt());
		System.out.println(s6.getAsInt());
		System.out.println(s6.getAsInt());
		System.out.println(numList);
		
		//Quiz
		//랜덤으로 문자열을 출력하는데, 가위,바위,보 중 하나가 문자열, 랜덤으로 출력되도록
		//Supplier 함수형 인터페이스를 완성하시오.
		Supplier<String> rcp = ()->{
			int rNum = rand.nextInt(3);
			return switch(rNum) {
			case 0->"가위";
			case 1->"바위";
			case 2->"보";
			default ->"";			
			};
		};
		System.out.println(rcp.get());
		System.out.println(rcp.get());
		System.out.println(rcp.get());
		System.out.println(rcp.get());
		
		Supplier<String> rcp2 = ()->{
			int rNum = rand.nextInt(3);
			return (rNum==0)? "가위":((rNum==1)?"바위":"보");
		};
		System.out.println(rcp2.get());
		System.out.println(rcp2.get());
		System.out.println(rcp2.get());
		System.out.println(rcp2.get());
		
	}

}
