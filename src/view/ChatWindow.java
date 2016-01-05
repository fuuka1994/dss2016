package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class ChatWindow extends JFrame {

	/**
	 * Main view
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ChatWindow(){
		this.setResizable(false);
		this.setTitle("H%u1EC7%20th%u1ED1ng%20tr%u1EE3%20gi%FAp%20quy%u1EBFt%20%u0111%u1ECBnh%20v%u1EC1%20Y%20h%u1ECDc%20c%u1ED5%20truy%u1EC1n");
		this.setBounds(150, 5, 1000, 710);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
	}
}
