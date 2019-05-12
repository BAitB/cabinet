package Interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import DataBase.Helper;
import actors.Patient;

import actors.RDV;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.MessageFormat;

import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;

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
	private JComboBox<String> cb_sexe;
	JButton btn_afficher;
	private String des;
	private JTextField Fieldlogin;

	/**
	 * Create the panel.
	 */
	public Patient_sec_pan() {
		setBackground(new Color(0, 206, 209));
		setLayout(null);
		
		btn_afficher = new JButton("Afficher");
		
		btn_afficher.setBackground(new Color(175, 238, 238));
		btn_afficher.addActionListener(new ActionListener() {
			
			@Override 
			public void actionPerformed(ActionEvent arg0) {
			
				
					try {
						table.setModel(Helper.buildTableModel(Patient.allsec()));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
		});
		btn_afficher.setBounds(609, 437, 113, 25);
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
		adr_ta.setBounds(12, 370, 200, 36);
		add(adr_ta);
		
		tel_tf = new JTextField();
		tel_tf.setColumns(10);
		tel_tf.setBounds(12, 433, 200, 29);
		add(tel_tf);
		
		btn_delete = new JButton("Supprimer");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index =table.getSelectedRow();
				String Cin=(String)table.getValueAt(index, 0);

				int choix=JOptionPane.showConfirmDialog(null, "Vous-voulez vraiment supprimer l'enregistrement?","Supprimer",JOptionPane.YES_NO_OPTION);
				if(choix==JOptionPane.YES_OPTION) 
					
				{
					Patient.Delete(Cin);
					btn_afficher.doClick();
					
				}

				Patient.Delete(Cin);

			}
		});
		btn_delete.setBackground(new Color(219, 112, 147));
		btn_delete.setBounds(465, 437, 105, 25);
		add(btn_delete);
		
	    btn_ajouter = new JButton("Ajouter");
	    btn_ajouter.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent arg0) {
	    	String nom=	nom_tf.getText();
	    	String prenom= prenom_tf.getText();
	    	String CIN =cin_tf.getText();
	    	String sexe =(String) cb_sexe.getSelectedItem();
	        int age= Integer.parseInt(age_tf.getText());
	    	String adresse =adr_ta.getText();
	    	String telephone =tel_tf.getText();
	    	String login=Fieldlogin.getText();
	    	Patient.insert(CIN, nom, prenom, adresse, telephone, sexe, age,login);
	    	btn_afficher.doClick();
	    	
	    	
	    		}
	    });
		btn_ajouter.setBackground(new Color(0, 206, 209));
		btn_ajouter.setBounds(221, 437, 105, 25);
		add(btn_ajouter);
		
		 btn_modifier = new JButton("Modifier");

		 btn_modifier.addActionListener(new ActionListener() {
		    	@Override
		    	public void actionPerformed(ActionEvent arg0) {
		    	String nom=	nom_tf.getText();
		    	String prenom= prenom_tf.getText();
		    	String CIN =cin_tf.getText();
		    	String sexe =(String) cb_sexe.getSelectedItem();
		        int age= Integer.parseInt(age_tf.getText());
		    	String adresse =adr_ta.getText();
		    	String telephone =tel_tf.getText();
		    	String login =Fieldlogin.getText();
		    	Patient.modifier(CIN, nom, prenom, adresse, telephone, sexe, age,login);
		    	btn_afficher.doClick();  	
		    		}
		    });

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
		lb_adr.setBounds(13, 356, 56, 16);
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
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFillsViewportHeight(true);
		
		scrollPane.setViewportView(table);
		
		JButton btnFichierText = new JButton("G\u00E9n\u00E9rer un  txt");
		btnFichierText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				PrintWriter out=null;
				try{
					/* Path vers le fichier à créer*/
					String pathFichier = "ressources/patient.txt";
					/* Ouverture du fichier en écriture */
					out = new PrintWriter(new BufferedWriter(new FileWriter(pathFichier)));
				  out.println("   ------------------ les informations du patient--------------------");
				  out.println("\n");
				    out.write("   |nom            |      " );
					out.println(nom_tf.getText());
					out.write("   |prenom         |      " );
					out.println(prenom_tf.getText());
					out.write("   |CIN            |      " );
					out.println(cin_tf.getText());
					out.write("   |Sexe           |      " );
					if(cb_sexe.getSelectedIndex()==0) out.println("Homme");
					else out.println("Femme");
					out.write("   |Age            |      " );
					out.println(age_tf.getText());
					out.write("   |Adresse        |      " );
					out.println(adr_ta.getText());
					out.write("   |Telephone      |      " );
					out.println(tel_tf.getText());
					out.write("   |Description    |      " );
					out.println(des);
					out.println(" __________________________________________________________________");
					JOptionPane.showMessageDialog(null, "Terminer ,le fichier patient a été bien créé ");
					
				}
				catch(IOException exc){
					exc.printStackTrace();
					JOptionPane.showMessageDialog(null,"Probleme lors de la creation du fichier" ,"Erreur",  JOptionPane.ERROR_MESSAGE);
				}
				finally {
					if(out!=null){
						/* Fermeture du flux */
						out.close();
					}
				}
			}
		});
		btnFichierText.setBackground(new Color(175, 238, 238));
		btnFichierText.setBounds(753, 437, 113, 25);
		add(btnFichierText);
		
		Fieldlogin = new JTextField();
		Fieldlogin.setColumns(10);
		Fieldlogin.setBounds(12, 316, 200, 29);
		add(Fieldlogin);
		
		JLabel labellogin = new JLabel("Login");
		labellogin.setBounds(12, 302, 56, 16);
		add(labellogin);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int index=table.getSelectedRow();
				String C=(String)table.getValueAt(index, 0);
				String n=(String)table.getValueAt(index, 1);
				String p=(String)table.getValueAt(index, 2);
				String adr=(String)table.getValueAt(index, 5);
				String sexe=(String)table.getValueAt(index, 3);
				int age=(int)table.getValueAt(index, 4);
				String telepho=(String)table.getValueAt(index, 6);
				String log=(String)table.getValueAt(index, 7);
				String ages=""+age;
				System.out.println(C);
			  	nom_tf.setText(n);
				Fieldlogin.setText(log);
		    	prenom_tf.setText(p);
		    	cin_tf.setText(C);
		    	if (sexe.equals("homme")) {
		    		cb_sexe.setSelectedIndex(0);
		    	}else {cb_sexe.setSelectedIndex(1);
		    	
		    	}
		        age_tf.setText(ages);
		    	adr_ta.setText(adr);
		    	tel_tf.setText(telepho);
			}
		});

	}
}
