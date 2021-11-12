package 인터페이스;

public class TV implements Controllable{
	int id;

	public TV(int id) {
		super();
		this.id = id;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(id+"의 TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(id+"의 TV를 끕니다.");
				
	}
	@Override
	public void repair() {
		System.out.println(id+"의 TV를 수리합니다.");
	
	}
}
