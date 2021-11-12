package �������̽�;

public interface Controllable {
	//�߻� �޼��� - �����ΰ� ���� ���� �Ǿ��ִ� �޼���.
	void turnOn();
	void turnOff();
	
	//interface �������� ��밡��
	private void show(String s) {
		System.out.println(s);
	}
	
	//�����ΰ� �ִ� �޼�, Java 8�������� ��밡��
	default void repair() {
		show("��� �����մϴ�.");
	}
	
	static void reset() { //��ü�� ��������, ��ü�� �־�� ��밡�� 
		System.out.println("��� �ʱ�ȭ�մϴ�.");
	}
}
