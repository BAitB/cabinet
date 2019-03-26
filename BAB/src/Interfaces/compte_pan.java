package Interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

import com.mysql.jdbc.Statement;

import DataBase.JDBC;
import actors.Secretaire;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class compte_pan extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JTextField txtMotDePasse;
	private JTextField txtNouveauMotDe;
	private JTextField textField_4;
	boolean hello=true;
	int passClick1=0;
	int passClick2=0;

	/**
	 * Create the panel.
	 */
	
	public compte_pan() {
		setLayout(null);
		
		JLabel label_1 = new JLabel("Pr\u00E9nom");
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		label_1.setBounds(10, 62, 64, 14);
		add(label_1);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setText("test");
		textField.setFont(new Font("Rod", Font.PLAIN, 17));
		textField.setEditable(false);
		textField.setDropMode(DropMode.INSERT);
		textField.setColumns(10);
		textField.setBounds(84, 54, 162, 35);
		add(textField);
		
		JLabel label_2 = new JLabel("Pseudo");
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		label_2.setBounds(10, 151, 64, 14);
		add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setText("test");
		textField_1.setFont(new Font("Rod", Font.PLAIN, 17));
		textField_1.setEditable(false);
		textField_1.setDropMode(DropMode.INSERT);
		textField_1.setColumns(10);
		textField_1.setBounds(84, 143, 162, 35);
		add(textField_1);
		
		JLabel label_3 = new JLabel("CIN");
		label_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		label_3.setBounds(10, 227, 64, 14);
		add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setText("test");
		textField_2.setFont(new Font("Rod", Font.PLAIN, 17));
		textField_2.setEditable(false);
		textField_2.setDropMode(DropMode.INSERT);
		textField_2.setColumns(10);
		textField_2.setBounds(84, 219, 162, 35);
		add(textField_2);
		
		JLabel label_4 = new JLabel("Tel");
		label_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		label_4.setBounds(10, 314, 64, 14);
		add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setText("065654521");
		textField_3.setFont(new Font("Rod", Font.PLAIN, 17));
		textField_3.setEditable(false);
		textField_3.setDropMode(DropMode.INSERT);
		textField_3.setColumns(10);
		textField_3.setBounds(84, 306, 162, 35);
		add(textField_3);
		
		JLabel label_5 = new JLabel("Mot de passe");
		label_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		label_5.setBounds(318, 151, 104, 14);
		add(label_5);
		
		passwordField = new JPasswordField();
		passwordField.setText("bhzfkjfhskqljl");
		passwordField.setEditable(false);
		passwordField.setBounds(443, 143, 162, 35);
		add(passwordField);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(662, 54, 38, 35);
		add(label_6);
		
		txtMotDePasse = new JTextField();
		txtMotDePasse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(passClick1==0)
				{
				txtMotDePasse.setText("");
				}
				passClick1=1;
			}
		});
		txtMotDePasse.setToolTipText("");
		txtMotDePasse.setText("Mot De passe Actuell");
		txtMotDePasse.setFont(new Font("Kalinga", Font.ITALIC, 11));
		txtMotDePasse.setDropMode(DropMode.INSERT);
		txtMotDePasse.setColumns(10);
		txtMotDePasse.setBounds(443, 205, 162, 35);
		add(txtMotDePasse);
		txtMotDePasse.setVisible(false);
		
		txtNouveauMotDe = new JTextField();
		txtNouveauMotDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(passClick2==0)
				{
					txtNouveauMotDe.setText("");
				}
					passClick2=1;
			}
		});
		txtNouveauMotDe.setToolTipText("");
		txtNouveauMotDe.setText("Nouveau Mot De Passe");
		txtNouveauMotDe.setFont(new Font("Kalinga", Font.ITALIC, 11));
		txtNouveauMotDe.setDropMode(DropMode.INSERT);
		txtNouveauMotDe.setColumns(10);
		txtNouveauMotDe.setBounds(443, 263, 162, 35);
		add(txtNouveauMotDe);
		txtNouveauMotDe.setVisible(false);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("ressources\\done.png"));
		button_1.setBounds(582, 314, 32, 28);
		add(button_1);
		button_1.setVisible(false);
		
		
		JButton btnSauvegarder = new JButton("SAUVEGARDER");
		btnSauvegarder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String log=textField_1.getText();
				String passe=(String)(passwordField.getText());
				if(Secretaire.getProfil(log, passe)==1)
				{
					String prenom=textField.getText();
					String nom=textField_4.getText();
					 log=textField_1.getText();
					String cin=textField_2.getText();
					String tel=textField_3.getText();
					 passe=(String)(passwordField.getText());
					String req="INSERT INTO authentification VALUES('"+log+"','"+passe+"',1)";
					//String req2="INSERT INTO secretaire VALUES('"+cin+"','"+nom+"','"+prenom+"',null,'"+passe+"','"+tel+"')";
					try {
						java.sql.Connection conn =	JDBC.getConnection();
						Statement stm;
						stm=(Statement) conn.createStatement();
						stm.executeUpdate(req);
						//stm.executeUpdate(req2);
						}
						catch(Exception e1)
		        		{
		        			e1.printStackTrace();
		        		}
					 
				}
				else if(Secretaire.getProfil(log, passe)==2)
				{
					
				}
			}
		});
		btnSauvegarder.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		btnSauvegarder.setIcon(new ImageIcon("ressources\\save.png"));
		btnSauvegarder.setBounds(637, 365, 187, 35);
		add(btnSauvegarder);
		btnSauvegarder.setVisible(false);
		
		JLabel label_7 = new JLabel("Nom");
		label_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		label_7.setBounds(354, 62, 46, 14);
		add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setText("test");
		textField_4.setFont(new Font("Rod", Font.PLAIN, 17));
		textField_4.setEditable(false);
		textField_4.setDropMode(DropMode.INSERT);
		textField_4.setColumns(10);
		textField_4.setBounds(443, 54, 162, 35);
		add(textField_4);
		
		JButton button_2 = new JButton("MODIFIER Mes info");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(true);
				//textField_5.setEditable(true);
				btnSauvegarder.setVisible(true);
			}
		});
		button_2.setForeground(new Color(0, 0, 139));
		button_2.setFont(new Font("Verdana", Font.BOLD, 12));
		button_2.setBackground(new Color(255, 255, 204));
		button_2.setBounds(560, 20, 171, 23);
		add(button_2);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("ressources\\down.png"));
		label_8.setBounds(603, 143, 38, 35);
		add(label_8);
		
		JButton button_3 = new JButton("changer mon mot de passe");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(hello==true)
				{
					
					label_8.setIcon(new ImageIcon("ressources\\up.png"));
				//panel_2.add(label);
				txtMotDePasse.setVisible(true);
				txtNouveauMotDe.setVisible(true);
				button_1.setVisible(true);
				hello=false;
				}
				else{
					
					label_8.setIcon(new ImageIcon("ressources\\down.png"));
					txtMotDePasse.setVisible(false);
					txtNouveauMotDe.setVisible(false);
					button_1.setVisible(false);
					hello=true;
					}
			}
		});
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		button_3.setBackground(new Color(255, 255, 204));
		button_3.setBounds(639, 149, 195, 23);
		add(button_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("ressources\\backgroud ki ma tle3.png"));
		label.setBounds(-20, 0, 899, 481);
		add(label);
		System.out.println();
		actualiser();
	}
	public   void actualiser()
	{
		String log=textField_1.getText();
		String passe=(String)(passwordField.getText());
		String req="select cinM,nomM,prenomM,login,password,telM from medecin where login='"+Authentification.txtUsername.getText()+"'";
		
		//String req2="select cinS,nomS,prenomS,login,password,telS from secretaire";
	
		
		try {
			java.sql.Connection conn =	JDBC.getConnection();
			Statement stm;
			stm=(Statement) conn.createStatement();
		
				stm.executeQuery(req);
				ResultSet res=(ResultSet) stm.executeQuery(req);
				res.next();
				textField_2.setText(res.getString(1));
				textField_4.setText(res.getString(2));
				textField.setText(res.getString(3));
				textField_1.setText(res.getString(4));
				passwordField.setText(res.getString(5));
				textField_3.setText(res.getString(6));
				
			}
			catch(Exception e1)
    		{
    			e1.printStackTrace();
    		}
		
		
		
		 
	}
}
