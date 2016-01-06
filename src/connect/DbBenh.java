package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.BaiThuoc;
import model.Benh;

public class DbBenh extends connect {
	public List<Benh> loadTen(String keyWord) throws SQLException{
		List<Benh> list = new ArrayList<Benh>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * form Tbl_Benh where Lower(TenBenh) like ?";
		PreparedStatement ps = connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Benh b = new Benh();
			b.setMaBenh(rs.getInt(1));
			b.setTenBenh(rs.getString("TenBenh"));
			b.setThongTin(rs.getString("Thongtin"));
			b.setTrieuChung(rs.getString("TrieuChung"));
			b.setKiengKy(rs.getString("KiengKy"));
			b.setSoLuotTruyCap(rs.getInt(6));
			
			list.add(b);
		}
		return list;
	}
}
