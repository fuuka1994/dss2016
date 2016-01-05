package model;

public class BaiViet {
	private int maBaiViet;
	private String tenBaiViet;
	private String noiDung;
	private String anhMinhHoa;
	private int soLuotTruyCap;
	public BaiViet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaiViet(int maBaiViet, String tenBaiViet, String noiDung, String anhMinhHoa, int soLuotTruyCap) {
		super();
		this.maBaiViet = maBaiViet;
		this.tenBaiViet = tenBaiViet;
		this.noiDung = noiDung;
		this.anhMinhHoa = anhMinhHoa;
		this.soLuotTruyCap = soLuotTruyCap;
	}
	public int getMaBaiViet() {
		return maBaiViet;
	}
	public void setMaBaiViet(int maBaiViet) {
		this.maBaiViet = maBaiViet;
	}
	public String getTenBaiViet() {
		return tenBaiViet;
	}
	public void setTenBaiViet(String tenBaiViet) {
		this.tenBaiViet = tenBaiViet;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public String getAnhMinhHoa() {
		return anhMinhHoa;
	}
	public void setAnhMinhHoa(String anhMinhHoa) {
		this.anhMinhHoa = anhMinhHoa;
	}
	public int getSoLuotTruyCap() {
		return soLuotTruyCap;
	}
	public void setSoLuotTruyCap(int soLuotTruyCap) {
		this.soLuotTruyCap = soLuotTruyCap;
	}
	@Override
	public String toString() {
		return "BaiViet [maBaiViet=" + maBaiViet + ", tenBaiViet=" + tenBaiViet + ", noiDung=" + noiDung
				+ ", anhMinhHoa=" + anhMinhHoa + ", soLuotTruyCap=" + soLuotTruyCap + "]";
	}
	
	
}
