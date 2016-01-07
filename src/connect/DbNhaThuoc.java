package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.NhaThuoc;
import model.ViThuoc;

public class DbNhaThuoc extends connect {
	public List<NhaThuoc> loadTen(String keyWord) throws SQLException{
		List<NhaThuoc> list = new ArrayList<NhaThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * form Tbl_NhaThuoc where Lower(TenNhaThuoc) like ?";
		PreparedStatement ps = connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			NhaThuoc nt = new NhaThuoc();
			nt.setMaNhaThuoc(rs.getInt(1));
			nt.setTenNhaThuoc(rs.getString("TenNhaThuoc"));
			nt.setThongTin(rs.getString("ThongTin"));
			nt.setDiaChi(rs.getString("DiaChi"));
			nt.setSoLuotTruyCap(rs.getInt(5));
			
			list.add(nt);
		}
		return list;
	}
}
