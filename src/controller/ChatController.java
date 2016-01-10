package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import connect.DbBaiThuoc;
import connect.connect;
import model.Answer;
import model.BaiThuoc;
import model.BaiViet;
import model.Benh;
import model.LuongY;
import model.NhaThuoc;
import model.Question;
import model.ViThuoc;
import view.ChatWindow;

public class ChatController {
	ChatWindow view;
	
	private List<Question> questions;
	private List<Answer> answers;
	
	private String keyword;
	private int type;
	private int type2;
	private int pos;
	
	private List<String> listtentruyenvao;
	
	private List<BaiThuoc> listbaithuoc;
	private List<ViThuoc> listvithuoc;
	private List<Benh> listbenh;
	private List<LuongY> listluongy;
	private List<NhaThuoc> listnhathuoc;
	private List<BaiViet> listbaiviet;
	
	private DbBaiThuoc daobaithuoc;
	
	public ChatController(){
		
		connect con = new connect();
		con.ketNoi();
		
		daobaithuoc = new DbBaiThuoc();
		
		view = new ChatWindow();
		try {
		      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } catch (ClassNotFoundException e) {
		      e.printStackTrace();
		    } catch (InstantiationException e) {
		      e.printStackTrace();
		    } catch (IllegalAccessException e) {
		      e.printStackTrace();
		    } catch (UnsupportedLookAndFeelException e) {
		      e.printStackTrace();
		    }

		SwingUtilities.updateComponentTreeUI(view);
		
		questions = new ArrayList<Question>();
		answers = new ArrayList<Answer>();
		
		view.addResetButtonActionListener(getResetActionListener());
		view.addBackButtonActionListener(getBackActionListener());
		
		view.generateDoctorSentence("Xin ch\u00e0o, t\u00f4i l\u00e0 l\u01b0\u01a1ng y Nh\u00f3m 5. H\u00e3y h\u1ecfi v\u1ec1 nh\u1eefng g\u00ec b\u1ea1n th\u1eafc m\u1eafc nh\u00e9.");
		view.getStartPanel();
		view.refreshLog();
		
		view.addBaithuocButtonActionListener(getBaithuocActionListener());
		view.addTenBaiThuocButtonActionListener(getTenBaiThuocActionListener());
		view.addBenhCanChuaButtonActionListener(getBenhCanChuaActionListener());
		view.addViThuocTrongBaiButtonActionListener(getViThuocTrongBaiActionListener());
		view.addNhaThuocCoBanButtonActionListener(getNhaThuocCoBanActionListener());
		
		view.addVithuocButtonActionListener(getVithuocActionListener());
		view.addTenViThuocButtonActionListener(getTenViThuocActionListener());
		view.addBaiThuocCoViNayButtonActionListener(getBaiThuocCoViNayActionListener());
		
		view.addBenhButtonActionListener(getBenhActionListener());
		view.addTenBenhButtonActionListener(getTenBenhActionListener());
		view.addLuongYChuaNoButtonActionListener(getLuongYChuaNoActionListener());
		view.addBaiThuocChuaBenhButtonActionListener(getBaiThuocChuaBenhActionListener());
		
		view.addLuongyButtonActionListener(getLuongYActionListener());
		view.addTenLuongYButtonActionListener(getTenLuongYActionListener());
		view.addKhuVucLuongYButtonActionListener(getKhuVucLuongYActionListener());
		view.addBenhCanChuaLuongYButtonActionListener(getBenhCanChuaLuongYActionListener());
		view.addNhaThuocDangLamButtonActionListener(getNhaThuocDangLamActionListener());
		
		view.addNhathuocButtonActionListener(getNhaThuocActionListener());
		view.addTenNhaThuocButtonActionListener(getTenNhaThuocActionListener());
		view.addBaiThuocCanMuaButtonActionListener(getBaiThuocCanMuaActionListener());
		view.addLuongYMuonChuaButtonActionListener(getLuongYMuonChuaActionListener());
		view.addKhuVucNhaThuocButtonActionListener(getKhuVucNhaThuocActionListener());
		
		view.addBaivietButtonActionListener(getBaiVietActionListener());
		view.addDanhYButtonActionListener(getDanhYActionListener());
		view.addKhacButtonActionListener(getKhacActionListener());
		
		view.addOkButtonActionListener(getOkActionListener());
		
		view.addResultListMouseListener(getResultListMouseAdapter());
		
		view.setVisible(true);
		
		keyword = "";
		type = 0;
		type2 = 0;
		pos = 0;
		
		listtentruyenvao = new ArrayList<String>();
		
		listtentruyenvao.add("Nguy\u1ec5n Linh \u0110an");
		listtentruyenvao.add("V\u0169 \u0110\u00ecnh \u0110\u00f4ng");
		listtentruyenvao.add("Nguy\u1ec1n V\u0103n Hi\u1ec7u");
		listtentruyenvao.add("Ho\u00e0ng Th\u1ecb Hu\u00ea");
		listtentruyenvao.add("Nguy\u1ec5n Th\u1ecb Nh\u00e0n");
		listtentruyenvao.add("Nguy\u1ec5n Tuy\u1ebft Ng\u00e2n");
		listtentruyenvao.add("L\u01b0u Trung Th\u1eafng");
		listtentruyenvao.add("Tr\u1ea7n Quang Trung");
		
//		try {
//			List<BaiThuoc> baithuoc = new DbBaiThuoc().loadTen("");
//			view.baiThuocDetail(baithuoc.get(0));
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		listbaithuoc = new ArrayList<BaiThuoc>();
		listvithuoc = new ArrayList<ViThuoc>();
	}
	
