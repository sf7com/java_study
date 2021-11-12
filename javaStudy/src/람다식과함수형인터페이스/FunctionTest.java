package ���ٽİ��Լ����������̽�;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntFunction;

import ���ٽİ��Լ����������̽�.Ȱ��.Car;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> add2 = x ->x+2;
		System.out.println(add2.apply(10));
		
		Function<Integer, String> numToStr = num -> String.valueOf(num);
		String numStr = numToStr.apply(103);
		System.out.println(numStr);
		
		//�⺻Ÿ�� int�� �޾Ƽ� double�� ����ϴ� �������̽�
		IntToDoubleFunction half = x-> x/2.0;
		System.out.println(half.applyAsDouble(5));
	
		//�ΰ��� �ٸ� Ÿ���� ��ü�� �޾Ƽ� �⺻Ÿ�� double�� ����ϴ� �������̽�
		ToDoubleBiFunction<String, Integer> circleArea = 
				(s,i) -> Double.parseDouble(s)*i*i;
		System.out.println(circleArea.applyAsDouble("3.14", 5));
		
		//////////////////////////////////////////////////
		//�ڵ��� ��ü�� �Է¹޾Ƽ� �� ��ü�� �𵨸��� �������ִ� �������̽�
		Function<Car, String> f1 = c->c.getModel();
		//�ڵ��� ��ü�� �Է¹޾Ƽ� �� ��ü�� ������ �������ִ� �������̽�(���� �⺻Ÿ�� int)
		ToIntFunction<Car> f2 = c->c.getAge();
		for(Car car : Car.cars) {
			System.out.println("("+f1.apply(car)+","+f2.applyAsInt(car)+")");
		}
		double avgAge = avg(Car.cars, c->c.getAge());
		double avgMile = avg(Car.cars, c->c.getMileage());
		System.out.println();
		System.out.println("�ڵ����� ��� ���� : "+avgAge);
		System.out.println("�ڵ����� ��� ����Ÿ� : "+avgMile);
		
		
	}
	static public <T> double avg(List<T> list, ToIntFunction<T> f){
		double sum = 0;
		for(var val : list) {
			sum+=f.applyAsInt(val);
		}
		return sum/list.size();
		
	}

}
