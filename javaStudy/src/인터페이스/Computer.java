package �������̽�;

public class Computer implements Controllable{ //�������̽� ���ǵ��� ���� �߻�޼��带 �����ؾ� ��.
	int id;

	public Computer(int id) {
		super();
		this.id = id;
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(id +"�� ��ǻ�͸� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(id + "�� ��ǻ�͸� ���ϴ�.");
		
	}
	

}
