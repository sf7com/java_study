package 람다식과함수형인터페이스.활용;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var cars = Car.cars;
		
		System.out.println(cars);
		
		//오름차순
		Comparator<Car> modelCom = Comparator.comparing(Car::getModel);
		//Collections.sort(cars,modelCom);
		Collections.sort(cars,(c1,c2)->c1.getModel().compareTo(c2.getModel()));
		System.out.println(cars);
		
		//내림차순
		Collections.sort(cars,modelCom.reversed());
		System.out.println(cars);
		Collections.sort(cars,(c1,c2)->c2.getModel().compareTo(c1.getModel()));
		System.out.println(cars);
		
		////////////////////////////////////////////////////////////
		//마일리지 기준 정렬
		Collections.sort(cars,Comparator.comparingInt(Car::getMileage)); //int,double,long 구분해야 함.
		System.out.println(cars);
		
		Collections.sort(cars, (c1,c2)->c2.getMileage()-c1.getMileage()); //람다식함수 많이 사용 예제(정렬)
		System.out.println(cars);
		
		///////////////////////////////////////////////////////////
		//null이 가장 먼저 정렬하겠다.
		Car[] carsArray = cars.toArray(new Car[cars.size()+1]);
		System.out.println(Arrays.toString(carsArray));
		
		Comparator<Car> modelComparatorNullFirst = Comparator.nullsFirst(modelCom);
		Arrays.sort(carsArray,modelComparatorNullFirst);
		System.out.println(Arrays.toString(carsArray));
		
		Comparator<Car> modelComparatorNullLast = Comparator.nullsLast(modelCom);
		Arrays.sort(carsArray,modelComparatorNullLast);
		System.out.println(Arrays.toString(carsArray));
		
		////////////////////////////////////////////////////////
		//정렬기준 결합
		Comparator<Car> modelNAgeCom = modelCom.thenComparing(Car::getAge);
		Collections.sort(cars,modelNAgeCom);
		System.out.println(cars);
	}

}
