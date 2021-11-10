package 제네릭;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<String> g1 = new Generic<>("홍길동");
		System.out.println(g1.getField());
		g1.setField("장동건");
		System.out.println(g1.getField());
		
		Generic<Integer> g2 = new Generic<Integer>(10);
		System.out.println(g2.getField());
	}

}
