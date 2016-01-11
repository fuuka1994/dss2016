package model;

public class BaiThuoc {
	private int maBaiThuoc;
	private String tenBaiThuoc;
	private String thongTin;
	private String cachDung;
	private int soLuotTruyCap;
	private int diemVote;
	
	public int getDiemVote() {
		return diemVote;
	}
	public void setDiemVote(int diemVote) {
		this.diemVote = diemVote;
	}
	public BaiThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaiThuoc(int maBaiThuoc, String tenBaiThuoc, String thongTin, String cachDung, int soLuongTruyCap) {
		super();
		this.maBaiThuoc = maBaiThuoc;
		this.tenBaiThuoc = tenBaiThuoc;
		this.thongTin = thongTin;
		this.cachDung = cachDung;
		this.soLuotTruyCap = soLuongTruyCap;
	}
	public int getMaBaiThuoc() {
		return maBaiThuoc;
	}
	public void setMaBaiThuoc(int maBaiThuoc) {
		this.maBaiThuoc = maBaiThuoc;
	}
	public String getTenBaiThuoc() {
		return tenBaiThuoc;
	}
	public void setTenBaiThuoc(String tenBaiThuoc) {
		this.tenBaiThuoc = tenBaiThuoc;
	}
	public String getThongTin() {
		return thongTin;
	}
	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}
	public String getCachDung() {
		return cachDung;
	}
	public void setCachDung(String cachDung) {
		this.cachDung = cachDung;
	}
	public int getSoLuotTruyCap() {
		return soLuotTruyCap;
	}
	public void setSoLuotTruyCap(int soLuotTruyCap) {
		this.soLuotTruyCap = soLuotTruyCap;
	}
	@Override
	public String toString() {
		return "BaiThuoc [maBaiThuoc=" + maBaiThuoc + ", tenBaiThuoc=" + tenBaiThuoc + ", thongTin=" + thongTin
				+ ", cachDung=" + cachDung + ", soLuongTruyCap=" + soLuotTruyCap + "]";
	}
	
	
}
