package ���ٽİ��Լ����������̽�;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;



public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s1 = ()->"apple";
		System.out.println(s1.get());
		
		Random rand = new Random();
		Supplier<Integer> s2 = ()->rand.nextInt(100);
		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println(s2.get());
		
		//��¥������ Ŭ���� - ��¥ ���� ����
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(dateForm.format(new Date())); //new Date(); ���� ��¥�� �ð���ü
		
		Supplier<String> today = ()->dateForm.format(new Date());
		System.out.println(today.get());
		
		DoubleSupplier s3 = ()->Math.random(); //Math.random() 0~1���� ������ �Ǽ�
		System.out.println(s3.getAsDouble());
		System.out.println(s3.getAsDouble());
		
		int num = 0;
		//�Լ��� �������̽��� �ܺ� ������ ���� ���ٲ۴�.
		//�ܺκ����� ���� ������ �� �� �ִ�.
//		IntSupplier s4 = ()->num++;
		IntSupplier s4 = ()->num+1;
		System.out.println(s4.getAsInt());
		System.out.println(s4.getAsInt());
		
		//��ȸ������ �ܺκ����� ���� �ٲ� �� �ִ�.
		int[] x = {0};
		IntSupplier s5= ()->x[0]++;
		System.out.println(s5.getAsInt());
		System.out.println(s5.getAsInt());
		System.out.println(s5.getAsInt());
		System.out.println(s5.getAsInt());
		
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		IntSupplier s6 = ()->{
			int num2 = numList.get(0);
			numList.set(0,++num2);
			return num2;
		};
		System.out.println(s6.getAsInt());
		System.out.println(s6.getAsInt());
		System.out.println(s6.getAsInt());
		System.out.println(s6.getAsInt());
		System.out.println(numList);
		
		//Quiz
		//�������� ���ڿ��� ����ϴµ�, ����,����,�� �� �ϳ��� ���ڿ�, �������� ��µǵ���
		//Supplier �Լ��� �������̽��� �ϼ��Ͻÿ�.
		Supplier<String> rcp = ()->{
			int rNum = rand.nextInt(3);
			return switch(rNum) {
			case 0->"����";
			case 1->"����";
			case 2->"��";
			default ->"";			
			};
		};
		System.out.println(rcp.get());
		System.out.println(rcp.get());
		System.out.println(rcp.get());
		System.out.println(rcp.get());
		
		Supplier<String> rcp2 = ()->{
			int rNum = rand.nextInt(3);
			return (rNum==0)? "����":((rNum==1)?"����":"��");
		};
		System.out.println(rcp2.get());
		System.out.println(rcp2.get());
		System.out.println(rcp2.get());
		System.out.println(rcp2.get());
		
	}

}
