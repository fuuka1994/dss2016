package model;

public class NhomBenh {
	private int maNhomBenh;
	private String tenNhomBenh;
	private String thongTin;
	private int soLuotTruyCap;
	public NhomBenh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhomBenh(int maNhomBenh, String tenNhomBenh, String thongTin, int soLuotTruyCap) {
		super();
		this.maNhomBenh = maNhomBenh;
		this.tenNhomBenh = tenNhomBenh;
		this.thongTin = thongTin;
		this.soLuotTruyCap = soLuotTruyCap;
	}
	public int getMaNhomBenh() {
		return maNhomBenh;
	}
	public void setMaNhomBenh(int maNhomBenh) {
		this.maNhomBenh = maNhomBenh;
	}
	public String getTenNhomBenh() {
		return tenNhomBenh;
	}
	public void setTenNhomBenh(String tenNhomBenh) {
		this.tenNhomBenh = tenNhomBenh;
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
		return "NhomBenh [maNhomBenh=" + maNhomBenh + ", tenNhomBenh=" + tenNhomBenh + ", thongTin=" + thongTin
				+ ", soLuotTruyCap=" + soLuotTruyCap + "]";
	}
	
	
}
