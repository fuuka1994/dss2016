package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Benh;
import model.LuongY;
import model.NhaThuoc;
import oracle.net.aso.l;

public class DbLuongY extends connect {
	public List<LuongY> loadTen(String keyWord) throws SQLException{
		List<LuongY> list = new ArrayList<LuongY>();
		connect con = new connect();
		con.ketNoi();
		String word = "%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * from Tbl_LuongY where Lower(Ten) like ?";
		PreparedStatement ps = con.connection.prepareStatement(command);
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
			ly.setDiemVote(rs.getInt(7));
			
			list.add(ly);
		}
		return list;
	}
	
	public void updateLuotTruyCap(int id) throws SQLException{
		LuongY ly = new LuongY();
		connect con = new connect();
		con.ketNoi();
		String command1 = "select * from TBL_LUONGY where MALUONGY = ? ";
		PreparedStatement ps1 = con.connection.prepareStatement(command1);
		ps1.setInt(1, id);
		ResultSet rs1 = ps1.executeQuery();
		while (rs1.next()) {
			
			ly.setMaLuongY(rs1.getInt(1));
			ly.setTen(rs1.getString("Ten"));
			ly.setThongTin(rs1.getString("ThongTin"));
			ly.setsDT(rs1.getString("SDT"));
			ly.setTrangThai(rs1.getInt(5));
			ly.setSoLuotTruyCap(rs1.getInt(6));
			ly.setDiemVote(rs1.getInt(7));
		}
		
		int count = ly.getSoLuotTruyCap();
		System.out.println(count);
		count = count+1;
		String command2 = "update TBL_LUONGY set SOLUOTTRUYCAP = ? where MALUONGY=? ";
		PreparedStatement ps2 = con.connection.prepareStatement(command2);
		ps2.setInt(1, count);
		ps2.setInt(2, id);
		
		int rs2 = 0;
		rs2 = ps2.executeUpdate();
		
	}
	
	public void updateDiemVote(int id, int p) throws SQLException{
		LuongY ly = new LuongY();
		connect con = new connect();
		con.ketNoi();
		String command1 = "select * from TBL_LUONGY where MALUONGY = ? ";
		PreparedStatement ps1 = con.connection.prepareStatement(command1);
		ps1.setInt(1, id);
		ResultSet rs1 = ps1.executeQuery();
		while (rs1.next()) {
			
			ly.setMaLuongY(rs1.getInt(1));
			ly.setTen(rs1.getString("Ten"));
			ly.setThongTin(rs1.getString("ThongTin"));
			ly.setsDT(rs1.getString("SDT"));
			ly.setTrangThai(rs1.getInt(5));
			ly.setSoLuotTruyCap(rs1.getInt(6));
			ly.setDiemVote(rs1.getInt(7));
		}
		
		int count = ly.getSoLuotTruyCap();
		System.out.println(count);
		count = p;
		String command2 = "update TBL_LUONGY set DIEMVOTE = ? where MALUONGY=? ";
		PreparedStatement ps2 = con.connection.prepareStatement(command2);
		ps2.setInt(1, count);
		ps2.setInt(2, id);
		
		int rs2 = 0;
		rs2 = ps2.executeUpdate();
		
	}
	
	public List<LuongY> sortTruyCap(List<LuongY> luongy){
		for (int i = 0; i < luongy.size()-1; i++) {
			for (int j = i+1; j < luongy.size(); j++) {
				if(luongy.get(i).getSoLuotTruyCap() < luongy.get(j).getSoLuotTruyCap()){
					LuongY temp = new LuongY();
					temp = luongy.get(i);
					luongy.set(i, luongy.get(j));
					luongy.set(j, temp);
		
					
				}
			}
		}
		return luongy;
	}
	
	
	public List<NhaThuoc> loadNhaThuocTuLuongY(String keyWord) throws SQLException{
		List<NhaThuoc> list = new ArrayList<NhaThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "SELECT tbl_nhathuoc.manhathuoc, tbl_nhathuoc.tennhathuoc, tbl_nhathuoc.thongtin, tbl_nhathuoc.diachi, tbl_nhathuoc.soluottruycap, tbl_nhathuoc.diemvote FROM tbl_luongynhathuoc INNER JOIN tbl_nhathuoc ON tbl_luongynhathuoc.manhathuoc = tbl_nhathuoc.manhathuoc INNER JOIN tbl_luongy ON tbl_luongynhathuoc.maluongy = tbl_luongy.maluongy where Lower(Ten) like ?";
		PreparedStatement ps = con.connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			NhaThuoc nt = new NhaThuoc();
			nt.setMaNhaThuoc(rs.getInt(1));
			nt.setTenNhaThuoc(rs.getString("TenNhaThuoc"));
			nt.setThongTin(rs.getString("ThongTin"));
			nt.setDiaChi(rs.getString("DiaChi"));
			nt.setSoLuotTruyCap(rs.getInt(5));
			nt.setDiemVote(rs.getInt(6));
			
			list.add(nt);		}
		return list;	
	}
	public List<Benh> loadBenhTuLuongY(String keyWord) throws SQLException{
		List<Benh> list = new ArrayList<Benh>();
		connect con = new connect();
		con.ketNoi();
		String word = "%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "SELECT tbl_benh.mabenh, tbl_benh.tenbenh, tbl_benh.thongtin, tbl_benh.trieuchung, tbl_benh.kiengky, tbl_benh.soluottruycap, tbl_benh.diemvote FROM tbl_luongybenh INNER JOIN tbl_luongy ON tbl_luongybenh.maluongy = tbl_luongy.maluongy INNER JOIN tbl_benh ON tbl_luongybenh.mabenh = tbl_benh.mabenh where Lower(Ten) like ?";
		PreparedStatement ps = con.connection.prepareStatement(command);
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
			b.setDiemVote(rs.getInt(7));
			
			list.add(b);
		}
		return list;
		
	}
//	public static void main(String[] args) throws SQLException {
//		DbLuongY dbbt = new DbLuongY();
//		//List<BaiThuoc> list = new ArrayList<BaiThuoc>();
//		List<LuongY> list = dbbt.loadTen("duy");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
//		
//		dbbt.updateLuotTruyCap(7);
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
//		List<Benh> list1 = dbbt.loadBenhTuLuongY("duy");
////		
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println(list1.get(i).toString());
//		}
//		
//		System.out.println(list1.size());
//		
//	}
	
}
