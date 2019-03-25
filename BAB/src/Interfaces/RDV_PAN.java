package Interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;



import DataBase.Helper;
import DataBase.JDBC;
//import com.mysql.jdbc.Statement;

import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.Component;
import javax.swing.Box;

public class RDV_PAN extends JPanel {
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public RDV_PAN() {
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 206, 209));
		panel_1.setBounds(0, 409, 878, 71);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton SupprimerButton = new JButton("Supprimer");
		SupprimerButton.setBounds(726, 21, 122, 27);
		panel_1.add(SupprimerButton);
		SupprimerButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		SupprimerButton.setBackground(Color.RED);
		
		JButton ViderButton = new JButton("Vider");
		ViderButton.setBounds(554, 23, 105, 23);
		panel_1.add(ViderButton);
		ViderButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		ViderButton.setBackground(Color.WHITE);
		
		JButton ListerButton = new JButton("Lister");
		ListerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				java.sql.Connection con=JDBC.getConnection();
				String req="select * from rdv ";
				try {
				java.sql.Statement stm=(java.sql.Statement) con.createStatement();
				ResultSet rs=stm.executeQuery(req);
				DefaultTableModel dtm=Helper.buildTableModel(rs);
				table.setModel(dtm);
				}
				catch(SQLException e){ e.printStackTrace();}
			}	
			
		});
		ListerButton.setBounds(356, 23, 120, 23);
		panel_1.add(ListerButton);
		ListerButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		ListerButton.setBackground(new Color(127, 255, 212));
		
		JButton ModifierButton = new JButton("Modifier");
		ModifierButton.setBounds(165, 25, 105, 23);
		panel_1.add(ModifierButton);
		ModifierButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		ModifierButton.setBackground(Color.GREEN);
		
		JButton AjouterButton = new JButton("Ajouter");
		AjouterButton.setBounds(0, 25, 115, 23);
		panel_1.add(AjouterButton);
		AjouterButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		AjouterButton.setBackground(new Color(144, 238, 144));
		ViderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(353, 0, 525, 431);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(0, 0, 353, 416);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		lblNewLabel_1.setBounds(37, 237, 81, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CIN Docteur");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		lblNewLabel_2.setBounds(37, 183, 105, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CIN Patient");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		lblNewLabel_3.setBounds(37, 89, 148, 28);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CIN Secretaire");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		lblNewLabel_4.setBounds(37, 138, 143, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		lblDescription.setBounds(37, 282, 68, 14);
		panel.add(lblDescription);
		
		JLabel lblNewLabel_5 = new JLabel("IdRDV");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		lblNewLabel_5.setBounds(42, 51, 135, 14);
		panel.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(195, 185, 135, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(195, 91, 135, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(195, 136, 135, 20);
		panel.add(comboBox_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(44, 307, 286, 98);
		panel.add(textArea);
		
		JSpinner spinner = new JSpinner();
		spinner.setEnabled(false);
		spinner.setBounds(195, 48, 135, 20);
		panel.add(spinner);
		
		textField = new JTextField();
		textField.setBounds(195, 234, 135, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("ressources\\backgroud ki ma tle3.png"));
		lblNewLabel.setBounds(0, 0, 878, 513);
		add(lblNewLabel);

	}
}
