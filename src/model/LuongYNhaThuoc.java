package model;

public class LuongYNhaThuoc {
	private int id;
	private int maLuongY;
	private int maNhaThuoc;
	public LuongYNhaThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LuongYNhaThuoc(int id, int maLuongY, int maNhaThuoc) {
		super();
		this.id = id;
		this.maLuongY = maLuongY;
		this.maNhaThuoc = maNhaThuoc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaLuongY() {
		return maLuongY;
	}
	public void setMaLuongY(int maLuongY) {
		this.maLuongY = maLuongY;
	}
	public int getMaNhaThuoc() {
		return maNhaThuoc;
	}
	public void setMaNhaThuoc(int maNhaThuoc) {
		this.maNhaThuoc = maNhaThuoc;
	}
	@Override
	public String toString() {
		return "LuongYNhaThuoc [id=" + id + ", maLuongY=" + maLuongY + ", maNhaThuoc=" + maNhaThuoc + "]";
	}
	
	
}
