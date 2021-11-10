package 제네릭;

public class NumberGeneric <T extends Number, V extends Number> { //타입을 부모클래스 Number로 제한한다.

	private T num1;
	private V num2;
	
	public NumberGeneric(T num1, V num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double sum() {
		return num1.doubleValue()+num2.doubleValue();
	}

}
