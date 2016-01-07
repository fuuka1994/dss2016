package model;

public class LuongY {
	private int maLuongY;
	private String ten;
	private String thongTin;
	private String sDT;
	private int trangThai;
	private int soLuotTruyCap;
	public LuongY() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LuongY(int maLuongY, String ten, String thongTin, String sDT, int trangThai, int soLuotTruyCap) {
		super();
		this.maLuongY = maLuongY;
		this.ten = ten;
		this.thongTin = thongTin;
		this.sDT = sDT;
		this.trangThai = trangThai;
		this.soLuotTruyCap = soLuotTruyCap;
	}
	public int getMaLuongY() {
		return maLuongY;
	}
	public void setMaLuongY(int maLuongY) {
		this.maLuongY = maLuongY;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getThongTin() {
		return thongTin;
	}
	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	public int getSoLuotTruyCap() {
		return soLuotTruyCap;
	}
	public void setSoLuotTruyCap(int soLuotTruyCap) {
		this.soLuotTruyCap = soLuotTruyCap;
	}
	@Override
	public String toString() {
		return "LuongY [maLuongY=" + maLuongY + ", ten=" + ten + ", thongTin=" + thongTin + ", sDT=" + sDT
				+ ", trangThai=" + trangThai + ", soLuotTruyCap=" + soLuotTruyCap + "]";
	}
	
	
	
	
	
	
}
