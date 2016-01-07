package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.swing.internal.plaf.basic.resources.basic;

import model.BaiThuoc;
import model.BaiViet;
import model.Benh;
import model.LuongY;

public class DbBenh extends connect {
	public List<Benh> loadTen(String keyWord) throws SQLException{
		List<Benh> list = new ArrayList<Benh>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * form TBL_BENH where Lower(TENBENH) like ?";
		PreparedStatement ps = connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Benh b = new Benh();
			b.setMaBenh(rs.getInt(1));
			b.setTenBenh(rs.getString("TENBENH"));
			b.setThongTin(rs.getString("THONGTIN"));
			b.setTrieuChung(rs.getString("TRIEUCHUNG"));
			b.setKiengKy(rs.getString("KIENGKY"));
			b.setSoLuotTruyCap(rs.getInt(6));
			
			list.add(b);
		}
		return list;
	}
	
	public void updateLuotTruyCap(int id) throws SQLException{
		Benh b = new Benh();
		connect con = new connect();
		con.ketNoi();
		
		String command1 = "select *from TBL_BENH where MABENH = ?";
		PreparedStatement ps1 = connection.prepareStatement(command1);
		ps1.setInt(1, id);
		ResultSet rs1 = ps1.executeQuery();
		
		while(rs1.next()){
		
			b.setMaBenh(rs1.getInt(1));
			b.setTenBenh(rs1.getString("TENBENH"));
			b.setThongTin(rs1.getString("THONGTIN"));
			b.setTrieuChung(rs1.getString("TRIEUCHUNG"));
			b.setKiengKy(rs1.getString("KIENGKY"));
			b.setSoLuotTruyCap(rs1.getInt(6));
			
		}
		
		int count = b.getSoLuotTruyCap();
		count = count++;
		String command2 = "update TBL_BENH set SOLUONGTRUYCAP = ? where MABENH=? ";
		PreparedStatement ps2 = connection.prepareStatement(command2);
		ps2.setInt(1, count);
		ps2.setInt(2, id);
		
		int rs2 = 0;
		rs2 = ps2.executeUpdate();
		
	}
	
	public List<Benh> sortTruyCap(ArrayList<Benh> benh){
		for (int i = 0; i < benh.size()-1; i++) {
			for (int j = i+1; j < benh.size(); j++) {
				if(benh.get(i).getSoLuotTruyCap() < benh.get(j).getSoLuotTruyCap()){
					Benh temp = new Benh();
					temp = benh.get(i);
					benh.set(i, benh.get(j));
					benh.set(j, temp);
		
					
				}
			}
		}
		return benh;
	}
	
	public List<BaiThuoc> loadBaiThuocTuBenh(String keyWord) throws SQLException{
		List<BaiThuoc> list = new ArrayList<BaiThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "SELECT * FROM tbl_baithuocbenh INNER JOIN tbl_baithuoc ON tbl_baithuocbenh.mabaithuoc = tbl_baithuoc.mabaithuoc INNER JOIN tbl_benh ON tbl_baithuocbenh.mabenh = tbl_benh.mabenh where Lower(TenBenh) like ?";
		PreparedStatement ps = connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			BaiThuoc bt = new BaiThuoc();
			bt.setMaBaiThuoc(rs.getInt(1));
			bt.setTenBaiThuoc(rs.getString("TenBaiThuoc"));
			bt.setThongTin(rs.getString("ThongTin"));
			bt.setCachDung(rs.getString("CachDung"));
			bt.setSoLuotTruyCap(rs.getInt(5));
			
			list.add(bt);
		}
		return list;
		
	}
	public List<LuongY> loadLuongYTuBenh(String keyWord) throws SQLException{
		List<LuongY> list = new ArrayList<LuongY>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "SELECT * FROM tbl_luongybenh INNER JOIN tbl_luongy ON tbl_luongybenh.maluongy = tbl_luongy.maluongy INNER JOIN tbl_benh ON tbl_luongybenh.mabenh = tbl_benh.mabenh where Lower(TenBenh) like ?";
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
	
}
