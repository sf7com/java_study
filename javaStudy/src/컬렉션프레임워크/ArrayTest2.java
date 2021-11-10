package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("홍길동",90);
		Student s2 = new Student("임꺽정");
		s2.setScore(88);
		System.out.println(s1);
		System.out.println(s2);
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(new Student("장동건",99));
		stuList.add(new Student("김태희",78));
		
		System.out.println(stuList);
		
		int total = 0;
		for(Student stu : stuList) {
			total += stu.getScore();
		}
		double avg = total/stuList.size();
		System.out.println("평균값 : "+avg);
		
		//이름이 김씨인 사람의 데이터를 조회
		for(Student stu : stuList) {
			if(stu.getName().startsWith("김")) {
				System.out.println(stu);
			}
		}
		
		//점수가 90점 이하인 학생들 제거
		for (int i=0;i<stuList.size();i++) {
			Student curStu = stuList.get(i);
			if(curStu.getScore() < 90) {
				stuList.remove(i);
			}
		}
		System.out.println(stuList);
		
		stuList.add(new Student("홍",10));
		stuList.add(new Student("홍",20));
		stuList.add(new Student("홍",30));
		stuList.add(new Student("홍",40));
		stuList.add(new Student("고",100));
		stuList.add(new Student("김",20));
		stuList.add(new Student("고",100));
		stuList.add(new Student("김",40));

//		for (int i=0;i<stuList.size();i++) {
//			Student curStu = stuList.get(i);
//			if(curStu.getScore() < 90) {
//				stuList.remove(i);
//			}
//		}
//		System.out.println(stuList);
		
		//반복자를 통한 제거
		Iterator<Student> iter = stuList.iterator();
		while(iter.hasNext()) {
			Student curStu = iter.next();
			if(curStu.getScore() < 90)
				iter.remove(); //현재 참조하고 있는 객체 삭제
		}
		System.out.println(stuList);
	}

}
