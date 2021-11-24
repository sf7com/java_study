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
		
		public String inTotal;
		public String inAvg;
		public String outTotal;
		public String outAvg;
		
		
		public DBItem(String item, String money, String date) {
			super();
			this.item = (item==null)? "" : item;
			this.money = (money==null)? "" : money;
			this.date = (date==null)? "" : date;			
		}

		public DBItem(String date, String inTotal, String inAvg, String outTotal, String outAvg) {
			super();
			this.date = date;
			this.inTotal = inTotal;
			this.inAvg = inAvg;
			this.outTotal = outTotal;
			this.outAvg = outAvg;
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
	//마지막 데이터 삭제 메서드
	public void lastDatadel() {
		dbConn(); //db연결
		try {
			String query = "DELETE FROM PocketMoney WHERE no=(SELECT MAX(no)FROM PocketMoney)";
			
			pstm = conn.prepareStatement(query); 
			pstm.executeQuery();
			//int rowNum = pstm.executeUpdate();
			//System.out.println(rowNum+"만큼 삽입되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		dbClose();
	}
	
	//품목별 지출 합계 1~5위 조회
	public List<DBItem> getTop5Exp() {
		dbConn();
		List<DBItem> result = new ArrayList<>();
		try {
			String query = "WITH\r\n"
					+ "exTable AS(\r\n"
					+ "SELECT item, SUM(money)exm FROM PocketMoney WHERE money<0 \r\n"
					+ "GROUP BY item ORDER BY exm)\r\n"
					+ "SELECT * FROM exTable WHERE rownum<=5";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			while(rs.next()) {
				result.add(new DBItem(rs.getString("item"),
					rs.getString("exm"), ""));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dbClose();
		return result;
	}	
	
	//월별 수입합계,수입평균,지출합계,지출평균 조회
	public List<DBItem> getStatByMon() {
		dbConn();
		List<DBItem> result = new ArrayList<>();
		try {
			String query = "WITH\r\n"
					+ "monIn AS\r\n"
					+ "(SELECT TO_CHAR(iodate, 'YYYY-MM')yearmon,SUM(money)total, ROUND(AVG(money),0)avg\r\n"
					+ "FROM PocketMoney WHERE money > 0 GROUP BY TO_CHAR(iodate,'YYYY-MM')),\r\n"
					+ "monOut AS(SELECT TO_CHAR(iodate, 'YYYY-MM')yearmon,SUM(money)total, ROUND(AVG(money),0)avg\r\n"
					+ "FROM PocketMoney WHERE money < 0 GROUP BY TO_CHAR(iodate,'YYYY-MM'))\r\n"
					+ "SELECT NVL(monIn.yearmon,monOut.yearmon)yearmon,\r\n"
					+ "NVL(monIn.total,0)inTotal,NVL(monIn.avg,0)inAvg,\r\n"
					+ "NVL(monOut.total,0)outTotal,NVL(monOut.avg,0)outAvg\r\n"
					+ "FROM monIn FULL JOIN monOut\r\n"
					+ "ON monIn.yearmon = monOut.yearmon";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			while(rs.next()) {
				result.add(new DBItem(rs.getString("yearmon"),
					rs.getString("inTotal"), rs.getString("inAvg"),
					rs.getString("outTotal"), rs.getString("outAvg")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dbClose();
		return result;
	}	
}
