package 컬렉션프레임워크;

import java.util.HashSet;
import java.util.Set;

class Fruit {
	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}
	
//	@Override //매세드 재정의
//	public int hashCode() {
//		return name !=null? name.hashCode() : 0;
//	}
//	
//	@Override
//	//Object는 모든 클래스의 부모 클래스
//	public boolean equals(Object obj) { 
//		if(obj instanceof Fruit) { // instanceof 타입 비교
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
		System.out.println(f1);//객체를 sysout에 넣으면 자동으로 toString 메서드 호출
		
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
