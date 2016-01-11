package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.BaiThuoc;
import model.BaiViet;
import model.LuongY;


	public class DbBaiViet extends connect {
		public List<BaiViet> loadTen(String keyWord) throws SQLException{
			List<BaiViet> list = new ArrayList<BaiViet>();
			connect con = new connect();
			con.ketNoi();
			String word = "%"+keyWord+"%";
			word = word.toLowerCase();
			String command = "select * from Tbl_BaiViet where Lower(Ten) like ?";
			PreparedStatement ps = con.connection.prepareStatement(command);
			ps.setString(1,word);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				BaiViet bv = new BaiViet();
				bv.setMaBaiViet(rs.getInt(1));
				bv.setTenBaiViet(rs.getString("TenBaiViet"));
				bv.setNoiDung(rs.getString("NoiDung"));
				bv.setAnhMinhHoa(rs.getString("AnhMinhHoa"));
				bv.setSoLuotTruyCap(rs.getInt(5));
				
				list.add(bv);
			}
			return list;
		}
		
		public void updateLuotTruyCap(int id) throws SQLException{
			BaiViet bv = new BaiViet();
			connect con = new connect();
			String command1 = "select *from TBL_BAIVIET where MABAIVIET=? ";
			PreparedStatement ps1 = con.connection.prepareStatement(command1);
			ps1.setInt(1, id);
			ResultSet rs1 = ps1.executeQuery();
			while (rs1.next()) {
				bv.setMaBaiViet(rs1.getInt(1));
				bv.setTenBaiViet(rs1.getString("TenBaiViet"));
				bv.setNoiDung(rs1.getString("NoiDung"));
				bv.setAnhMinhHoa(rs1.getString("AnhMinhHoa"));
				bv.setSoLuotTruyCap(rs1.getInt(5));
			}
			
			int count = bv.getSoLuotTruyCap();
			count = count+1;
			String command2 = "update TBL_BAIVIET set SOLUOTTRUYCAP = ? where MABAIVIET=? ";
			PreparedStatement ps2 = con.connection.prepareStatement(command2);
			ps2.setInt(1, count);
			ps2.setInt(2, id);
			
			int rs2 = 0;
			rs2 = ps2.executeUpdate();
			
		}
		
		public void updateDiemVote(int id) throws SQLException{
			BaiViet bv = new BaiViet();
			connect con = new connect();
			String command1 = "select *from TBL_BAIVIET where MABAIVIET=? ";
			PreparedStatement ps1 = con.connection.prepareStatement(command1);
			ps1.setInt(1, id);
			ResultSet rs1 = ps1.executeQuery();
			while (rs1.next()) {
				bv.setMaBaiViet(rs1.getInt(1));
				bv.setTenBaiViet(rs1.getString("TenBaiViet"));
				bv.setNoiDung(rs1.getString("NoiDung"));
				bv.setAnhMinhHoa(rs1.getString("AnhMinhHoa"));
				bv.setSoLuotTruyCap(rs1.getInt(5));
			}
			
			int count = bv.getSoLuotTruyCap();
			count = count+1;
			String command2 = "update TBL_BAIVIET set DIEMVOTE = ? where MABAIVIET=? ";
			PreparedStatement ps2 = con.connection.prepareStatement(command2);
			ps2.setInt(1, count);
			ps2.setInt(2, id);
			
			int rs2 = 0;
			rs2 = ps2.executeUpdate();
			
		}
		
		public List<BaiViet> sortTruyCap(List<BaiViet> baiviet){
			for (int i = 0; i < baiviet.size()-1; i++) {
				for (int j = i+1; j < baiviet.size(); j++) {
					if(baiviet.get(i).getSoLuotTruyCap() < baiviet.get(j).getSoLuotTruyCap()){
						BaiViet temp = new BaiViet();
						temp = baiviet.get(i);
						baiviet.set(i, baiviet.get(j));
						baiviet.set(j, temp);
			
						
					}
				}
			}
			return baiviet;
		}
		
		public static void main(String[] args) throws SQLException {
			DbBaiViet dbbt = new DbBaiViet();
			//List<BaiThuoc> list = new ArrayList<BaiThuoc>();
			List<BaiViet> list = dbbt.loadTen("gan");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}
			
			dbbt.updateLuotTruyCap(7);
			
			
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).toString());
//			}
//			
//			List<LuongY> list1 = dbbt.loadLuongYTuBenh("gan");
//			
//			for (int i = 0; i < list1.size(); i++) {
//				System.out.println(list1.get(i).toString());
//			}
//			
//			System.out.println(list1.size());
//			
		}
		
		
}
