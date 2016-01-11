package model;

public class Benh {
	private int maBenh;
	private String tenBenh;
	private String thongTin;
	private String trieuChung;
	private String kiengKy;
	private int soLuotTruyCap;
	private int diemVote;
	public int getDiemVote() {
		return diemVote;
	}
	public void setDiemVote(int diemVote) {
		this.diemVote = diemVote;
	}
	public Benh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Benh(int maBenh, String tenBenh, String thongTin, String trieuChung, String kiengKy, int soLuotTruyCap) {
		super();
		this.maBenh = maBenh;
		this.tenBenh = tenBenh;
		this.thongTin = thongTin;
		this.trieuChung = trieuChung;
		this.kiengKy = kiengKy;
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
	public String getTrieuChung() {
		return trieuChung;
	}
	public void setTrieuChung(String trieuChung) {
		this.trieuChung = trieuChung;
	}
	public String getKiengKy() {
		return kiengKy;
	}
	public void setKiengKy(String kiengKy) {
		this.kiengKy = kiengKy;
	}
	public int getSoLuotTruyCap() {
		return soLuotTruyCap;
	}
	public void setSoLuotTruyCap(int soLuotTruyCap) {
		this.soLuotTruyCap = soLuotTruyCap;
	}
	@Override
	public String toString() {
		return "Benh [maBenh=" + maBenh + ", tenBenh=" + tenBenh + ", thongTin=" + thongTin + ", trieuChung="
				+ trieuChung + ", kiengKy=" + kiengKy + ", soLuotTruyCap=" + soLuotTruyCap + "]";
	}
	
	
	
	
}
