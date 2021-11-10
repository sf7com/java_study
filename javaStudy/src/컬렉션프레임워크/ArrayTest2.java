package �÷��������ӿ�ũ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("ȫ�浿",90);
		Student s2 = new Student("�Ӳ���");
		s2.setScore(88);
		System.out.println(s1);
		System.out.println(s2);
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(new Student("�嵿��",99));
		stuList.add(new Student("������",78));
		
		System.out.println(stuList);
		
		int total = 0;
		for(Student stu : stuList) {
			total += stu.getScore();
		}
		double avg = total/stuList.size();
		System.out.println("��հ� : "+avg);
		
		//�̸��� �达�� ����� �����͸� ��ȸ
		for(Student stu : stuList) {
			if(stu.getName().startsWith("��")) {
				System.out.println(stu);
			}
		}
		
		//������ 90�� ������ �л��� ����
		for (int i=0;i<stuList.size();i++) {
			Student curStu = stuList.get(i);
			if(curStu.getScore() < 90) {
				stuList.remove(i);
			}
		}
		System.out.println(stuList);
		
		stuList.add(new Student("ȫ",10));
		stuList.add(new Student("ȫ",20));
		stuList.add(new Student("ȫ",30));
		stuList.add(new Student("ȫ",40));
		stuList.add(new Student("��",100));
		stuList.add(new Student("��",20));
		stuList.add(new Student("��",100));
		stuList.add(new Student("��",40));

//		for (int i=0;i<stuList.size();i++) {
//			Student curStu = stuList.get(i);
//			if(curStu.getScore() < 90) {
//				stuList.remove(i);
//			}
//		}
//		System.out.println(stuList);
		
		//�ݺ��ڸ� ���� ����
		Iterator<Student> iter = stuList.iterator();
		while(iter.hasNext()) {
			Student curStu = iter.next();
			if(curStu.getScore() < 90)
				iter.remove(); //���� �����ϰ� �ִ� ��ü ����
		}
		System.out.println(stuList);
	}

}
