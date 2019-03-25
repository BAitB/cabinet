package Interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;

public class Patient_sec_pan extends JPanel {
	private JTable table;
	private JTextField nom_tf;
	private JTextField prenom_tf;
	private JTextField cin_tf;
	private JTextField age_tf;
	private JTextField tel_tf;

	/**
	 * Create the panel.
	 */
	public Patient_sec_pan() {
		setBackground(new Color(175, 238, 238));
		setLayout(null);
		
		JButton btn_afficher = new JButton("Afficher");
		btn_afficher.setBackground(new Color(175, 238, 238));
		btn_afficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_afficher.setBounds(602, 437, 227, 25);
		add(btn_afficher);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(221, 402, 657, -400);
		add(scrollPane);
		
		table = new JTable();
		table.setBounds(0, 0, 1, 1);
		add(table);
		
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
		
		JTextArea adr_ta = new JTextArea();
		adr_ta.setBounds(12, 321, 200, 87);
		add(adr_ta);
		
		tel_tf = new JTextField();
		tel_tf.setColumns(10);
		tel_tf.setBounds(12, 433, 200, 29);
		add(tel_tf);
		
		JButton btn_delete = new JButton("Supprimer");
		btn_delete.setBackground(new Color(219, 112, 147));
		btn_delete.setBounds(465, 437, 105, 25);
		add(btn_delete);
		
		JButton btn_ajouter = new JButton("Ajouter");
		btn_ajouter.setBackground(new Color(0, 139, 139));
		btn_ajouter.setBounds(221, 437, 105, 25);
		add(btn_ajouter);
		
		JButton btn_modifier = new JButton("Modifier");
		btn_modifier.setBackground(new Color(0, 206, 209));
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
		
		JComboBox cb_sexe = new JComboBox();
		cb_sexe.setBounds(12, 211, 200, 22);
		add(cb_sexe);

	}
}
