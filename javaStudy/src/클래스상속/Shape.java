package Ŭ�������;
//�߻� �޼��尡 �ϳ��� ������ �߻� Ŭ������ �ȴ�.
public abstract class Shape { //abstract �߻�Ŭ����
	//���� id
	private int id;
	
	public Shape(int id) {
		super();
		this.id = id;
	}

	//����
	//�߻� �޼��� : �����θ� �ٷ� �ȸ��� �ȴ�.
	public abstract double getArea(); //abstract �߻� �޼���
	
	public void printId() {
		System.out.println("ID[" + id + "]");
	}
}
