package Class;

class HealthInfo{
	//�ʵ弱��
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
			System.out.println("������ �߸��Է��߽��ϴ�. M,F�� �Է��ϼ���.");
			this.gender = "M"; //�߸��Է��� ��� M���� �ʱ�ȭ
			
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

	//������ �޼���
	public HealthInfo(String gender, double height, double weight) {
		super();
		setGender(gender);
		setHeight(height);
		setWeight(weight);
	}
	
	//�޼��� ����
	//(1) ǥ��ü�� ���ϴ� �޼���
	double getStdWeight() { //�ʵ� �������� ()�ȿ� �Է��� �ʿ�� ����.
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
	//(3) �񸸵��� ���� �������� ���ڿ��� ����ϴ� �޼���
	String getObesityStr() {
		double obRatio = getObesityRatio();
		String result;
		if(obRatio > 150) {
			result = "����";
		}else if(obRatio >130){
			result = "�ߵ���";
		}else if(obRatio >120){
			result = "�浵��";
		}else if(obRatio >110){
			result = "��ü��";
		}else if(obRatio >90){
			result = "����";
		}else{
			result = "��ü��";
		}
		return result;
	}
}

public class Classhomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char per = "*";
		HealthInfo myHealth = new HealthInfo("M", 174, 78);
		System.out.printf("ǥ�� ü�� : %.2f\n", myHealth.getStdWeight());
		System.out.printf("�񸸵� : %.2f \n", myHealth.getObesityRatio());
		System.out.printf("������ : %s\n", myHealth.getObesityStr());
	
	}

}
