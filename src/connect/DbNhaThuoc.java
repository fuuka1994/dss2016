package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.LuongY;
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
	
	public List<NhaThuoc> loadDiaChi(String keyWord) throws SQLException{
		List<NhaThuoc> list = new ArrayList<NhaThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * form Tbl_NhaThuoc where Lower(DiaChi) like ?";
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
	
	public void updateLuotTruyCap(int id) throws SQLException{
		NhaThuoc nt = new NhaThuoc();
		connect con = new connect();
		String command1 = "select *from TBL_NHATHUOC where MANHATHUOC=? ";
		PreparedStatement ps1 = connection.prepareStatement(command1);
		ps1.setInt(1, id);
		ResultSet rs1 = ps1.executeQuery();
		while (rs1.next()) {
			nt.setMaNhaThuoc(rs1.getInt(1));
			nt.setTenNhaThuoc(rs1.getString("TenNhaThuoc"));
			nt.setThongTin(rs1.getString("ThongTin"));
			nt.setDiaChi(rs1.getString("DiaChi"));
			nt.setSoLuotTruyCap(rs1.getInt(5));
		}
		
		int count = nt.getSoLuotTruyCap();
		count = count++;
		String command2 = "update TBL_NHATHUOC set SOLUONGTRUYCAP = ? where MANHATHUOC=? ";
		PreparedStatement ps2 = connection.prepareStatement(command2);
		ps2.setInt(1, count);
		ps2.setInt(2, id);
		
		int rs2 = 0;
		rs2 = ps2.executeUpdate();
		
	}
	
	public List<NhaThuoc> sortTruyCap(ArrayList<NhaThuoc> nhathuoc){
		for (int i = 0; i < nhathuoc.size()-1; i++) {
			for (int j = i+1; j < nhathuoc.size(); j++) {
				if(nhathuoc.get(i).getSoLuotTruyCap() < nhathuoc.get(j).getSoLuotTruyCap()){
					NhaThuoc temp = new NhaThuoc();
					temp = nhathuoc.get(i);
					nhathuoc.set(i, nhathuoc.get(j));
					nhathuoc.set(j, temp);
		
					
				}
			}
		}
		return nhathuoc;
	}
	
	
}
