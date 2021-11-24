package DB연동;

import java.util.Scanner;

public class PocketMoneyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DBAccess da = new DBAccess();
		while(true) {
			ScreenOut.menu();
			switch(sc.nextLine()) {
			case "1" : //지출
			{
				//지출메뉴
				ScreenOut.outItem();
				String item = sc.nextLine();//지출 항목 입력
				ScreenOut.outMoney();
				String money = sc.nextLine();//지출 금액 입력
				ScreenOut.checkMent(item, money, "지출");
				String check = sc.nextLine();
				if(check.equals("1")) {
					ScreenOut.yesMent();
					//데이터 삽입
					da.insertData(item, "-"+money);
				}else {
					ScreenOut.noMent();
				}
				System.out.println("Enter");
				sc.nextLine();//엔터 누를 때까지 대기
				break;
			}
			case "2" : //수입
			{
				//수입메뉴
				ScreenOut.inItem();
				String item = sc.nextLine();//지출 항목 입력
				ScreenOut.inMoney();
				String money = sc.nextLine();//지출 금액 입력
				ScreenOut.checkMent(item, money, "수입");
				String check = sc.nextLine();
				if(check.equals("1")) {
					ScreenOut.yesMent();
					//데이터 삽입
					da.insertData(item, money);
				}else {
					ScreenOut.noMent();
				}
				System.out.println("Enter");
				sc.nextLine();//엔터 누를 때까지 대기
				break;
			}
			case "3" : //잔액조회
			{
				//잔액 조회 함수 필요
				int balance=da.getMoneyBalance();//잔액
				System.out.println("\t현재 남은 잔액은 " + balance + "원 입니다.");
				System.out.println("Enter");
				sc.nextLine(); //엔터 누를 때까지 대기
				break;
			}
			case "4" : //전체조회
			{
				System.out.println("\t전체 목록을 조회합니다.");
				System.out.println("Enter");
				sc.nextLine(); //엔터 누를 때까지 대기
				System.out.println("\t지출(수입)내역\t금액\t\t날짜");
				System.out.println("\t" + "*".repeat(60));
				//모든 데이터 조회
				var items = da.getAllItems();
				for(var item : items) {
					System.out.printf("\t%-10s\t%7s원\t%s\n",
							item.item, item.money, item.date);
				}
				//
				System.out.println("\n\t모든 조회가 완료되었습니다.");
				System.out.println("Enter");
				sc.nextLine(); //엔터 누를 때까지 대기
				break;
			}
			case "5" : //마지막 데이터 삭제
			{
				System.out.println("\t마지막 입력을 취소하시겠습니까?\n\t"
						+"(마지막에 입력된 내용이 삭제됩니다.)\n\t"
						+"1)예\t2)아니오\n입력 : ");
				String check = sc.nextLine();
				if(check.equals("1")) {
					da.lastDatadel();
					System.out.println("\t성공적으로 삭제되었습니다.");
				}else {
					System.out.println("\t취소되었습니다.");
				}
				System.out.println("Enter");
				sc.nextLine(); //엔터 누를 때까지 대기
				break;
			}
			case "6" : //품목별 지출 합계 상위 5개
			{
				System.out.println("\t상위 5개 품목별 지출 합계값을 출력합니다.");
				System.out.println("Enter");
				sc.nextLine(); //엔터 누를 때까지 대기
				System.out.println("\t지출(수입)내역\t금액");
				System.out.println("\t" + "*".repeat(60));
				//상위5개 지출데이터 가져오기
				var items = da.getTop5Exp();
				for(var item : items) {
					System.out.printf("\t%-10s\t%7s원\n",
							item.item, item.money);
				}
				//
				System.out.println("\n\t모든 조회가 완료되었습니다.");
				System.out.println("Enter");
				sc.nextLine(); //엔터 누를 때까지 대기
				break;
			}
			case "7" : //월별 통계값
			{
				System.out.println("\t월별 통계값을 출력합니다..");
				System.out.println("Enter");
				sc.nextLine(); //엔터 누를 때까지 대기
				System.out.println("\t날짜\t\t수입합계\t\t수입평균\t\t지출합계\t\t지출평균");
				System.out.println("\t" + "*".repeat(80));
				//상위5개 지출데이터 가져오기
				var items = da.getStatByMon();
				for(var item : items) {
					System.out.printf("\t%-10s\t%7s원\t%7s원\t%7s원\t%7s원\n",
							item.date, item.inTotal, item.inAvg, item.outTotal, item.outAvg);
				}
				//
				System.out.println("\n\t모든 조회가 완료되었습니다.");
				System.out.println("Enter");
				sc.nextLine(); //엔터 누를 때까지 대기
				break;
			}
			case "0" : //종료
			{
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			default :
				//메뉴 잘못입력
				System.out.println("잘못입력하였습니다. 다시 입력하세요.");
			}
		}
	}

}
