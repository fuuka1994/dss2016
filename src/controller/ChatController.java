package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.Answer;
import model.Question;
import view.ChatWindow;

public class ChatController {
	ChatWindow view;
	
	private List<Question> questions;
	private List<Answer> answers;
	
	public ChatController(){
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
		
		view.generateDoctorSentence("Xin ch\u00e0o, t\u00f4i l\u00e0 l\u01b0\u01a1ng y Nh\u00f3m 5. H\u00e3y h\u1ecfi v\u1ec1 nh\u1eefng g\u00ec b\u1ea1n th\u1eafc m\u1eafc nh\u00e9.");
		view.getStartPanel();
		view.refreshLog();
		
		view.addBaithuocButtonActionListener(getBaithuocActionListener());
		
		view.setVisible(true);
	}
	
	private ActionListener getBaithuocActionListener(){
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.generatePatientSentence("T\u00f4i mu\u1ed1n h\u1ecfi v\u1ec1 b\u00e0i thu\u1ed1c.");
				view.generateBaithuocPanel();
				view.generateDoctorField("Fuckkk");
				view.refreshLog();
			}
		};
		return listener;
	}
}
