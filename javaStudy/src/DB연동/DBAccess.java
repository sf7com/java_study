package DB연동;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DBAccess {
	
	public class DBItem {
		public String item;
		public String money;
		public String date;
		
		public DBItem(String item, String money, String date) {
			super();
			this.item = (item==null)? "" : item;
			this.money = (money==null)? "" : money;
			this.date = (date==null)? "" : date;
		}
	}
	
	private Connection conn=null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null;
	
	//DB연결 메서드
	private void dbConn() {
		conn = DBConnection.getConnection();
	}
	//DB종료 메서드
	private void dbClose() {
		try {
			if(rs!=null) rs.close();
			if(pstm!=null) pstm.close();
			if(conn!=null) conn.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	//데이터 삽입 메서드
	public void insertData(String item, String money) {
		dbConn(); //db연결
		try {
			String query = "INSERT INTO PocketMoney(no,item,money)" +
						" VALUES(SEQ_PM.NEXTVAL,?,?)";
			pstm = conn.prepareStatement(query); 
			pstm.setString(1, item);
			pstm.setInt(2, Integer.parseInt(money));
			pstm.executeQuery();
			//int rowNum = pstm.executeUpdate();
			//System.out.println(rowNum+"만큼 삽입되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		dbClose();
	}
	
	//잔액 조회 메서드
	public int getMoneyBalance() {
		dbConn();
		try {
			String query = "SELECT SUM(MONEY) bal FROM PocketMoney";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			if(rs.next()) {
				//return rs.getInt("bal");
				return rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dbClose();
		return -9999999;
	}
	//모든 데이터 가져오는 메서드
	public List<DBItem> getAllItems() {
		dbConn();
		List<DBItem> result = new ArrayList<>();
		try {
			String query = "SELECT item, money, iodate "
					+ "FROM PocketMoney ORDER BY iodate DESC";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			while(rs.next()) {
				result.add(new DBItem(rs.getString("item"),
					rs.getString("money"), rs.getString("iodate")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dbClose();
		return result;
	}	
}
