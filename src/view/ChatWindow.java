package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
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
	
	private static final Font BIGGER_FONT = new Font(Font.SERIF, Font.PLAIN, 40);
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
	private final String caythuocImg = "ct.png";
	private final String caythuocHoverImg = "cth.png";
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
	private final String caythuoctrongbaiImg = "cttb.png";
	private final String caythuoctrongbaiHoverImg = "cttbh.png";
	private final String okImg = "ok.png";
	private final String okHoverImg = "okh.png";

	private JScrollPane scrollAskPane;
	private JPanel chatList;
	private DefaultListModel<JPanel> chatListModel;
	private JPanel questionPanel;
	private ImageButton backButton;
	private ImageButton askButton;
	private ImageButton resetButton;
	
	private ImageButton baithuocButton;
	private ImageButton caythuocButton;
	private ImageButton benhButton;
	private ImageButton luongyButton;
	private ImageButton nhathuocButton;
	private ImageButton baivietButton;
	
	private ImageButton tenbaithuocButton;
	private ImageButton benhcanchuaButton;
	private ImageButton caythuoctrongbaiButton;
	
	private JTextField keywordfield;
	private ImageButton okButton;
	
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
		chatListModel = new DefaultListModel<JPanel>();
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
		
		caythuocButton = new ImageButton(caythuocImg, caythuocHoverImg);
		caythuocButton.setPreferredSize(new Dimension(100, 100));
		caythuocButton.setOpaque(false);
		
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
		
		tenbaithuocButton = new ImageButton(tenbaithuocImg, tenbaithuocHoverImg);
		tenbaithuocButton.setPreferredSize(new Dimension(200, 50));
		tenbaithuocButton.setOpaque(false);
		
		benhcanchuaButton = new ImageButton(benhcanchuaImg, benhcanchuaHoverImg);
		benhcanchuaButton.setPreferredSize(new Dimension(200, 50));
		benhcanchuaButton.setOpaque(false);
		
		caythuoctrongbaiButton = new ImageButton(caythuoctrongbaiImg, caythuoctrongbaiHoverImg);
		caythuoctrongbaiButton.setPreferredSize(new Dimension(200, 50));
		caythuoctrongbaiButton.setOpaque(false);
		
		okButton = new ImageButton(okImg, okHoverImg);
		okButton.setPreferredSize(new Dimension(50, 50));
		okButton.setOpaque(false);
		
		keywordfield = new JTextField();
		keywordfield.setPreferredSize(new Dimension(430, 50));
		keywordfield.setForeground(fgColor);
		keywordfield.setFont(SMALLER_FONT);
		
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
		buttonPanel.add(caythuocButton);
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
		buttonPanel.add(caythuoctrongbaiButton);
		textButtonPanel.add(buttonPanel);
		
		panelBaithuoc.add(bubble, BorderLayout.CENTER);
		logs.add(panelBaithuoc);
	}
	
	public String generateDoctorField(String sentence){
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
		
		buttonPanel.add(keywordfield);
		buttonPanel.add(okButton);
		textPanel.add(buttonPanel);
		
		panelDoctor.add(bubble, BorderLayout.CENTER);
		logs.add(panelDoctor);
		
		return null;
	}

	
	public void refreshLog() {
//		chatListModel.clear();
//		panelRenderer = new PanelListCellRenderer();
//		chatList.setCellRenderer(panelRenderer);
		
		chatList.removeAll();
		
		for (JPanel log: logs) {
//			chatListModel.addElement(log);
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
	
	public void addBaithuocButtonActionListener(ActionListener listener){
		baithuocButton.addActionListener(listener);
	}
	
	public void addCaythuocButtonActionListener(ActionListener listener){
		caythuocButton.addActionListener(listener);
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
	
	
}
