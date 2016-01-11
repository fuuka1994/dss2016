package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.omg.Messaging.SyncScopeHelper;

import model.BaiThuoc;

public class connect {
	String url = "jdbc:oracle:thin:@localhost:1522:dbDongY";
	String user = "system";
	String password = "123456";
	public Connection connection;
	Statement statement;

	public boolean ketNoi() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			try {
				connection = DriverManager.getConnection(url, user, password);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		if (connection == null) {

			throw new NullPointerException("Connection is null");
		}
		return true;
	}



		public void CreateStatement() {
			if (statement == null) {
				try {
					statement = connection.createStatement();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		public ResultSet xxx(String sqlCommand) {

			try {
				CreateStatement();
				ResultSet resultSet = statement.executeQuery(sqlCommand);
				return resultSet;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

		}
//		public List<BaiThuoc> loadTen(String keyWord) throws SQLException{
//			
//			
//			
//			
//			
//			int r = 0;
//			List<BaiThuoc> list = new ArrayList<BaiThuoc>();
//			connect con = new connect();
//			con.ketNoi();
//			String word = "%"+keyWord+"%";
//			word = word.toLowerCase();
//			System.out.println(word);
//			String command = "select * from TBL_BAITHUOC where lower(tenBaithuoc) like 	?";
//			
//			PreparedStatement ps = connection.prepareStatement(command);
//			System.out.println("123");
//			//r = ps.executeUpdate();
//		//	con.CreateStatement();
//			ps.setString(1, word);
//			
//		//	ps.executeUpdate();
//		//	System.out.println("123");
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()){
//				BaiThuoc bt = new BaiThuoc();
//				bt.setMaBaiThuoc(rs.getInt(1));
//				bt.setTenBaiThuoc(rs.getString("TENBAITHUOC"));
//				bt.setThongTin(rs.getString("THONGTIN"));
//				bt.setCachDung(rs.getString("CACHDUNG"));
//				bt.setSoLuotTruyCap(rs.getInt(5));
//				bt.setDiemVote(rs.getInt(6));
//				
//				list.add(bt);
//			}
//			return list;
//		}
//		
//		
//		public static void main(String[] args) throws SQLException {
//			connect con1 = new connect();
//			if(con1.ketNoi() == true){
//				System.out.println("ok");
//			}else{
//				System.out.println("no");
//			}
//			
//			List<BaiThuoc> lisi = con1.loadTen("An Thai");
//			for (int i = 0; i < lisi.size(); i++) {
//				System.out.println(lisi.get(i).toString());
//			}
//			
//			
//			
//		}
//		

	
		
	
}
