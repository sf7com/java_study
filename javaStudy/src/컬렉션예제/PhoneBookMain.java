package 컬렉션예제;

import java.util.Scanner;
import java.util.Set;

public class PhoneBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) 파일 입출력/ 데이터 베이스 - 회원정보 읽어들여 pbm에 저장
		PhoneBookManager pbm = new PhoneBookManager();
		pbm.add("홍길동","010-1234-5678", "서울시 강남구 11-3");
		pbm.add("임꺽정","010-4848-8282", "서울시 서초구 방배동 193");
		pbm.add("김하나","010-8282-2678", "부산시 해운대구 해운대동 77-3");
		PhoneBook pb = new PhoneBook("김태희", "010-9181-2468", "수원시 권선구 248");
		pbm.add(pb);
		
		boolean run = true;
		while(run) {
			//메뉴 선택
			int sel = getMenu();
			switch(sel) {
			case 1:
				//회원추가메뉴
				addMenu(pbm);
				break;
			case 2:
				//회원삭제메뉴
				delMenu(pbm);
				break;
			case 3:
				//회원검색 메뉴
				searchMenu(pbm);
				break;
			case 4:
				//회원정보 출력메뉴
				pbm.printAllMember();
				break;
			case 5:
				//프로그램 종료
				run = false;
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
				continue;
			}
		}
		
	}

	private static void searchMenu(PhoneBookManager pbm) {
		// TODO Auto-generated method stub
		System.out.println("\n검색-조회방법을 선택하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : 이름");
		System.out.println("2 : 전화번호");
		System.out.println("3 : 주소");
		
		int sel;
		Set<PhoneBook> members = null;
		do {			
			System.out.print("숫자입력 >");
			sel = sc.nextInt();
			sc.nextLine(); //\n 버퍼 비우기(숫자 입력 후 string 입력)			
			switch (sel) {
			case 1:
				System.out.print("이름 >");
				String name = sc.nextLine();
				members = pbm.searchByName(name);
				break;
			case 2:
				System.out.print("전화번호 >");
				String phone = sc.nextLine();
				members = pbm.searchByPhone(phone);			
				break;
			case 3:
				System.out.print("주소 >");
				String addr = sc.nextLine();
				members = pbm.searchByAddr(addr);			
				break;
	
			default:
				System.out.println("잘못된 숫자를 입력하였습니다.");
				sel = -1;
				break;
			}
		}while(sel==-1);

		for(var member:members) {
			System.out.println(member);
		}
		
		System.out.println("조회가 완료되었습니다.");
		
	}

	private static void delMenu(PhoneBookManager pdm) {
		// TODO Auto-generated method stub
		System.out.println("\n삭제-회원 정보를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 >");
		String name = sc.nextLine();
		System.out.print("전화번호 >");
		String phone = sc.nextLine();
		
		pdm.delMember(name, phone);
		System.out.println("회원삭제 되었습니다.");
		
	}

	private static void addMenu(PhoneBookManager pdm) {
		// TODO Auto-generated method stub
		System.out.println("\n추가-회원 정보를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 >");
		String name = sc.nextLine();
		System.out.print("전화번호 >");
		String phone = sc.nextLine();
		System.out.print("주소 >");
		String addr = sc.nextLine();
		
		pdm.add(name,phone,addr);
		System.out.println("회원추가 되었습니다.");
	}

	private static int getMenu() {
		// TODO Auto-generated method stub
		System.out.println("\n<회원 관리>");
		System.out.println("1.회원추가");
		System.out.println("2.회원삭제");
		System.out.println("3.회원검색");
		System.out.println("4.전체 회원조회");
		System.out.println("5.종료");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
				
		return sel;
	}

}
