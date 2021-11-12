package ���ٽİ��Լ����������̽�.Ȱ��;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> diselCars = findCar(Car.cars, c->!c.isGasoline());
		System.out.println("���� �ڵ��� = " + diselCars);
		
		var oldCars = findCar(Car.cars, c->c.getAge()>10);
		System.out.println("������ �ڵ��� = " + oldCars);
		
		var oldDiselCars = findCar(Car.cars, c->!c.isGasoline() && c.getAge()>10);
		System.out.println("������ �����ڵ���" + oldDiselCars);
		
		//����Ÿ��� 3�� ������ �ڵ��� �˻�
		var under30kCars = findCar(Car.cars, c->c.getMileage()<30000);
		System.out.println("3�� ���� �����ڵ���" + under30kCars);
		
		/////////////////////////////////////////////////////////////////////
		System.out.println("���� �ڵ��� =");
		printCar(diselCars, c->System.out.printf("%s(%d) ",c.getModel(), c.getAge()));
		
		System.out.println();
		System.out.print("������ �ڵ��� = ");
		printCar(oldCars, c->System.out.printf("%s(%d,%d) ",c.getModel(),c.getAge(),c.getMileage()));
		
		printCars(Car.cars, c->c.isGasoline(), c->System.out.println(c));
		
		
		
	}
	//Ư�� ������ �ڵ��� ��ü�� ã�Ƽ� List�� ��ȯ
	public static List<Car> findCar(List<Car> cars, CarPredicate cp){
		List<Car> result = new ArrayList<>();
		for(var car : cars) {
			if(cp.test(car)) {
				result.add(car);
			}
		}
		return result;
	}
	
	//��� ���¸� ���ٽ��� ���ؼ� �پ��ϰ� ����ϴ� �޼���
	public static void printCar(List<Car> cars, CarConsumer cc) {
		for(var car : cars) {
			cc.apply(car);
		}
	}
	
	public static void printCars(List<Car> cars, CarPredicate cp, CarConsumer cc) {
		for(var car : cars) {
			if(cp.test(car))
				cc.apply(car);
		}
	}
	
}
