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

public class RDV_PAN extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public RDV_PAN() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(353, 0, 525, 412);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton SupprimerButton = new JButton("Supprimer");
		SupprimerButton.setBounds(706, 423, 115, 23);
		add(SupprimerButton);
		SupprimerButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		SupprimerButton.setBackground(Color.RED);
		
		JButton ViderButton = new JButton("Vider");
		ViderButton.setBounds(10, 423, 105, 23);
		add(ViderButton);
		ViderButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		ViderButton.setBackground(Color.WHITE);
		
		JButton ListerButton = new JButton("Lister");
		ListerButton.setBounds(329, 423, 120, 23);
		add(ListerButton);
		ListerButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		ListerButton.setBackground(new Color(127, 255, 212));
		
		JButton ModifierButton = new JButton("Modifier");
		ModifierButton.setBounds(174, 423, 105, 23);
		add(ModifierButton);
		ModifierButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		ModifierButton.setBackground(Color.GREEN);
		
		JButton AjouterButton = new JButton("Ajouter");
		AjouterButton.setBounds(508, 423, 115, 23);
		add(AjouterButton);
		AjouterButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		AjouterButton.setBackground(new Color(144, 238, 144));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 353, 412);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_1.setBounds(24, 195, 81, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CIN Docteur");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_2.setBounds(24, 44, 105, 23);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(156, 119, 141, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CIN Patient");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_3.setBounds(25, 117, 91, 28);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 180, 141, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 43, 141, 28);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("ressources\\backgroud ki ma tle3.png"));
		lblNewLabel.setBounds(0, 0, 878, 513);
		add(lblNewLabel);

	}
}
