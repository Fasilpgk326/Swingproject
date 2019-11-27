package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Calculatorr {
	
	double num1;
	double num2;
	double result;
	String op;
	String ans;

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatorr window = new Calculatorr();
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
	public Calculatorr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 546, 307);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 24, 515, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 76, 261, 186);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="sqrt";
			}
		});
		btnSqrt.setBounds(10, 11, 60, 35);
		panel_1.add(btnSqrt);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="1/x";
			}
		});
		btnx.setBounds(95, 11, 60, 35);
		panel_1.add(btnx);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="sin";
			}
		});
		btnSin.setBounds(178, 11, 60, 35);
		panel_1.add(btnSin);
		
		JButton button_13 = new JButton("%");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="%";
			}
		});
		button_13.setBounds(10, 54, 60, 35);
		panel_1.add(button_13);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="Exp";
			}
		});
		btnExp.setBounds(95, 57, 60, 35);
		panel_1.add(btnExp);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="cos";
			}
		});
		btnCos.setBounds(178, 54, 60, 35);
		panel_1.add(btnCos);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="x^y";
			}
		});
		btnXy.setBounds(10, 100, 60, 35);
		panel_1.add(btnXy);
		
		JButton btnIn = new JButton("In");
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="In";
			}
		});
		btnIn.setBounds(95, 100, 60, 35);
		panel_1.add(btnIn);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="tan";
			}
		});
		btnTan.setBounds(178, 100, 60, 35);
		panel_1.add(btnTan);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="x^2";
			}
		});
		btnX.setBounds(10, 146, 60, 35);
		panel_1.add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="n!";
			}
		});
		btnN.setBounds(95, 146, 60, 35);
		panel_1.add(btnN);
		
		JButton btnSec = new JButton("Sec");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="Sec";
			}
		});
		btnSec.setBounds(178, 146, 60, 35);
		panel_1.add(btnSec);
		
		JLabel lblScientific = new JLabel("Scientific");
		lblScientific.setBounds(10, 65, 61, 14);
		frame.getContentPane().add(lblScientific);
		
		JPanel panel = new JPanel();
		panel.setBounds(281, 76, 241, 186);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton.getText();
				textField.setText(Number);
			}
		});
		btnNewButton.setBounds(10, 11, 44, 36);
		panel.add(btnNewButton);
		
		JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setBounds(64, 11, 44, 36);
		panel.add(button);
		
		JButton button_1 = new JButton("9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBounds(122, 11, 44, 36);
		panel.add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				 op="/";
			}
		});
		button_2.setBounds(176, 11, 44, 36);
		panel.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setBounds(10, 51, 44, 36);
		panel.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(64, 51, 44, 36);
		panel.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setBounds(122, 51, 44, 36);
		panel.add(button_5);
		
		JButton button_6 = new JButton("*");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_6.setBounds(176, 51, 44, 36);
		panel.add(button_6);
		
		JButton button_7 = new JButton("1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBounds(10, 98, 44, 36);
		panel.add(button_7);
		
		JButton button_8 = new JButton("2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setBounds(64, 98, 44, 36);
		panel.add(button_8);
		
		JButton button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(122, 98, 44, 36);
		panel.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_10.setBounds(176, 98, 44, 36);
		panel.add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBounds(10, 139, 44, 36);
		panel.add(button_11);
		
		JButton button_12 = new JButton(".");
		button_12.setBounds(64, 139, 44, 36);
		panel.add(button_12);
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String ans;
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
					if (op=="SIN") {
						if (textField.getText().equals("")) {
							textField.setText("");
						} else {
						double	a = Math.sin(Double.parseDouble(textField.getText()));
							textField.setText("");
							textField.setText(textField.getText() + a);
						}
					}
					if (op=="COS") {
						if (textField.getText().equals("")) {
							textField.setText("");
						} else {
						double	a = Math.cos(Double.parseDouble(textField.getText()));
							textField.setText("");
							textField.setText(textField.getText() + a);
						}
					}
					if (op=="TAN") {
						if (textField.getText().equals("")) {
							textField.setText("");
						} else {
						double	a = Math.tan(Double.parseDouble(textField.getText()));
							textField.setText("");
							textField.setText(textField.getText() + a);
						}
					}
					if (op=="n!"){
						if (textField.getText().equals("")) {
							textField.setText("");
						} else {
						double	a = fact(Double.parseDouble(textField.getText()));
							textField.setText("");
							textField.setText(textField.getText() + a);
						}
					}
					textField.requestFocus();
				}

				double fact(double x) {
					int er = 0;
					if (x < 0) {
						er = 20;
						return 0;
					}
					double i, s = 1;
					for (i = 2; i <= x; i += 1.0)
						s *= i;
					return s;
				

				
				
				
			
		}});
		button_14.setBounds(122, 139, 44, 36);
		panel.add(button_14);
		
		JButton button_15 = new JButton("+");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_15.setBounds(176, 139, 44, 36);
		panel.add(button_15);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setBounds(281, 65, 46, 14);
		frame.getContentPane().add(lblStandard);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(10, -1, 36, 23);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(48, -1, 36, 23);
		frame.getContentPane().add(lblView);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(94, -1, 36, 23);
		frame.getContentPane().add(lblHelp);
	}

}
