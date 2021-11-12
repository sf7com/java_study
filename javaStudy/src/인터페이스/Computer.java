package 인터페이스;

public class Computer implements Controllable{ //인터페이승 정의되지 않은 추상메서드를 정의해야 됨.
	int id;

	public Computer(int id) {
		super();
		this.id = id;
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(id +"의 컴퓨터를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(id + "의 컴퓨터를 끕니다.");
		
	}
	

}
