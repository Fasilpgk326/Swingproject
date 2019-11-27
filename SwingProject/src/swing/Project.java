package swing;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Project {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
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
	public Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(64, 224, 208));
		frame.setBounds(100, 100, 883, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C://Users/USER/Downloads/zzo.png"));
		lblNewLabel.setBounds(10, 84, 238, 274);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFitnessCenter = new JLabel("FITNESS CENTER");
		lblFitnessCenter.setForeground(new Color(0, 128, 128));
		lblFitnessCenter.setBackground(new Color(0, 128, 128));
		lblFitnessCenter.setFont(new Font("Showcard Gothic", Font.PLAIN, 51));
		lblFitnessCenter.setBounds(199, 11, 638, 45);
		frame.getContentPane().add(lblFitnessCenter);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(32, 178, 170), new Color(255, 215, 0), new Color(32, 178, 170), new Color(255, 215, 0)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(610, 101, 190, 156);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Name :");
		label.setBounds(10, 11, 63, 17);
		panel.add(label);
		label.setForeground(new Color(255, 245, 238));
		label.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel label_1 = new JLabel("Age    :");
		label_1.setBounds(10, 39, 63, 17);
		panel.add(label_1);
		label_1.setForeground(new Color(255, 228, 196));
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel label_2 = new JLabel("Address :");
		label_2.setBounds(10, 67, 63, 17);
		panel.add(label_2);
		label_2.setForeground(new Color(255, 250, 205));
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel label_3 = new JLabel("Contact no. :");
		label_3.setBounds(10, 108, 73, 17);
		panel.add(label_3);
		label_3.setForeground(new Color(255, 228, 196));
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(94, 10, 86, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(94, 38, 86, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(94, 66, 86, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(93, 107, 86, 20);
		panel.add(textField_6);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(359, 118, 57, 17);
		frame.getContentPane().add(lblHeight);
		lblHeight.setForeground(new Color(255, 228, 196));
		lblHeight.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel label_4 = new JLabel("Weight");
		label_4.setBounds(359, 172, 57, 17);
		frame.getContentPane().add(label_4);
		label_4.setForeground(new Color(255, 250, 205));
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel label_5 = new JLabel("BMI");
		label_5.setBounds(359, 224, 46, 14);
		frame.getContentPane().add(label_5);
		label_5.setForeground(new Color(255, 228, 196));
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setBounds(426, 117, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(426, 171, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(426, 221, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel label_6 = new JLabel(new ImageIcon("C://Users/USER/Downloads/ftt.png"));
		label_6.setBounds(369, 249, 269, 197);
		frame.getContentPane().add(label_6);
	}
}
