package connect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.*;
public class DbBaiThuoc {
	public static List<BaiThuoc> loadAll() throws SQLException{
		List<BaiThuoc> list = new ArrayList<BaiThuoc>();
		connect con = new connect();
		con.ketNoi();
		String command = "select * from baithuoc";
		ResultSet rs = con.xxx(command);
		while(rs.next()){
			BaiThuoc bt = new BaiThuoc();
			bt.setMaBaiThuoc(rs.getInt(1));
			bt.setTenBaiThuoc(rs.getString("tenbaithuoc"));
			bt.setThongTin(rs.getString("thongtin"));
			bt.setCachDung(rs.getString("cachdung"));
			bt.setSoLuongTruyCap(rs.getInt(5));
			
			list.add(bt);
		}
		return list;
	}
}
