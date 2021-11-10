package �÷��ǿ���;

import java.util.Objects;

//�ѻ���� �ּҷ� ������ ���� �� �ִ� Ŭ����
public class PhoneBook {
	private String name;
	private String phone;
	private String address;
	
	public PhoneBook(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneBook other = (PhoneBook) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	@Override
	public String toString() {
		return "[�̸�:" + name + ", ��ȭ��ȣ:" + phone + ", �ּ�:" + address + "]";
	}
	
}
