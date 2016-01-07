package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.BaiViet;
import model.LuongY;


	public class DbBaiViet extends connect {
		public List<BaiViet> loadTen(String keyWord) throws SQLException{
			List<BaiViet> list = new ArrayList<BaiViet>();
			connect con = new connect();
			con.ketNoi();
			String word = "N%"+keyWord+"%";
			word = word.toLowerCase();
			String command = "select * form Tbl_BaiViet where Lower(Ten) like ?";
			PreparedStatement ps = connection.prepareStatement(command);
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
			PreparedStatement ps1 = connection.prepareStatement(command1);
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
			count = count++;
			String command2 = "update TBL_BAIVIET set SOLUONGTRUYCAP = ? where MABAIVIET=? ";
			PreparedStatement ps2 = connection.prepareStatement(command2);
			ps2.setInt(1, count);
			ps2.setInt(2, id);
			
			int rs2 = 0;
			rs2 = ps2.executeUpdate();
			
		}
}
