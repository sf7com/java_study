package 람다식과함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import 람다식과함수형인터페이스.활용.Car;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntUnaryOperator add2 = x->x+2;
		System.out.println(add2.applyAsInt(10));
		
		IntBinaryOperator add = (x,y) -> x+y;
		System.out.println(add.applyAsInt(10, 30));
		
		UnaryOperator<String> o1 = s->s.substring(0,1);
		System.out.println(o1.apply("apple"));
		
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		//numList의 모든 요소의 값을 10씩 증가
		numList.replaceAll(n->n+10); //
		System.out.println(numList);
		numList.replaceAll(n->n*10); //
		System.out.println(numList);
		
		List<String> fruits = new ArrayList();
		fruits.add("apple");
		fruits.add("grape");
		fruits.add("banana");
		fruits.replaceAll(s->s.toUpperCase()); //전체 대문자
		fruits.replaceAll(s->s.substring(0,1).toUpperCase()+s.substring(1)); //첫글자만 대문자
		System.out.println(fruits);
		
		//과일 List에 모든 요소에
		//1_apple
		//2_grape
		//3_banana
//		fruits.replaceAll(s->"1_"+s);
		int[] num= {0};
		fruits.replaceAll(s->++num[0]+"_"+s);
		System.out.println(fruits);
		
		List<Car> newCars = remodeling(Car.cars, c->new Car("뉴"+c.getModel(),c.isGasoline(),0,0));
		System.out.println(newCars);
		
	}
	public static <T> List<T> remodeling(List<T> list, UnaryOperator<T> o){
		List<T> result = new ArrayList<>();
		for(var val : list) {
			result.add(o.apply(val));
		}
		return result;
	}

}
