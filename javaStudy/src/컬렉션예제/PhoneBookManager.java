package 컬렉션예제;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//PhoneBook 객체를 관리하는 클래스
//회원정보 추가,검색,삭제,수정
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
	
	//회원정보 추가
	public void add(PhoneBook pb) {
		memberInfo.add(pb);
	}
	public void add(String name, String phone, String address) {
		memberInfo.add(new PhoneBook(name, phone, address));
	}
	
	//회원검색 - 이름이 같은 회원
	public Set<PhoneBook> searchByName(String name){
		Set<PhoneBook> result = new HashSet<>();
		for(var member : memberInfo) {
			if(member.getName().equals(name)) {
				result.add(member);
			}
		}
		return result;
	}
	
	//회원검색 - 전화번호 같은 회원
	public Set<PhoneBook> searchByPhone(String phone){
		Set<PhoneBook> result = new HashSet<>();
		for(var member : memberInfo) {
			if(member.getPhone().equals(phone)) {
				result.add(member);
			}
		}
		return result;
	}
	
	//회원검색 - 주소가 비슷한 회원
	public Set<PhoneBook> searchByAddr(String addr){
		Set<PhoneBook> result = new HashSet<>();
		for(var member : memberInfo) {
			if(member.getAddress().contains(addr)) {
				result.add(member);
			}
		}
		return result;
	}
	
	//회원삭제 
	public void delMember(String name, String phone	) {
		memberInfo.remove(new PhoneBook(name, phone, ""));
	}
	
	//회원수정
	public void alterMember(String name, String phone) {
		System.out.println("수정할 회원 정보를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 > ");
		String inName = sc.nextLine();
		System.out.print("전화번호 > ");
		String inPhone = sc.nextLine();
		System.out.print("주소 > ");
		String inAddr = sc.nextLine();
		
		delMember(inName, inPhone);
		add(inName, inPhone, inAddr);	
	}
	
	//등록회원수
	public int size() {
		return memberInfo.size();
	}
	
	//모든 회원 출력
	void printAllMember() {
		System.out.println("-".repeat(30));
		System.out.println("등록된 회원수 : " + size());
		int i=1;
		for(var member : memberInfo) {
			System.out.print(i+"-");
			System.out.println(member);
			i++;
		}
	}
	
}
