package Á¦³×¸¯;

public class NumberGenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberGeneric<Integer, Double> ng1 = new NumberGeneric<>(10, 3.14);
		System.out.println(ng1.sum());
		
		NumberGeneric<Double, Double> ng2 = new NumberGeneric<>(10.4, 3.14);
		System.out.println(ng2.sum());
	}

}
