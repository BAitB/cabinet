package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import java.awt.Font;
import javax.swing.DropMode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class Authentification extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	int ilog=0;
	int ipass=0;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification frame = new Authentification();
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
	public Authentification() {
		setTitle("Authentification");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150,150, 485, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	    setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 245, 238));
		panel.setBounds(0, 0, 482, 553);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Imad Boutahar\\Downloads\\stethoscope.png"));
		lblNewLabel.setBounds(192, 26, 98, 87);
		panel.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.ITALIC, 17));
		txtUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (ilog==0) {
				txtUsername.setText("");
				ilog=1;}
				
			}
		});
		txtUsername.setText("Username");
		txtUsername.setDropMode(DropMode.INSERT);
		txtUsername.setToolTipText("");
		txtUsername.setBounds(128, 233, 268, 44);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ipass==0) {
					passwordField.setText("");
					ipass=1;}
			}
		});
		passwordField.setToolTipText("");
		passwordField.setText("Pjdfkjfdqkjfd");
		passwordField.setBounds(128, 334, 268, 44);
		panel.add(passwordField);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Imad Boutahar\\Downloads\\closed-lock (1).png"));
		label_1.setBounds(83, 334, 56, 44);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Imad Boutahar\\Downloads\\user.png"));
		label_2.setBounds(83, 233, 56, 44);
		panel.add(label_2);
		
		JButton btnNewButton = new JButton("     LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Imad Boutahar\\Downloads\\open-padlock.png"));
		btnNewButton.setBackground(new Color(240, 255, 255));
		btnNewButton.setBounds(245, 405, 151, 44);
		panel.add(btnNewButton);
		
		JLabel lblAuthentification = new JLabel("Authentification");
		lblAuthentification.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblAuthentification.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthentification.setBounds(128, 96, 226, 61);
		panel.add(lblAuthentification);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(253, 245, 230));
		label.setIcon(new ImageIcon("C:\\Users\\Imad Boutahar\\Desktop\\backgroud ki ma tle3.png"));
		label.setBounds(0, 0, 482, 553);
		panel.add(label);
	}
}
