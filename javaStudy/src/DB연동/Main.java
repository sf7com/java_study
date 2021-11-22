package DB연동;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null; //DB연결상태를 담는 객체
		PreparedStatement pstm = null; //SQL문을 담는 객체
		ResultSet rs = null; //쿼리 결과를 받는 객체
		
		try {
			conn = DBConnection.getConnection(); //DB연결
			String query = "SELECT * FROM PocketMoney";
			pstm = conn.prepareStatement(query); //연결된 DB객체에 쿼리문 담기
			rs = pstm.executeQuery(); //쿼리 실행 : DB에 전달되어 결과값 받음
			System.out.println("----------------------------");
			
			while(rs.next()) {
//				int no = rs.getInt("no");
//				String item = rs.getString("item");
//				int money = rs.getInt("money");
//				String date = rs.getString("iodate");
				
				int no = rs.getInt(1);
				String item = rs.getString(2);
				int money = rs.getInt(3);
				String date = rs.getString(4);
				
				System.out.printf("%d행 : %-3d %-10s %-10d %-30s\n",
						rs.getRow(),no,item,money,date);
			}
			//데이터 삽입
//			query = "INSERT INTO POCKETMONEY(no,item,money) VALUES"
//					+"(SEQ_PM.NEXTVAL,'간식',-3000)";
//			pstm.executeQuery(query);
//			query = "INSERT INTO POCKETMONEY(no,item,money) VALUES"
//					+"(SEQ_PM.NEXTVAL,?,?)";
//			String item = "월급";
//			int money = 3000000;
//			pstm = conn.prepareStatement(query);
//			pstm.setString(1, item);
//			pstm.setInt(2, money);
//			pstm.executeQuery();
			
			//데이터 수정
//			query = "UPDATE POCKETMONEY SET ITEM='보너스',MONEY=300000"
//					+"WHERE NO=26";
//			pstm.executeQuery(query);
//			System.out.println("끝");
			
			query = "UPDATE POCKETMONEY SET ITEM=?, MONEY=?"
					+"WHERE NO=?";
			String item = "호떡";
			int money =-4000;
			int no=5;
			pstm = conn.prepareStatement(query);
			pstm.setString(1, item);
			pstm.setInt(2, money);
			pstm.setInt(3, no);
			pstm.executeQuery();
			
			//데이터 삭제
			query = "DELETE FROM POCKETMONEY";
			pstm = conn.prepareStatement(query);
			pstm.executeQuery();
			
			System.out.println("프로그램 종료");
			
			
		} catch (SQLException e) {
			System.out.println("SQL 예외 발생.");
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstm!=null) pstm.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
