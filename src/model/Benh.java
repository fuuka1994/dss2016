package model;

public class Benh {
	private int maBenh;
	private String tenBenh;
	private String thongTin;
	private int thuocNhomBenh;
	private String trieuChung;
	private int soLuotTruyCap;
	public Benh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Benh(int maBenh, String tenBenh, String thongTin, int thuocNhomBenh, String trieuChung, int soLuotTruyCap) {
		super();
		this.maBenh = maBenh;
		this.tenBenh = tenBenh;
		this.thongTin = thongTin;
		this.thuocNhomBenh = thuocNhomBenh;
		this.trieuChung = trieuChung;
		this.soLuotTruyCap = soLuotTruyCap;
	}
	public int getMaBenh() {
		return maBenh;
	}
	public void setMaBenh(int maBenh) {
		this.maBenh = maBenh;
	}
	public String getTenBenh() {
		return tenBenh;
	}
	public void setTenBenh(String tenBenh) {
		this.tenBenh = tenBenh;
	}
	public String getThongTin() {
		return thongTin;
	}
	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}
	public int getThuocNhomBenh() {
		return thuocNhomBenh;
	}
	public void setThuocNhomBenh(int thuocNhomBenh) {
		this.thuocNhomBenh = thuocNhomBenh;
	}
	public String getTrieuChung() {
		return trieuChung;
	}
	public void setTrieuChung(String trieuChung) {
		this.trieuChung = trieuChung;
	}
	public int getSoLuotTruyCap() {
		return soLuotTruyCap;
	}
	public void setSoLuotTruyCap(int soLuotTruyCap) {
		this.soLuotTruyCap = soLuotTruyCap;
	}
	@Override
	public String toString() {
		return "Benh [maBenh=" + maBenh + ", tenBenh=" + tenBenh + ", thongTin=" + thongTin + ", thuocNhomBenh="
				+ thuocNhomBenh + ", trieuChung=" + trieuChung + ", soLuotTruyCap=" + soLuotTruyCap + "]";
	}
	
	
	
}
