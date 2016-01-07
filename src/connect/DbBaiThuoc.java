package connect;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.*;
public class DbBaiThuoc extends connect {
	
	public List<BaiThuoc> loadTen(String keyWord) throws SQLException{
		List<BaiThuoc> list = new ArrayList<BaiThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * form TBL_BAITHUOC where Lower(TENBAITHUOC) like ?";
		PreparedStatement ps = connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			BaiThuoc bt = new BaiThuoc();
			bt.setMaBaiThuoc(rs.getInt(1));
			bt.setTenBaiThuoc(rs.getString("TENBAITHUOC"));
			bt.setThongTin(rs.getString("THONGTIN"));
			bt.setCachDung(rs.getString("CACHDUNG"));
			bt.setSoLuotTruyCap(rs.getInt(5));
			
			list.add(bt);
		}
		return list;
	}
	
	public void updateLuotTruyCap(int id) throws SQLException{
		BaiThuoc bt = new BaiThuoc();
		connect con = new connect();
		con.ketNoi();
		
		String command1 = "select *from TBL_BAITHUOC where MABAITHUOC=? ";
		PreparedStatement ps1 = connection.prepareStatement(command1);
		ps1.setInt(1, id);
		ResultSet rs1 = ps1.executeQuery();
		while (rs1.next()) {
			bt.setMaBaiThuoc(rs1.getInt(1));
			bt.setTenBaiThuoc(rs1.getString("TENBAITHUOC"));
			bt.setThongTin(rs1.getString("THONGTIN"));
			bt.setCachDung(rs1.getString("CACHDUNG"));
			bt.setSoLuotTruyCap(rs1.getInt(5));	
		}
		
		int count = bt.getSoLuotTruyCap();
		count = count++;
		String command2 = "update TBL_BAITHUOC set SOLUONGTRUYCAP = ? where MABAITHUOC=? ";
		PreparedStatement ps2 = connection.prepareStatement(command2);
		ps2.setInt(1, count);
		ps2.setInt(2, id);
		
		int rs2 = 0;
		rs2 = ps2.executeUpdate();
		
		
	}
	
	public List<BaiThuoc> sortTruyCap(ArrayList<BaiThuoc> baithuoc){
		for (int i = 0; i < baithuoc.size()-1; i++) {
			for (int j = i+1; j < baithuoc.size(); j++) {
				if(baithuoc.get(i).getSoLuotTruyCap() < baithuoc.get(j).getSoLuotTruyCap()){
					BaiThuoc temp = new BaiThuoc();
					temp = baithuoc.get(i);
					baithuoc.set(i, baithuoc.get(j));
					baithuoc.set(j, temp);
		
					
				}
			}
		}
		return baithuoc;
	}
	
	public List<ViThuoc> loadViThuocTuBaiThuoc(String keyWord) throws SQLException{
		List<ViThuoc> list = new ArrayList<ViThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "SELECT * FROM tbl_baithuocvithuoc INNER JOIN tbl_vithuoc ON tbl_baithuoccaythuoc.mavithuoc = tbl_vithuoc.mavithuoc INNER JOIN tbl_baithuoc ON tbl_baithuoccaythuoc.mabaithuoc = tbl_caythuoc.mabaithuoc where Lower(TenBaiThuoc) like ?";
		PreparedStatement ps = connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			ViThuoc bt = new ViThuoc();
			bt.setMaViThuoc(rs.getInt(1));
			bt.setTenViThuoc(rs.getString("TENVITHUOC"));
			bt.setChuTri(rs.getString("CHUTRI"));
			bt.setKiengKy(rs.getString("KIENGKY"));
			bt.setTinhChat(rs.getString("TINHCHAT"));
			bt.setSoLuotTruyCap(rs.getInt(6));
			
			list.add(bt);
		}
		return list;
	}
	
	public List<NhaThuoc> loadNhaThuocTuBaiThuoc(String keyWord) throws SQLException{
		List<NhaThuoc> list = new ArrayList<NhaThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "SELECT * FROM tbl_nhathuocbaithuoc INNER JOIN tbl_nhathuoc ON tbl_baithuoccaythuoc.nhathuoc = tbl_vithuoc.nhathuoc INNER JOIN tbl_baithuoc ON tbl_nhathuocbaithuoc.mabaithuoc = tbl_caythuoc.mabaithuoc where Lower(TenBaiThuoc) like ?";
		PreparedStatement ps = connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			NhaThuoc bt = new NhaThuoc();
			bt.setMaNhaThuoc(rs.getInt(1));
			bt.setTenNhaThuoc(rs.getString("TENNHATHUOC"));
			bt.setThongTin(rs.getString("THONGTIN"));
			bt.setDiaChi(rs.getString("DIACHI"));
			bt.setSoLuotTruyCap(rs.getInt(5));
			
			list.add(bt);
		}
		return list;	
	}
	
	public List<Benh> loadBenhTuBaiThuoc(String keyWord) throws SQLException{
		List<Benh> list = new ArrayList<Benh>();
		connect con = new connect();
		con.ketNoi();
		String word = "N%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "SELECT * FROM tbl_baithuocbenh INNER JOIN tbl_baithuoc ON tbl_baithuocbenh.mabaithuoc = tbl_baithuoc.mabaithuoc INNER JOIN tbl_benh ON tbl_baithuocbenh.mabenh = tbl_benh.mabenh where Lower(TenBaiThuoc) like ?";
		PreparedStatement ps = connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Benh bt = new Benh();
			bt.setMaBenh(rs.getInt(1));
			bt.setTenBenh(rs.getString("TENBENH"));
			bt.setThongTin(rs.getString("THONGTIN"));
			bt.setTrieuChung(rs.getString("TRIEUCHUNG"));
			bt.setKiengKy(rs.getString("KIENGKY"));
			bt.setSoLuotTruyCap(rs.getInt(6));
			
			list.add(bt);
		}
		return list;
		
	}
	
	
	
	
}
