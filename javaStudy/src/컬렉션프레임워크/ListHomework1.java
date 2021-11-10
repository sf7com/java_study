package �÷��������ӿ�ũ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) ���� ����Ʈ�� ��� ����� ���� ���ϴ� �˰���
		//   Ŭ����Ÿ�Ը�
		List<Integer> numList = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			numList.add(i);
		}
		//�� �߰�,����,���� �Ұ��� - �б� ����
		List<Integer> numList2 = Arrays.asList(1,2,3,4,5);
		
		//�� �߰�,����,���� ����
		List<Integer> numList3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		//�迭 -> ����Ʈ
		Integer[] intArray = {1,2,3,4,5,6};
		List<Integer> numList4 = Arrays.asList(intArray);
		
		//(1-1) for�� Ȱ��
		int total = 0;
		//numList.size() : ����Ʈ���� ������ ����, ��� ��
		for(int i=0;i<numList.size(); i++) {
			total+=numList.get(i); //get() �ε����� ���� �� ����
		}
		System.out.println("numList�� ���� : " + total);
		System.out.println("numList�� ��� : " + (double)total/numList.size()); //int->double Ÿ�Ժ�ȯ(double)
		System.out.println("numList�� ��� : " + 1.0*total/numList.size()); //�Ǽ��� ������ �����ָ� �Ǽ��� ����ȯ ��.
		
		//(1-2) for-each��
		total = 0;
		for(Integer val : numList) {
			total += val;
		}
		System.out.println("numList�� ���� : " + total);
		System.out.println("numList�� ���� : " + (double)total/numList.size());
		System.out.println("numList�� ��� : " + 1.0*total/numList.size());
		
		//(1-3) �ݺ���
		Iterator<Integer> iter = numList.iterator();
		total=0;
		while(iter.hasNext()){
			total += iter.next();
		}
		System.out.println("numList�� ���� : " + total);
		System.out.println("numList�� ���� : " + (double)total/numList.size());
		System.out.println("numList�� ��� : " + 1.0*total/numList.size());
		
		//(2) numList�� ¦�� ��Ҹ� ����
		var iter2 = numList.iterator();
		while(iter2.hasNext()) {
			if(iter2.next()%2==0) {
				iter2.remove();
			}
		}
		System.out.println(numList);
		
		///////////////////////////////////////////////////////
		//(3) �޷� ����
//		int[] cld = {31,28,31,30,31,30,31,31,30,31,30,31};//12��
//		int mon = 0;
//		for(int i=0; i<cld.length;i++) {
//			System.out.printf("%d�� - ,",i+1);
//			
//			for(int day=1;day<=cld[mon];day++) {
//				System.out.printf("%d��", day);
//				if(day!=cld[mon]) {
//					System.out.print(",");
//				}
//			}
//			System.out.println();
//		}
		//�޼��� ���� : �⵵�� ���� �Է��� �ް� ���ڿ��� �޷��� ���
		//2020�� 1�� - 1��,2��,3��,4��,5��,6��,7��,8��,9��,10��,11��,12��,13��,14��,15��,16��,17��,18��,19��,20��,21��,22��,23��,24��,25��,26��,27��,28��,29��,30��,31��
		//2���� ��� ������ �����ؼ� ������ ���� �ٸ��� �Ѵ�.(������ ��� 2��29��, �ƴѰ�� 28��)
		
		//(����) ��,�� �������� �� �����ؾ� ������
		// �� �⵵�� 4�� ������ �������� ��.
		// �� �⵵�� 100���� ������ �������� �ʰų� �⵵�� 400���� ������ �������� ��.
		//(����) 4(����), 100(���), 400(����)��
		
	System.out.println(getCalender(2021, 11));
	System.out.println(getWeekStr(2021, 11,9));
	
	}
	
	
	public static String getCalender(int year, int mon) {
		//Map �ʱ�ȭ 10������ �ʱ�ȭ ����
//		Map<Integer, Integer> lastDayMap = Map.of(
//			1,31, 2,28, 3,31, 4,30, 5,31, 6,30, 7,31, 8,31, 9,30, 10,31);
//		lastDayMap.put(11, 30);
//		lastDayMap.put(12, 31);
		String result;
		Map<Integer, Integer> lastDayMap = new HashMap<>();
		lastDayMap.put(1, 31);lastDayMap.put(2, 28);lastDayMap.put(3, 31);
		lastDayMap.put(4, 30);lastDayMap.put(5, 31);lastDayMap.put(6, 30);
		lastDayMap.put(7, 31);lastDayMap.put(8, 31);lastDayMap.put(9, 30);
		lastDayMap.put(10, 31);lastDayMap.put(11, 30);lastDayMap.put(12, 31);
		
		//3�׿�����
		//���� = (����)? a:b
		//������ ���̸� ������ a�� ����, ������ �����̸� ������ b���� ����
//		int lastDay = (mon==2 && isLeapYear(year))?lastDayMap.get(mon)+1 : lastDayMap.get(mon); //3�� ������
		
		int lastDay;
		boolean isLeap = isLeapYear(year);
		if(mon == 2 && isLeap) {
			lastDay = lastDayMap.get(mon)+1;
		}else {
			lastDay = lastDayMap.get(mon);
		}
		
		result = String.format("%04d�⵵ %02d��-",year,mon);
		for (int day=1;day<=lastDay;day++) {
			result += String.format("%02d��(%s)",day,getWeekStr(year,mon,day));
			if(day!=lastDay)
				result +=",";					
			
		}
		return result;
	}
		
	public static boolean isLeapYear(int year) {
		boolean result = false;
		if(year % 4 == 0 && (year%100!=0 || year%400==0 )) 
			result = true;
		return result;
		
	}
	
	public static String getWeekStr(int year, int mon, int day) {
		int a,b; //a�� �⵵�� ��2�ڸ�, b�� ������ ��2�ڸ�
		
		if(mon <= 2) {
			year--;
			mon+=12;
		}
		a = year/100; //ex) 2014/100 = 20.14 ->20
		b = year%100; //ex) 2014 ������ 14
		
		int week = ((21*a/4)+(5*b/4)+26*(mon+1)/10+day-1)%7;
		//0:d��, 1:��, 2:ȭ......
		String weekStr = switch(week) {
		case 0 -> "��";
		case 1 -> "��";
		case 2 -> "ȭ";
		case 3 -> "��";
		case 4 -> "��";
		case 5 -> "��";
		case 6 -> "��";
		default -> "";		
		};
		return weekStr;
	}

}
