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
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

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
	
	private static final Font BIGGER_FONT = new Font(Font.SERIF, Font.PLAIN, 30);
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
	private final String askImg = "ask.png";
	private final String askHoverImg = "askh.png";
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
	
	

	private JScrollPane scrollAskPane;
	private JPanel chatList;
	private ImageButton backButton;
	private ImageButton askButton;
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
	
	public ChatWindow(){
		this.setResizable(false);
		this.setTitle("H\u1ec7 th\u1ed1ng tr\u1ee3 gi\u00fap quy\u1ebft \u0111\u1ecbnh v\u1ec1 Y h\u1ecdc c\u1ed5 truy\u1ec1n");
		this.setBounds((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width-600)/2, 5, 600, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(bgColor);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
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
		tabbedPane.addTab("H\u1ecfi \u0111\u00e1p", null, askPanel, null);
		askPanel.setLayout(new BorderLayout(0, 0));
		
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
		bottomButtonPanel.setPreferredSize(new Dimension(600, 50));
//		bottomAskPanel.add(bottomButtonPanel, BorderLayout.SOUTH);
		askPanel.add(bottomButtonPanel, BorderLayout.SOUTH);
		
		backButton = new ImageButton(backImg, backHoverImg);
		backButton.setPreferredSize(new Dimension(150, 45));
		backButton.setOpaque(false);
		bottomButtonPanel.add(backButton);
		
		askButton = new ImageButton(askImg, askHoverImg);
		askButton.setPreferredSize(new Dimension(200, 45));
		askButton.setOpaque(false);
		bottomButtonPanel.add(askButton);
		
		resetButton = new ImageButton(resetImg, resetHoverImg);
		resetButton.setPreferredSize(new Dimension(150, 45));
		resetButton.setOpaque(false);
		bottomButtonPanel.add(resetButton);
		
		baithuocButton = new ImageButton(baithuocImg, baithuocHoverImg);
		baithuocButton.setPreferredSize(new Dimension(100, 100));
		baithuocButton.setOpaque(false);
		
		vithuocButton = new ImageButton(vithuocImg, vithuocHoverImg);
		vithuocButton.setPreferredSize(new Dimension(100, 100));
		vithuocButton.setOpaque(false);
		
		benhButton = new ImageButton(benhImg, benhHoverImg);
		benhButton.setPreferredSize(new Dimension(100, 100));
		benhButton.setOpaque(false);
		
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
	
	public void generateDetailList(String title, String sentence, List<String> result){
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
		
		JTextArea tit = new JTextArea(title);
		tit.setFont(BIGGER_FONT);
		tit.setForeground(bgColor);
		tit.setOpaque(false);
		tit.setEditable(false);
		tit.setColumns(34);
		tit.setLineWrap(true);
		tit.setWrapStyleWord(true);
		
		JTextArea text = new JTextArea(sentence);
		text.setFont(SMALLER_FONT);
		text.setForeground(bgColor);
		text.setOpaque(false);
		text.setEditable(false);
		text.setColumns(34);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		textPanel.add(tit);
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
	
	public void addBackButtonActionListener(ActionListener listener){
		backButton.addActionListener(listener);
	}
	
	public void addAskButtonActionListener(ActionListener listener){
		askButton.addActionListener(listener);
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

}
