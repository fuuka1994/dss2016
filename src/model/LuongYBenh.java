package model;

public class LuongYBenh {
	private int id;
	private String maLuongY;
	private String maBenh;
	public LuongYBenh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LuongYBenh(int id, String maLuongY, String maBenh) {
		super();
		this.id = id;
		this.maLuongY = maLuongY;
		this.maBenh = maBenh;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaLuongY() {
		return maLuongY;
	}
	public void setMaLuongY(String maLuongY) {
		this.maLuongY = maLuongY;
	}
	public String getMaBenh() {
		return maBenh;
	}
	public void setMaBenh(String maBenh) {
		this.maBenh = maBenh;
	}
	@Override
	public String toString() {
		return "LuongYBenh [id=" + id + ", maLuongY=" + maLuongY + ", maBenh=" + maBenh + "]";
	}
	
	
}
