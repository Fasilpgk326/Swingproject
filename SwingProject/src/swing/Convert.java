package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class Convert {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;


	double num1;
	double num2;
	double result;
	String op;
	String ans;
	double USD=70.955;
	double EUR=78.886;
	double INR=100.68;
	double POU=91.3899;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Convert window = new Convert();
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
	public Convert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 732, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 34, 507, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 90, 45, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_3 = new JButton("0");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_3.setBounds(10, 347, 95, 52);
		frame.getContentPane().add(button_3);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}                                                                                                                                                                                                                                                           
		});
		btnC.setBounds(110, 90, 45, 52);
		frame.getContentPane().add(btnC);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(110, 153, 45, 52);
		frame.getContentPane().add(button_9);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setBounds(10, 153, 45, 52);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBounds(10, 218, 45, 52);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(10, 281, 45, 52);
		frame.getContentPane().add(button_2);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBounds(60, 90, 45, 52);
		frame.getContentPane().add(btnCe);
		
		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setBounds(60, 153, 45, 52);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setBounds(60, 281, 45, 52);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBounds(60, 218, 45, 52);
		frame.getContentPane().add(button_7);
		
		JButton button_10 = new JButton("6");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(110, 218, 45, 52);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBounds(110, 281, 45, 52);
		frame.getContentPane().add(button_11);
		
		JButton btnSqrt = new JButton("+-");
		btnSqrt.setBounds(164, 90, 45, 52);
		frame.getContentPane().add(btnSqrt);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_14.setBounds(164, 153, 45, 52);
		frame.getContentPane().add(button_14);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_13.setBounds(164, 218, 45, 52);
		frame.getContentPane().add(button_13);
		
		JButton button_15 = new JButton("-");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-	";
			}
		});
		button_15.setBounds(164, 281, 45, 52);
		frame.getContentPane().add(button_15);
		
		JButton button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		button_12.setBounds(110, 347, 45, 52);
		frame.getContentPane().add(button_12);
		
		JButton button_16 = new JButton("+");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
				
			}
		});
		button_16.setBounds(164, 347, 45, 52);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("=");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	String ans;
			num2=Double.parseDouble(textField.getText());
			if(op=="+")
			{
				result=num1+num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
			if(op=="-")
			{
				result=num1-num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
			if(op=="/")
			{
				result=num1/num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
			if(op=="*")
			{
				result=num1*num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}	
			if(op=="%")
			{
				result=num1%num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}	
             if(op=="x^y")
             {
            	 result=Math.pow(num1, num2);
            	 ans=String.format("%.2f",result);
            	 textField.setText(ans);
             }
				
			}
		});
		button_17.setBounds(219, 281, 55, 118);
		frame.getContentPane().add(button_17);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=1/num1;
				String a=String.format("%.2f",result);
				textField.setText(a);
			}
		});
		btnx.setBounds(219, 216, 55, 52);
		frame.getContentPane().add(btnx);
		
		JButton button_18 = new JButton("%");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_18.setBounds(219, 153, 55, 52);
		frame.getContentPane().add(button_18);
		
		JButton btnQrt = new JButton("qrt");
		btnQrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				result=Math.sqrt(num2);
				
				ans=String.format("%.2f",result);
				textField.setText(ans);
				
				
				
			}
		});
		btnQrt.setBounds(219, 90, 55, 52);
		frame.getContentPane().add(btnQrt);
		
		JButton btnL = new JButton("L..");
		btnL.setBounds(277, 90, 55, 52);
		frame.getContentPane().add(btnL);
		
		JButton btnPi = new JButton("Pi");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=3.14;
				String s=String.format("%.2f",a);
				textField.setText(s);
			}
		});
		btnPi.setBounds(277, 153, 55, 52);
		frame.getContentPane().add(btnPi);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y"
				;
			}
		});
		btnXy.setBounds(277, 216, 55, 52);
		frame.getContentPane().add(btnXy);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				double a=Math.pow(num1,2);
				String d=String.format("%.2f",a);
				textField.setText(d);

			}
		});
		btnX.setBounds(277, 281, 55, 52);
		frame.getContentPane().add(btnX);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				double a=Math.pow(num1,3);
				String c=String.format("%.2f",a);
				textField.setText(c);
				
			}
		});
		btnX_1.setBounds(277, 347, 55, 52);
		frame.getContentPane().add(btnX_1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  num1=Double.parseDouble(textField.getText());
	                num1=Math.sin(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnSin.setBounds(339, 90, 55, 52);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  num1=Double.parseDouble(textField.getText());
	                num1=Math.cos(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnCos.setBounds(338, 153, 55, 52);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  num1=Double.parseDouble(textField.getText());
	                num1=Math.tan(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnTan.setBounds(339, 216, 55, 52);
		frame.getContentPane().add(btnTan);
		
		JButton btnCtr = new JButton("Run");
		btnCtr.setBounds(338, 281, 55, 52);
		frame.getContentPane().add(btnCtr);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			
			}
		});
		btnBin.setBounds(338, 347, 55, 52);
		frame.getContentPane().add(btnBin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  num1=Double.parseDouble(textField.getText());
	                num1=Math.sinh(num1);
	                
	             textField.setText(String.valueOf(num1));
	                
	                
			}
		});
		btnSinh.setBounds(398, 90, 73, 52);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.cosh(num1);
	            textField.setText(String.valueOf(num1));

				
			}
		});
		btnCosh.setBounds(398, 153, 73, 52);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.tanh(num1);
	                
	             textField.setText(String.valueOf(num1));

			}
		});
		btnTanh.setBounds(398, 218, 73, 52);
		frame.getContentPane().add(btnTanh);
		
		JButton btnRund = new JButton("Rond");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				double i=Math.round(num1);
				String s=String.format("%.2f",i);
				textField.setText(s);
			}
		});
		btnRund.setBounds(398, 281, 73, 52);
		frame.getContentPane().add(btnRund);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
				
			}
		});
		btnHex.setBounds(398, 347, 73, 52);
		frame.getContentPane().add(btnHex);
		
		JButton btnMod = new JButton("M");
		btnMod.setBounds(481, 90, 44, 52);
		frame.getContentPane().add(btnMod);
		
		JButton btnX_2 = new JButton("X");
		btnX_2.setBounds(481, 153, 44, 52);
		frame.getContentPane().add(btnX_2);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.setBounds(481, 218, 44, 52);
		frame.getContentPane().add(btnC_1);
		
		JButton btnp = new JButton("2P");
		btnp.setBounds(481, 281, 44, 52);
		frame.getContentPane().add(btnp);
		
		JButton btnOc = new JButton("oc");
		btnOc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOc.setBounds(481, 347, 44, 52);
		frame.getContentPane().add(btnOc);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(535, 45, 182, 365);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyCoverter = new JLabel("Currency Coverter");
		lblCurrencyCoverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblCurrencyCoverter.setBounds(10, 11, 162, 43);
		panel.add(lblCurrencyCoverter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR", "POU"}));
		comboBox.setBounds(10, 77, 152, 37);
		panel.add(comboBox);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.BLACK);
		label.setBounds(39, 199, 92, 23);
		panel.add(label);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 155, 152, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Convert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_2.getText());
				if(comboBox.getSelectedItem().equals("USD"))
				{
					String c=String.format("RS %.2f",bp*USD);
					label.setText(c);
				}	
				if(comboBox.getSelectedItem().equals("EUR"))
				{
					String c=String.format("RS %.2f",bp*EUR);
					label.setText(c);
				}	
				if(comboBox.getSelectedItem().equals("POU"))
				{
					String c=String.format("RS %.2f",bp*POU);
					label.setText(c);
				}	
				
			}
		});
		btnNewButton_1.setBounds(10, 248, 72, 20);
		panel.add(btnNewButton_1);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(90, 248, 82, 23);
		panel.add(btnClear);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(56, 199, 46, 14);
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 717, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Standard");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 287, 448);
				textField.setBounds(10,40,250,35);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);

			}
		});
		mnFile.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Scientific");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 543, 448);
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmUnitConvertion = new JMenuItem("Unit Convertion");
		mntmUnitConvertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 732, 448);
			}
		});
		mnFile.add(mntmUnitConvertion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame=new Jframe("Exit");
				frame=new JFrame("Exit");
                int confirmed=JOptionPane.showConfirmDialog(null,"Do you want to Exit","EXIT",JOptionPane.YES_NO_OPTION);
                //if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION==JOptionPane.YES_NO_OPTION))
                if(confirmed==JOptionPane.YES_OPTION)
                {    System.exit(0);
                }
                }
		});
		mnFile.add(mntmExit);
	}
}
