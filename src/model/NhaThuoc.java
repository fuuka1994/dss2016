package model;

public class NhaThuoc {
	private int maNhaThuoc;
	private String tenNhaThuoc;
	private String thongTin;
	private String diaChi;
	private int soLuotTruyCap;
	public NhaThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhaThuoc(int maNhaThuoc, String tenNhaThuoc, String thongTin, String diaChi, int soLuotTruyCap) {
		super();
		this.maNhaThuoc = maNhaThuoc;
		this.tenNhaThuoc = tenNhaThuoc;
		this.thongTin = thongTin;
		this.diaChi = diaChi;
		this.soLuotTruyCap = soLuotTruyCap;
	}
	public int getMaNhaThuoc() {
		return maNhaThuoc;
	}
	public void setMaNhaThuoc(int maNhaThuoc) {
		this.maNhaThuoc = maNhaThuoc;
	}
	public String getTenNhaThuoc() {
		return tenNhaThuoc;
	}
	public void setTenNhaThuoc(String tenNhaThuoc) {
		this.tenNhaThuoc = tenNhaThuoc;
	}
	public String getThongTin() {
		return thongTin;
	}
	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getSoLuotTruyCap() {
		return soLuotTruyCap;
	}
	public void setSoLuotTruyCap(int soLuotTruyCap) {
		this.soLuotTruyCap = soLuotTruyCap;
	}
	@Override
	public String toString() {
		return "NhaThuoc [maNhaThuoc=" + maNhaThuoc + ", tenNhaThuoc=" + tenNhaThuoc + ", thongTin=" + thongTin
				+ ", diaChi=" + diaChi + ", soLuotTruyCap=" + soLuotTruyCap + "]";
	}
	
	
}
