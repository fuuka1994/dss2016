package model;

public class NhaThuocBaiThuoc {
	
	private int id;
	private String maBaiThuoc;
	private String maNhaThuoc;
	public NhaThuocBaiThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhaThuocBaiThuoc(int id, String maBaiThuoc, String maNhaThuoc) {
		super();
		this.id = id;
		this.maBaiThuoc = maBaiThuoc;
		this.maNhaThuoc = maNhaThuoc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaBaiThuoc() {
		return maBaiThuoc;
	}
	public void setMaBaiThuoc(String maBaiThuoc) {
		this.maBaiThuoc = maBaiThuoc;
	}
	public String getMaNhaThuoc() {
		return maNhaThuoc;
	}
	public void setMaNhaThuoc(String maNhaThuoc) {
		this.maNhaThuoc = maNhaThuoc;
	}
	@Override
	public String toString() {
		return "NhaThuocBaiThuoc [id=" + id + ", maBaiThuoc=" + maBaiThuoc + ", maNhaThuoc=" + maNhaThuoc + "]";
	}
	
	

}
