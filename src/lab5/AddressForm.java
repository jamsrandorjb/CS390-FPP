package lab5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddressForm extends JFrame {

	private JTextField text1;
	private JPanel textPanel1;
	private JLabel label1;
	private JTextField text2;
	private JPanel textPanel2;
	private JLabel label2;
	private JTextField text3;
	private JPanel textPanel3;
	private JLabel label3;
	private JTextField text4;
	private JPanel textPanel4;
	private JLabel label4;
	private JTextField text5;
	private JPanel textPanel5;
	private JLabel label5;
	private JLabel label6 = new JLabel();
	private JButton button;

	JPanel topPanel = new JPanel();
	JPanel middlePanel = new JPanel();
	JPanel lowPanel = new JPanel();

	public AddressForm() {

		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		defineLowPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		mainPanel.add(lowPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);

		/** Config of window */
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Address Form");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setSize((int) width - 670, 180);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void defineTextPanel() {
		label1 = new JLabel("Name");
		text1 = new JTextField(10);
		textPanel1 = new JPanel();
		textPanel1.setLayout(new BorderLayout());
		textPanel1.add(text1, BorderLayout.CENTER);
		textPanel1.add(label1, BorderLayout.NORTH);

		label2 = new JLabel("Street");
		text2 = new JTextField(10);
		textPanel2 = new JPanel();
		textPanel2.setLayout(new BorderLayout());
		textPanel2.add(text2, BorderLayout.CENTER);
		textPanel2.add(label2, BorderLayout.NORTH);

		label3 = new JLabel("City");
		text3 = new JTextField(10);
		textPanel3 = new JPanel();
		textPanel3.setLayout(new BorderLayout());
		textPanel3.add(text3, BorderLayout.CENTER);
		textPanel3.add(label3, BorderLayout.NORTH);

		label4 = new JLabel("State");
		text4 = new JTextField(10);
		textPanel4 = new JPanel();
		textPanel4.setLayout(new BorderLayout());
		textPanel4.add(text4, BorderLayout.CENTER);
		textPanel4.add(label4, BorderLayout.NORTH);

		label5 = new JLabel("Zip");
		text5 = new JTextField(10);
		textPanel5 = new JPanel();
		textPanel5.setLayout(new BorderLayout());
		textPanel5.add(text5, BorderLayout.CENTER);
		textPanel5.add(label5, BorderLayout.NORTH);

	}

	private void defineTopPanel() {
		topPanel = new JPanel();
		defineTextPanel();
		topPanel.add(textPanel1);
		topPanel.add(textPanel2);
		topPanel.add(textPanel3);
	}

	private void defineMiddlePanel() {
		middlePanel = new JPanel();
		middlePanel.add(textPanel4);
		middlePanel.add(textPanel5);
	}

	private void defineLowPanel() {
		lowPanel = new JPanel();
		button = new JButton("Submit");
		button.addActionListener(new MyButtonListener());
		lowPanel.add(button);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			AddressForm ex = new AddressForm();
			ex.setVisible(true);
		});
	}

	class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String str1 = text1.getText();
			String str2 = text2.getText();
			String str3 = text3.getText();
			String str4 = text4.getText();
			String str5 = text5.getText();

			 label6.setText(str1 + "\n" + str2 + "\n" + str3 + ", " + str4
			 + " " + str5);
			 System.out.println(str1 + "\n" + str2 + "\n" + str3 + ", " +
					 str4 + " " + str5);
			
		}
	}

}
