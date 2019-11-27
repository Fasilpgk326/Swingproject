package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ticket {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table_1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
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
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 669, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel.setBounds(149, 11, 377, 58);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setBounds(22, 11, 308, 36);
		panel.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(10, 89, 61, 20);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(81, 91, 109, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 117, 260, 8);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnStandard.setBounds(6, 132, 92, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Single Ticket");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(95, 132, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnA = new JRadioButton("Adult");
		rdbtnA.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnA.setBounds(206, 132, 64, 23);
		frame.getContentPane().add(rdbtnA);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnFirstClass.setBounds(6, 158, 92, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("AC");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setBounds(105, 158, 41, 20);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Sleeper");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_2.setBounds(149, 158, 69, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Child");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_3.setBounds(216, 158, 54, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Arunachal predhesh", "kerala", "tamil nadu", "karnadaka"}));
		comboBox.setBounds(10, 188, 88, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Andhra predhesh", "kerala", "tamil nadu", "karnadaka"}));
		comboBox_1.setBounds(108, 188, 75, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new 	(new String[] {"1", "2", "3", "4"}));
		comboBox_2.setBounds(193, 188, 77, 20);
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 219, 260, 13);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tax");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 229, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 226, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(10, 254, 88, 14);
		frame.getContentPane().add(lblSubTotal);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 251, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(10, 279, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(118, 282, 86, 20);
		frame.getContentPane().add(textField_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 313, 260, 8);
		frame.getContentPane().add(separator_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 332, 77, 28);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s=textField.getText();
				String s3=textField_3.getText();
				textField_10.setText(s3);
				String a="",b="";
				textField.setText(s);
				String s1=(String) comboBox.getSelectedItem();
				String s2=(String) comboBox_1.getSelectedItem();
				if(s1.equals("Arunachal predhesh"))
                    a="Arunachal predhesh";
				if(s1.equals("Kerala"))
						a="Kerala";
				if(s1.equals("Tamilnadu"))
					a="Tamilnadu";
				if(s1.equals("Karnadaka"));
				   a="karanadaka";
				if(s2.equals("Arunachal predhesh"))
					b="Arunachal predhesh";
				if(s2.equals("Kerala"))
					b="Kerala";
				if(s2.equals("Tamilnadu"));
				  b="Tamilnadu";
				if(s2.equals("Karnadaka"));
				  b="Karnadaka";
				  textField_5.setText(a);
				  textField_6.setText(b);
				  }
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(0, 0, 77, 28);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(95, 332, 77, 28);
		frame.getContentPane().add(panel_2);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(0, 0, 77, 28);
		panel_2.add(btnReset);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(182, 332, 77, 28);
		frame.getContentPane().add(panel_3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
                int confirmed=JOptionPane.showConfirmDialog(null,"Do you want to Exit","EXIT",JOptionPane.YES_NO_OPTION);
                //if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION==JOptionPane.YES_NO_OPTION))
                if(confirmed==JOptionPane.YES_OPTION)
                {   
                	System.exit(0);
                	}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(0, 0, 77, 28);
		panel_3.add(btnExit);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_4.setBounds(286, 80, 357, 294);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 34, 59, 14);
		panel_4.add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(66, 33, 100, 20);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFrom.setBounds(10, 74, 46, 14);
		panel_4.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTo.setBounds(10, 109, 59, 25);
		panel_4.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDate.setBounds(10, 149, 46, 14);
		panel_4.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTime.setBounds(10, 186, 46, 14);
		panel_4.add(lblTime);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(66, 72, 100, 20);
		panel_4.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(66, 112, 100, 20);
		panel_4.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(66, 147, 100, 20);
		panel_4.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(66, 184, 100, 20);
		panel_4.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(233, 91, 100, 20);
		panel_4.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(233, 130, 100, 20);
		panel_4.add(textField_10);
		
		JLabel lblNewLabel_3 = new JLabel("Ticket no");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(249, 74, 68, 14);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrice.setBounds(253, 114, 46, 14);
		panel_4.add(lblPrice);
		
		JLabel lblRout = new JLabel("Route");
		lblRout.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRout.setBounds(253, 161, 46, 14);
		panel_4.add(lblRout);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(233, 180, 100, 20);
		panel_4.add(textField_11);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(88, 238, 113, 25);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnComfirm = new JButton("Comfirm");
		btnComfirm.setBounds(0, 0, 113, 26);
		panel_5.add(btnComfirm);
		btnComfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	                textField_8.setText(tTime.format(timer.getTime()));
	                //Date
	                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
	                textField_7.setText(tdate.format(timer.getTime()));
                DefaultTableModel model=(DefaultTableModel) table_1.getModel();
                String v;
                
				if(rdbtnNewRadioButton_1.isSelected())
				{
					v="AC";
					
			     }
				else
				{
					v="nonAC";
					
				}
				
				model.addRow(new String[]
				{	
					textField_4.getText(),
					textField_9.getText(),
					textField_5.getText(),
					textField_6.getText(),
					(String) comboBox_2.getSelectedItem(),
					textField_7.getText(),
					textField_8.getText(),
					v,
					textField_10.getText(),
				

	
				});

			}
			
		});
		btnComfirm.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(276, 117, 65, 255);
		frame.getContentPane().add(separator_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLUE);
		panel_6.setBounds(10, 385, 633, 80);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No.of Seat", "Time", "Date", "Ac/Non-Ac", "Price"},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Name", "Booking no", "From", "To", "No.of Seat", "Time", "Date", "Ac/Non-Ac", "Price"
			}
		));
		table_1.setBounds(10, 11, 613, 47);
		panel_6.add(table_1);
	}
}
