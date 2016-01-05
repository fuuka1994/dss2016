package model;

public class CayThuoc {
	private int maCayThuoc;
	private String tenCayThuoc;
	private String thongTin;
	private int soLuotTruyCap;
	
	public CayThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CayThuoc(int maCayThuoc, String tenCayThuoc, String thongTin, int soLuotTruyCap) {
		super();
		this.maCayThuoc = maCayThuoc;
		this.tenCayThuoc = tenCayThuoc;
		this.thongTin = thongTin;
		this.soLuotTruyCap = soLuotTruyCap;
	}
	public int getMaCayThuoc() {
		return maCayThuoc;
	}
	public void setMaCayThuoc(int maCayThuoc) {
		this.maCayThuoc = maCayThuoc;
	}
	public String getTenCayThuoc() {
		return tenCayThuoc;
	}
	public void setTenCayThuoc(String tenCayThuoc) {
		this.tenCayThuoc = tenCayThuoc;
	}
	public String getThongTin() {
		return thongTin;
	}
	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}
	public int getSoLuotTruyCap() {
		return soLuotTruyCap;
	}
	public void setSoLuotTruyCap(int soLuotTruyCap) {
		this.soLuotTruyCap = soLuotTruyCap;
	}
	@Override
	public String toString() {
		return "CayThuoc [maCayThuoc=" + maCayThuoc + ", tenCayThuoc=" + tenCayThuoc + ", thongTin=" + thongTin
				+ ", soLuotTruyCap=" + soLuotTruyCap + "]";
	}
	
	
}


