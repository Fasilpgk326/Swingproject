package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class sample {

	private JFrame frame;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample window = new sample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("login");
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 589, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton(new ImageIcon("C://Users/USER/Downloads/Click-here-button.png"));
		btnNewButton.setText("FGF");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Iskoola Pota", Font.BOLD, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(171, 342, 194, 36);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(315, 148, 155, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setFont(new Font("Serif", Font.PLAIN, 17));
		lblUserName.setBounds(229, 145, 121, 21);
		frame.getContentPane().add(lblUserName);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(315, 179, 155, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Serif", Font.PLAIN, 17));
		lblPassword.setBounds(239, 176, 91, 20);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C://Users/USER/Downloads/ff.png"));
		lblNewLabel.setBounds(-120, -89, 470, 467);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(206, 359, 144, -95);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxForgotPassword = new JCheckBox("Forgot password");
		chckbxForgotPassword.setBounds(325, 211, 134, 20);
		frame.getContentPane().add(chckbxForgotPassword);
	}
}
