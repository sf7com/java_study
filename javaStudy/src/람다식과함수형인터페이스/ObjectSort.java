package 람다식과함수형인터페이스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Rect2 implements Comparable<Rect2>{
	int hSize,vSize;
	public Rect2(int hSize, int vSize) {
		super();
		this.hSize = hSize;
		this.vSize = vSize;
	}
	int getArea() {
		return hSize*vSize;
	}
	
	@Override
	public String toString() {
		return "사각형 [가로=" + hSize + ", 세로=" + vSize + "]";
	}
	//두객체 비교 메서드(오름차순 기준)
	//양수이면 자기자신 객체가 크다.(List나 배열에서 자리를 바꾼다.)
	//음수이면 다른 객체가 크다.(List나 배열에서 자리를 안바꾼다.)
	//0이면 객체의 크기가 같다.(List나 배열에서 자리를 안바꾼다.)
	@Override
	public int compareTo(Rect2 o) { //정렬 기준이 추가될 때마다 계속 수식 추가해야 함.
		return getArea()-o.getArea();
	}
}

public class ObjectSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect2 r1 = new Rect2(10,5);
		Rect2 r2 = new Rect2(3,8);
		Rect2 r3 = new Rect2(7,6);

		Rect2[] rects = {r1,r2,r3};
		
		//정렬 전
		for(var r : rects) {
			System.out.println(r);
		}
		
		Arrays.sort(rects);
		System.out.println("-".repeat(30));
		//정렬 후
		for(var r : rects) {
			System.out.print(r);
			System.out.println(r.getArea());
		}
		
		List<Rect2> rList = new ArrayList<>();
		rList.add(r1);
		rList.add(r2);
		rList.add(r3);
		System.out.println(rList);
		Collections.sort(rList);
		System.out.println(rList);
		
		
		
	}

}
