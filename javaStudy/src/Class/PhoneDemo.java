package Class;

class Phone {
	String model;
	int value;
	
	void print() {
		System.out.printf("%s모델의 가격은 %d입니다.\n", model, value);
	}
}
public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone Phone1 = new Phone();
		Phone1.model = "갤럭시S11";
		Phone1.value = 121;
		Phone1.print();
		
		Phone Phone2 = new Phone();
		Phone2.print();
		
		System.out.println(Phone1);
		System.out.println(Phone2);
		
		String str1 = "apple";
		String str2 = new String("apple");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1==str2); //class는 참조값이어서 문자열의 주소를 비교 함
		System.out.println(str1.equals(str2)); //문자열 값 비교
	}

}
