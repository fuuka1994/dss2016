package model;

public class LuongY {
	private int maLuongY;
	private String tenLuongY;
	private String thongTin;
	private String SDT;
	private int soLuotTruyCap;
	public LuongY() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LuongY(int maLuongY, String tenLuongY, String thongTin, String sDT, int soLuotTruyCap) {
		super();
		this.maLuongY = maLuongY;
		this.tenLuongY = tenLuongY;
		this.thongTin = thongTin;
		SDT = sDT;
		this.soLuotTruyCap = soLuotTruyCap;
	}
	public int getMaLuongY() {
		return maLuongY;
	}
	public void setMaLuongY(int maLuongY) {
		this.maLuongY = maLuongY;
	}
	public String getTenLuongY() {
		return tenLuongY;
	}
	public void setTenLuongY(String tenLuongY) {
		this.tenLuongY = tenLuongY;
	}
	public String getThongTin() {
		return thongTin;
	}
	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public int getSoLuotTruyCap() {
		return soLuotTruyCap;
	}
	public void setSoLuotTruyCap(int soLuotTruyCap) {
		this.soLuotTruyCap = soLuotTruyCap;
	}
	@Override
	public String toString() {
		return "LuongY [maLuongY=" + maLuongY + ", tenLuongY=" + tenLuongY + ", thongTin=" + thongTin + ", SDT=" + SDT
				+ ", soLuotTruyCap=" + soLuotTruyCap + "]";
	}
	
	
	
}
