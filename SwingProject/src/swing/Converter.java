package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Converter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1,num2;
	double res,res1;
	String ans;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
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
	public Converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Height and Weight converter v.Beta 0.12.1");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 379, 298);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(234, 89, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(234, 138, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				res=num1/3.371;
				res1=num2/3.215;
				ans=String.format("%.2f m",res);
				String ans1=String.format("%.2f m",res1);
				label.setText(ans);
				lblNewLabel_2.setText(ans1);
			}
		});
		btnNewButton.setBounds(84, 186, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(213, 186, 109, 23);
		frame.getContentPane().add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(83, 135, 110, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(84, 86, 110, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Height:");
		lblNewLabel.setFont(new Font("Gulim", Font.PLAIN, 11));
		lblNewLabel.setBounds(25, 89, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Weight:");
		lblNewLabel_1.setFont(new Font("Gulim", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(25, 138, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setFont(new Font("Gulim", Font.PLAIN, 12));
		lblUsMeasurement.setBounds(85, 62, 139, 23);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Gulim", Font.PLAIN, 12));
		lblMetric.setBounds(234, 66, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Gulim", Font.PLAIN, 11));
		lblHelp.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Gulim", Font.PLAIN, 11));
		lblAbout.setBounds(47, 11, 46, 14);
		frame.getContentPane().add(lblAbout);
		
			}
}
