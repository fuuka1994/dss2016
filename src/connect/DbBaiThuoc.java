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
	
	
	
	
	
}
