package Class;

class HealthInfo{
	//필드선언
	private String gender;
	private double height;
	private double weight;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		//M,F
		if(gender.equals("M")||gender.equals("F"))
		this.gender = gender;
		else {
			System.out.println("성별을 잘못입력했습니다. M,F로 입력하세요.");
			this.gender = "M"; //잘못입력한 경우 M으로 초기화
			
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height>0)
		this.height = height;
		else
			this.height=100;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight>0)
		this.weight = weight;
	}

	//생성자 메서드
	public HealthInfo(String gender, double height, double weight) {
		super();
		setGender(gender);
		setHeight(height);
		setWeight(weight);
	}
	
	//메서드 선언
	//(1) 표준체중 구하는 메서드
	double getStdWeight() { //필드 선언으로 ()안에 입력할 필요는 없음.
		//gender : M, F
		if(gender.equals("f")) {
			return (height-100)*0.85;
		}else {
			return (height-100)*0.9;
		}
	}
	
	double getObesityRatio() {
		return weight/getStdWeight()*100;
	}
	//(3) 비만도에 따라 비만정도를 문자열로 출력하는 메서드
	String getObesityStr() {
		double obRatio = getObesityRatio();
		String result;
		if(obRatio > 150) {
			result = "고도비만";
		}else if(obRatio >130){
			result = "중도비만";
		}else if(obRatio >120){
			result = "경도비만";
		}else if(obRatio >110){
			result = "과체중";
		}else if(obRatio >90){
			result = "정상";
		}else{
			result = "저체중";
		}
		return result;
	}
}

public class Classhomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char per = "*";
		HealthInfo myHealth = new HealthInfo("M", 174, 78);
		System.out.printf("표준 체중 : %.2f\n", myHealth.getStdWeight());
		System.out.printf("비만도 : %.2f \n", myHealth.getObesityRatio());
		System.out.printf("비만정도 : %s\n", myHealth.getObesityStr());
	
	}

}
