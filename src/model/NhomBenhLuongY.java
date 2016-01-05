package model;

public class NhomBenhLuongY {
	private int id;
	private int maNhomBenh;
	private int maLuongY;
	public NhomBenhLuongY() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhomBenhLuongY(int id, int maNhomBenh, int maLuongY) {
		super();
		this.id = id;
		this.maNhomBenh = maNhomBenh;
		this.maLuongY = maLuongY;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaNhomBenh() {
		return maNhomBenh;
	}
	public void setMaNhomBenh(int maNhomBenh) {
		this.maNhomBenh = maNhomBenh;
	}
	public int getMaLuongY() {
		return maLuongY;
	}
	public void setMaLuongY(int maLuongY) {
		this.maLuongY = maLuongY;
	}
	@Override
	public String toString() {
		return "NhomBenhLuongY [id=" + id + ", maNhomBenh=" + maNhomBenh + ", maLuongY=" + maLuongY + "]";
	}
	
	
}
