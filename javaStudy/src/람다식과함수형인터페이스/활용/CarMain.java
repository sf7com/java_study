package 람다식과함수형인터페이스.활용;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> diselCars = findCar(Car.cars, c->!c.isGasoline());
		System.out.println("디젤 자동차 = " + diselCars);
		
		var oldCars = findCar(Car.cars, c->c.getAge()>10);
		System.out.println("오래된 자동차 = " + oldCars);
		
		var oldDiselCars = findCar(Car.cars, c->!c.isGasoline() && c.getAge()>10);
		System.out.println("오래된 디젤자동차" + oldDiselCars);
		
		//주행거리가 3만 이하인 자동차 검색
		var under30kCars = findCar(Car.cars, c->c.getMileage()<30000);
		System.out.println("3만 이하 디젤자동차" + under30kCars);
		
		/////////////////////////////////////////////////////////////////////
		System.out.println("디젤 자동차 =");
		printCar(diselCars, c->System.out.printf("%s(%d) ",c.getModel(), c.getAge()));
		
		System.out.println();
		System.out.print("오래된 자동차 = ");
		printCar(oldCars, c->System.out.printf("%s(%d,%d) ",c.getModel(),c.getAge(),c.getMileage()));
		
		printCars(Car.cars, c->c.isGasoline(), c->System.out.println(c));
		
		
		
	}
	//특정 조건의 자동차 객체를 찾아서 List로 반환
	public static List<Car> findCar(List<Car> cars, CarPredicate cp){
		List<Car> result = new ArrayList<>();
		for(var car : cars) {
			if(cp.test(car)) {
				result.add(car);
			}
		}
		return result;
	}
	
	//출력 형태를 람다식을 통해서 다양하게 출력하는 메서드
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
