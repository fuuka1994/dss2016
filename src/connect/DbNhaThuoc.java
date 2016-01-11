package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.BaiThuoc;
import model.LuongY;
import model.NhaThuoc;
import model.ViThuoc;

public class DbNhaThuoc extends connect {
	public List<NhaThuoc> loadTen(String keyWord) throws SQLException{
		List<NhaThuoc> list = new ArrayList<NhaThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * from Tbl_NhaThuoc where Lower(TenNhaThuoc) like ?";
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
			
			list.add(nt);
		}
		return list;
	}
	
	public List<NhaThuoc> loadDiaChi(String keyWord) throws SQLException{
		List<NhaThuoc> list = new ArrayList<NhaThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "select * from Tbl_NhaThuoc where Lower(DiaChi) like ?";
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
			
			list.add(nt);
		}
		return list;
	}
	
	public void updateLuotTruyCap(int id) throws SQLException{
		NhaThuoc nt = new NhaThuoc();
		connect con = new connect();
		con.ketNoi();
		String command1 = "select *from TBL_NHATHUOC where MANHATHUOC=? ";
		PreparedStatement ps1 = con.connection.prepareStatement(command1);
		ps1.setInt(1, id);
		ResultSet rs1 = ps1.executeQuery();
		while (rs1.next()) {
			nt.setMaNhaThuoc(rs1.getInt(1));
			nt.setTenNhaThuoc(rs1.getString("TenNhaThuoc"));
			nt.setThongTin(rs1.getString("ThongTin"));
			nt.setDiaChi(rs1.getString("DiaChi"));
			nt.setSoLuotTruyCap(rs1.getInt(5));
			nt.setDiemVote(rs1.getInt(6));
		}
		
		int count = nt.getSoLuotTruyCap();
		count = count+1;
		String command2 = "update TBL_NHATHUOC set SOLUOTTRUYCAP = ? where MANHATHUOC=? ";
		PreparedStatement ps2 = con.connection.prepareStatement(command2);
		ps2.setInt(1, count);
		ps2.setInt(2, id);
		
		int rs2 = 0;
		rs2 = ps2.executeUpdate();
		
	}
	
	public void updateDiemVote(int id, int p) throws SQLException{
		NhaThuoc nt = new NhaThuoc();
		connect con = new connect();
		con.ketNoi();
		String command1 = "select *from TBL_NHATHUOC where MANHATHUOC=? ";
		PreparedStatement ps1 = con.connection.prepareStatement(command1);
		ps1.setInt(1, id);
		ResultSet rs1 = ps1.executeQuery();
		while (rs1.next()) {
			nt.setMaNhaThuoc(rs1.getInt(1));
			nt.setTenNhaThuoc(rs1.getString("TenNhaThuoc"));
			nt.setThongTin(rs1.getString("ThongTin"));
			nt.setDiaChi(rs1.getString("DiaChi"));
			nt.setSoLuotTruyCap(rs1.getInt(5));
			nt.setDiemVote(rs1.getInt(6));
		}
		
		int count = nt.getSoLuotTruyCap();
		count = p;
		String command2 = "update TBL_NHATHUOC set DIEMVOTE = ? where MANHATHUOC=? ";
		PreparedStatement ps2 = con.connection.prepareStatement(command2);
		ps2.setInt(1, count);
		ps2.setInt(2, id);
		
		int rs2 = 0;
		rs2 = ps2.executeUpdate();
		
	}
	
	public List<NhaThuoc> sortTruyCap(List<NhaThuoc> nhathuoc){
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
	
	public List<BaiThuoc> loadBaiThuocTuNhaThuoc(String keyWord) throws SQLException{
		List<BaiThuoc> list = new ArrayList<BaiThuoc>();
		connect con = new connect();
		con.ketNoi();
		String word = "%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "SELECT tbl_baithuoc.mabaithuoc, tbl_baithuoc.tenbaithuoc, tbl_baithuoc.thongtin, tbl_baithuoc.cachdung, tbl_baithuoc.soluottruycap, tbl_baithuoc.diemvote FROM tbl_nhathuocbaithuoc INNER JOIN tbl_nhathuoc ON tbl_nhathuocbaithuoc.manhathuoc = tbl_nhathuoc.manhathuoc INNER JOIN tbl_baithuoc ON tbl_nhathuocbaithuoc.mabaithuoc = tbl_baithuoc.mabaithuoc where Lower(TenNhaThuoc) like ?";
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
			
			list.add(bt);		}
		return list;	
	}
	public List<LuongY> loadLuongYTuNhaThuoc(String keyWord) throws SQLException{
		List<LuongY> list = new ArrayList<LuongY>();
		connect con = new connect();
		con.ketNoi();
		String word = "%"+keyWord+"%";
		word = word.toLowerCase();
		String command = "SELECT tbl_luongy.maluongy, tbl_luongy.ten, tbl_luongy.thongtin, tbl_luongy.sdt, tbl_luongy.trangthai, tbl_luongy.soluottruycap, tbl_luongy.diemvote FROM tbl_luongynhathuoc INNER JOIN tbl_nhathuoc ON tbl_luongynhathuoc.manhathuoc = tbl_nhathuoc.manhathuoc INNER JOIN tbl_luongy ON tbl_luongynhathuoc.maluongy = tbl_luongy.maluongy where Lower(TenNhaThuoc) like ?";
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
	
//	public static void main(String[] args) throws SQLException {
//		DbNhaThuoc dbbt = new DbNhaThuoc();
//		//List<BaiThuoc> list = new ArrayList<BaiThuoc>();
////		List<NhaThuoc> list = dbbt.loadDiaChi("nai");
////		for (int i = 0; i < list.size(); i++) {
////			System.out.println(list.get(i).toString());
////		}
////		
////	dbbt.updateLuotTruyCap(7);
//////		
////		for (int i = 0; i < list.size(); i++) {
////			System.out.println(list.get(i).toString());
////		}
//		List<LuongY> list1 = dbbt.loadLuongYTuNhaThuoc("an");
////		
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println(list1.get(i).toString());
//		}
//	}
}
