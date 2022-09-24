import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Calculator {

	private JFrame frmCalculato;
	private JTextField textfield;
	private JButton btnPercentage;
	private JButton btnClear;
	private JButton btnBackspace;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btn8;
	private JButton btn9;
	private JButton btn5;
	private JButton btn6;
	private JButton btn2;
	private JButton btn3;
	private JButton btnDot;
	private JButton btnEqual;
	private JButton btnDiv;
	private JButton btnMulti;
	private JButton btnSub;
	private JButton btnPlus;

	
	double first;
	double second;
	double total;
	String operation;
	String ans;

	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculato.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Calculator() {
		initialize();
	}

	
	private void initialize() {
	
		frmCalculato = new JFrame();
		frmCalculato.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sIUzy\\eclipse-workspace\\GUI\\src\\icon\\icons8-math-20 (1).png"));
		frmCalculato.setBackground(SystemColor.activeCaptionText);
		frmCalculato.setTitle("Calculator");
		
		frmCalculato.getContentPane().setBackground(SystemColor.controlHighlight);
		frmCalculato.setBounds(100, 100, 398, 501);
		frmCalculato.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculato.getContentPane().setLayout(null);
		
		textfield = new JTextField();
		textfield.setHorizontalAlignment(SwingConstants.RIGHT);
		textfield.setBackground(SystemColor.control);
		textfield.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		textfield.setBounds(10, 11, 362, 108);
		frmCalculato.getContentPane().add(textfield);
		textfield.setColumns(10);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn00.getText();
				textfield.setText(number);
			}
		});
		btn00.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn00.setBackground(new Color(255, 255, 255));
		btn00.setBounds(10, 130, 89, 62);
		frmCalculato.getContentPane().add(btn00);
		
		btnPercentage = new JButton("");
		btnPercentage.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\GUI\\src\\icon\\icons8-percentage-20.png"));
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textfield.getText());
				textfield.setText("");
				operation="%";
			}
		});
		btnPercentage.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnPercentage.setBackground(Color.WHITE);
		btnPercentage.setBounds(103, 130, 89, 62);
		frmCalculato.getContentPane().add(btnPercentage);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnClear.setBackground(Color.WHITE);
		btnClear.setBounds(197, 130, 89, 62);
		frmCalculato.getContentPane().add(btnClear);
		
		
		btnBackspace = new JButton("");
		btnBackspace.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\GUI\\src\\icon\\icons8-backspace-20.png"));
		btnBackspace.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textfield.getText().length()>0) {
					StringBuilder str = new StringBuilder(textfield.getText());
					str.deleteCharAt(textfield.getText().length()-1);
					backSpace=str.toString();
					textfield.setText(backSpace);
				}
	
			}
		});

		btnBackspace.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnBackspace.setBackground(Color.WHITE);
		btnBackspace.setBounds(293, 130, 79, 62);
		frmCalculato.getContentPane().add(btnBackspace);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn7.getText();
				textfield.setText(number);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(10, 194, 89, 62);
		frmCalculato.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn4.getText();
				textfield.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(10, 261, 89, 62);
		frmCalculato.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn1.getText();
				textfield.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(10, 327, 89, 62);
		frmCalculato.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn0.getText();
				textfield.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(10, 395, 89, 56);
		frmCalculato.getContentPane().add(btn0);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn8.getText();
				textfield.setText(number);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(103, 194, 89, 62);
		frmCalculato.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn9.getText();
				textfield.setText(number);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(197, 194, 89, 62);
		frmCalculato.getContentPane().add(btn9);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn5.getText();
				textfield.setText(number);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(103, 261, 89, 62);
		frmCalculato.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn6.getText();
				textfield.setText(number);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(197, 261, 89, 62);
		frmCalculato.getContentPane().add(btn6);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn2.getText();
				textfield.setText(number);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(103, 327, 89, 62);
		frmCalculato.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btn3.getText();
				textfield.setText(number);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(197, 327, 89, 62);
		frmCalculato.getContentPane().add(btn3);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textfield.getText()+btnDot.getText();
				textfield.setText(number);
			}
		});
		btnDot.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDot.setBackground(Color.WHITE);
		btnDot.setBounds(103, 395, 89, 56);
		frmCalculato.getContentPane().add(btnDot);
		
		btnEqual = new JButton("");
		btnEqual.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\GUI\\src\\icon\\icons8-equal-sign-20.png"));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textfield.getText());
				if (operation == "+") {
					total = first + second;
					answer = String.format("%.2f", total);
					textfield.setText(answer);
					
				}
				
				else if (operation == "-") {
					total = first - second;
					answer = String.format("%.2f", total);
					textfield.setText(answer);
					
				}
				
				if (operation == "/") {
					total = first / second;
					answer = String.format("%.2f", total);
					textfield.setText(answer);
					
				}
				
				if (operation == "*") {
					total = first * second;
					answer = String.format("%.2f", total);
					textfield.setText(answer);
					
				}
				
				if (operation == "%") {
					total = first % second;
					answer = String.format("%.2f", total);
					textfield.setText(answer);
					
				}
			}
		});
		btnEqual.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnEqual.setBackground(Color.WHITE);
		btnEqual.setBounds(197, 395, 89, 56);
		frmCalculato.getContentPane().add(btnEqual);
		
		btnDiv = new JButton("");
		btnDiv.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\GUI\\src\\icon\\icons8-divide-20.png"));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textfield.getText());
				textfield.setText("");
				operation="/";
			}
		});
		btnDiv.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnDiv.setBackground(Color.WHITE);
		btnDiv.setBounds(293, 194, 79, 62);
		frmCalculato.getContentPane().add(btnDiv);
		
		btnMulti = new JButton("");
		btnMulti.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\GUI\\src\\icon\\icons8-multiply-20.png"));
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textfield.getText());
				textfield.setText("");
				operation="*";
			}
		});
		btnMulti.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnMulti.setBackground(Color.WHITE);
		btnMulti.setBounds(293, 261, 79, 62);
		frmCalculato.getContentPane().add(btnMulti);
		
		btnSub = new JButton("");
		btnSub.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\GUI\\src\\icon\\icons8-minus-20.png"));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textfield.getText());
				textfield.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnSub.setBackground(Color.WHITE);
		btnSub.setBounds(293, 327, 79, 62);
		frmCalculato.getContentPane().add(btnSub);
		
		btnPlus = new JButton("");
		btnPlus.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\GUI\\src\\icon\\icons8-plus-20.png"));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textfield.getText());
				textfield.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnPlus.setBackground(Color.WHITE);
		btnPlus.setBounds(293, 395, 79, 56);
		frmCalculato.getContentPane().add(btnPlus);
	}
}
