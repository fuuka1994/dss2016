package connect;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import model.BaiThuoc;

public class TestConnect {
	public static void main(String[] args) {
		try {
			connect con = new connect();
			con.ketNoi();
			List<BaiThuoc> baithuoc = new DbBaiThuoc().loadTen("");
			for (BaiThuoc baiThuoc2 : baithuoc) {
				System.out.println(baiThuoc2.toString());
			}
			System.out.println(baithuoc.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
