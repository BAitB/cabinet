package Interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import DataBase.Helper;
import actors.Patient;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JTabbedPane;

public class Patient_sec_pan extends JPanel {
	private JTextField nom_tf;
	private JTextField prenom_tf;
	private JTextField cin_tf;
	private JTextField age_tf;
	private JTextField tel_tf;
	private JTable table;
	JTextArea adr_ta;
	JButton btn_ajouter ;
	JButton btn_delete ;
	JButton btn_modifier ;
	JComboBox<String> cb_sexe;
	JButton btn_afficher;

	/**
	 * Create the panel.
	 */
	public Patient_sec_pan() {
		setBackground(new Color(0, 206, 209));
		setLayout(null);
		
		btn_afficher = new JButton("Afficher");
		btn_afficher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					table.setModel(Helper.buildTableModel(Patient.all()));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btn_afficher.setBackground(new Color(175, 238, 238));
		btn_afficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_afficher.setBounds(602, 437, 227, 25);
		add(btn_afficher);
		
		nom_tf = new JTextField();
		nom_tf.setBounds(12, 23, 200, 29);
		add(nom_tf);
		nom_tf.setColumns(10);
		
		prenom_tf = new JTextField();
		prenom_tf.setColumns(10);
		prenom_tf.setBounds(12, 85, 200, 29);
		add(prenom_tf);
		
		cin_tf = new JTextField();
		cin_tf.setColumns(10);
		cin_tf.setBounds(12, 136, 200, 29);
		add(cin_tf);
		
		age_tf = new JTextField();
		age_tf.setColumns(10);
		age_tf.setBounds(12, 262, 200, 29);
		add(age_tf);
		
		adr_ta = new JTextArea();
		adr_ta.setBounds(12, 321, 200, 87);
		add(adr_ta);
		
		tel_tf = new JTextField();
		tel_tf.setColumns(10);
		tel_tf.setBounds(12, 433, 200, 29);
		add(tel_tf);
		
		btn_delete = new JButton("Supprimer");
		btn_delete.setBackground(new Color(219, 112, 147));
		btn_delete.setBounds(465, 437, 105, 25);
		add(btn_delete);
		
	    btn_ajouter = new JButton("Ajouter");
	    btn_ajouter.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent arg0) {
	    	String nom=	nom_tf.getText();
	    	String prenom= prenom_tf.getText();
	    	String CIN =cin_tf.getText();
	    	String sexe =(String) cb_sexe.getSelectedItem();
	        int age= Integer.parseInt(age_tf.getText());
	    	String adresse =adr_ta.getText();
	    	String telephone =tel_tf.getText();
	    	Patient.insert(CIN, nom, prenom, adresse, telephone, sexe, age);
	    	btn_afficher.doClick();
	    	
	    	
	    		}
	    });
		btn_ajouter.setBackground(new Color(0, 206, 209));
		btn_ajouter.setBounds(221, 437, 105, 25);
		add(btn_ajouter);
		
		 btn_modifier = new JButton("Modifier");
		btn_modifier.setBackground(new Color(0, 255, 255));
		btn_modifier.setBounds(334, 437, 105, 25);
		add(btn_modifier);
		
		JLabel lbl_nom = new JLabel("Nom");
		lbl_nom.setBounds(13, 0, 56, 16);
		add(lbl_nom);
		
		JLabel lbl_prenom = new JLabel("Pr\u00E9nom");
		lbl_prenom.setBounds(13, 65, 56, 16);
		add(lbl_prenom);
		
		JLabel lbl_cin = new JLabel("CIN");
		lbl_cin.setBounds(12, 118, 56, 16);
		add(lbl_cin);
		
		JLabel lbl_sexe = new JLabel("sexe");
		lbl_sexe.setBounds(12, 182, 56, 16);
		add(lbl_sexe);
		
		JLabel age_lbl = new JLabel("Age");
		age_lbl.setBounds(12, 242, 56, 16);
		add(age_lbl);
		
		JLabel lb_adr = new JLabel("Adresse");
		lb_adr.setBounds(12, 305, 56, 16);
		add(lb_adr);
		
		JLabel lbl_tel = new JLabel("Telephone");
		lbl_tel.setBounds(12, 417, 71, 16);
		add(lbl_tel);
		
		cb_sexe = new JComboBox<String>();
		cb_sexe.setEditable(true);
		cb_sexe.addItem("homme");
		cb_sexe.addItem("femme");
		cb_sexe.setBounds(12, 211, 200, 22);
		add(cb_sexe);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(224, 23, 642, 385);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}
