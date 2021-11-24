package DB����;

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
	
	//DB���� �޼���
	private void dbConn() {
		conn = DBConnection.getConnection();
	}
	//DB���� �޼���
	private void dbClose() {
		try {
			if(rs!=null) rs.close();
			if(pstm!=null) pstm.close();
			if(conn!=null) conn.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	//������ ���� �޼���
	public void insertData(String item, String money) {
		dbConn(); //db����
		try {
			String query = "INSERT INTO PocketMoney(no,item,money)" +
						" VALUES(SEQ_PM.NEXTVAL,?,?)";
			pstm = conn.prepareStatement(query); 
			pstm.setString(1, item);
			pstm.setInt(2, Integer.parseInt(money));
			pstm.executeQuery();
			//int rowNum = pstm.executeUpdate();
			//System.out.println(rowNum+"��ŭ ���ԵǾ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		dbClose();
	}
	
	//�ܾ� ��ȸ �޼���
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
	//��� ������ �������� �޼���
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
	//������ ������ ���� �޼���
	public void lastDatadel() {
		dbConn(); //db����
		try {
			String query = "DELETE FROM PocketMoney WHERE no=(SELECT MAX(no)FROM PocketMoney)";
			
			pstm = conn.prepareStatement(query); 
			pstm.executeQuery();
			//int rowNum = pstm.executeUpdate();
			//System.out.println(rowNum+"��ŭ ���ԵǾ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		dbClose();
	}
	
	//ǰ�� ���� �հ� 1~5�� ��ȸ
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
	
	//���� �����հ�,�������,�����հ�,������� ��ȸ
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
