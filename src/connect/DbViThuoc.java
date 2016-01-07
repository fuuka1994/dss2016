package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Benh;
import model.ViThuoc;

public class DbViThuoc extends connect {
	public List<ViThuoc> loadTen(String keyWord) throws SQLException{
		List<ViThuoc> list = new ArrayList<ViThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * form Tbl_ViThuoc where Lower(TenViThuoc) like ?";
		PreparedStatement ps = connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			ViThuoc vt = new ViThuoc();
			vt.setMaViThuoc(rs.getInt(1));
			vt.setTenViThuoc(rs.getString("TenViThuoc"));
			vt.setChuTri(rs.getString("ChuTri"));
			vt.setKiengKy(rs.getString("KiengKy"));
			vt.setTinhChat(rs.getString("TinhChat"));
			vt.setSoLuotTruyCap(rs.getInt(6));
			
			list.add(vt);
		}
		return list;
	}
}
