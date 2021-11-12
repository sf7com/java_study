package ���ٽİ��Լ����������̽�;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int�� �Է¹ް� boolean ����ϴ� �Լ��� �������̽�
		IntPredicate even = x -> x%2==0;
		IntPredicate even2 = (int x) -> {return x%2==0;};
		System.out.println(even.test(3));
		System.out.println(even.test(6));
		
		IntPredicate one = x->x==1;
		//or�� ������ or �����ؼ� �Լ����������̽��� ��ȯ
		IntPredicate oneOrEven = one.or(even);
		System.out.println(oneOrEven.test(5)? "1Ȥ�� ¦��":"1�� �ƴ� Ȧ��");
		System.out.println(oneOrEven.test(4)? "1Ȥ�� ¦��":"1�� �ƴ� Ȧ��");
		System.out.println(oneOrEven.test(1)? "1Ȥ�� ¦��":"1�� �ƴ� Ȧ��");
	
		IntPredicate tenGreater = x->x>10;
		IntPredicate tenGreaterNEven = tenGreater.and(even);
		System.out.println(tenGreaterNEven.test(5)?"10���� ũ�鼭 ¦��":"10���� ũ�鼭 ¦���� �ƴ� ���");
		System.out.println(tenGreaterNEven.test(11)?"10���� ũ�鼭 ¦��":"10���� ũ�鼭 ¦���� �ƴ� ���");
		System.out.println(tenGreaterNEven.test(12)?"10���� ũ�鼭 ¦��":"10���� ũ�鼭 ¦���� �ƴ� ���");
		
		IntPredicate tenGreaterNEven2 = x->(x>10)&&(x%2==0); //Integer����Ϸ��� Predicate<Integer> ����ؾ� ��
		IntPredicate oneOrEven2 = x->(x==1)&&(x%2==0);
		//////////////////////////////////////////////////////
		Predicate<String> isJava = x->x.equals("java");
		Predicate<String> isJava2 = (String x)->{return x.equals("java");};
		System.out.println(isJava.test("kava"));
		System.out.println(isJava.test("java"));
		
		//////////////////////////////////////////////////
		BiPredicate<Integer, Integer> compareNum = (x,y)->x>y;
		System.out.println(compareNum.test(2, 3)?"ù ���ڰ� �� Ů�ϴ�.":"�ι�° ���ڰ� �� Ů�ϴ�.");
		
		//////////////////////////////////////////////////
		//Quiz
		//(1) � ���ڿ��� ���̰� 5���� ū�� �Ǻ��ϴ� �Լ����������̽��� ����ÿ�.
		//Predicate ���		
		Predicate<String> isStr = x->x.length()>5;
		System.out.println(isStr.test("hello java")?"���ڿ��� 5���� Ů�ϴ�.":"���ڿ��� 5���� �����ϴ�.");		
		System.out.println(isStr.test("java")?"���ڿ��� 5���� Ů�ϴ�.":"���ڿ��� 5���� �����ϴ�.");		
		
		//(2) �� ���� ���� �������� �Ǻ��ϴ� �Լ��� �������̽��� ����ÿ�.
		//Bipredicate ���
		BiPredicate<Integer, Integer> negNum = (x,y)->x*y < 0;
		System.out.println(negNum.test(2, 3)?"�� ���� ���� ���� �Դϴ�.":"�� ���� ���� ����Դϴ�.");
		System.out.println(negNum.test(-2, 3)?"�� ���� ���� ���� �Դϴ�.":"�� ���� ���� ����Դϴ�.");
		
	}

}
