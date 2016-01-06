package model;

import java.util.List;

public class Answer {
	private int type;		//cau tra loi ma he thong dua ra cho lua chon cua nguoi dung
	private List<String> infor;
	
	public Answer(int type, List<String> infor) {
		super();
		this.type = type;
		this.infor = infor;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<String> getInfor() {
		return infor;
	}

	public void setInfor(List<String> infor) {
		this.infor = infor;
	}

	@Override
	public String toString() {
		return "Answer [type=" + type + ", infor=" + infor + "]";
	}

	
}
