package Á¦³×¸¯;

import java.util.ArrayList;
import java.util.List;

public class EntryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry<String, Integer> e1 = new Entry<String, Integer>("È«±æµ¿", 30);
		Entry<String, Integer> e2 = new Entry<String, Integer>("ÀÓ²©Á¤", 80);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		
		Entry<String, String> e3 = new Entry<String, String>("id01", "±èÅÂÈñ");
		System.out.println(e3);
		System.out.println(e3.getKey());
		System.out.println(e3.getValue());
		
		///////////////////////////////////////////////////////////////////
		List<Entry<Integer, String>> stuList = new ArrayList<>();
		stuList.add(new Entry<>(1, "È«±æµ¿"));
		stuList.add(new Entry<>(2, "ÀÓ²©Á¤"));
		stuList.add(new Entry<>(3, "Àåµ¿°Ç"));
		stuList.add(new Entry<>(4, "±èÅÂÈñ"));
		
		//Â¦¼ö¹øÈ£¸¸ Ãâ·Â
		for(var stu : stuList) {
			if(stu.getKey() % 2 == 0)
				System.out.println(stu);
		}
		
		
	}

}
