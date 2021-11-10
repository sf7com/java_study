package �÷��ǿ���;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//PhoneBook ��ü�� �����ϴ� Ŭ����
//ȸ������ �߰�,�˻�,����,����
public class PhoneBookManager {
	private Set<PhoneBook> memberInfo;

	public PhoneBookManager(Set<PhoneBook> memberInfo) {
		super();
		this.memberInfo = memberInfo;
	}
	
	public PhoneBookManager() {
		super();
		this.memberInfo = new HashSet<>();
	}
	
	//ȸ������ �߰�
	public void add(PhoneBook pb) {
		memberInfo.add(pb);
	}
	public void add(String name, String phone, String address) {
		memberInfo.add(new PhoneBook(name, phone, address));
	}
	
	//ȸ���˻� - �̸��� ���� ȸ��
	public Set<PhoneBook> searchByName(String name){
		Set<PhoneBook> result = new HashSet<>();
		for(var member : memberInfo) {
			if(member.getName().equals(name)) {
				result.add(member);
			}
		}
		return result;
	}
	
	//ȸ���˻� - ��ȭ��ȣ ���� ȸ��
	public Set<PhoneBook> searchByPhone(String phone){
		Set<PhoneBook> result = new HashSet<>();
		for(var member : memberInfo) {
			if(member.getPhone().equals(phone)) {
				result.add(member);
			}
		}
		return result;
	}
	
	//ȸ���˻� - �ּҰ� ����� ȸ��
	public Set<PhoneBook> searchByAddr(String addr){
		Set<PhoneBook> result = new HashSet<>();
		for(var member : memberInfo) {
			if(member.getAddress().contains(addr)) {
				result.add(member);
			}
		}
		return result;
	}
	
	//ȸ������ 
	public void delMember(String name, String phone	) {
		memberInfo.remove(new PhoneBook(name, phone, ""));
	}
	
	//ȸ������
	public void alterMember(String name, String phone) {
		System.out.println("������ ȸ�� ������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� > ");
		String inName = sc.nextLine();
		System.out.print("��ȭ��ȣ > ");
		String inPhone = sc.nextLine();
		System.out.print("�ּ� > ");
		String inAddr = sc.nextLine();
		
		delMember(inName, inPhone);
		add(inName, inPhone, inAddr);	
	}
	
	//���ȸ����
	public int size() {
		return memberInfo.size();
	}
	
	//��� ȸ�� ���
	void printAllMember() {
		System.out.println("-".repeat(30));
		System.out.println("��ϵ� ȸ���� : " + size());
		int i=1;
		for(var member : memberInfo) {
			System.out.print(i+"-");
			System.out.println(member);
			i++;
		}
	}
	
}
