package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;

public class Hotel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	double INDIA=57.3;
	double USA=71.3;
	double UAE=68.05;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 891, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 50, 384, 206);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChickenBurger.setBounds(10, 26, 92, 14);
		panel.add(lblChickenBurger);
		
		textField = new JTextField();
		textField.setBounds(158, 23, 144, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChickenBurgerMeal.setBounds(10, 51, 137, 14);
		panel.add(lblChickenBurgerMeal);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(158, 48, 144, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Cheese Burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 76, 92, 14);
		panel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(158, 79, 144, 20);
		panel.add(textField_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 107, 292, 11);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDrink.setBounds(10, 125, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQty.setBounds(161, 125, 46, 14);
		panel.add(lblQty);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tea", "Cofee", "pepsi", "Appy"}));
		comboBox.setBounds(10, 149, 80, 20);
		panel.add(comboBox);
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		radioButton.setBounds(6, 176, 109, 23);
		panel.add(radioButton);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(158, 149, 144, 14);
		panel.add(textField_3);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setBounds(158, 176, 109, 23);
		panel.add(rdbtnTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 278, 384, 122);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setBounds(10, 11, 88, 14);
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeals = new JLabel("Cost of Meals");
		lblCostOfMeals.setBounds(10, 47, 77, 14);
		lblCostOfMeals.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblCostOfMeals);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setBounds(10, 85, 103, 14);
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblCostOfDelivery);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(110, 11, 139, 22);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 139, 22);
		panel_5.add(lblNewLabel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(110, 47, 139, 22);
		panel_1.add(panel_6);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 139, 22);
		panel_6.add(lblNewLabel_3);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(110, 85, 139, 22);
		panel_1.add(panel_7);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 139, 22);
		panel_7.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(397, 50, 215, 206);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblUrrencyConverter = new JLabel("Currency Converter");
		lblUrrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUrrencyConverter.setBounds(10, 11, 184, 26);
		panel_2.add(lblUrrencyConverter);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"INDIA", "USA", "UAE"}));
		comboBox_1.setBounds(10, 61, 167, 20);
		panel_2.add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 96, 167, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 159, 88, 26);
		panel_2.add(panel_8);
		panel_8.setLayout(null);
		
		JButton btnNewButton = new JButton("Covert");
		btnNewButton.addActionListener(new ActionListener() {
			private JLabel lblNewLabel_12;

			public void actionPerformed(ActionEvent e) {
						
				double db=Double.parseDouble(textField_4.getText());
				if(comboBox_1.getSelectedItem().equals("INDIA"))
				{
				String c=String.format("Rs. %.2f", db*INDIA);
				textField_4.setText(c);
				}
				if(comboBox_1.getSelectedItem().equals("USA"))
				{
				String c=String.format("Doller. %.2f", db*USA);
				textField_4.setText(c);
				}
				if(comboBox_1.getSelectedItem().equals("UAE"))
				{
				String c=String.format("Pound. %.2f", db*UAE);
				textField_4.setText(c);
				}
			}
		});
		btnNewButton.setBounds(0, 0, 88, 26);
		panel_8.add(btnNewButton);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(108, 159, 86, 26);
		panel_2.add(panel_9);
		panel_9.setLayout(null);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(0, 0, 86, 26);
		panel_9.add(btnClose);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(397, 278, 226, 122);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTax.setBounds(10, 11, 46, 14);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(10, 47, 59, 14);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(10, 82, 46, 14);
		panel_3.add(lblTotal);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(83, 11, 133, 17);
		panel_3.add(panel_10);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(0, 0, 133, 17);
		panel_10.add(lblNewLabel_5);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_12.setBounds(83, 82, 133, 17);
		panel_3.add(panel_12);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(0, 0, 133, 14);
		panel_12.add(lblNewLabel_7);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBounds(83, 47, 133, 17);
		panel_3.add(panel_11);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(0, 0, 133, 17);
		panel_11.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(152, 5, 397, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(627, 50, 238, 351);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 22, 223, 329);
		panel_4.add(tabbedPane);
		
		JPanel panel_14 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_14, null);
		panel_14.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(-5, 0, 223, 301);
		panel_14.add(panel_13);
		panel_13.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_13.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 11, 207, 36);
		panel_13.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("B");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(10, 61, 43, 36);
		panel_13.add(btnNewButton_1);
		
		JButton button = new JButton("C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText(null);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(63, 61, 43, 36);
		panel_13.add(button);
		
		JButton btnMcc = new JButton("MCC");
		btnMcc.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMcc.setBounds(116, 61, 43, 36);
		panel_13.add(btnMcc);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_5.getText());
				textField_5.setText("");
				op="+";		
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBounds(169, 61, 43, 36);
		panel_13.add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_3.getText();
				textField_5.setText(Number);

			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBounds(10, 108, 43, 36);
		panel_13.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_4.getText();
				textField_5.setText(Number);

			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setBounds(10, 155, 43, 36);
		panel_13.add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_5.getText()+button_5.getText();
				textField_5.setText(Number);
				
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_5.setBounds(10, 202, 43, 36);
		panel_13.add(button_5);
		
		JButton button_6 = new JButton("0");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_6.getText();
				textField_5.setText(Number);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_6.setBounds(10, 249, 43, 36);
		panel_13.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_7.getText();
				textField_5.setText(Number);

			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_7.setBounds(63, 108, 43, 36);
		panel_13.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_8.getText();
				textField_5.setText(Number);

			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_8.setBounds(63, 155, 43, 36);
		panel_13.add(button_8);
		
		JButton button_9 = new JButton("2");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_9.getText();
				textField_5.setText(Number);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_9.setBounds(63, 202, 43, 36);
		panel_13.add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_10.getText();
				textField_5.setText(Number);

			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_10.setBounds(63, 249, 43, 36);
		panel_13.add(button_10);
		
		JButton button_11 = new JButton("9");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_11.getText();
				textField_5.setText(Number);

			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_11.setBounds(116, 108, 43, 36);
		panel_13.add(button_11);
		
		JButton button_12 = new JButton("6");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_12.getText();
				textField_5.setText(Number);

			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_12.setBounds(116, 155, 43, 36);
		panel_13.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_13.getText();
				textField_5.setText(Number);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_13.setBounds(116, 202, 43, 36);
		panel_13.add(button_13);
		
		JButton button_14 = new JButton("00");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_14.setBounds(116, 249, 43, 36);
		panel_13.add(button_14);
		
		JButton button_15 = new JButton("-");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_5.getText());
				textField_5.setText("");
				op="/";
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_15.setBounds(169, 108, 43, 36);
		panel_13.add(button_15);
		
		JButton button_16 = new JButton("*");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_5.getText());
				textField_5.setText("");
				op="*";
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_16.setBounds(169, 155, 43, 36);
		panel_13.add(button_16);
		
		JButton button_17 = new JButton("/");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_5.getText());
				textField_5.setText("");
				op="/";		
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_17.setBounds(169, 202, 43, 36);
		panel_13.add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField_5.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField_5.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f",result);
					textField_5.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f",result);
					textField_5.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f",result);
					textField_5.setText(ans);
				}	
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField_5.setText(ans);
				}	

			}
			
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_18.setForeground(new Color(0, 0, 0));
		button_18.setBounds(169, 249, 43, 36);
		panel_13.add(button_18);
		
		JPanel panel_15 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_15, null);
		panel_15.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Resturant Management System :");
		lblNewLabel_8.setBounds(10, 11, 188, 29);
		panel_15.add(lblNewLabel_8);
		
		JLabel lblChickenBurger_1 = new JLabel("Chicken Burger");
		lblChickenBurger_1.setBounds(10, 70, 72, 14);
		panel_15.add(lblChickenBurger_1);
		
		JLabel lblChickenBurgerMeals = new JLabel("Chicken Burger Meals");
		lblChickenBurgerMeals.setBounds(10, 108, 120, 14);
		panel_15.add(lblChickenBurgerMeals);
		
		JLabel lblBaconAndCheese = new JLabel("Bacon and Cheese Burger");
		lblBaconAndCheese.setBounds(10, 154, 136, 14);
		panel_15.add(lblBaconAndCheese);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(152, 70, 46, 14);
		panel_15.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(152, 108, 46, 14);
		panel_15.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(152, 154, 46, 14);
		panel_15.add(lblNewLabel_11);
		
		JLabel lblThanksForUsing = new JLabel("Thanks for using jobs Estimates");
		lblThanksForUsing.setBounds(10, 208, 172, 14);
		panel_15.add(lblThanksForUsing);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(32, 403, 797, 43);
		frame.getContentPane().add(panel_16);
		panel_16.setLayout(null);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(109, 11, 114, 21);
		panel_16.add(panel_17);
		panel_17.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnTotal.setBounds(0, 0, 114, 21);
		panel_17.add(btnTotal);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBounds(248, 11, 114, 21);
		panel_16.add(panel_18);
		
		JButton btnReciept = new JButton("Reciept");
		btnReciept.setBounds(0, 0, 114, 21);
		panel_18.add(btnReciept);
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBounds(391, 11, 114, 21);
		panel_16.add(panel_19);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(0, 0, 114, 21);
		panel_19.add(btnReset);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBounds(529, 11, 114, 21);
		panel_16.add(panel_20);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(0, 0, 114, 21);
		panel_20.add(btnCancel);
	}
}
