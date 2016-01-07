package model;

public class BaiThuocViThuoc {
	private int id;
	private int maViThuoc;
	private int maBaiThuoc;
	private int khoiLuong;
	public BaiThuocViThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaiThuocViThuoc(int id, int maCayThuoc, int maBaiThuoc, int khoiLuong) {
		super();
		this.id = id;
		this.maViThuoc = maCayThuoc;
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
		return maViThuoc;
	}
	public void setMaViThuoc(int maViThuoc) {
		this.maViThuoc = maViThuoc;
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
		return "BaiThuocCayThuoc [id=" + id + ", maCayThuoc=" + maViThuoc + ", maBaiThuoc=" + maBaiThuoc
				+ ", khoiLuong=" + khoiLuong + "]";
	}
	
	
	
}
