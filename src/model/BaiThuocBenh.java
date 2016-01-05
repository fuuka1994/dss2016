package model;

public class BaiThuocBenh {
	private int id;
	private int maBaiThuoc;
	private int maBenh;
	public BaiThuocBenh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaiThuocBenh(int id, int maBaiThuoc, int maBenh) {
		super();
		this.id = id;
		this.maBaiThuoc = maBaiThuoc;
		this.maBenh = maBenh;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaBaiThuoc() {
		return maBaiThuoc;
	}
	public void setMaBaiThuoc(int maBaiThuoc) {
		this.maBaiThuoc = maBaiThuoc;
	}
	public int getMaBenh() {
		return maBenh;
	}
	public void setMaBenh(int maBenh) {
		this.maBenh = maBenh;
	}
	@Override
	public String toString() {
		return "BaiThuocBenh [id=" + id + ", maBaiThuoc=" + maBaiThuoc + ", maBenh=" + maBenh + "]";
	}
	
	
}
