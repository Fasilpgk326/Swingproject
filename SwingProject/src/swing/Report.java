package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Report {

	private JFrame frame;
	private JTextField textField;
	private JPanel panel_1;
	private JTextField textField_1;
	private JLabel lblSurename;
	private JTextField textField_2;
	private JLabel lblCourse;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextArea textArea;
	private JPanel panel_3;
	private JButton btnNewButton;
	private JPanel panel_6;
	private JButton btnShowReport;
	private JPanel panel_4;
	private JButton btnAddReport;
	private JPanel panel_5;
	private JButton btnDelete;
	private JPanel panel_7;
	private JButton btnExit;
	private JPanel panel_8;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report window = new Report();
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
	public Report() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 738, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 336, 253);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel.setBounds(10, 25, 62, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(82, 23, 67, 16);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("Firstname");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblFirstName.setBounds(10, 49, 62, 17);
		panel.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(82, 50, 67, 16);
		panel.add(textField_1);
		
		lblSurename = new JLabel("Surename");
		lblSurename.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblSurename.setBounds(10, 77, 62, 14);
		panel.add(lblSurename);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(82, 77, 67, 16);
		panel.add(textField_2);
		
		lblCourse = new JLabel("CourseCode");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblCourse.setBounds(10, 102, 62, 14);
		panel.add(lblCourse);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 127, 149, 8);
		panel.add(separator);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblTotalScore.setBounds(10, 137, 62, 17);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblAverage.setBounds(10, 165, 62, 16);
		panel.add(lblAverage);
		
		JLabel lblNewLabel_1 = new JLabel("Ranking");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_1.setBounds(10, 202, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(82, 135, 67, 16);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(82, 165, 67, 16);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(82, 201, 67, 16);
		panel.add(textField_6);
		
		JLabel lblNewLabel_2 = new JLabel("Maths");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_2.setBounds(169, 25, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblEnglish.setBounds(169, 50, 46, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblBiology.setBounds(169, 77, 46, 14);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblComputer.setBounds(169, 102, 56, 14);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblChemistry.setBounds(169, 127, 56, 16);
		panel.add(lblChemistry);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblTamil.setBounds(169, 179, 46, 14);
		panel.add(lblTamil);
		
		JLabel lblNewLabel_3 = new JLabel("Malayalam");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_3.setBounds(169, 202, 56, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Physics");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(169, 154, 46, 14);
		panel.add(lblNewLabel_4);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
                char num=evt.getKeyChar();
               if(!(Character.isDigit(num))
                       ||(num==KeyEvent.VK_BACK_SPACE)
                       ||(num==KeyEvent.VK_DELETE)) {
                   evt.consume();
                
               
	               }
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(236, 22, 67, 16);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
			
            if(!(Character.isDigit(num))
                    ||(num==KeyEvent.VK_BACK_SPACE)
                    ||(num==KeyEvent.VK_DELETE)) {
                e.consume();
             
				
            }
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(236, 47, 67, 16);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
				
	            if(!(Character.isDigit(num))
	                    ||(num==KeyEvent.VK_BACK_SPACE)
	                    ||(num==KeyEvent.VK_DELETE)) {
	                e.consume();
	            }
	             
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(236, 74, 67, 16);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
char num=e.getKeyChar();
				
	            if(!(Character.isDigit(num))
	                    ||(num==KeyEvent.VK_BACK_SPACE)
	                    ||(num==KeyEvent.VK_DELETE)) {
	                e.consume();
	            }
	             
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(236, 99, 67, 16);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
char num=e.getKeyChar();
				
	            if(!(Character.isDigit(num))
	                    ||(num==KeyEvent.VK_BACK_SPACE)
	                    ||(num==KeyEvent.VK_DELETE)) {
	                e.consume();
	            }
	             
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(236, 127, 67, 16);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
char num=e.getKeyChar();
				
	            if(!(Character.isDigit(num))
	                    ||(num==KeyEvent.VK_BACK_SPACE)
	                    ||(num==KeyEvent.VK_DELETE)) {
	                e.consume();
	            }
	             
			}
		});
		textField_12.setColumns(10);
		textField_12.setBounds(236, 148, 67, 16);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
char num=e.getKeyChar();
				
	            if(!(Character.isDigit(num))
	                    ||(num==KeyEvent.VK_BACK_SPACE)
	                    ||(num==KeyEvent.VK_DELETE)) {
	                e.consume();
	            }
	             
			}
		});
		textField_13.setColumns(10);
		textField_13.setBounds(236, 175, 67, 16);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
