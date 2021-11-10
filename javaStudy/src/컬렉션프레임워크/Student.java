package �÷��������ӿ�ũ;

public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		setName(name);
		setScore(score);
	}

	public Student(String name) {
		this(name,0);
	}
	
	public Student(int score) {
		this("",score);
	}
	
	public Student() {
		this("",0);
	}
	
	public String getName() {
		return name + "��";
	}

	public void setName(String name) {
		int len = name.length();
		if(len>5) {
			this.name = name.substring(0,5);
		}else {
			this.name = name;
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score > 100)
			this.score = 100;
		else if (score <0)
			this.score = 0;
		else
			this.score = score;
	}
	
	//System out���� �ֿܼ� ��ü�� ����ϴ� ��� ��µ� ���ڿ�
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [name="+name+", score="+score+"]";
	}
	
}
