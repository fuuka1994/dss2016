package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.BaiThuoc;
import model.BaiThuocViThuoc;
import model.BaiViet;
import model.Benh;
import model.LuongY;
import model.NhaThuoc;
import model.ViThuoc;

import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;

public class ChatWindow extends JFrame {

	/**
	 * Main view
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Font BIGGER_FONT = new Font(Font.SERIF, Font.PLAIN, 25);
	private static final Font SMALLER_FONT = new Font(Font.SERIF, Font.PLAIN, 20);
	private static final Color marked = Color.RED;
	private int bgValue = Integer.parseInt("FFFFFF", 16);
	private Color bgColor = new Color(bgValue);
	private int bgValue2 = Integer.parseInt("D4D4D4", 16);
	private Color bgColor2 = new Color(bgValue2);
	private int fgValue = Integer.parseInt("3E4651", 16);
	private Color fgColor = new Color(fgValue);
	private int fgValue2 = Integer.parseInt("00B5B5", 16);
	private Color fgColor2 = new Color(fgValue2);
	private int fgValue3 = Integer.parseInt("F1654C", 16);
	private Color fgColor3 = new Color(fgValue3);
	
	private final String backImg = "back.png";
	private final String backHoverImg = "backh.png";
	private final String resetImg = "reset.png";
	private final String resetHoverImg = "reseth.png";
	private final String doctorImg = "doctor.png";
	private final String topBubbleImg = "top.png";
	private final String bottomBubbleImg = "bottom.png";
	private final String patientImg = "patient.png";
	private final String top2BubbleImg = "top2.png";
	private final String bottom2BubbleImg = "bottom2.png";
	
	private final String baithuocImg = "bt.png";
	private final String baithuocHoverImg = "bth.png";
	private final String vithuocImg = "vt.png";
	private final String vithuocHoverImg = "vth.png";
	private final String benhImg = "b.png";
	private final String benhHoverImg = "bh.png";
	private final String luongyImg = "ly.png";
	private final String luongyHoverImg = "lyh.png";
	private final String nhathuocImg = "nt.png";
	private final String nhathuocHoverImg = "nth.png";
	private final String baivietImg = "bv.png";
	private final String baivietHoverImg = "bvh.png";
	
	private final String tenbaithuocImg = "tbt.png";
	private final String tenbaithuocHoverImg = "tbth.png";
	private final String benhcanchuaImg = "bcc.png";
	private final String benhcanchuaHoverImg = "bcch.png";
	private final String vithuoctrongbaiImg = "vttb.png";
	private final String vithuoctrongbaiHoverImg = "vttbh.png";
	private final String nhathuoccobanImg = "ntcb.png";
	private final String nhathuoccobanHoverImg = "ntcbh.png";
	private final String tenvithuocImg = "tvt.png";
	private final String tenvithuocHoverImg = "tvth.png";
	private final String baithuoccovinayImg = "btcvn.png";
	private final String baithuoccovinayHoverImg = "btcvnh.png";
	
	private final String tenbenhImg = "tb.png";
	private final String tenbenhHoverImg = "tbh.png";
	private final String luongychuanoImg = "lycn.png";
	private final String luongychuanoHoverImg = "lycnh.png";
	private final String baithuocchuabenhImg = "btcb.png";
	private final String baithuocchuabenhHoverImg = "btcbh.png";
	private final String chandoanImg = "cd.png";
	private final String chandoanHoverImg = "cdh.png";
	private final String tenluongyImg = "tly.png";
	private final String tenluongyHoverImg = "tlyh.png";
	private final String khuvucluongyImg = "kv.png";
	private final String khuvucluongyHoverImg = "kvh.png";
	private final String benhcanchualuongyImg = "bcc.png";
	private final String benhcanchualuongyHoverImg = "bcch.png";
	private final String nhathuocdanglamImg = "ntdl.png";
	private final String nhathuocdanglamHoverImg = "ntdl.png";
	private final String tennhathuocImg = "tnt.png";
	private final String tennhathuocHoverImg = "tnth.png";
	private final String baithuoccanmuaImg = "btcm.png";
	private final String baithuoccanmuaHoverImg = "btcmh.png";
	private final String luongymuonchuaImg = "lymc.png";
	private final String luongymuonchuaHoverImg = "lymch.png";
	private final String khuvucnhathuocImg = "kv.png";
	private final String khuvucnhathuocHoverImg = "kvh.png";
	private final String danhyImg = "dy.png";
	private final String danhyHoverImg = "dyh.png";
	private final String khacImg = "k.png";
	private final String khacHoverImg = "kh.png";
	
	
	private final String okImg = "ok.png";
	private final String okHoverImg = "okh.png";
	
	private final String rateImg = "rate.png";
	private final String rateHoverImg = "rateh.png";

	private JScrollPane scrollAskPane;
	private JPanel chatList;
	private ImageButton backButton;
	private ImageButton resetButton;
	//cac nut chinh
	private ImageButton baithuocButton;
	private ImageButton vithuocButton;
	private ImageButton benhButton;
	private ImageButton luongyButton;
	private ImageButton nhathuocButton;
	private ImageButton baivietButton;
	//cac nut ve bai thuoc
	private ImageButton tenbaithuocButton;
	private ImageButton benhcanchuaButton;
	private ImageButton vithuoctrongbaiButton;
	private ImageButton nhathuoccobanButton;
	//cac nut ve vi thuoc
	private ImageButton tenvithuocButton;
	private ImageButton baithuoccovinayButton;
	//cac nut ve benh
	private ImageButton tenbenhButton;
	private ImageButton luongychuanoButton;
	private ImageButton baithuocchuabenhButton;
	private ImageButton chandoanButton;
	//cac nut ve luong y
	private ImageButton tenluongyButton;
	private ImageButton khuvucluongyButton;
	private ImageButton benhcanchualuongyButton;
	private ImageButton nhathuocdanglamButton;
	//cac nut ve nha thuoc
	private ImageButton tennhathuocButton;
	private ImageButton baithuoccanmuaButton;
	private ImageButton luongymuonchuaButton;
	private ImageButton khuvucnhathuocButton;
	//cac nut ve bai viet
	private ImageButton danhyButton;
	private ImageButton khacButton;
	
	//nut va field cho form nhap
	private JTextField keywordfield;
	private ImageButton okButton;
	
	//list label dung cho lít ket qua
	private JList<JLabel> resultList;
	private DefaultListModel<JLabel> labelListModel;
	private LabelListCellRenderer labelRenderer;

	//list tat ca Jpanel trong khung chat
	private List<JPanel> logs;
	private JPanel detailPanel;
	private JLabel detailTitle;
	private JProgressBar detailScore;
	private JLabel detailViews;
	private JPanel detailInform;
	private ImageButton rateButton;
	
	public ChatWindow(){
		this.setResizable(false);
		this.setTitle("H\u1ec7 th\u1ed1ng tr\u1ee3 gi\u00fap quy\u1ebft \u0111\u1ecbnh v\u1ec1 Y h\u1ecdc c\u1ed5 truy\u1ec1n");
		this.setBounds((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width-1100)/2, 5, 1100, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(bgColor);
		
		//Menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmItem = new JMenuItem("Item1");
		mnFile.add(mntmItem);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		//Ask Tab		
		JPanel askPanel = new JPanel();
		askPanel.setLayout(new BorderLayout(0, 0));
		askPanel.setPreferredSize(new Dimension(610, 640));
		getContentPane().add(askPanel, BorderLayout.WEST);
		
		JPanel borderOfScroll = new JPanel(new BorderLayout());
		borderOfScroll.setBorder(new LineBorder(fgColor));
		borderOfScroll.setBackground(bgColor);
		askPanel.add(borderOfScroll, BorderLayout.CENTER);
		
		scrollAskPane = new JScrollPane();
		scrollAskPane.setOpaque(false);
		scrollAskPane.setBorder(new EmptyBorder(0, 2, 0, 0));
		borderOfScroll.add(scrollAskPane, BorderLayout.CENTER);

		chatList = new JPanel(new WrapLayout());
		chatList.setMaximumSize(new Dimension(500, 100000));
		scrollAskPane.setViewportView(chatList);
		chatList.setBackground(bgColor);
		chatList.setForeground(fgColor);
		chatList.setBorder(new EmptyBorder(0, 0, 10, 0));
		
//		JPanel bottomAskPanel = new JPanel(new BorderLayout());
//		askPanel.add(bottomAskPanel, BorderLayout.SOUTH);
//		bottomAskPanel.setBackground(bgColor2);
//		bottomAskPanel.setPreferredSize(new Dimension(600, 150));
//		
//		questionPanel = new JPanel();
//		questionPanel.setPreferredSize(new Dimension(600, 100));
//		bottomAskPanel.add(questionPanel, BorderLayout.NORTH);
		
		JPanel bottomButtonPanel = new JPanel(new FlowLayout());
		bottomButtonPanel.setBackground(bgColor);
		bottomButtonPanel.setPreferredSize(new Dimension(600, 50));
//		bottomAskPanel.add(bottomButtonPanel, BorderLayout.SOUTH);
		askPanel.add(bottomButtonPanel, BorderLayout.SOUTH);
		
		backButton = new ImageButton(backImg, backHoverImg);
		backButton.setPreferredSize(new Dimension(150, 45));
		backButton.setOpaque(false);
		bottomButtonPanel.add(backButton);
		
		resetButton = new ImageButton(resetImg, resetHoverImg);
		resetButton.setPreferredSize(new Dimension(150, 45));
		resetButton.setOpaque(false);
		bottomButtonPanel.add(resetButton);
		
		detailPanel = new JPanel();
		getContentPane().add(detailPanel, BorderLayout.EAST);
		detailPanel.setBackground(bgColor);
		detailPanel.setLayout(new BorderLayout());
		
		benhButton = new ImageButton(benhImg, benhHoverImg);
		benhButton.setPreferredSize(new Dimension(100, 100));
		benhButton.setOpaque(false);
		
		baithuocButton = new ImageButton(baithuocImg, baithuocHoverImg);
		baithuocButton.setPreferredSize(new Dimension(100, 100));
		baithuocButton.setOpaque(false);
		
		vithuocButton = new ImageButton(vithuocImg, vithuocHoverImg);
		vithuocButton.setPreferredSize(new Dimension(100, 100));
		vithuocButton.setOpaque(false);
		
		luongyButton = new ImageButton(luongyImg, luongyHoverImg);
		luongyButton.setPreferredSize(new Dimension(100, 100));
		luongyButton.setOpaque(false);		
		
		nhathuocButton = new ImageButton(nhathuocImg, nhathuocHoverImg);
		nhathuocButton.setPreferredSize(new Dimension(100, 100));
		nhathuocButton.setOpaque(false);
		
		baivietButton = new ImageButton(baivietImg, baivietHoverImg);
		baivietButton.setPreferredSize(new Dimension(100, 100));
		baivietButton.setOpaque(false);
		
		logs = new ArrayList<JPanel>();
		
		//cac nut ve bai thuoc
		tenbaithuocButton = new ImageButton(tenbaithuocImg, tenbaithuocHoverImg);
		tenbaithuocButton.setPreferredSize(new Dimension(200, 50));
		tenbaithuocButton.setOpaque(false);
		
		benhcanchuaButton = new ImageButton(benhcanchuaImg, benhcanchuaHoverImg);
		benhcanchuaButton.setPreferredSize(new Dimension(200, 50));
		benhcanchuaButton.setOpaque(false);
		
		vithuoctrongbaiButton = new ImageButton(vithuoctrongbaiImg, vithuoctrongbaiHoverImg);
		vithuoctrongbaiButton.setPreferredSize(new Dimension(200, 50));
		vithuoctrongbaiButton.setOpaque(false);
		
		nhathuoccobanButton = new ImageButton(nhathuoccobanImg, nhathuoccobanHoverImg);
		nhathuoccobanButton.setPreferredSize(new Dimension(200, 50));
		nhathuoccobanButton.setOpaque(false);
		
		//cac nut ve vi thuoc
		tenvithuocButton = new ImageButton(tenvithuocImg, tenvithuocHoverImg);
		tenvithuocButton.setPreferredSize(new Dimension(200, 50));
		tenvithuocButton.setOpaque(false);
		
		baithuoccovinayButton = new ImageButton(baithuoccovinayImg, baithuoccovinayHoverImg);
		baithuoccovinayButton.setPreferredSize(new Dimension(200, 50));
		baithuoccovinayButton.setOpaque(false);
		
		//cac nut ve benh
		tenbenhButton = new ImageButton(tenbenhImg, tenbenhHoverImg);
		tenbenhButton.setPreferredSize(new Dimension(200, 50));
		tenbenhButton.setOpaque(false);
		
		luongychuanoButton = new ImageButton(luongychuanoImg, luongychuanoHoverImg);
		luongychuanoButton.setPreferredSize(new Dimension(200, 50));
		luongychuanoButton.setOpaque(false);
		
		baithuocchuabenhButton = new ImageButton(baithuocchuabenhImg, baithuocchuabenhHoverImg);
		baithuocchuabenhButton.setPreferredSize(new Dimension(200, 50));
		baithuocchuabenhButton.setOpaque(false);
		
		chandoanButton = new ImageButton(chandoanImg, chandoanHoverImg);
		chandoanButton.setPreferredSize(new Dimension(200, 50));
		chandoanButton.setOpaque(false);
		
		//cac nut ve luong y
		tenluongyButton = new ImageButton(tenluongyImg, tenluongyHoverImg);
		tenluongyButton.setPreferredSize(new Dimension(200, 50));
		tenluongyButton.setOpaque(false);
		
		khuvucluongyButton = new ImageButton(khuvucluongyImg, khuvucluongyHoverImg);
		khuvucluongyButton.setPreferredSize(new Dimension(200, 50));
		khuvucluongyButton.setOpaque(false);
		
		benhcanchualuongyButton = new ImageButton(benhcanchualuongyImg, benhcanchualuongyHoverImg);
		benhcanchualuongyButton.setPreferredSize(new Dimension(200, 50));
		benhcanchualuongyButton.setOpaque(false);
		
		nhathuocdanglamButton = new ImageButton(nhathuocdanglamImg, nhathuocdanglamHoverImg);
		nhathuocdanglamButton.setPreferredSize(new Dimension(200, 50));
		nhathuocdanglamButton.setOpaque(false);
		
		//cac nut ve nha thuoc
		tennhathuocButton = new ImageButton(tennhathuocImg, tennhathuocHoverImg);
		tennhathuocButton.setPreferredSize(new Dimension(200, 50));
		tennhathuocButton.setOpaque(false);
		
		baithuoccanmuaButton = new ImageButton(baithuoccanmuaImg, baithuoccanmuaHoverImg);
		baithuoccanmuaButton.setPreferredSize(new Dimension(200, 50));
		baithuoccanmuaButton.setOpaque(false);
		
		luongymuonchuaButton = new ImageButton(luongymuonchuaImg, luongymuonchuaHoverImg);
		luongymuonchuaButton.setPreferredSize(new Dimension(200, 50));
		luongymuonchuaButton.setOpaque(false);
		
		khuvucnhathuocButton = new ImageButton(khuvucnhathuocImg, khuvucnhathuocHoverImg);
		khuvucnhathuocButton.setPreferredSize(new Dimension(200, 50));
		khuvucnhathuocButton.setOpaque(false);
		
		//cac nut ve bai viet
		danhyButton = new ImageButton(danhyImg, danhyHoverImg);
		danhyButton.setPreferredSize(new Dimension(200, 50));
		danhyButton.setOpaque(false);
		
		khacButton = new ImageButton(khacImg, khacHoverImg);
		khacButton.setPreferredSize(new Dimension(200, 50));
		khacButton.setOpaque(false);
		
		//cac nut ve field chung
		okButton = new ImageButton(okImg, okHoverImg);
		okButton.setPreferredSize(new Dimension(50, 50));
		okButton.setOpaque(false);
		
		keywordfield = new JTextField();
		keywordfield.setPreferredSize(new Dimension(430, 50));
		keywordfield.setForeground(fgColor);
		keywordfield.setFont(SMALLER_FONT);
		
		resultList = new JList<JLabel>();
		labelListModel = new DefaultListModel<JLabel>();
		resultList.setModel(labelListModel);
		resultList.setBackground(fgColor2);
		
		JPanel topDetailPanel = new JPanel(new BorderLayout());
		detailPanel.add(topDetailPanel, BorderLayout.NORTH);
		topDetailPanel.setOpaque(false);
		
		detailTitle = new JLabel();
		detailTitle.setFont(BIGGER_FONT);
		detailTitle.setForeground(fgColor);
		detailTitle.setOpaque(false);
		detailTitle.setFont(BIGGER_FONT);
		detailTitle.setOpaque(false);
		detailTitle.setText(String.format("<html><div WIDTH=%d><center>%s</center></div><html>", 470, "Y h\u1ecdc c\u1ed5 truy\u1ec1n"));
		topDetailPanel.add(detailTitle, BorderLayout.NORTH);
		
		detailScore = new JProgressBar();
		detailScore.setPreferredSize(new Dimension(150, 30));
		detailScore.setForeground(fgColor2);
		detailScore.setValue(100);
		detailScore.setString("3/5");
		detailScore.setStringPainted(true);
		
		JPanel bottomTopDetailPanel = new JPanel(new BorderLayout());
		bottomTopDetailPanel.setOpaque(false);
		topDetailPanel.add(bottomTopDetailPanel, BorderLayout.CENTER);
		
		bottomTopDetailPanel.add(detailScore, BorderLayout.WEST);
		
		detailViews = new JLabel("L\u01b0\u1ee3t vote: 3", JLabel.CENTER);
		detailViews.setForeground(fgColor);
		detailViews.setFont(SMALLER_FONT);
		detailViews.setOpaque(false);
		
		JPanel leftBottomDetailPanel = new JPanel(new BorderLayout());
		leftBottomDetailPanel.setOpaque(false);
		
		bottomTopDetailPanel.add(leftBottomDetailPanel, BorderLayout.CENTER);
		leftBottomDetailPanel.add(detailViews, BorderLayout.CENTER);
		
		rateButton = new ImageButton(rateImg, rateHoverImg);
		rateButton.setPreferredSize(new Dimension(100, 30));
		leftBottomDetailPanel.add(rateButton, BorderLayout.WEST);
		
		detailInform = new JPanel(new WrapLayout());
		detailInform.setBackground(bgColor);
		detailInform.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JScrollPane scrollDetailPane = new JScrollPane();
		scrollDetailPane.setOpaque(false);
		detailPanel.add(scrollDetailPane, BorderLayout.CENTER);

		detailInform.setMaximumSize(new Dimension(470, 100000));
		scrollDetailPane.setViewportView(detailInform);
		
		openDetail();
	}
	
	public void generateDoctorSentence(String sentence){
		JPanel panelDoctor = new JPanel(new BorderLayout());
		panelDoctor.setOpaque(false);
		
		ImageLabel doctorLabel = new ImageLabel(doctorImg, 60, 45);
		panelDoctor.add(doctorLabel, BorderLayout.WEST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(topBubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottomBubbleImg, 500, 15);
		
		JPanel textPanel = new JPanel(new FlowLayout());
		textPanel.setBackground(fgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea(sentence);
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textPanel.add(text);
		
		panelDoctor.add(bubble, BorderLayout.CENTER);
		logs.add(panelDoctor);
	}
	
	public void generatePatientSentence(String sentence){
		JPanel panelPatient = new JPanel(new BorderLayout());
		panelPatient.setOpaque(false);
		
		ImageLabel patientLabel = new ImageLabel(patientImg, 60, 45);
		panelPatient.add(patientLabel, BorderLayout.EAST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(top2BubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottom2BubbleImg, 500, 15);
		
		JPanel textPanel = new JPanel(new FlowLayout());
		textPanel.setBackground(bgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea(sentence);
		text.setFont(SMALLER_FONT);
		text.setForeground(fgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textPanel.add(text);
		
		panelPatient.add(bubble, BorderLayout.CENTER);
		logs.add(panelPatient);
	}
	
	public void getStartPanel(){
		JPanel panelStart = new JPanel(new BorderLayout());
		panelStart.setOpaque(false);
		
		ImageLabel doctorLabel = new ImageLabel(doctorImg, 60, 45);
		panelStart.add(doctorLabel, BorderLayout.WEST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(topBubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottomBubbleImg, 500, 15);
		
		JPanel textButtonPanel = new JPanel(new WrapLayout());
		textButtonPanel.setBackground(fgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textButtonPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea("H\u00e3y ch\u1ecdn m\u1ee5c m\u00e0 b\u1ea1n mu\u1ed1n h\u1ecfi:");
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textButtonPanel.add(text);
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setPreferredSize(new Dimension(350, 210));
		buttonPanel.setOpaque(false);
		
		buttonPanel.add(baithuocButton);
		buttonPanel.add(vithuocButton);
		buttonPanel.add(benhButton);
		buttonPanel.add(luongyButton);
		buttonPanel.add(nhathuocButton);
		buttonPanel.add(baivietButton);
		
		textButtonPanel.add(buttonPanel);
		
		panelStart.add(bubble, BorderLayout.CENTER);
		logs.add(panelStart);
	}
	
	public void generateBaithuocPanel(){
		JPanel panelBaithuoc = new JPanel(new BorderLayout());
		panelBaithuoc.setOpaque(false);
		
		ImageLabel doctorLabel = new ImageLabel(doctorImg, 60, 45);
		panelBaithuoc.add(doctorLabel, BorderLayout.WEST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(topBubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottomBubbleImg, 500, 15);
		
		JPanel textButtonPanel = new JPanel(new WrapLayout());
		textButtonPanel.setBackground(fgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textButtonPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea("B\u1ea1n c\u1ea7n h\u1ecfi v\u1ec1 b\u00e0i thu\u1ed1c theo ti\u00eau ch\u00ed g\u00ec?");
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textButtonPanel.add(text);
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setPreferredSize(new Dimension(450, 110));
		buttonPanel.setOpaque(false);
		
		buttonPanel.add(tenbaithuocButton);
		buttonPanel.add(benhcanchuaButton);
		buttonPanel.add(vithuoctrongbaiButton);
		buttonPanel.add(nhathuoccobanButton);
		textButtonPanel.add(buttonPanel);
		
		panelBaithuoc.add(bubble, BorderLayout.CENTER);
		logs.add(panelBaithuoc);
	}

	public void generateVithuocPanel(){
		JPanel panelVithuoc = new JPanel(new BorderLayout());
		panelVithuoc.setOpaque(false);
		
		ImageLabel doctorLabel = new ImageLabel(doctorImg, 60, 45);
		panelVithuoc.add(doctorLabel, BorderLayout.WEST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(topBubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottomBubbleImg, 500, 15);
		
		JPanel textButtonPanel = new JPanel(new WrapLayout());
		textButtonPanel.setBackground(fgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textButtonPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea("B\u1ea1n c\u1ea7n h\u1ecfi v\u1ec1 v\u1ecb thu\u1ed1c theo ti\u00eau ch\u00ed g\u00ec?");
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textButtonPanel.add(text);
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setPreferredSize(new Dimension(450, 60));
		buttonPanel.setOpaque(false);
		
		buttonPanel.add(tenvithuocButton);
		buttonPanel.add(baithuoccovinayButton);
		textButtonPanel.add(buttonPanel);
		
		panelVithuoc.add(bubble, BorderLayout.CENTER);
		logs.add(panelVithuoc);
	}
	
	public void generateBenhPanel(){
		JPanel panelBenh = new JPanel(new BorderLayout());
		panelBenh.setOpaque(false);
		
		ImageLabel doctorLabel = new ImageLabel(doctorImg, 60, 45);
		panelBenh.add(doctorLabel, BorderLayout.WEST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(topBubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottomBubbleImg, 500, 15);
		
		JPanel textButtonPanel = new JPanel(new WrapLayout());
		textButtonPanel.setBackground(fgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textButtonPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea("B\u1ea1n c\u1ea7n h\u1ecfi v\u1ec1 b\u1ec7nh theo ti\u00eau ch\u00ed g\u00ec?");
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textButtonPanel.add(text);
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setPreferredSize(new Dimension(450, 110));
		buttonPanel.setOpaque(false);
		
		buttonPanel.add(tenbenhButton);
		buttonPanel.add(luongychuanoButton);
		buttonPanel.add(baithuocchuabenhButton);
		buttonPanel.add(chandoanButton);
		textButtonPanel.add(buttonPanel);
		
		panelBenh.add(bubble, BorderLayout.CENTER);
		logs.add(panelBenh);
	}
	
	public void generateLuongYPanel(){
		JPanel panelLuongY = new JPanel(new BorderLayout());
		panelLuongY.setOpaque(false);
		
		ImageLabel doctorLabel = new ImageLabel(doctorImg, 60, 45);
		panelLuongY.add(doctorLabel, BorderLayout.WEST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(topBubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottomBubbleImg, 500, 15);
		
		JPanel textButtonPanel = new JPanel(new WrapLayout());
		textButtonPanel.setBackground(fgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textButtonPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea("B\u1ea1n c\u1ea7n h\u1ecfi v\u1ec1 b\u1ec7nh theo ti\u00eau ch\u00ed g\u00ec?");
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textButtonPanel.add(text);
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setPreferredSize(new Dimension(450, 110));
		buttonPanel.setOpaque(false);
		
		buttonPanel.add(tenluongyButton);
		buttonPanel.add(khuvucluongyButton);
		buttonPanel.add(benhcanchualuongyButton);
		buttonPanel.add(nhathuocdanglamButton);
		textButtonPanel.add(buttonPanel);
		
		panelLuongY.add(bubble, BorderLayout.CENTER);
		logs.add(panelLuongY);
	}
	
	public void generateNhaThuocPanel(){
		JPanel panelNhaThuoc = new JPanel(new BorderLayout());
		panelNhaThuoc.setOpaque(false);
		
		ImageLabel doctorLabel = new ImageLabel(doctorImg, 60, 45);
		panelNhaThuoc.add(doctorLabel, BorderLayout.WEST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(topBubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottomBubbleImg, 500, 15);
		
		JPanel textButtonPanel = new JPanel(new WrapLayout());
		textButtonPanel.setBackground(fgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textButtonPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea("B\u1ea1n c\u1ea7n h\u1ecfi v\u1ec1 b\u1ec7nh theo ti\u00eau ch\u00ed g\u00ec?");
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textButtonPanel.add(text);
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setPreferredSize(new Dimension(450, 110));
		buttonPanel.setOpaque(false);
		
		buttonPanel.add(tennhathuocButton);
		buttonPanel.add(baithuoccanmuaButton);
		buttonPanel.add(luongymuonchuaButton);
		buttonPanel.add(khuvucnhathuocButton);
		textButtonPanel.add(buttonPanel);
		
		panelNhaThuoc.add(bubble, BorderLayout.CENTER);
		logs.add(panelNhaThuoc);
	}
	
	public void generateBaiVietPanel(){
		JPanel panelVithuoc = new JPanel(new BorderLayout());
		panelVithuoc.setOpaque(false);
		
		ImageLabel doctorLabel = new ImageLabel(doctorImg, 60, 45);
		panelVithuoc.add(doctorLabel, BorderLayout.WEST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(topBubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottomBubbleImg, 500, 15);
		
		JPanel textButtonPanel = new JPanel(new WrapLayout());
		textButtonPanel.setBackground(fgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textButtonPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea("C\u00f3 theo ti\u00eau ch\u00ed g\u00ec \u0111\u1eb7c bi\u1ec7t kh\u00f4ng?");
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textButtonPanel.add(text);
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setPreferredSize(new Dimension(450, 60));
		buttonPanel.setOpaque(false);
		
		buttonPanel.add(danhyButton);
		buttonPanel.add(khacButton);
		textButtonPanel.add(buttonPanel);
		
		panelVithuoc.add(bubble, BorderLayout.CENTER);
		logs.add(panelVithuoc);
	}
	
	public void generateDoctorField(String sentence){
		JPanel panelDoctor = new JPanel(new BorderLayout());
		panelDoctor.setOpaque(false);
		
		ImageLabel doctorLabel = new ImageLabel(doctorImg, 60, 45);
		panelDoctor.add(doctorLabel, BorderLayout.WEST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(topBubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottomBubbleImg, 500, 15);
		
		JPanel textPanel = new JPanel(new WrapLayout());
		textPanel.setBackground(fgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea(sentence);
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textPanel.add(text);
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setPreferredSize(new Dimension(490, 60));
		buttonPanel.setOpaque(false);
		
		keywordfield.setText("");
		buttonPanel.add(keywordfield);
		buttonPanel.add(okButton);
		textPanel.add(buttonPanel);
		
		panelDoctor.add(bubble, BorderLayout.CENTER);
		logs.add(panelDoctor);
	}
	
	public void generateResultList(String sentence, List<String> result){
		JPanel panelDoctor = new JPanel(new BorderLayout());
		panelDoctor.setOpaque(false);
		
		ImageLabel doctorLabel = new ImageLabel(doctorImg, 60, 45);
		panelDoctor.add(doctorLabel, BorderLayout.WEST);
		
		JPanel bubble = new JPanel(new BorderLayout());
		bubble.setOpaque(false);
		
		ImageLabel topLabel = new ImageLabel(topBubbleImg, 500, 25);
		ImageLabel bottomLabel = new ImageLabel(bottomBubbleImg, 500, 15);
		
		JPanel textPanel = new JPanel(new WrapLayout());
		textPanel.setBackground(fgColor2);
		
		bubble.add(topLabel, BorderLayout.NORTH);
		
		bubble.add(bottomLabel, BorderLayout.SOUTH);
		
		bubble.add(textPanel, BorderLayout.CENTER);
		
		JTextArea text = new JTextArea(sentence);
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textPanel.add(text);
		
		setListOfResult(result);
		JScrollPane resultScroll = new JScrollPane();
//		resultScroll.setBackground(fgColor2);
		resultScroll.setPreferredSize(new Dimension(480, 150));
		resultScroll.setViewportView(resultList);
		textPanel.add(resultScroll);
		
		panelDoctor.add(bubble, BorderLayout.CENTER);
		logs.add(panelDoctor);
	}
	

	public void refreshLog() {
//		chatListModel.clear();
//		panelRenderer = new PanelListCellRenderer();
//		chatList.setCellRenderer(panelRenderer);
		
		chatList.removeAll();
		
		for (JPanel log: logs) {
			chatList.add(log);
		}
		chatList.repaint();
		int height = (int)chatList.getPreferredSize().getHeight();
		System.out.println(height);
		scrollAskPane.getViewport().setViewPosition(new Point(0,height));
//		scrollAskPane.repaint();
	}
	
	public void rollBack() {
//		chatListModel.clear();
//		panelRenderer = new PanelListCellRenderer();
//		chatList.setCellRenderer(panelRenderer);
		
		chatList.removeAll();
		if(logs.size() > 2){
			logs.remove(logs.size()-1);
			logs.remove(logs.size()-1);
		}
		
		for (JPanel log: logs) {
			chatList.add(log);
		}
		chatList.repaint();
		int height = (int)chatList.getPreferredSize().getHeight();
		System.out.println(height);
		scrollAskPane.getViewport().setViewPosition(new Point(0,height));
//		scrollAskPane.repaint();
	}
	
	public void addBackButtonActionListener(ActionListener listener){
		backButton.addActionListener(listener);
	}
	
	public void addResetButtonActionListener(ActionListener listener){
		resetButton.addActionListener(listener);
	}
	
	//them listener cho cac nut chung
	public void addBaithuocButtonActionListener(ActionListener listener){
		baithuocButton.addActionListener(listener);
	}
	
	public void addVithuocButtonActionListener(ActionListener listener){
		vithuocButton.addActionListener(listener);
	}
	
	public void addBenhButtonActionListener(ActionListener listener){
		benhButton.addActionListener(listener);
	}
	
	public void addLuongyButtonActionListener(ActionListener listener){
		luongyButton.addActionListener(listener);
	}
	
	public void addNhathuocButtonActionListener(ActionListener listener){
		nhathuocButton.addActionListener(listener);
	}
	
	public void addBaivietButtonActionListener(ActionListener listener){
		baivietButton.addActionListener(listener);
	}
	
	//them listener cho cac nut ve bai thuoc
	public void addTenBaiThuocButtonActionListener(ActionListener listener){
		tenbaithuocButton.addActionListener(listener);
	}
	
	public void addViThuocTrongBaiButtonActionListener(ActionListener listener){
		vithuoctrongbaiButton.addActionListener(listener);
	}
	
	public void addNhaThuocCoBanButtonActionListener(ActionListener listener){
		nhathuoccobanButton.addActionListener(listener);
	}
	
	public void addBenhCanChuaButtonActionListener(ActionListener listener){
		benhcanchuaButton.addActionListener(listener);
	}
	
	//them listener cho cac nut ve vi thuoc
	public void addTenViThuocButtonActionListener(ActionListener listener){
		tenvithuocButton.addActionListener(listener);
	}
	public void addBaiThuocCoViNayButtonActionListener(ActionListener listener){
		baithuoccovinayButton.addActionListener(listener);
	}
	
	//them listener cho cac nut ve benh
	public void addTenBenhButtonActionListener(ActionListener listener){
		tenbenhButton.addActionListener(listener);
	}
	public void addLuongYChuaNoButtonActionListener(ActionListener listener){
		luongychuanoButton.addActionListener(listener);
	}
	public void addBaiThuocChuaBenhButtonActionListener(ActionListener listener){
		baithuocchuabenhButton.addActionListener(listener);
	}
	public void addChandoanButtonActionListener(ActionListener listener){
		chandoanButton.addActionListener(listener);
	}
	
	//them listener cho cac nut ve luong y
	public void addTenLuongYButtonActionListener(ActionListener listener){
		tenluongyButton.addActionListener(listener);
	}
	public void addKhuVucLuongYButtonActionListener(ActionListener listener){
		khuvucluongyButton.addActionListener(listener);
	}
	public void addBenhCanChuaLuongYButtonActionListener(ActionListener listener){
		benhcanchualuongyButton.addActionListener(listener);
	}
	public void addNhaThuocDangLamButtonActionListener(ActionListener listener){
		nhathuocdanglamButton.addActionListener(listener);
	}
	
	//them listener cho cac nut ve nha thuoc
	public void addTenNhaThuocButtonActionListener(ActionListener listener){
		tennhathuocButton.addActionListener(listener);
	}
	public void addKhuVucNhaThuocButtonActionListener(ActionListener listener){
		khuvucnhathuocButton.addActionListener(listener);
	}
	public void addBaiThuocCanMuaButtonActionListener(ActionListener listener){
		baithuoccanmuaButton.addActionListener(listener);
	}
	public void addLuongYMuonChuaButtonActionListener(ActionListener listener){
		luongymuonchuaButton.addActionListener(listener);
	}
	
	//them listener cho cac nut ve nha thuoc
	public void addDanhYButtonActionListener(ActionListener listener){
		danhyButton.addActionListener(listener);
	}
	public void addKhacButtonActionListener(ActionListener listener){
		khacButton.addActionListener(listener);
	}
	
	//them listener cho cac nut OK
	public void addOkButtonActionListener(ActionListener listener){
		okButton.addActionListener(listener);
	}
	
	public String getKeyWord(){
		return keywordfield.getText();
	}
	
	public void setListOfResult(List<String> result) {
		labelListModel.clear();
		labelRenderer = new LabelListCellRenderer();
		resultList.setCellRenderer(labelRenderer);

		for (String res : result) {
			labelListModel.addElement(getResultLabel(res));
		}
	}
	
	public void reset(){
		chatList.removeAll();
		
		logs = new ArrayList<JPanel>();
		chatList.repaint();
		int height = (int)chatList.getPreferredSize().getHeight();
		System.out.println(height);
		scrollAskPane.getViewport().setViewPosition(new Point(0,height));
	}
	
	private JLabel getResultLabel(String s){
		JLabel resultLabel = new JLabel(s);
		resultLabel.setPreferredSize(new Dimension(440, 50));
		resultLabel.setFont(SMALLER_FONT);
		resultLabel.setBorder(new EmptyBorder(0, 5, 0, 0));
		return resultLabel;
	}

	class LabelListCellRenderer implements ListCellRenderer<JLabel> {

		@Override
		public Component getListCellRendererComponent(JList<? extends JLabel> list, JLabel value, int index, boolean isSelected, boolean cellHasFocus) {
			if (value != null) {
				if (isSelected) {
					value.setOpaque(true);
					value.setBackground(bgColor2);
					value.setForeground(fgColor);
				} else {
					value.setForeground(bgColor);
					value.setBackground(fgColor);
					value.setOpaque(false);
				}
				return value;
			} else {
				return new JLabel("???");
			}
		}
	}
	
	public void addResultListMouseListener(MouseAdapter adapter){
		resultList.addMouseListener(adapter);
	}

	public void openDetail(){
		detailTitle.setText(String.format("<html><div WIDTH=%d><center>%s</center></div><html>", 470, "Y h\u1ecdc c\u1ed5 truy\u1ec1n"));
		detailScore.setValue(100);
		detailScore.setString("5/5");
		detailViews.setText("L\u01b0\u1ee3t vote: ");
		
		detailInform.removeAll();
		
//		JTextArea text1 = new JTextArea("Th\u00f4ng tin");
//		text1.setFont(SMALLER_FONT);
//		text1.setForeground(fgColor);
//		text1.setOpaque(false);
//		text1.setEditable(false);
//		text1.setColumns(30);
//		text1.setLineWrap(true);
//		text1.setWrapStyleWord(true);
//		
//		detailInform.add(text1);
		
		JTextArea content1 = new JTextArea("L\u00fd lu\u1eadn \u0110\u00f4ng y d\u1ef1a tr\u00ean n\u1ec1n t\u1ea3ng tri\u1ebft h\u1ecdc c\u1ed5 Trung Hoa: \u00c2m D\u01b0\u01a1ng, Ng\u0169 H\u00e0nh. \u00c2m D\u01b0\u01a1ng, Ng\u0169 H\u00e0nh c\u00e2n b\u1eb1ng th\u00ec c\u01a1 th\u1ec3 kh\u1ecfe m\u1ea1nh, vi\u1ec7c ch\u1eefa b\u1ec7nh nh\u1eb1m l\u1eadp l\u1ea1i tr\u1ea1ng th\u00e1i c\u00e2n b\u1eb1ng c\u1ee7a c\u00e1c y\u1ebfu t\u1ed1 \u0111\u00f3 trong khi T\u00e2y y d\u1ef1a tr\u00ean c\u00e1c ki\u1ebfn th\u1ee9c v\u1ec1 gi\u1ea3i ph\u1eabu, sinh l\u00fd, vi sinh v.v. c\u00f9ng c\u00e1c th\u00e0nh t\u1ef1u c\u1ee7a c\u00e1c ng\u00e0nh khoa h\u1ecdc hi\u1ec7n \u0111\u1ea1i. \n" +

"B\u00ean c\u1ea1nh \u00c2m D\u01b0\u01a1ng, Ng\u0169 H\u00e0nh, c\u01a1 s\u1edf l\u00fd lu\u1eadn \u0110\u00f4ng y c\u00f2n bao g\u1ed3m: h\u1ecdc thuy\u1ebft Thi\u00ean Nh\u00e2n h\u1ee3p nh\u1ea5t, h\u1ecdc thuy\u1ebft kinh l\u1ea1c, b\u00e1t c\u01b0\u01a1ng, h\u1ecdc thuy\u1ebft t\u1ea1ng t\u01b0\u1ee3ng. M\u1eb7c d\u1ea7u t\u1ea1ng t\u01b0\u1ee3ng h\u1ecdc \u0110\u00f4ng y c\u00f3 nhi\u1ec1u \u0111i\u1ec3m t\u01b0\u01a1ng \u0111\u1ed3ng v\u1edbi gi\u1ea3i ph\u1eabu v\u00e0 sinh l\u00fd h\u1ecdc T\u00e2y y, c\u00e1c t\u1eeb H\u00e1n-Vi\u1ec7t d\u00f9ng \u0111\u1ec3 ch\u1ec9 c\u00e1c t\u1ea1ng (t\u00e2m, Can, T\u1ef3, Ph\u1ebf, Th\u1eadn), ph\u1ee7 (v\u1ecb, \u0111\u1edfm, tam ti\u00eau, b\u00e0ng quang, ti\u1ec3u tr\u01b0\u1eddng, \u0111\u1ea1i tr\u01b0\u1eddng) trong \u0110\u00f4ng y kh\u00f4ng \u0111\u1ed3ng nh\u1ea5t v\u1edbi c\u00e1c t\u1eeb ch\u1ec9 c\u00e1c c\u01a1 quan theo gi\u1ea3i ph\u1eabu h\u1ecdc T\u00e2y y (tim, gan, l\u00e1ch, ph\u1ed5i, c\u1eadt; d\u1ea1 d\u00e0y, m\u1eadt v.v.). B\u1edfi l\u1ebd \u0110\u00f4ng y c\u00f3 m\u1ed9t h\u1ec7 th\u1ed1ng l\u00fd lu\u1eadn kh\u00e1c, theo \u0111\u00f3, vi\u1ec7c chia t\u00e1ch c\u01a1 th\u1ec3 th\u00e0nh c\u00e1c b\u1ed9 ph\u1eadn kh\u00e1c nhau m\u1ed9t c\u00e1ch r\u1ea1ch r\u00f2i ch\u1ec9 l\u00e0 khi\u00ean c\u01b0\u1ee1ng, do c\u01a1 th\u1ec3 l\u00e0 m\u1ed9t th\u1ec3 th\u1ed1ng nh\u1ea5t.\n" +

"Tr\u00e1i ng\u01b0\u1ee3c v\u1edbi v\u0103n h\u00f3a ph\u01b0\u01a1ng T\u00e2y, v\u0103n h\u00f3a ph\u01b0\u01a1ng \u0110\u00f4ng coi tr\u1ecdng c\u00e2n b\u1eb1ng v\u00e0 \u0111i\u1ec1u h\u00f2a. Trung dung - t\u1ee9c c\u00e2n b\u1eb1ng gi\u1eefa hai th\u00e1i c\u1ef1c, \u0111\u01b0\u1ee3c ng\u01b0\u1eddi x\u01b0a t\u00f4n vinh l\u00e0 ti\u00eau chu\u1ea9n t\u1ed1i cao trong tri\u1ebft l\u00fd tu th\u00e2n c\u1ee7a b\u1eadc qu\u00e2n t\u1eed.  Trong quan h\u1ec7 v\u1edbi thi\u00ean nhi\u00ean, ph\u01b0\u01a1ng \u0110\u00f4ng kh\u00f4ng ch\u1ee7 tr\u01b0\u01a1ng ch\u1ebf ph\u1ee5c m\u00e0 h\u01b0\u1edbng t\u1edbi s\u1ef1 h\u00f2a h\u1ee3p \u2013 thi\u00ean nh\u00e2n h\u1ee3p nh\u1ea5t. Trong quan h\u1ec7 gi\u1eefa ng\u01b0\u1eddi v\u1edbi ng\u01b0\u1eddi, t\u1eeb ng\u00e0n n\u0103m x\u01b0a d\u0129 h\u00f2a vi qu\u00fd \u0111\u00e3 tr\u1edf th\u00e0nh ph\u01b0\u01a1ng ch\u00e2m x\u1eed th\u1ebf c\u01a1 b\u1ea3n. \u0110\u1eb7c t\u00ednh v\u0103n h\u00f3a \u0111\u00f3 \u0111\u00e3 \u1ea3nh h\u01b0\u1edfng s\u00e2u s\u1eafc t\u1edbi quan ni\u1ec7m v\u00e0 ph\u01b0\u01a1ng ph\u00e1p ch\u1eefa b\u1ec7nh c\u1ee7a \u0110\u00f4ng y h\u1ecdc.V\u1ec1 b\u1ec7nh t\u1eadt, \u0110\u00f4ng y quan ni\u1ec7m m\u1ecdi th\u1ee9 \u0111\u1ec1u do \u00e2m d\u01b0\u01a1ng th\u1ea5t \u0111i\u1ec1u - m\u1ea5t s\u1ef1 c\u00e2n b\u1eb1ng v\u00e0 trung dung g\u00e2y n\u00ean. \u0110\u1ec3 ch\u1eefa tr\u1ecb b\u1ec7nh t\u1eadt, \u0110\u00f4ng y s\u1eed d\u1ee5ng 8 bi\u1ec7n ph\u00e1p c\u01a1 b\u1ea3n - h\u00e3n (l\u00e0m ra m\u1ed3 h\u00f4i), th\u1ed5 (g\u00e2y n\u00f4n), h\u1ea1 (th\u00f4ng \u0111\u1ea1i ti\u1ec7n), h\u00f2a (h\u00f2a gi\u1ea3i), \u00f4n (l\u00e0m \u1ea5m), thanh (l\u00e0m m\u00e1t), ti\u00eau (ti\u00eau th\u1ee9c \u0103n t\u00edch tr\u1ec7), b\u1ed5 (b\u1ed3i b\u1ed5) \u0111\u1ec3 kh\u00f4i ph\u1ee5c c\u00e2n b\u1eb1ng ch\u1ec9nh th\u1ec3, h\u00f3a gi\u1ea3i m\u00e2u thu\u1eabn gi\u1eefa ch\u00ednh kh\u00ed (s\u1ee9c ch\u1ed1ng b\u1ec7nh) v\u00e0 t\u00e0 kh\u00ed (t\u00e1c nh\u00e2n g\u00e2y b\u1ec7nh). Trong 8 ph\u00e9p \u0111\u00f3, kh\u00f4ng c\u00f3 bi\u1ec7n ph\u00e1p n\u00e0o mang t\u00ednh \u0111\u1ed1i kh\u00e1ng, t\u1ea5n c\u00f4ng tr\u1ef1c di\u1ec7n v\u00e0o b\u1ec7nh t\u00e0 nh\u01b0 trong T\u00e2y y.\n" +

"\u0110\u1eb7c bi\u1ec7t \u0111\u1ec3 th\u1ef1c hi\u1ec7n vi\u1ec7c h\u00f3a gi\u1ea3i c\u00f3 hi\u1ec7u qu\u1ea3 nh\u1ea5t, \u0110\u00f4ng y ch\u1ee7 tr\u01b0\u01a1ng tr\u1ecb v\u1ecb b\u1ec7nh (ch\u1eefa t\u1eeb khi b\u1ec7nh ch\u01b0a h\u00ecnh th\u00e0nh). 2000 n\u0103m tr\u01b0\u1edbc, N\u1ed9i kinh - b\u1ed9 s\u00e1ch kinh \u0111i\u1ec3n c\u1ee7a \u0110\u00f4ng y \u0111\u00e3 vi\u1ebft: B\u1eadc th\u00e1nh y kh\u00f4ng ch\u1edd khi b\u1ec7nh h\u00ecnh th\u00e0nh r\u1ed3i m\u1edbi ch\u1eefa tr\u1ecb, m\u00e0 ch\u1eefa t\u1eeb khi ch\u01b0a ph\u00e1t b\u1ec7nh. B\u1ec7nh \u0111\u00e3 h\u00ecnh th\u00e0nh m\u1edbi d\u00f9ng thu\u1ed1c, x\u00e3 h\u1ed9i \u0111\u00e3 r\u1ed1i lo\u1ea1n m\u1edbi lo ch\u1ea5n ch\u1ec9nh, kh\u00e1c g\u00ec khi kh\u00e1t n\u01b0\u1edbc m\u1edbi lo \u0111\u00e0o gi\u1ebfng, gi\u1eb7c t\u1edbi n\u01a1i m\u1edbi \u0111\u00fac binh kh\u00ed, ch\u1eb3ng qu\u00e1 mu\u1ed9n sao? (Th\u00e1nh nh\u00e2n b\u1ea5t tr\u1ecb d\u0129 b\u1ec7nh, tr\u1ecb v\u1ecb b\u1ec7nh; b\u1ec7nh d\u0129 th\u00e0nh nhi h\u1eadu d\u01b0\u1ee3c chi, lo\u1ea1n d\u0129 th\u00e0nh nhi h\u1eadu tr\u1ecb chi, v\u00ed do kh\u00e1t nhi xuy\u00ean t\u1ec9nh, \u0111\u1ea5u nhi ch\u00fa binh, b\u1ea5t di\u1ec7c v\u00e3n h\u1ed3).  Do ch\u1ee7 tr\u01b0\u01a1ng tr\u1ecb v\u1ecb b\u1ec7nh n\u00ean \u0110\u00f4ng y r\u1ea5t coi tr\u1ecdng d\u01b0\u1ee1ng sinh - n\u00e2ng cao ch\u00ednh kh\u00ed, ch\u00ednh kh\u00ed \u0111\u1ea7y \u0111\u1ee7 th\u00ec b\u1ec7nh t\u1eadt kh\u00f4ng th\u1ec3 x\u00e2m ph\u1ea1m (Ch\u00ednh kh\u00ed t\u1ed3n n\u1ed9i, t\u00e0 b\u1ea5t kh\u1ea3 can). \u0110\u00f3 c\u0169ng l\u00e0 t\u01b0 t\u01b0\u1edfng t\u01b0\u1edbng gi\u1ecfi kh\u00f4ng c\u1ea7n \u0111\u00e1nh m\u00e0 th\u1eafng trong T\u00f4n T\u1eed binh ph\u00e1p (B\u1ea5t chi\u1ebfn nhi khu\u1ea5t nh\u00e2n chi s\u01b0).  Trong s\u00e1ch N\u1ed9i kinh, d\u01b0\u1ee1ng sinh \u0111\u01b0\u1ee3c \u0111\u1eb7t v\u00e0o v\u1ecb tr\u00ed t\u1ed1i cao, c\u00f2n tr\u1ecb li\u1ec7u ch\u1ec9 \u0111\u01b0\u1ee3c xem l\u00e0 bi\u1ec7n ph\u00e1p \u1edf b\u00ecnh di\u1ec7n th\u1ea5p. T\u1ea5n c\u00f4ng tr\u1ef1c ti\u1ebfp v\u00e0o b\u1ec7nh t\u00e0 ch\u1ec9 \u0111\u01b0\u1ee3c \u0110\u00f4ng y xem nh\u01b0 bi\u1ec7n ph\u00e1p cu\u1ed1i c\u00f9ng, b\u1ea5t \u0111\u1eafc d\u0129. Tr\u1ecb v\u1ecb b\u1ec7nh, ph\u00f2ng b\u1ec7nh h\u01a1n ch\u1eefa b\u1ec7nh - l\u00e0 chi\u1ebfn l\u01b0\u1ee3c y t\u1ebf v\u00f4 c\u00f9ng s\u00e1ng su\u1ed1t v\u00e0 l\u00e0 n\u00e9t v\u0103n h\u00f3a \u0111\u1ed9c \u0111\u00e1o c\u1ee7a \u0110\u00f4ng y t\u1eeb ng\u00e0n n\u0103m x\u01b0a.  Ng\u00e0y nay, khi ph\u1ed5 b\u1ec7nh \u0111ang c\u00f3 xu h\u01b0\u1edbng chuy\u1ec3n t\u1eeb nhi\u1ec5m tr\u00f9ng sang b\u1ec7nh t\u00e2m th\u00e2n, n\u1ed9i ti\u1ebft, chuy\u1ec3n h\u00f3a, ph\u01b0\u01a1ng th\u1ee9c s\u1ed1ng,... th\u00ec chi\u1ebfn l\u01b0\u1ee3c \u0111\u00f3 s\u1ebd c\u00f2n c\u00f3 gi\u00e1 tr\u1ecb th\u1ef1c ti\u1ec5n v\u00e0 khoa h\u1ecdc to l\u1edbn h\u01a1n n\u1eefa.\n" +

"\u0110\u00f4ng y l\u00e0 nh\u00e2n thu\u1eadt, n\u00ean \u0111\u1ed1i t\u01b0\u1ee3ng ch\u00ednh c\u1ee7a \u0110\u00f4ng y kh\u00f4ng ph\u1ea3i l\u00e0 b\u1ec7nh m\u00e0 l\u00e0 con ng\u01b0\u1eddi. Con ng\u01b0\u1eddi trong \u0110\u00f4ng y c\u00f9ng v\u1edbi m\u00f4i tr\u01b0\u1eddng, v\u0169 tr\u1ee5 h\u1ee3p th\u00e0nh m\u1ed9t ch\u1ec9nh th\u1ec3 th\u1ed1ng nh\u1ea5t, ng\u01b0\u1eddi x\u01b0a g\u1ecdi \u0111\u00f3 l\u00e0 Thi\u00ean nh\u00e2n h\u1ee3p nh\u1ea5t. B\u1ea3n th\u00e2n con ng\u01b0\u1eddi c\u0169ng l\u00e0 m\u1ed9t ch\u1ec9nh th\u1ec3 th\u1ed1ng nh\u1ea5t, n\u00ean tinh th\u1ea7n v\u00e0 th\u1ec3 x\u00e1c h\u1ee3p nh\u1ea5t v\u1edbi nhau, ng\u01b0\u1eddi x\u01b0a g\u1ecdi \u0111\u00f3 l\u00e0 H\u00ecnh th\u1ea7n h\u1ee3p nh\u1ea5t.\n" +

"Ph\u01b0\u01a1ng ch\u00e2m c\u01a1 b\u1ea3n c\u1ee7a \u0110\u00f4ng y trong ch\u1eefa b\u1ec7nh l\u00e0 l\u01b0u nh\u00e2n tr\u1ecb b\u1ec7nh - ngh\u0129a l\u00e0 tr\u01b0\u1edbc h\u1ebft ph\u1ea3i gi\u1eef l\u1ea5y m\u1ea1ng s\u1ed1ng c\u1ee7a con ng\u01b0\u1eddi, sau \u0111\u00f3 m\u1edbi ngh\u0129 t\u1edbi v\u1ea5n \u0111\u1ec1 kh\u1ed1ng ch\u1ebf, ti\u00eau tr\u1eeb \u1ed5 b\u1ec7nh. M\u1ee5c ti\u00eau ch\u1eefa b\u1ec7nh c\u1ee7a \u0110\u00f4ng y l\u00e0 l\u1eadp l\u1ea1i tr\u1ea1ng th\u00e1i c\u00e2n b\u1eb1ng ch\u1ec9nh th\u1ec3. Do \u0111\u00f3 trong qu\u00e1 tr\u00ecnh ch\u1eefa b\u1ec7nh, \u0110\u00f4ng y coi tr\u1ecdng kh\u1ea3 n\u0103ng t\u1ef1 kh\u00f4i ph\u1ee5c v\u00e0 t\u00e1i t\u1ea1o c\u1ee7a c\u01a1 th\u1ec3 con ng\u01b0\u1eddi, l\u1ea5y vi\u1ec7c huy \u0111\u1ed9ng ti\u1ec1m n\u0103ng c\u1ee7a con ng\u01b0\u1eddi l\u00e0m ph\u01b0\u01a1ng ch\u00e2m ch\u00ednh. V\u00ec v\u1eady, b\u1ec7nh nh\u00e2n \u0111\u01b0\u1ee3c coi l\u00e0 ch\u1ee7 th\u1ec3, nh\u00e2n vi b\u1ea3n b\u1ec7nh vi ti\u00eau - ngh\u0129a l\u00e0 ng\u01b0\u1eddi l\u00e0 g\u1ed1c, l\u00e0 ch\u1ee7 th\u1ec3, b\u1ec7nh ch\u1ec9 l\u00e0 ng\u1ecdn.\n" +

"\u0110\u00f4ng y d\u00f9ng thu\u1ed1c t\u00f9y theo nguy\u00ean t\u1eafc Bi\u1ec7n ch\u1ee9ng lu\u1eadn tr\u1ecb - ngh\u0129a l\u00e0 t\u00f9y theo ch\u1ee9ng tr\u1ea1ng bi\u1ec3u hi\u1ec7n \u1edf ng\u01b0\u1eddi b\u1ec7nh m\u00e0 s\u1eed d\u1ee5ng ph\u00e9p ch\u1eefa, b\u00e0i thu\u1ed1c kh\u00e1c nhau. Tr\u00ean l\u00e2m s\u00e0ng, tr\u0103m ng\u01b0\u1eddi m\u1eafc c\u00f9ng m\u1ed9t b\u1ec7nh, c\u00f3 th\u1ec3 \u0111\u01b0\u1ee3c ch\u1eefa tr\u1ecb b\u1eb1ng h\u00e0ng tr\u0103m ph\u01b0\u01a1ng thu\u1ed1c kh\u00e1c nhau. V\u00ec ph\u01b0\u01a1ng thu\u1ed1c \u0111\u01b0\u1ee3c l\u1eadp ra theo nguy\u00ean t\u1eafc Bi\u1ec7n ch\u1ee9ng lu\u1eadn tr\u1ecb - t\u1ee9c ph\u1ecfng theo b\u1ec7nh t\u00ecnh c\u1ee5 th\u1ec3 \u1edf t\u1eebng ng\u01b0\u1eddi b\u1ec7nh. Ph\u01b0\u01a1ng gi\u1ea3 ph\u1ecfng d\u00e3 nh\u01b0 y gia th\u1eddi x\u01b0a th\u01b0\u1eddng n\u00f3i./n");
		content1.setFont(SMALLER_FONT);
		content1.setForeground(fgColor);
		content1.setOpaque(false);
		content1.setEditable(false);
		content1.setColumns(30);
		content1.setLineWrap(true);
		content1.setWrapStyleWord(true);
		
		detailInform.add(content1);
		
		detailInform.repaint();
		
	}
	
	public void baiThuocDetail(BaiThuoc baithuoc){
		detailTitle.setText(String.format("<html><div WIDTH=%d><center>%s</center></div><html>", 470, baithuoc.getTenBaiThuoc()));
		detailScore.setValue(baithuoc.getDiemVote()*20);
		detailScore.setString(baithuoc.getDiemVote()+"/5");
		detailViews.setText("L\u01b0\u1ee3t vote: " + baithuoc.getSoLuotTruyCap());
		
		detailInform.removeAll();
		
		JTextArea text1 = new JTextArea("Th\u00f4ng tin");
		text1.setFont(SMALLER_FONT);
		text1.setForeground(fgColor);
		text1.setOpaque(false);
		text1.setEditable(false);
		text1.setColumns(30);
		text1.setLineWrap(true);
		text1.setWrapStyleWord(true);
		
		detailInform.add(text1);
		
		JTextArea content1 = new JTextArea(baithuoc.getThongTin());
		content1.setFont(SMALLER_FONT);
		content1.setForeground(fgColor);
		content1.setOpaque(false);
		content1.setEditable(false);
		content1.setColumns(30);
		content1.setLineWrap(true);
		content1.setWrapStyleWord(true);
		
		detailInform.add(content1);
		
		JTextArea text2 = new JTextArea("C\u00e1ch d\u00f9ng");
		text2.setFont(SMALLER_FONT);
		text2.setForeground(fgColor);
		text2.setOpaque(false);
		text2.setEditable(false);
		text2.setColumns(30);
		text2.setLineWrap(true);
		text2.setWrapStyleWord(true);
		
		detailInform.add(text2);
		
		JTextArea content2 = new JTextArea(baithuoc.getCachDung());
		content2.setFont(SMALLER_FONT);
		content2.setForeground(fgColor);
		content2.setOpaque(false);
		content2.setEditable(false);
		content2.setColumns(30);
		content2.setLineWrap(true);
		content2.setWrapStyleWord(true);
		
		detailInform.add(content2);
		
		detailInform.repaint();
		
	}

	public void viThuocDetail(ViThuoc vithuoc){
		detailTitle.setText(String.format("<html><div WIDTH=%d><center>%s</center></div><html>", 470, vithuoc.getTenViThuoc()));
		detailScore.setValue(vithuoc.getDiemVote()*20);
		detailScore.setString(vithuoc.getDiemVote()+"/5");
		detailViews.setText("L\u01b0\u1ee3t vote: " + vithuoc.getSoLuotTruyCap());
		
		detailInform.removeAll();
		
		JTextArea text1 = new JTextArea("Ch\u1ee7 tr\u1ecb");
		text1.setFont(SMALLER_FONT);
		text1.setForeground(fgColor);
		text1.setOpaque(false);
		text1.setEditable(false);
		text1.setColumns(30);
		text1.setLineWrap(true);
		text1.setWrapStyleWord(true);
		
		detailInform.add(text1);
		
		JTextArea content1 = new JTextArea(vithuoc.getChuTri());
		content1.setFont(SMALLER_FONT);
		content1.setForeground(fgColor);
		content1.setOpaque(false);
		content1.setEditable(false);
		content1.setColumns(30);
		content1.setLineWrap(true);
		content1.setWrapStyleWord(true);
		
		detailInform.add(content1);
		
		JTextArea text2 = new JTextArea("Ki\u00eang k\u1ef5");
		text2.setFont(SMALLER_FONT);
		text2.setForeground(fgColor);
		text2.setOpaque(false);
		text2.setEditable(false);
		text2.setColumns(30);
		text2.setLineWrap(true);
		text2.setWrapStyleWord(true);
		
		detailInform.add(text2);
		
		JTextArea content2 = new JTextArea(vithuoc.getKiengKy());
		content2.setFont(SMALLER_FONT);
		content2.setForeground(fgColor);
		content2.setOpaque(false);
		content2.setEditable(false);
		content2.setColumns(30);
		content2.setLineWrap(true);
		content2.setWrapStyleWord(true);
		
		detailInform.add(content2);
		
		JTextArea text3 = new JTextArea("T\u00ednh ch\u1ea5t");
		text3.setFont(SMALLER_FONT);
		text3.setForeground(fgColor);
		text3.setOpaque(false);
		text3.setEditable(false);
		text3.setColumns(30);
		text3.setLineWrap(true);
		text3.setWrapStyleWord(true);
		
		detailInform.add(text3);
		
		JTextArea content3 = new JTextArea(vithuoc.getTinhChat());
		content3.setFont(SMALLER_FONT);
		content3.setForeground(fgColor);
		content3.setOpaque(false);
		content3.setEditable(false);
		content3.setColumns(30);
		content3.setLineWrap(true);
		content3.setWrapStyleWord(true);
		
		detailInform.add(content3);
		
		detailInform.repaint();
		
	}
	
	public void benhDetail(Benh benh){
		detailTitle.setText(String.format("<html><div WIDTH=%d><center>%s</center></div><html>", 470, benh.getTenBenh()));
		detailScore.setValue(benh.getDiemVote()*20);
		detailScore.setString(benh.getDiemVote()+"/5");
		detailViews.setText("L\u01b0\u1ee3t vote: " + benh.getSoLuotTruyCap());
		
		detailInform.removeAll();
		
		JTextArea text1 = new JTextArea("Th\u00f4ng tin");
		text1.setFont(SMALLER_FONT);
		text1.setForeground(fgColor);
		text1.setOpaque(false);
		text1.setEditable(false);
		text1.setColumns(30);
		text1.setLineWrap(true);
		text1.setWrapStyleWord(true);
		
		detailInform.add(text1);
		
		JTextArea content1 = new JTextArea(benh.getThongTin());
		content1.setFont(SMALLER_FONT);
		content1.setForeground(fgColor);
		content1.setOpaque(false);
		content1.setEditable(false);
		content1.setColumns(30);
		content1.setLineWrap(true);
		content1.setWrapStyleWord(true);
		
		detailInform.add(content1);
		
		JTextArea text2 = new JTextArea("Tri\u1ec7u ch\u1ee9ng");
		text2.setFont(SMALLER_FONT);
		text2.setForeground(fgColor);
		text2.setOpaque(false);
		text2.setEditable(false);
		text2.setColumns(30);
		text2.setLineWrap(true);
		text2.setWrapStyleWord(true);
		
		detailInform.add(text2);
		
		JTextArea content2 = new JTextArea(benh.getTrieuChung());
		content2.setFont(SMALLER_FONT);
		content2.setForeground(fgColor);
		content2.setOpaque(false);
		content2.setEditable(false);
		content2.setColumns(30);
		content2.setLineWrap(true);
		content2.setWrapStyleWord(true);
		
		detailInform.add(content2);
		
		JTextArea text3 = new JTextArea("Ki\u00eang k\u1ef5");
		text3.setFont(SMALLER_FONT);
		text3.setForeground(fgColor);
		text3.setOpaque(false);
		text3.setEditable(false);
		text3.setColumns(30);
		text3.setLineWrap(true);
		text3.setWrapStyleWord(true);
		
		detailInform.add(text3);
		
		JTextArea content3 = new JTextArea(benh.getKiengKy());
		content3.setFont(SMALLER_FONT);
		content3.setForeground(fgColor);
		content3.setOpaque(false);
		content3.setEditable(false);
		content3.setColumns(30);
		content3.setLineWrap(true);
		content3.setWrapStyleWord(true);
		
		detailInform.add(content3);
		
		detailInform.repaint();
		
	}

	public void luongyDetail(LuongY luongy){
		detailTitle.setText(String.format("<html><div WIDTH=%d><center>%s</center></div><html>", 470, luongy.getTen()));
		detailScore.setValue(luongy.getDiemVote()*20);
		detailScore.setString(luongy.getDiemVote()+"/5");
		detailViews.setText("L\u01b0\u1ee3t vote: " + luongy.getSoLuotTruyCap());
		
		detailInform.removeAll();
		
		JTextArea text1 = new JTextArea("Th\u00f4ng tin");
		text1.setFont(SMALLER_FONT);
		text1.setForeground(fgColor);
		text1.setOpaque(false);
		text1.setEditable(false);
		text1.setColumns(30);
		text1.setLineWrap(true);
		text1.setWrapStyleWord(true);
		
		detailInform.add(text1);
		
		JTextArea content1 = new JTextArea(luongy.getThongTin());
		content1.setFont(SMALLER_FONT);
		content1.setForeground(fgColor);
		content1.setOpaque(false);
		content1.setEditable(false);
		content1.setColumns(30);
		content1.setLineWrap(true);
		content1.setWrapStyleWord(true);
		
		detailInform.add(content1);
		
		JTextArea text2 = new JTextArea("Li\u00ean h\u1ec7");
		text2.setFont(SMALLER_FONT);
		text2.setForeground(fgColor);
		text2.setOpaque(false);
		text2.setEditable(false);
		text2.setColumns(30);
		text2.setLineWrap(true);
		text2.setWrapStyleWord(true);
		
		detailInform.add(text2);
		
		JTextArea content2 = new JTextArea(luongy.getsDT());
		content2.setFont(SMALLER_FONT);
		content2.setForeground(fgColor);
		content2.setOpaque(false);
		content2.setEditable(false);
		content2.setColumns(30);
		content2.setLineWrap(true);
		content2.setWrapStyleWord(true);
		
		detailInform.add(content2);
		
		detailInform.repaint();
		
	}
	
	public void nhathuocDetail(NhaThuoc nhathuoc){
		detailTitle.setText(String.format("<html><div WIDTH=%d><center>%s</center></div><html>", 470, nhathuoc.getTenNhaThuoc()));
		detailScore.setValue(nhathuoc.getDiemVote()*20);
		detailScore.setString(nhathuoc.getDiemVote()+"/5");
		detailViews.setText("L\u01b0\u1ee3t vote: " + nhathuoc.getSoLuotTruyCap());
		
		detailInform.removeAll();
		
		JTextArea text1 = new JTextArea("Th\u00f4ng tin");
		text1.setFont(SMALLER_FONT);
		text1.setForeground(fgColor);
		text1.setOpaque(false);
		text1.setEditable(false);
		text1.setColumns(30);
		text1.setLineWrap(true);
		text1.setWrapStyleWord(true);
		
		detailInform.add(text1);
		
		JTextArea content1 = new JTextArea(nhathuoc.getThongTin());
		content1.setFont(SMALLER_FONT);
		content1.setForeground(fgColor);
		content1.setOpaque(false);
		content1.setEditable(false);
		content1.setColumns(30);
		content1.setLineWrap(true);
		content1.setWrapStyleWord(true);
		
		detailInform.add(content1);
		
		JTextArea text2 = new JTextArea("\u0110\u1ecba ch\u1ec9");
		text2.setFont(SMALLER_FONT);
		text2.setForeground(fgColor);
		text2.setOpaque(false);
		text2.setEditable(false);
		text2.setColumns(30);
		text2.setLineWrap(true);
		text2.setWrapStyleWord(true);
		
		detailInform.add(text2);
		
		JTextArea content2 = new JTextArea(nhathuoc.getDiaChi());
		content2.setFont(SMALLER_FONT);
		content2.setForeground(fgColor);
		content2.setOpaque(false);
		content2.setEditable(false);
		content2.setColumns(30);
		content2.setLineWrap(true);
		content2.setWrapStyleWord(true);
		
		detailInform.add(content2);
		
		detailInform.repaint();
		
	}

	public void baivietDetail(BaiViet baiviet){
		detailTitle.setText(String.format("<html><div WIDTH=%d><center>%s</center></div><html>", 470, baiviet.getTenBaiViet()));
		detailScore.setValue(baiviet.getDiemVote()*20);
		detailScore.setString(baiviet.getDiemVote()+"/5");
		detailViews.setText("L\u01b0\u1ee3t vote: " + baiviet.getSoLuotTruyCap());
		
		detailInform.removeAll();
		
		JTextArea content1 = new JTextArea(baiviet.getNoiDung());
		content1.setFont(SMALLER_FONT);
		content1.setForeground(fgColor);
		content1.setOpaque(false);
		content1.setEditable(false);
		content1.setColumns(30);
		content1.setLineWrap(true);
		content1.setWrapStyleWord(true);
		
		detailInform.add(content1);
		
		detailInform.repaint();
		
	}
	
	public void addRateActionListener(ActionListener listener){
		rateButton.addActionListener(listener);
	}

}
