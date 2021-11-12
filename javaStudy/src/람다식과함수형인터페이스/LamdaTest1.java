package 람다식과함수형인터페이스;

import java.util.Arrays;

class Rect{
	int hSize,vSize;
	public Rect(int hSize, int vSize) {
		super();
		this.hSize = hSize;
		this.vSize = vSize;
	}
	int getArea() {
		return hSize*vSize;
	}
}

public class LamdaTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect(10,5);
		Rect r2 = new Rect(3,8);
		Rect r3 = new Rect(7,6);
		Rect[] rArray = {r1,r2,r3};
		
		//정렬전 - 배열 객체 면적
		for(var r : rArray) {
			System.out.println(r.hSize);
		}
		
		Arrays.sort(rArray,(o1, o2)->o1.getArea()-o2.getArea());//기준이 없어 정렬이 안됨, 기준 추가 Arrays.sort(rArray); ->
		//rArray o1,o2 불러와서 o1-o2를 빼서 양수이면 위치 변경한다
//		Arrays.sort(rArray,(o1, o2)->o1.hSize-o2.hSize);//기준이 없어 정렬이 안됨, 기준 추가 Arrays.sort(rArray); ->
		//rArray o1,o2 불러와서 o1-o2를 빼서 양수이면 위치 변경한다 (int형을 나와야 함)
		Arrays.sort(rArray,(o1, o2)->o2.hSize-o1.hSize);//기준이 없어 정렬이 안됨, 기준 추가 Arrays.sort(rArray); ->
		//rArray o1,o2 불러와서 o1-o2를 빼서 양수이면 위치 변경한다 (int형을 나와야 함) 내림차순
		System.out.println("-".repeat(30));
		//정렬 후 - 배열 객체별 면적
		for(var r : rArray) {
			System.out.println(r.hSize);
		}
	}

}
