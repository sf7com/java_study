package 컬렉션프레임워크;

import java.util.Objects;

public class Student2 {
	private String name;
	private int id;
	private int score;
	
	public Student2(String name, int id, int score) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", id=" + id + ", score=" + score + "]";
	}

	
	
	
	
}
