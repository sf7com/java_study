package �������̽�;

public class TV implements Controllable{
	int id;

	public TV(int id) {
		super();
		this.id = id;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(id+"�� TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(id+"�� TV�� ���ϴ�.");
				
	}
	@Override
	public void repair() {
		System.out.println(id+"�� TV�� �����մϴ�.");
	
	}
}
