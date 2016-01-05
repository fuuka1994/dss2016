package model;

public class BaiThuocCayThuoc {
	private int id;
	private int maCayThuoc;
	private int maBaiThuoc;
	private int khoiLuong;
	public BaiThuocCayThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaiThuocCayThuoc(int id, int maCayThuoc, int maBaiThuoc, int khoiLuong) {
		super();
		this.id = id;
		this.maCayThuoc = maCayThuoc;
		this.maBaiThuoc = maBaiThuoc;
		this.khoiLuong = khoiLuong;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaCayThuoc() {
		return maCayThuoc;
	}
	public void setMaCayThuoc(int maCayThuoc) {
		this.maCayThuoc = maCayThuoc;
	}
	public int getMaBaiThuoc() {
		return maBaiThuoc;
	}
	public void setMaBaiThuoc(int maBaiThuoc) {
		this.maBaiThuoc = maBaiThuoc;
	}
	public int getKhoiLuong() {
		return khoiLuong;
	}
	public void setKhoiLuong(int khoiLuong) {
		this.khoiLuong = khoiLuong;
	}
	@Override
	public String toString() {
		return "BaiThuocCayThuoc [id=" + id + ", maCayThuoc=" + maCayThuoc + ", maBaiThuoc=" + maBaiThuoc
				+ ", khoiLuong=" + khoiLuong + "]";
	}
	
	
	
}
