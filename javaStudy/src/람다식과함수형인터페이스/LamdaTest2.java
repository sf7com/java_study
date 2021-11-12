package 람다식과함수형인터페이스;

//함수형 인터페이스 : 추상메서드가 1개인 인터페이스
interface Negative{
	int neg(int x);
}
interface Printable{
	void print();
}

public class LamdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Negative n;
		// 함수형 인터페이스 구현부를 람다식으로 정의
		//   인자타입    구현부
		n = (int x)->{return -x;};
		System.out.println(n.neg(10));
		//입력타입 생략 가능
		n = (x)->{return -x;};
		System.out.println(n.neg(10));
		//입력이 1개라면 괄호도 생략 가능
		n = x->{return -x;};
		System.out.println(n.neg(10));
		//구현부에 return식만 있다면 {} 및 return도 생략 가능
		n = x->-x;
		System.out.println(n.neg(10));
		//////////////////////////////////////////
		Printable p;
		
		p = ()->{System.out.println("안녕!");};
		p.print();
		
		//구현부에 식이 하나라면 {} 생략 가능
		p = ()->System.out.println("안녕!");
		p.print();
		

	}

}
