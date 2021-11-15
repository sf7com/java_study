package 기초test;

class HealthInfo{
	String gender;
	double height;
	double weight;
	
	public HealthInfo(String gender, double height, double weight) {
		super();
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	public double getStdWeight(String gender, double height) {
		double result = 0;
		if (gender == "남성")
			result = (height-100)*0.9;
		else if (gender == "여성")
			result = (height-100)*0.85;
		return result;
	}
	
	public double getObesity() {
		return (weight/getStdWeight(gender,height))*100;
	}
	
	public void getObesityStr() {
		String grade="";
		if(getObesity() <=90)
			grade = "저체중";
		else if(getObesity() <=110)
			grade = "정상(표준체중)";
		else if(getObesity() <=120)
			grade = "과체중";
		else if(getObesity() <=130)
			grade = "경도비만";
		else if(getObesity() <=150)
			grade = "중도비만";
		else if(getObesity() >150) 
			grade = "고도비만";
		
		System.out.printf("비만도 : %.1f퍼센트 이며 %s 입니다.\n",getObesity(),grade);	
	}

}


class RightTriangle{
	double base;
	double height;
	
	public RightTriangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public double getArea(double base, double height) {
		return (base+height)/2;
	}
	
	public double getHypotenuse(double base, double height) {
		return Math.sqrt((base*base)+(height*height));
	}
	
	public double getPerimeter(double base, double height) {
		return base+height+getHypotenuse(base,height);
	}
	
}


public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base = 4.5;
		double height = 5.0;
		RightTriangle tri = new RightTriangle(base,height);
		System.out.printf("삼각형의 넓이 : %.2f",tri.getArea(base,height));
		System.out.println();
		System.out.printf("빗변의 길이 : %.2f",tri.getHypotenuse(base,height));
		System.out.println();
		System.out.printf("둘레의 길이 : %.2f",tri.getPerimeter(base,height));
		System.out.println();
		System.out.println("/".repeat(30));
		
		String gender = "남성";
		double height1 = 174.1;
		double weight = 78.8;
		HealthInfo myinfo = new HealthInfo(gender,height1, weight);
		myinfo.getObesityStr();
		
	}

}
