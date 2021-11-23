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
}
