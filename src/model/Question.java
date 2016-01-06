package model;

public class Question {
	
	private int type; 			//loai cau hoi, tuong ung voi 10 kieu doi tuong cua chuong trinh và cac cau hoi them
	private String keyword; 	//tu khoa cua cau hoi, vi du voi bai thuoc thi la ten bai thuoc
	
	public Question(int type, String keyword) {
		super();
		this.type = type;
		this.keyword = keyword;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		String question = "";
		switch(type){
			case 1: //hoi ve bai thuoc
				question = "C\u00e1c th\u00f4ng tin v\u00e0 th\u00e0nh ph\u1ea7n c\u1ee7a b\u00e0i thu\u1ed1c " + keyword + "?";
				break;
			case 2: //hoi ve cac bai thuoc chua mot benh
				question = "C\u00e1c b\u00e0i thu\u1ed1c ch\u1eefa b\u1ec7nh " + keyword + "?";
				break;
			case 3: //hoi ve cac bai thuoc co chua mot cay thuoc
				question = "C\u00e1c b\u00e0i thu\u1ed1c c\u00f3 ch\u1ee9a c\u00e2y thu\u1ed1c " + keyword + "?";
				break;
			case 4: //hoi mot bai viet
				question = "C\u00e1c th\u00f4ng tin v\u1ec1 " + keyword + "?";
				break;
			case 5: //hoi ve mot benh
				question = "C\u00e1c th\u00f4ng tin v\u1ec1 b\u1ec7nh " + keyword + "?";
				break;
			case 6: //hoi ve mot cay thuoc
				question = "C\u00e1c th\u00f4ng tin v\u1ec1 c\u00e2y thu\u1ed1c " + keyword + "?";
				break;
			case 7: //hoi ve mot luong y
				question = "C\u00e1c th\u00f4ng tin v\u1ec1 l\u01b0\u01a1ng y " + keyword + "?";
				break;
			case 8: //hoi ve cac luong y o mot nha thuoc
				question = "L\u01b0\u01a1ng Y \u1edf nh\u00e0 thu\u1ed1c " + keyword + "l\u00e0 ai?";
				break;
			case 9: //hoi ve nha thuoc
				question = "C\u00e1c th\u00f4ng tin v\u1ec1 nh\u00e0 thu\u1ed1c " + keyword + "?";
				break;
			case 10: //hoi ve luong y chuyen ve benh
				question = "C\u00e1c l\u01b0\u01a1ng y chuy\u00ean v\u1ec1 b\u1ec7nh " + keyword + "?";
				break;
			case 11: //hoi ve nha thuoc o khu vuc nao do
				question = "C\u00e1c nh\u00e0 thu\u1ed1c g\u1ea7n khu v\u1ef1c " + keyword + "?";
				break;
			default: //khong hoi nua, cam on
				question = "C\u1ea3m \u01a1n. T\u00f4i kh\u00f4ng c\u00f2n g\u00ec c\u1ea7n h\u1ecfi n\u1eefa.";
				break;
		}
		return question;
	}

}
