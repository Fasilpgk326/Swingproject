package swing;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
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
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 337, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);;
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("C://Users/USER/Downloads/rrr.png"));
		lblNewLabel_1.setBounds(-21, 285, 358, 175);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C://Users/USER/Downloads/hhh.png"));
		lblNewLabel.setBounds(0, 0, 324, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(10, 57, 296, 228);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(89, 60, 136, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblHeightm = new JLabel("Height(m):");
		lblHeightm.setBounds(25, 62, 68, 17);
		panel.add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("Weight(kg):");
		lblWeightkg.setBounds(25, 102, 68, 20);
		panel.add(lblWeightkg);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(89, 102, 136, 20);
		panel.add(textField_1);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							}
		});
		btnCalculate.setBounds(51, 194, 77, 23);
		panel.add(btnCalculate);
		
		JButton btnOk = new JButton("Clear");
		btnOk.setBounds(138, 194, 68, 23);
		panel.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(216, 194, 68, 23);
		panel.add(btnCancel);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBmi.setBounds(35, 134, 46, 14);
		panel.add(lblBmi);
		
		
	}
}
