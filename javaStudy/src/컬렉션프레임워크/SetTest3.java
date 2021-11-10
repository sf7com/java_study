package 컬렉션프레임워크;

import java.util.HashSet;
import java.util.Set;

public class SetTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2("홍길동", 1, 88);
		Student2 s2 = new Student2("임꺽정", 2, 80);
		Student2 s3 = new Student2("홍길동", 1, 45);
		Student2 s4 = new Student2("임해성", 1, 45);
		
		System.out.println("s1==s2" + s1.equals(s2));
		System.out.println("s1==s3" + s1.equals(s3));
		System.out.println("s1==s4" + s1.equals(s4));
		
		System.out.println(s1.hashCode()); //54151054
		System.out.println(s2.hashCode()); //50523003
		System.out.println(s3.hashCode()); //54151054
		System.out.println(s4.hashCode()); //50828449
		
		Set<Student2> stuSet = new HashSet<>();
		stuSet.add(s1);
		stuSet.add(s2);
		stuSet.add(s3);
		stuSet.add(s4);
		System.out.println(stuSet);
		
	}

}
