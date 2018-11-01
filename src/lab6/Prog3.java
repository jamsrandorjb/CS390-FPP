package lab6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Prog3 extends JFrame  {
	private JTextField text1;
	private JPanel textPanel1;
	private JLabel label1;
	private JTextField text2;
	private JPanel textPanel2;
	private JLabel label2;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	JPanel rightPanel = new JPanel();
	JPanel leftPanel = new JPanel();
	JPanel lowPanel = new JPanel();
	
	public Prog3() {

		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		defineLowPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(rightPanel, BorderLayout.CENTER);
		mainPanel.add(leftPanel, BorderLayout.WEST);
		getContentPane().add(mainPanel);

		/** Config of window */
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("String Utility-Updated");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setSize((int) width -670, 120);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	private void defineTopPanel() {
		rightPanel = new JPanel();
		defineTextPanel();
		rightPanel.add(textPanel1);
		rightPanel.add(textPanel2);
		rightPanel.setLayout((LayoutManager) new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
	}
	private void defineTextPanel() {
		label1 = new JLabel("Input");
		text1 = new JTextField(10);
		textPanel1 = new JPanel();
		textPanel1.setLayout(new BorderLayout());
		textPanel1.add(text1, BorderLayout.CENTER);
		textPanel1.add(label1, BorderLayout.NORTH);

		
		textPanel2 = new JPanel();
		label2 = new JLabel("Output");
		text2 = new JTextField(10);
		textPanel2.setLayout(new BorderLayout());
		textPanel2.add(text2, BorderLayout.CENTER);
		textPanel2.add(label2, BorderLayout.NORTH);
		
	}
	private void defineMiddlePanel() {
		leftPanel = new JPanel();
		
		button1 = new JButton("Count Letters");
		button1.addActionListener(evt -> {
										String str1= text1.getText();
										text2.setText(""+str1.length());
										});
										//new MyButtonListener());
		button2 = new JButton("Reverse Letters");
		button2.addActionListener(evt -> {
										String str1= text1.getText();
										text2.setText(""+reverseStr1(str1));
										});
										//new MyButtonListener());
		button3 = new JButton("Remove Duplicates");
		button3.addActionListener(evt -> {
										String str1= text1.getText();
										text2.setText(""+removeDuplicates1(str1));
										});
										//new MyButtonListener());
		leftPanel.setLayout((LayoutManager) new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		leftPanel.add(button1);
		leftPanel.add(button2);
		leftPanel.add(button3);
		//middlePanel.add(textPanel4);
		//middlePanel.add(textPanel5);
	}
	private void defineLowPanel() {
		lowPanel = new JPanel();
		
	}
	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			Prog3 ex = new Prog3();
			ex.setVisible(true);
		});
	}
	
	public String reverseStr1(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	            result += String.valueOf(input.charAt(input.length()-i-1));
	    }
	    return result;
	}
	
	public String removeDuplicates1(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}
	
	class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			/*String str1 = text1.getText();
			if(evt.getActionCommand().equals("Count Letters"))
				text2.setText(""+str1.length());
			else if(evt.getActionCommand().equals("Reverse Letters"))
				text2.setText(""+reverseStr(str1));
			else
				text2.setText(""+removeDuplicates(str1));
			*/
			
		}
		/*
		public String reverseStr(String input){
		    String result = "";
		    for (int i = 0; i < input.length(); i++) {
		            result += String.valueOf(input.charAt(input.length()-i-1));
		    }
		    return result;
		}

		public String removeDuplicates(String input){
		    String result = "";
		    for (int i = 0; i < input.length(); i++) {
		        if(!result.contains(String.valueOf(input.charAt(i)))) {
		            result += String.valueOf(input.charAt(i));
		        }
		    }
		    return result;
		}*/
	}


}
