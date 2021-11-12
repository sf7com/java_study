package �������̽�;

import java.util.ArrayList;
import java.util.List;

interface Animal{
	void sound();
	void old();
	void move(int x, int y);
}

interface Fly {
	void fly(int z);
}

class Dog implements Animal{
	private int age;
	private int xPos, yPos;
	
	public Dog(int age, int xPos, int yPos) {
		super();
		this.age = age;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	@Override
	public void sound() {
		System.out.println("�۸�~!");
	}
	@Override
	public void old() {
		age++;
		
	}
	@Override
	public void move(int x, int y) {
		this.xPos +=x;
		this.yPos +=y;
		System.out.printf("X�������� %d, Y�������� %d��ŭ �̵��߽��ϴ�.\n",x,y);
	}
}

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog(3,10,10);
		Dog dog2 = new Dog(4,5,10);
		Cuckoo cu1 = new Cuckoo(2,1,2,5);
		Cuckoo cu2 = new Cuckoo(3,5,3,9);
		
		dog1.move(10,5);
		dog1.sound();
		moveAnimal(dog1, 10,-4);
		
		List<Animal> animals = new ArrayList<>();
		animals.add(dog1);
		animals.add(dog2);
		animals.add(cu1);
		animals.add(cu2);
		//��� ������ ���� �ѻ� ����. 
		for(var ani : animals) {
			ani.old();			
		}
		
		//��� ������ 2,5 ��ŭ �̵� 
		for(var ani : animals) {
			moveAnimal(ani,2,5);			
		}
		
		//��� ���� �� �� �� �ִ� ���� �̵�
		for(var ani : animals) {
			ani.move(2, 5);
			if(ani instanceof Fly) { //instanceof Ÿ��üũ
				((Fly)ani).fly(5);							
			}
		}
		
		
		
	}
	public static void moveAnimal(Animal animal,int x, int y) {
		animal.move(x, y);
		
	}

}
class Cuckoo implements Animal,Fly{
	private int age;
	private int xPos, yPos, zPos;
	public Cuckoo(int age, int xPos, int yPos, int zPos) {
		super();
		this.age = age;
		this.xPos = xPos;
		this.yPos = yPos;
		this.zPos = zPos;
	}
	@Override
	public void sound() {
		System.out.println("����~!");
	}
	@Override
	public void old() {
		age++;
		
	}
	@Override
	public void move(int x, int y) {
		this.xPos +=x;
		this.yPos +=y;
		System.out.printf("X�������� %d, Y�������� %d��ŭ �̵��߽��ϴ�.\n",x,y);
	}
	@Override
	public void fly(int z) {
		this.zPos +=z;
		System.out.printf("Z�������� %d��ŭ �̵��߽��ϴ�.\n",z);
	}
}
