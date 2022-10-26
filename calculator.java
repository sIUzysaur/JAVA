package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtLoginSuccessful;
	
	double first;
	double second;
	double total;
	String operation;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(122, 107, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtLoginSuccessful = new JTextField();
		txtLoginSuccessful.setHorizontalAlignment(SwingConstants.CENTER);
		txtLoginSuccessful.setBounds(10, 11, 282, 85);
		contentPane.add(txtLoginSuccessful);
		txtLoginSuccessful.setColumns(10);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtLoginSuccessful.getText() + btn00.getText();
				txtLoginSuccessful.setText(number);
			}
		});
		btn00.setBackground(new Color(255, 255, 255));
		btn00.setBounds(10, 98, 64, 54);
		contentPane.add(btn00);
		
		JButton btnPercentage = new JButton("");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtLoginSuccessful.getText());
				txtLoginSuccessful.setText("");
				operation = "%";
			}
		});
		btnPercentage.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\Account\\src\\Icon\\icons8-percentage-20.png"));
		btnPercentage.setBackground(Color.WHITE);
		btnPercentage.setBounds(80, 98, 64, 54);
		contentPane.add(btnPercentage);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLoginSuccessful.setText(null);
			}
		});
		btnClear.setBackground(Color.WHITE);
		btnClear.setBounds(154, 98, 64, 54);
		contentPane.add(btnClear);
		
		JButton btnBackspace = new JButton("");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(txtLoginSuccessful.getText().length() > 0) {
					
					StringBuilder space = new StringBuilder(txtLoginSuccessful.getText());
					space.deleteCharAt(txtLoginSuccessful.getText().length()-1);
					backspace = space.toString();
					txtLoginSuccessful.setText(backspace);
					
				}
			}
		});
		btnBackspace.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\Account\\src\\Icon\\icons8-backspace-20.png"));
		btnBackspace.setBackground(Color.WHITE);
		btnBackspace.setBounds(228, 98, 64, 54);
		contentPane.add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtLoginSuccessful.getText() + btn7.getText();
				txtLoginSuccessful.setText(number);
			}
		});
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(10, 163, 64, 54);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtLoginSuccessful.getText() + btn4.getText();
				txtLoginSuccessful.setText(number);
			}
		});
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(10, 228, 64, 54);
		contentPane.add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtLoginSuccessful.getText() + btn3.getText();
				txtLoginSuccessful.setText(number);
			}
		});
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(10, 293, 64, 54);
		contentPane.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtLoginSuccessful.getText() + btn0.getText();
				txtLoginSuccessful.setText(number);
			}
		});
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(10, 358, 64, 54);
		contentPane.add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtLoginSuccessful.getText() + btn8.getText();
				txtLoginSuccessful.setText(number);
			}
		});
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(80, 163, 64, 54);
		contentPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtLoginSuccessful.getText() + btn5.getText();
				txtLoginSuccessful.setText(number);
			}
		});
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(80, 228, 64, 54);
		contentPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtLoginSuccessful.getText() + btn2.getText();
				txtLoginSuccessful.setText(number);
			}
		});
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(80, 293, 64, 54);
		contentPane.add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.WHITE);
		btnDot.setBounds(80, 358, 64, 54);
		contentPane.add(btnDot);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtLoginSuccessful.getText() + btn9.getText();
				txtLoginSuccessful.setText(number);
			}
		});
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(154, 163, 64, 54);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtLoginSuccessful.getText() + btn6.getText();
				txtLoginSuccessful.setText(number);
			}
		});
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(154, 228, 64, 54);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtLoginSuccessful.getText() + btn1.getText();
				txtLoginSuccessful.setText(number);
				
			}
		});
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(154, 293, 64, 54);
		contentPane.add(btn1);
		
		JButton btnEqual = new JButton("");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				second = Double.parseDouble(txtLoginSuccessful.getText());
				if (operation == "+") {
					total = first + second;
					answer = String.format("%, 2f ", total);
					txtLoginSuccessful.setText(answer);
				}
				else if (operation == "-") {
					total = first - second;
					answer = String.format("%, 2f ", total);
					txtLoginSuccessful.setText(answer);
				}
				
				else if (operation == "/") {
					total = first / second;
					answer = String.format("%, 2f ", total);
					txtLoginSuccessful.setText(answer);
				}
				
				else if (operation == "*") {
					total = first * second;
					answer = String.format("%, 2f ", total);
					txtLoginSuccessful.setText(answer);
				}
				
				else if (operation == "%") {
					total = first % second;
					answer = String.format("%, 2f ", total);
					txtLoginSuccessful.setText(answer);
				}
			}
		});
		btnEqual.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\Account\\src\\Icon\\icons8-equal-sign-20.png"));
		btnEqual.setBackground(Color.WHITE);
		btnEqual.setBounds(154, 358, 64, 54);
		contentPane.add(btnEqual);
		
		JButton btnDiv = new JButton("");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtLoginSuccessful.getText());
				txtLoginSuccessful.setText("");
				operation = "/";
			}
		});
		btnDiv.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\Account\\src\\Icon\\icons8-divide-20.png"));
		btnDiv.setBackground(Color.WHITE);
		btnDiv.setBounds(228, 163, 64, 54);
		contentPane.add(btnDiv);
		
		JButton btnMulti = new JButton("");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtLoginSuccessful.getText());
				txtLoginSuccessful.setText("");
				operation = "*";
			}
		});
		btnMulti.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\Account\\src\\Icon\\icons8-multiply-20.png"));
		btnMulti.setBackground(Color.WHITE);
		btnMulti.setBounds(228, 228, 64, 54);
		contentPane.add(btnMulti);
		
		JButton btnSub = new JButton("");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtLoginSuccessful.getText());
				txtLoginSuccessful.setText("");
				operation = "-";
			}
		});
		btnSub.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\Account\\src\\Icon\\icons8-minus-20.png"));
		btnSub.setBackground(Color.WHITE);
		btnSub.setBounds(228, 293, 64, 54);
		contentPane.add(btnSub);
		
		JButton btnPlus = new JButton("");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtLoginSuccessful.getText());
				txtLoginSuccessful.setText("");
				operation = "+";
			}
		});
		btnPlus.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\Account\\src\\Icon\\icons8-plus-20.png"));
		btnPlus.setBackground(Color.WHITE);
		btnPlus.setBounds(228, 358, 64, 54);
		contentPane.add(btnPlus);
	}

}
