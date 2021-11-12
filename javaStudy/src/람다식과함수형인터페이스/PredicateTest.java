package 람다식과함수형인터페이스;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int를 입력받고 boolean 출력하는 함수형 인터페이스
		IntPredicate even = x -> x%2==0;
		IntPredicate even2 = (int x) -> {return x%2==0;};
		System.out.println(even.test(3));
		System.out.println(even.test(6));
		
		IntPredicate one = x->x==1;
		//or은 조건을 or 연산해서 함수형인터페이스로 반환
		IntPredicate oneOrEven = one.or(even);
		System.out.println(oneOrEven.test(5)? "1혹은 짝수":"1이 아닌 홀수");
		System.out.println(oneOrEven.test(4)? "1혹은 짝수":"1이 아닌 홀수");
		System.out.println(oneOrEven.test(1)? "1혹은 짝수":"1이 아닌 홀수");
	
		IntPredicate tenGreater = x->x>10;
		IntPredicate tenGreaterNEven = tenGreater.and(even);
		System.out.println(tenGreaterNEven.test(5)?"10보다 크면서 짝수":"10보다 크면서 짝수가 아닌 경우");
		System.out.println(tenGreaterNEven.test(11)?"10보다 크면서 짝수":"10보다 크면서 짝수가 아닌 경우");
		System.out.println(tenGreaterNEven.test(12)?"10보다 크면서 짝수":"10보다 크면서 짝수가 아닌 경우");
		
		IntPredicate tenGreaterNEven2 = x->(x>10)&&(x%2==0); //Integer사용하려면 Predicate<Integer> 사용해야 함
		IntPredicate oneOrEven2 = x->(x==1)&&(x%2==0);
		//////////////////////////////////////////////////////
		Predicate<String> isJava = x->x.equals("java");
		Predicate<String> isJava2 = (String x)->{return x.equals("java");};
		System.out.println(isJava.test("kava"));
		System.out.println(isJava.test("java"));
		
		//////////////////////////////////////////////////
		BiPredicate<Integer, Integer> compareNum = (x,y)->x>y;
		System.out.println(compareNum.test(2, 3)?"첫 숫자가 더 큽니다.":"두번째 숫자가 더 큽니다.");
		
		//////////////////////////////////////////////////
		//Quiz
		//(1) 어떤 문자열의 길이가 5보다 큰지 판별하는 함수형인터페이스를 만드시오.
		//Predicate 사용		
		Predicate<String> isStr = x->x.length()>5;
		System.out.println(isStr.test("hello java")?"문자열이 5보다 큽니다.":"문자열이 5보다 적습니다.");		
		System.out.println(isStr.test("java")?"문자열이 5보다 큽니다.":"문자열이 5보다 적습니다.");		
		
		//(2) 두 수의 곱이 음수인지 판별하는 함수형 인터페이스를 만드시오.
		//Bipredicate 사용
		BiPredicate<Integer, Integer> negNum = (x,y)->x*y < 0;
		System.out.println(negNum.test(2, 3)?"두 수의 곱은 음수 입니다.":"두 수의 곱은 양수입니다.");
		System.out.println(negNum.test(-2, 3)?"두 수의 곱은 음수 입니다.":"두 수의 곱은 양수입니다.");
		
	}

}
