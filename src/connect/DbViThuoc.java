package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.BaiThuoc;
import model.Benh;
import model.NhaThuoc;
import model.ViThuoc;

public class DbViThuoc extends connect {
	public List<ViThuoc> loadTen(String keyWord) throws SQLException{
		List<ViThuoc> list = new ArrayList<ViThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * from Tbl_ViThuoc where Lower(TenViThuoc) like ?";
		PreparedStatement ps = con.connection.prepareStatement(command);
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
			vt.setDiemVote(rs.getInt(7));
			
			list.add(vt);
		}
		return list;
	}
	
	public void updateLuotTruyCap(int id) throws SQLException{
		ViThuoc vt = new ViThuoc();
		connect con = new connect();
		con.ketNoi();
		
		String command1 = "select *from TBL_VITHUOC where MAVITHUOC = ?";
		PreparedStatement ps1 = con.connection.prepareStatement(command1);
		ps1.setInt(1, id);
		ResultSet rs1 = ps1.executeQuery();
		
		while(rs1.next()){
		
			vt.setMaViThuoc(rs1.getInt(1));
			vt.setTenViThuoc(rs1.getString("TenViThuoc"));
			vt.setChuTri(rs1.getString("ChuTri"));
			vt.setKiengKy(rs1.getString("KiengKy"));
			vt.setTinhChat(rs1.getString("TinhChat"));
			vt.setSoLuotTruyCap(rs1.getInt(6));
			vt.setDiemVote(rs1.getInt(7));
			
		}
		
		int count = vt.getSoLuotTruyCap();
		count = count+1;
		String command2 = "update TBL_VITHUOC set SOLUOTTRUYCAP = ? where MAVITHUOC=? ";
		PreparedStatement ps2 = con.connection.prepareStatement(command2);
		ps2.setInt(1, count);
		ps2.setInt(2, id);
		
		int rs2 = 0;
		rs2 = ps2.executeUpdate();
		
	}
	
	public void updateDiemVote(int id, int p) throws SQLException{
		ViThuoc vt = new ViThuoc();
		connect con = new connect();
		con.ketNoi();
		
		String command1 = "select *from TBL_VITHUOC where MAVITHUOC = ?";
		PreparedStatement ps1 = con.connection.prepareStatement(command1);
		ps1.setInt(1, id);
		ResultSet rs1 = ps1.executeQuery();
		
		while(rs1.next()){
		
			vt.setMaViThuoc(rs1.getInt(1));
			vt.setTenViThuoc(rs1.getString("TenViThuoc"));
			vt.setChuTri(rs1.getString("ChuTri"));
			vt.setKiengKy(rs1.getString("KiengKy"));
			vt.setTinhChat(rs1.getString("TinhChat"));
			vt.setSoLuotTruyCap(rs1.getInt(6));
			vt.setDiemVote(rs1.getInt(7));
			
		}
		
		int count = vt.getSoLuotTruyCap();
		count = p;
		String command2 = "update TBL_VITHUOC set DIEMVOTE = ? where MAVITHUOC=? ";
		PreparedStatement ps2 = con.connection.prepareStatement(command2);
		ps2.setInt(1, count);
		ps2.setInt(2, id);
		
		int rs2 = 0;
		rs2 = ps2.executeUpdate();
		
	}
	
	public List<ViThuoc> sortTruyCap(List<ViThuoc> vithuoc){
		for (int i = 0; i < vithuoc.size()-1; i++) {
			for (int j = i+1; j < vithuoc.size(); j++) {
				if(vithuoc.get(i).getSoLuotTruyCap() < vithuoc.get(j).getSoLuotTruyCap()){
					ViThuoc temp = new ViThuoc();
					temp = vithuoc.get(i);
					vithuoc.set(i, vithuoc.get(j));
					vithuoc.set(j, temp);
		
					
				}
			}
		}
		return vithuoc;
	}
	public List<BaiThuoc> loadBaithuocTuVithuoc(String keyWord) throws SQLException{
		List<BaiThuoc> list = new ArrayList<BaiThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "SELECT tbl_baithuoc.mabaithuoc, tbl_baithuoc.tenbaithuoc, tbl_baithuoc.thongtin, tbl_baithuoc.cachdung, tbl_baithuoc.soluottruycap, tbl_baithuoc.diemvote FROM tbl_baithuocvithuoc INNER JOIN tbl_vithuoc ON tbl_baithuocvithuoc.mavithuoc = tbl_vithuoc.mavithuoc INNER JOIN tbl_baithuoc ON tbl_baithuocvithuoc.mabaithuoc = tbl_baithuoc.mabaithuoc where Lower(TenViThuoc) like ?";
		PreparedStatement ps = con.connection.prepareStatement(command);
		ps.setString(1,word);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			BaiThuoc bt = new BaiThuoc();
			bt.setMaBaiThuoc(rs.getInt(1));
			bt.setTenBaiThuoc(rs.getString("TenBaiThuoc"));
			bt.setThongTin(rs.getString("ThongTin"));
			bt.setCachDung(rs.getString("CachDung"));
			bt.setSoLuotTruyCap(rs.getInt(5));
			bt.setDiemVote(rs.getInt(6));
			
			list.add(bt);
		}
		return list;
	}
	
//	public static void main(String[] args) throws SQLException {
//		DbViThuoc dbbt = new DbViThuoc();
//		//List<BaiThuoc> list = new ArrayList<BaiThuoc>();
//		List<ViThuoc> list = dbbt.loadTen("gai");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
//		
//	dbbt.updateLuotTruyCap(7);
////		
//	
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
////		
//		List<BaiThuoc> list1 = dbbt.loadBaithuocTuVithuoc("gai");
//		
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println(list1.get(i).toString());
//		}
//		
//		System.out.println(list1.size());
//		
//	}
}
