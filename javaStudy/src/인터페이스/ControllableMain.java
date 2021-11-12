package 인터페이스;

import java.util.ArrayList;
import java.util.List;

public class ControllableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com1 = new Computer(1);
		Computer com2 = new Computer(2);
		TV tv1 = new TV(3);
		TV tv2 = new TV(4);
		
		com1.turnOn();
		com1.turnOff();
		tv1.turnOn();
		tv1.turnOff();
		
		
		List<Controllable> cList = new ArrayList<>(); //클래스가 서로 다른 객체들도 인터페이스 상속으로 List에 넣을 수 있다.
		cList.add(tv1);
		cList.add(tv2);
		cList.add(com1);
		cList.add(com2);
	
		for(var product : cList) {
			product.turnOn();
		}
		for(var product : cList) {
			product.turnOff();
		}
		for(var product : cList) {
			product.repair();
		}
		
		
	}

}
