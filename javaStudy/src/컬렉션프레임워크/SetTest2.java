package �÷��������ӿ�ũ;

import java.util.HashSet;
import java.util.Set;

class Fruit {
	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}
	
//	@Override //�ż��� ������
//	public int hashCode() {
//		return name !=null? name.hashCode() : 0;
//	}
//	
//	@Override
//	//Object�� ��� Ŭ������ �θ� Ŭ����
//	public boolean equals(Object obj) { 
//		if(obj instanceof Fruit) { // instanceof Ÿ�� ��
//			Fruit other = (Fruit) obj;
//			String otherFruit = other.name;
//			return otherFruit.equals(this.name);
////			return ((Fruit) obj).name.equals(this.name)
//		}else {
//			return false;
//		}
//	
//	}
	
	@Override
	public String toString() {
		return String.format("Fruit(%s)", name);
	}
}

public class SetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f1 = new Fruit("apple");
		System.out.println(f1);//��ü�� sysout�� ������ �ڵ����� toString �޼��� ȣ��
		
		String name1 = "apple";
		String name2 = new String("apple");
		String name3 = "banana";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		System.out.println(name1.equals(name2));
		
		Set<Fruit> fruitSet = new HashSet<>();
		fruitSet.add(f1);
		fruitSet.add(new Fruit("grape"));
		fruitSet.add(new Fruit("melon"));
		fruitSet.add(new Fruit("apple"));
		System.out.println(fruitSet);
		
	}

}
