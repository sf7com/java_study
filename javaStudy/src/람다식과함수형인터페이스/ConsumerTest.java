package ���ٽİ��Լ����������̽�;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;

import ���ٽİ��Լ����������̽�.Ȱ��.Car;


public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c1 = str->System.out.println(str.toLowerCase());
		c1.accept("Java Functional Interface");
		
		BiConsumer<String, String> c2 = (x,y)->System.out.println(x+":"+y);
		c2.accept("java", "python");
		
		BiConsumer<String, Integer> c3 = (x,y)->System.out.println(x.repeat(y));
		c3.accept("java ", 5);
		
		//Ŭ����Ÿ�� �ϳ��� int(�⺻Ÿ��) �� 2���� �Է����� �޴´�.
		ObjIntConsumer<String> c4 = (str,i)->System.out.println(Integer.parseInt(str)+i);
		c4.accept("33", 10);
		
		ObjIntConsumer<String> c5 = (str,i)->{
			try {
				System.out.println(Integer.parseInt(str)+i);
			}catch(Exception e) {
				System.out.println("���ڿ� ������ �ùٸ��� �ʽ��ϴ�.");
			}
		};
		c5.accept("aa", 10);
		c5.accept("33", 10);
		////////////////////////////////////////////////////
		IntConsumer c6 = x->System.out.printf("%d * %d = %d\n",x,x,x*x);
		IntConsumer c7 = x->System.out.printf("%d + %d = %d\n",x,x,x+x);
		c6.andThen(c7).accept(10);
		///////////////////////////////////////////////////
		printCondList(Car.cars,s->s.getAge()>10, s->System.out.printf("(%s,%d)",s.getModel(),s.getAge()));
	
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println();
		printCondList(numList, num->num%2==0, x->System.out.print(x+","));
		
		//Quiz
		//(1) ���ڿ��� �Է¹޾Ƽ� ���ڿ��� ù���ڸ� �빮�ڷ� ����ϴ� Consumer �������̽��� ����ÿ�.
		//ex) apple => Apple
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�.>");
		String inStr = sc.nextLine();
		
		Consumer<String> upC1 = str->System.out.println(inStr.substring(0,1).toUpperCase()+inStr.substring(1));
		upC1.accept("java");
		
	}
	
//	static public void printCondList(List<Car> list, Predicate<Car> pred, Consumer<Car> cons) {
//		
//		for(var val : list) {
//			if(pred.test(val)) {
//				cons.accept(val);
//			}
//		}
//	}
	public static <T> void printCondList(List<T> list, Predicate<T> pred, Consumer<T> cons) {
		
		for(var val : list) {
			if(pred.test(val)) {
				cons.accept(val);
			}
		}
	}

}
