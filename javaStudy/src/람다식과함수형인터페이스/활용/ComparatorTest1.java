package ���ٽİ��Լ����������̽�.Ȱ��;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var cars = Car.cars;
		
		System.out.println(cars);
		
		//��������
		Comparator<Car> modelCom = Comparator.comparing(Car::getModel);
		//Collections.sort(cars,modelCom);
		Collections.sort(cars,(c1,c2)->c1.getModel().compareTo(c2.getModel()));
		System.out.println(cars);
		
		//��������
		Collections.sort(cars,modelCom.reversed());
		System.out.println(cars);
		Collections.sort(cars,(c1,c2)->c2.getModel().compareTo(c1.getModel()));
		System.out.println(cars);
		
		////////////////////////////////////////////////////////////
		//���ϸ��� ���� ����
		Collections.sort(cars,Comparator.comparingInt(Car::getMileage)); //int,double,long �����ؾ� ��.
		System.out.println(cars);
		
		Collections.sort(cars, (c1,c2)->c2.getMileage()-c1.getMileage()); //���ٽ��Լ� ���� ��� ����(����)
		System.out.println(cars);
		
		///////////////////////////////////////////////////////////
		//null�� ���� ���� �����ϰڴ�.
		Car[] carsArray = cars.toArray(new Car[cars.size()+1]);
		System.out.println(Arrays.toString(carsArray));
		
		Comparator<Car> modelComparatorNullFirst = Comparator.nullsFirst(modelCom);
		Arrays.sort(carsArray,modelComparatorNullFirst);
		System.out.println(Arrays.toString(carsArray));
		
		Comparator<Car> modelComparatorNullLast = Comparator.nullsLast(modelCom);
		Arrays.sort(carsArray,modelComparatorNullLast);
		System.out.println(Arrays.toString(carsArray));
		
		////////////////////////////////////////////////////////
		//���ı��� ����
		Comparator<Car> modelNAgeCom = modelCom.thenComparing(Car::getAge);
		Collections.sort(cars,modelNAgeCom);
		System.out.println(cars);
	}

}
