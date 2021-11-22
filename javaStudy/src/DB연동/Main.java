package DB����;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null; //DB������¸� ��� ��ü
		PreparedStatement pstm = null; //SQL���� ��� ��ü
		ResultSet rs = null; //���� ����� �޴� ��ü
		
		try {
			conn = DBConnection.getConnection(); //DB����
			String query = "SELECT * FROM PocketMoney";
			pstm = conn.prepareStatement(query); //����� DB��ü�� ������ ���
			rs = pstm.executeQuery(); //���� ���� : DB�� ���޵Ǿ� ����� ����
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
				
				System.out.printf("%d�� : %-3d %-10s %-10d %-30s\n",
						rs.getRow(),no,item,money,date);
			}
			//������ ����
//			query = "INSERT INTO POCKETMONEY(no,item,money) VALUES"
//					+"(SEQ_PM.NEXTVAL,'����',-3000)";
//			pstm.executeQuery(query);
//			query = "INSERT INTO POCKETMONEY(no,item,money) VALUES"
//					+"(SEQ_PM.NEXTVAL,?,?)";
//			String item = "����";
//			int money = 3000000;
//			pstm = conn.prepareStatement(query);
//			pstm.setString(1, item);
//			pstm.setInt(2, money);
//			pstm.executeQuery();
			
			//������ ����
//			query = "UPDATE POCKETMONEY SET ITEM='���ʽ�',MONEY=300000"
//					+"WHERE NO=26";
//			pstm.executeQuery(query);
//			System.out.println("��");
			
			query = "UPDATE POCKETMONEY SET ITEM=?, MONEY=?"
					+"WHERE NO=?";
			String item = "ȣ��";
			int money =-4000;
			int no=5;
			pstm = conn.prepareStatement(query);
			pstm.setString(1, item);
			pstm.setInt(2, money);
			pstm.setInt(3, no);
			pstm.executeQuery();
			
			//������ ����
			query = "DELETE FROM POCKETMONEY";
			pstm = conn.prepareStatement(query);
			pstm.executeQuery();
			
			System.out.println("���α׷� ����");
			
			
		} catch (SQLException e) {
			System.out.println("SQL ���� �߻�.");
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
