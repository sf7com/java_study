package 컬렉션예제;

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
		
		pbm.printAllMember();
	}

}
