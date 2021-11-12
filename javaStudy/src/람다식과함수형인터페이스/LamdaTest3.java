package 람다식과함수형인터페이스;

interface Computable{
	double calculate(double num1, double num2);
}

interface Printable2{
	void print(String str);
}

public class LamdaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computable com = (n1,n2)->n1*n2;
		System.out.println(com.calculate(10, 3.14));
		
		com = (n1,n2)->{
			n1++;
			if(n1+n2 > 10) {
				System.out.println("10보다 큽니다.");
			}
			return n1+n2;
		};
		double result = com.calculate(1, 2);
		System.out.println(result);
		
		result = com.calculate(10, 20);
		System.out.println(result);
		
		print((s)->System.out.printf("%s",s.substring(0,5)),
				"hello world Jave");
		System.out.println();
		
		double result2 = cacul(3,5, (n1,n2)->n1-n2);
		System.out.println(result2);
	}
	
	public static void print(Printable2 p2, String str) {
		p2.print(str);
	}
	
	public static double cacul(double n1, double n2, Computable com) {
		return com.calculate(n1, n2);
	}

}
