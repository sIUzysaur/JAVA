package main;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField UserText;
	private JPasswordField UserPass;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JLabel lblNewLabel_1;
	int attempts = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sIUzy\\eclipse-workspace\\Account\\src\\Icon\\icons8-login-35.png"));
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UserText = new JTextField();
		UserText.setBounds(154, 94, 130, 20);
		contentPane.add(UserText);
		UserText.setColumns(10);
		
		UserPass = new JPasswordField();
		UserPass.setBounds(154, 125, 130, 20);
		contentPane.add(UserPass);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = UserText.getText();
				String password = UserPass.getText();
				
				if(attempts < 3 && username.equals("siuzysaur") & password.equals("siuzy")) {
					
					calculator calcu = new calculator();
					calcu.setVisible(true);
					
					JOptionPane.showMessageDialog(null, "LOG-IN SUCCESSFUL ");
				}
				else if(username.equals("") & password.equals("")) {
					JOptionPane.showMessageDialog(null, "INPUT USERNAME AND PASSWORD!!!! ");
						
				}
				else if (attempts !=3) {
					login login = new login();
					JOptionPane.showMessageDialog(login, "LOG-IN FAILED, ATTEMPTS: " + attempts);
				}
					
				else if(attempts == 3){
					JOptionPane.showMessageDialog(null, "LOG-IN FAILED, ATTEMPTS EXCEEDED TO : " + attempts);
					UserText.setEditable(false);
					UserPass.setEnabled(false);
				}
				
				else if(username.equals("") & password.equals("")) {
					JOptionPane.showMessageDialog(null, "INPUT USERNAME AND PASSWORD!!!! ");
						
				}
				
				attempts++;
				
			}
		});
		btnNewButton.setBounds(154, 156, 89, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("Username: ");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		lblNewLabel.setBounds(67, 97, 134, 17);
		contentPane.add(lblNewLabel);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		lblPassword.setBounds(67, 125, 134, 17);
		contentPane.add(lblPassword);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\sIUzy\\eclipse-workspace\\Account\\src\\Icon\\icons8-login-64.png"));
		lblNewLabel_1.setBounds(154, 11, 89, 72);
		contentPane.add(lblNewLabel_1);
	}

}