	//cac listener chung
	private ActionListener getBackActionListener(){
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.rollBack();
			}
		};
		return listener;
	}
	
	private ActionListener getResetActionListener(){
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int dialogResult = JOptionPane.showConfirmDialog (null, "Vi\u1ec7c h\u1ecfi l\u1ea1i t\u1eeb \u0111\u1ea7u s\u1ebd x\u00f3a h\u1ecfi \u0111\u00e1p b\u1ea1n \u0111\u00e3 th\u1ef1c hi\u1ec7n. B\u1ea1n ch\u1eafc ch\u1eafn ch\u1ee9?","Ch\u00fa \u00fd!",0);
				if(dialogResult == JOptionPane.YES_OPTION){
					view.reset();
					view.generateDoctorSentence("Xin ch\u00e0o, t\u00f4i l\u00e0 l\u01b0\u01a1ng y Nh\u00f3m 5. H\u00e3y h\u1ecfi v\u1ec1 nh\u1eefng g\u00ec b\u1ea1n th\u1eafc m\u1eafc nh\u00e9.");
					view.getStartPanel();
					view.refreshLog();
				}
			}
		};
		return listener;
	}
	
 	private ActionListener getBaithuocActionListener(){
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n h\u1ecfi v\u1ec1 b\u00e0i thu\u1ed1c.");
				view.generateBaithuocPanel();
				view.refreshLog();
			}
		};
		return listener;
	}
	
	private ActionListener getVithuocActionListener(){
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n h\u1ecfi v\u1ec1 v\u1ecb thu\u1ed1c.");
				view.generateVithuocPanel();
				view.refreshLog();
			}
		};
		return listener;
	}
	
	private ActionListener getBenhActionListener(){
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n h\u1ecfi v\u1ec1 b\u1ec7nh.");
				view.generateBenhPanel();
				view.refreshLog();
			}
		};
		return listener;
	}
	
	private ActionListener getLuongYActionListener(){
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n h\u1ecfi v\u1ec1 l\u01b0\u01a1ng y.");
				view.generateLuongYPanel();
				view.refreshLog();
			}
		};
		return listener;
	}
	
	private ActionListener getNhaThuocActionListener(){
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n h\u1ecfi v\u1ec1 nh\u00e0 thu\u1ed1c.");
				view.generateNhaThuocPanel();
				view.refreshLog();
			}
		};
		return listener;
	}
	
	private ActionListener getBaiVietActionListener(){
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem lo\u1ea1i th\u00f4ng tin kh\u00e1c.");
				view.generateBaiVietPanel();
				view.refreshLog();
			}
		};
		return listener;
	}
	
	//cac listener baithuoc
	private ActionListener getTenBaiThuocActionListener(){		//type = 1
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin b\u00e0i thu\u1ed1c theo t\u00ean.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean b\u00e0i thu\u1ed1c");
				view.refreshLog();
				type = 1;
				type2 = 1;
			}
		};
		return listener;
	}
	
	private ActionListener getBenhCanChuaActionListener(){ 		//type = 2
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin b\u00e0i thu\u1ed1c theo b\u1ec7nh c\u1ea7n ch\u1eefa.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean b\u1ec7nh");
				view.refreshLog();
				type = 2;
				type2 = 1;
			}
		};
		return listener;
	}
	
	private ActionListener getViThuocTrongBaiActionListener(){	//type = 3
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin b\u00e0i thu\u1ed1c theo v\u1ecb thu\u1ed1c trong b\u00e0i.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean v\u1ecb thu\u1ed1c");
				view.refreshLog();
				type = 3;
				type2 = 1;
			}
		};
		return listener;
	}
	
	private ActionListener getNhaThuocCoBanActionListener(){	//type = 4
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin b\u00e0i thu\u1ed1c theo nh\u00e0 thu\u1ed1c c\u00f3 b\u00e1n.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean nh\u00e0 thu\u1ed1c");
				view.refreshLog();
				type = 4;
				type2 = 1;
			}
		};
		return listener;
	}
	
	//cac listener vi thuoc
	private ActionListener getTenViThuocActionListener(){		//type = 5
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin v\u1ecb thu\u1ed1c theo t\u00ean v\u1ecb thu\u1ed1c.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean v\u1ecb thu\u1ed1c");
				view.refreshLog();
				type = 5;
				type2 = 2;
			}
		};
		return listener;
	}

	private ActionListener getBaiThuocCoViNayActionListener(){	//type = 6
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin v\u1ecb thu\u1ed1c theo b\u00e0i thu\u1ed1c c\u00f3 v\u1ecb n\u00e0y.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean b\u00e0i thu\u1ed1c");
				view.refreshLog();
				type = 6;
				type2 = 2;
			}
		};
		return listener;
	}
	
	//cac listener benh
	private ActionListener getTenBenhActionListener(){			//type = 9
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin b\u1ec7nh theo t\u00ean b\u1ec7nh.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean b\u1ec7nh");
				view.refreshLog();
				type = 9;
				type2 = 3;
			}
		};
		return listener;
	}
	
	private ActionListener getLuongYChuaNoActionListener(){		//type = 10
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin b\u1ec7nh theo t\u00ean l\u01b0\u01a1ng y ch\u1eefa n\u00f3.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean l\u01b0\u01a1ng y");
				view.refreshLog();
				type = 10;
				type2 = 3;
			}
		};
		return listener;
	}
	
	private ActionListener getBaiThuocChuaBenhActionListener(){	//type = 11
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin b\u1ec7nh theo t\u00ean b\u00e0i thu\u1ed1c ch\u1eefa b\u1ec7nh.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean b\u00e0i thu\u1ed1c");
				view.refreshLog();
				type = 11;
				type2 = 3;
			}
		};
		return listener;
	}
	
	//cac listener luong y
	private ActionListener getTenLuongYActionListener(){		//type = 13
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin l\u01b0\u01a1ng y theo t\u00ean l\u01b0\u01a1ng y.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean l\u01b0\u01a1ng y");
				view.refreshLog();
				type = 13;
				type2 = 4;
			}
		};
		return listener;
	}
	
	private ActionListener getKhuVucLuongYActionListener(){		//type = 14
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin l\u01b0\u01a1ng y theo t\u00ean khu v\u1ef1c.");
				view.generateDoctorField("H\u00e3y nh\u1eadp khu v\u1ef1c");
				view.refreshLog();
				type = 14;
				type2 = 4;
			}
		};
		return listener;
	}
	
	private ActionListener getBenhCanChuaLuongYActionListener(){//type = 15
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin l\u01b0\u01a1ng y theo b\u1ec7nh c\u1ea7n ch\u1eefa.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean b\u1ec7nh");
				view.refreshLog();
				type = 15;
				type2 = 4;
			}
		};
		return listener;
	}
	
	private ActionListener getNhaThuocDangLamActionListener(){	//type = 16
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin l\u01b0\u01a1ng y theo nh\u00e0 thu\u1ed1c \u0111ang l\u00e0m.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean nh\u00e0 thu\u1ed1c");
				view.refreshLog();
				type = 16;
				type2 = 4;
			}
		};
		return listener;
	}
	
	//cac listener nha thuoc
	private ActionListener getTenNhaThuocActionListener(){		//type = 17
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin nh\u00e0 thu\u1ed1c theo t\u00ean nh\u00e0 thu\u1ed1c.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean nh\u00e0 thu\u1ed1c");
				view.refreshLog();
				type = 17;
				type2 = 5;
			}
		};
		return listener;
	}
	
	private ActionListener getBaiThuocCanMuaActionListener(){	//type = 18
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin nh\u00e0 thu\u1ed1c theo b\u00e0i thu\u1ed1c c\u1ea7n mua.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean b\u00e0i thu\u1ed1c");
				view.refreshLog();
				type = 18;
				type2 = 5;
			}
		};
		return listener;
	}
	
	private ActionListener getLuongYMuonChuaActionListener(){	//type = 19
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin nh\u00e0 thu\u1ed1c theo l\u01b0\u01a1ng Y mu\u1ed1n ch\u1eefa.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean l\u01b0\u01a1ng y");
				view.refreshLog();
				type = 19;
				type2 = 5;
			}
		};
		return listener;
	}
	
	private ActionListener getKhuVucNhaThuocActionListener(){	//type = 20
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin nh\u00e0 thu\u1ed1c y theo khu v\u1ef1c nh\u00e0 thu\u1ed1c.");
				view.generateDoctorField("H\u00e3y nh\u1eadp khu v\u1ef1c");
				view.refreshLog();
				type = 20;
				type2 = 5;
			}
		};
		return listener;
	}
	
	//cac listener baitviet
	private ActionListener getDanhYActionListener(){			//type = 25
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem th\u00f4ng tin danh y.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u00ean danh y");
				view.refreshLog();
				type = 18;
				type2 = 7;
			}
		};
		return listener;
	}
	
	private ActionListener getKhacActionListener(){				//type = 21
		ActionListener listener = new ActionListener() {		
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n xem lo\u1ea1i th\u00f4ng tin kh\u00e1c.");
				view.generateDoctorField("H\u00e3y nh\u1eadp t\u1eeb kh\u00f3a");
				view.refreshLog();
				type = 19;
				type2 = 6;
			}
		};
		return listener;
	}
	
	//listener cho nut ok cua form
	private ActionListener getOkActionListener(){
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String kw = view.getKeyWord();
				if(kw != null && kw != ""){
					keyword = kw;
					switch(type){
						case 1:
							view.generatePatientSentence("T\u00ecm theo t\u00ean b\u00e0i thu\u1ed1c '" + keyword + "'.");
							try {
								listbaithuoc = daobaithuoc.loadTen(keyword);
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							view.generateResultList("C\u00e1c b\u00e0i thu\u1ed1c h\u1ee3p v\u1edbi y\u00eau c\u1ea7u c\u1ee7a b\u1ea1n l\u00e0:", getListOfTenbaithuoc());
							view.refreshLog();
							break;
						default:
							break;
					}
					view.refreshLog();
				}
			}
		};
		return listener;
	}
	
	//mouse adapter cho list
	private MouseAdapter getResultListMouseAdapter(){
		MouseAdapter adapter = new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseEvent) {
				JList theList = (JList) mouseEvent.getSource();
				if (mouseEvent.getClickCount() >= 2) {
					pos = theList.locationToIndex(mouseEvent.getPoint());
					switch(type){
						case 1:
							view.generatePatientSentence("T\u00f4i mu\u1ed1n xem chi ti\u1ebft b\u00e0i thu\u1ed1c '" + getListOfTenbaithuoc().get(pos) + "'.");
							view.baiThuocDetail(listbaithuoc.get(pos));
							try {
								listvithuoc = daobaithuoc.loadViThuocTuBaiThuoc(keyword);
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							view.generateResultList("C\u00e1c c\u00e2y thu\u1ed1c thu\u1ed9c b\u00e0i thu\u1ed1c '" + getListOfTenbaithuoc().get(pos) + "':", getListOfTenvithuoc());
							break;
						default:
							break;
					}
					view.refreshLog();
				}
			}
		};
		return adapter;
	}
	
	private List<String> getListOfTenbaithuoc(){
		List<String> str = new ArrayList<String>();
		for (BaiThuoc bt : listbaithuoc) {
			str.add(bt.getTenBaiThuoc());
		}
		return str;
	}
	
	private List<String> getListOfTenvithuoc(){
		List<String> str = new ArrayList<String>();
		for (ViThuoc vt : listvithuoc) {
			str.add(vt.getTenViThuoc());
		}
		return str;
	}
	
	
	private boolean checkAllSpace(String s){
		for (int i = 0; i < s.length(); i++) {
			
		}
		return false;
	}
}
