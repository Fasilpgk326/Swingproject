package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private final JTextField textField = new JTextField();
	double num1;
	double num2;
	double result;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 277, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		textField.setBounds(10, 21, 243, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		btnNewButton.setBounds(76, 127, 53, 37);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnAc = new JButton("+");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnAc.setBounds(10, 127, 53, 37);
		frame.getContentPane().add(btnAc);	
		
		JButton button_1 = new JButton("/");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_1.setBounds(137, 127, 53, 37);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
				
			}
		});
		button_2.setBounds(10, 175, 53, 37);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setBounds(76, 175, 53, 37);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		button_4.setBounds(137, 175, 53, 37);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setBounds(10, 223, 53, 37);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setBounds(76, 223, 53, 37);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBounds(137, 223, 53, 37);
		frame.getContentPane().add(button_7);
		
		JButton btnNewButton_1 = new JButton("%");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		btnNewButton_1.setBounds(200, 127, 53, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("=");
		btnNewButton_2.addActionListener(new ActionListener() {
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

			}
		});
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(200, 222, 53, 86);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(10, 271, 53, 37);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("00");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBounds(76, 271, 53, 37);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_12.setBounds(137, 271, 53, 37);
		frame.getContentPane().add(button_12);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.YELLOW);
		btnC.setForeground(Color.BLACK);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(10, 77, 53, 37);
		frame.getContentPane().add(btnC);
		
		JButton btnM = new JButton("M+");
		btnM.setBounds(76, 77, 53, 37);
		frame.getContentPane().add(btnM);
		
		JButton btnM_1 = new JButton("M-");
		btnM_1.setBounds(137, 77, 53, 37);
		frame.getContentPane().add(btnM_1);
		
		JButton btnDel = new JButton("DEL");
		btnDel.setBackground(Color.RED);
		btnDel.setBounds(200, 77, 53, 37);
		frame.getContentPane().add(btnDel);
		
		JButton button = new JButton("*");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button.setBounds(200, 175, 53, 37);
		frame.getContentPane().add(button);
		
		
	}

}
