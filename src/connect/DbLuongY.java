package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.LuongY;

public class DbLuongY extends connect {
	public List<LuongY> loadTen(String keyWord) throws SQLException{
		List<LuongY> list = new ArrayList<LuongY>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * form Tbl_LuongY where Lower(Ten) like ?";
		PreparedStatement ps = connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			LuongY ly = new LuongY();
			ly.setMaLuongY(rs.getInt(1));
			ly.setTen(rs.getString("Ten"));
			ly.setThongTin(rs.getString("ThongTin"));
			ly.setsDT(rs.getString("SDT"));
			ly.setTrangThai(rs.getInt(5));
			ly.setSoLuotTruyCap(rs.getInt(6));
			
			list.add(ly);
		}
		return list;
	}
	
	public void updateLuotTruyCap(int id) throws SQLException{
		LuongY ly = new LuongY();
		connect con = new connect();
		String command1 = "select *from TBL_LUONGY where MALUONGY=? ";
		PreparedStatement ps1 = connection.prepareStatement(command1);
		ps1.setInt(1, id);
		ResultSet rs1 = ps1.executeQuery();
		while (rs1.next()) {
			ly.setMaLuongY(rs1.getInt(1));
			ly.setTen(rs1.getString("Ten"));
			ly.setThongTin(rs1.getString("ThongTin"));
			ly.setsDT(rs1.getString("SDT"));
			ly.setTrangThai(rs1.getInt(5));
			ly.setSoLuotTruyCap(rs1.getInt(6));
		}
		
		int count = ly.getSoLuotTruyCap();
		count = count++;
		String command2 = "update TBL_BAITHUOC set SOLUONGTRUYCAP = ? where MALUONGY=? ";
		PreparedStatement ps2 = connection.prepareStatement(command2);
		ps2.setInt(1, count);
		ps2.setInt(2, id);
		
		int rs2 = 0;
		rs2 = ps2.executeUpdate();
		
	}
}
