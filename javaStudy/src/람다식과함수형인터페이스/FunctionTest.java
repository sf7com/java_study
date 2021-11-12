package 람다식과함수형인터페이스;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntFunction;

import 람다식과함수형인터페이스.활용.Car;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> add2 = x ->x+2;
		System.out.println(add2.apply(10));
		
		Function<Integer, String> numToStr = num -> String.valueOf(num);
		String numStr = numToStr.apply(103);
		System.out.println(numStr);
		
		//기본타입 int를 받아서 double로 출력하는 인터페이스
		IntToDoubleFunction half = x-> x/2.0;
		System.out.println(half.applyAsDouble(5));
	
		//두개의 다른 타입의 객체를 받아서 기본타입 double로 출력하는 인터페이스
		ToDoubleBiFunction<String, Integer> circleArea = 
				(s,i) -> Double.parseDouble(s)*i*i;
		System.out.println(circleArea.applyAsDouble("3.14", 5));
		
		//////////////////////////////////////////////////
		//자동차 객체를 입력받아서 그 객체의 모델명을 리턴해주는 인터페이스
		Function<Car, String> f1 = c->c.getModel();
		//자동차 객체를 입력받아서 그 객체의 연식을 리턴해주는 인터페이스(연식 기본타입 int)
		ToIntFunction<Car> f2 = c->c.getAge();
		for(Car car : Car.cars) {
			System.out.println("("+f1.apply(car)+","+f2.applyAsInt(car)+")");
		}
		double avgAge = avg(Car.cars, c->c.getAge());
		double avgMile = avg(Car.cars, c->c.getMileage());
		System.out.println();
		System.out.println("자동차의 평균 연식 : "+avgAge);
		System.out.println("자동차의 평균 주행거리 : "+avgMile);
		
		
	}
	static public <T> double avg(List<T> list, ToIntFunction<T> f){
		double sum = 0;
		for(var val : list) {
			sum+=f.applyAsInt(val);
		}
		return sum/list.size();
		
	}

}
