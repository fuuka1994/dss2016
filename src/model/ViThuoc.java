package model;

public class ViThuoc {
	private int maViThuoc;
	private String tenViThuoc;
	private String chuTri;
	private String kiengKy;
	private String tinhChat;
	private int soLuotTruyCap;
	
	public ViThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViThuoc(int maViThuoc, String tenViThuoc, String chuTri, String kiengKy, String tinhChat,
			int soLuotTruyCap) {
		super();
		this.maViThuoc = maViThuoc;
		this.tenViThuoc = tenViThuoc;
		this.chuTri = chuTri;
		this.kiengKy = kiengKy;
		this.tinhChat = tinhChat;
		this.soLuotTruyCap = soLuotTruyCap;
	}

	public int getMaViThuoc() {
		return maViThuoc;
	}

	public void setMaViThuoc(int maViThuoc) {
		this.maViThuoc = maViThuoc;
	}

	public String getTenViThuoc() {
		return tenViThuoc;
	}

	public void setTenViThuoc(String tenViThuoc) {
		this.tenViThuoc = tenViThuoc;
	}

	public String getChuTri() {
		return chuTri;
	}

	public void setChuTri(String chuTri) {
		this.chuTri = chuTri;
	}

	public String getKiengKy() {
		return kiengKy;
	}

	public void setKiengKy(String kiengKy) {
		this.kiengKy = kiengKy;
	}

	public String getTinhChat() {
		return tinhChat;
	}

	public void setTinhChat(String tinhChat) {
		this.tinhChat = tinhChat;
	}

	public int getSoLuotTruyCap() {
		return soLuotTruyCap;
	}

	public void setSoLuotTruyCap(int soLuotTruyCap) {
		this.soLuotTruyCap = soLuotTruyCap;
	}

	@Override
	public String toString() {
		return "ViThuoc [maViThuoc=" + maViThuoc + ", tenViThuoc=" + tenViThuoc + ", chuTri=" + chuTri + ", kiengKy="
				+ kiengKy + ", tinhChat=" + tinhChat + ", soLuotTruyCap=" + soLuotTruyCap + "]";
	}
	
	
	
}