char num=e.getKeyChar();
				
	            if(!(Character.isDigit(num))
	                    ||(num==KeyEvent.VK_BACK_SPACE)
	                    ||(num==KeyEvent.VK_DELETE)) {
	                e.consume();
	            }
	             
			}
		});
		textField_14.setColumns(10);
		textField_14.setBounds(236, 201, 67, 16);
		panel.add(textField_14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 8));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"111032A", "111032B", "111032C"}));
		comboBox.setBounds(82, 99, 67, 20);
		panel.add(comboBox);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 328, 702, 73);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Std_ID", "Crsname", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "TotalScore", "Average", "Ranking"},
			},
			new String[] {
				"Std_ID", "Crsname", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "TotalScore", "Average", "Ranking"
			}
		));
		table.setBounds(0, 0, 702, 62);
		panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel_2.setBackground(new Color(123, 104, 238));
		panel_2.setBounds(352, 11, 370, 306);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 36, 350, 231);
		panel_2.add(textArea);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(123, 104, 238));
		panel_3.setForeground(new Color(147, 112, 219));
		panel_3.setBounds(131, 270, 117, 25);
		panel_2.add(panel_3);
		
		btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		panel_3.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(0, 0, 255));
		
		panel_6 = new JPanel();
		panel_6.setForeground(new Color(147, 112, 219));
		panel_6.setBackground(Color.BLUE);
		panel_6.setBounds(305, 412, 117, 25);
		frame.getContentPane().add(panel_6);
		
		btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("                  Student record                     \n"
						+"Student Name: \t\t"+textField.getText()+" "+textField_1.getText()+"\n"
						+"==============================================\n"
						+ "Math:\t\t"+textField_7.getText()+"\n"
						+"Englis :\t\t"+textField_8.getText()+"\n"
						+"Biology :\t\t"+textField_9.getText()+"\n"
						+"Computer :\t\t"+textField_10.getText()+"\n"
						+"Chemistry :\t\t"+textField_11.getText()+"\n"
						+"Physics :\t\t"+textField_12.getText()+"\n"
						+"Tamil :\t\t"+textField_13.getText()+"\n"
						+"Malayalam :\t\t"+textField_14.getText()+"\n"
						+"=====================================================\n"
						+"Total Score :\t\t"+textField_4.getText()+"\n"
						+"Average :\t\t"+textField_5.getText()+"\n"
						+"Ranking :\t\t"+textField_6.getText()+"\n"
						
						
			);
				      
			}
		});
		btnShowReport.setForeground(new Color(0, 0, 255));
		btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(btnShowReport);
		
		panel_4 = new JPanel();
		panel_4.setForeground(new Color(147, 112, 219));
		panel_4.setBackground(Color.BLUE);
		panel_4.setBounds(74, 412, 117, 25);
		frame.getContentPane().add(panel_4);
		
		btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
						double t1 = Double.parseDouble(textField_7.getText());
		                double t2 = Double.parseDouble(textField_8.getText());
		                double t3 = Double.parseDouble(textField_9.getText());
		                double t4 = Double.parseDouble(textField_10.getText());
		                double t5 = Double.parseDouble(textField_11.getText());
		                double t6 = Double.parseDouble(textField_12.getText());
		                double t7 = Double.parseDouble(textField_13.getText());
		                double t8 = Double.parseDouble(textField_14.getText());
		             double   total = t1+t2+t3+t4+t5+t6+t7+t8;
		                String c = String.format("%.2f", total);
		                textField_4.setText(c);
		             double   avg = total/8;
		                String a = String.format("%.2f", avg);
		                textField_5.setText(a);
		                if(total>700)
		                {
		                    textField_6.setText("1");
		                }
		                else if(total>600 && total<700)
		                {
		                    textField_6.setText("2");
		                }
		                else if(total>500 && total<600)
		                {
		                    textField_6.setText("3");
		                }
		                else if(total>300 && total<500)
		                {
		                    textField_6.setText("4");
		                }
		                else if(total>100 && total<300)
		                {
		                    textField_6.setText("5");
		                }
		                else
		                {
		                    textField_6.setText("Fail");
		                }
		                DefaultTableModel model=(DefaultTableModel)table.getModel();
		               model.addRow(new String[] {
		                       textField.getText(),
		                       (String) comboBox.getSelectedItem(),
		                       textField_7.getText(),
								textField_8.getText(),
								textField_9.getText(),
								textField_10.getText(),
								textField_11.getText(),
								textField_12.getText(),
								textField_13.getText(),
								textField_14.getText(),
								textField_4.getText(),
								textField_5.getText(),
								textField_6.getText(),

						
						
					
				});
			}
			
		});
		btnAddReport.setForeground(new Color(0, 128, 0));
		btnAddReport.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnAddReport);
		
		panel_5 = new JPanel();
		panel_5.setForeground(new Color(147, 112, 219));
		panel_5.setBackground(Color.BLUE);
		panel_5.setBounds(187, 412, 117, 25);
		frame.getContentPane().add(panel_5);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
	               try
	               {
	                   int rownum = table.getSelectedRow();
	                   model.removeRow(rownum);
	               }
	               catch(Exception msg)
	               {
	                   JOptionPane.showMessageDialog(null,"Please choose the particular row");
	               }
			}
		});
		btnDelete.setForeground(new Color(255, 0, 0));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(btnDelete);
		
		panel_7 = new JPanel();
		panel_7.setForeground(new Color(147, 112, 219));
		panel_7.setBackground(Color.BLUE);
		panel_7.setBounds(432, 412, 117, 25);
		frame.getContentPane().add(panel_7);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
                int confirmed=JOptionPane.showConfirmDialog(null,"Do you want to Exit","EXIT",JOptionPane.YES_NO_OPTION);
                //if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION==JOptionPane.YES_NO_OPTION))
                if(confirmed==JOptionPane.YES_OPTION)
                {    System.exit(0);
            }}
				
			
		});
		btnExit.setForeground(new Color(255, 20, 147));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(btnExit);
		
		panel_8 = new JPanel();
		panel_8.setForeground(new Color(147, 112, 219));
		panel_8.setBackground(Color.BLUE);
		panel_8.setBounds(550, 412, 117, 25);
		frame.getContentPane().add(panel_8);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);
				
			}
		});
		btnReset.setForeground(new Color(199, 21, 133));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(btnReset);
	}
	private JTable table;
}