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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public RDV_PAN() {
		setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(166, 150, 46, 14);
		add(label);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(166, 164, 86, 20);
		add(textField_5);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(24, 150, 46, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(166, 88, 46, 14);
		add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(24, 164, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 109, 84, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(353, 0, 525, 412);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton ListerButton = new JButton("Lister");
		ListerButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		ListerButton.setBackground(new Color(127, 255, 212));
		ListerButton.setBounds(202, 223, 120, 23);
		add(ListerButton);
		
		JButton AjouterButton = new JButton("Ajouter");
		AjouterButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		AjouterButton.setBackground(new Color(144, 238, 144));
		AjouterButton.setBounds(153, 285, 126, 23);
		add(AjouterButton);
		
		JButton SupprimerButton = new JButton("Supprimer");
		SupprimerButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		SupprimerButton.setBackground(Color.RED);
		SupprimerButton.setBounds(10, 342, 114, 23);
		add(SupprimerButton);
		
		JButton ModifierButton = new JButton("Modifier");
		ModifierButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		ModifierButton.setBackground(Color.GREEN);
		ModifierButton.setBounds(10, 285, 114, 23);
		add(ModifierButton);
		
		JButton ViderButton = new JButton("Vider");
		ViderButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		ViderButton.setBackground(Color.WHITE);
		ViderButton.setBounds(153, 342, 126, 23);
		add(ViderButton);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(24, 109, 86, 20);
		add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(35, 29, 46, 14);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(24, 45, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(166, 29, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(24, 88, 46, 14);
		add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 45, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mohamed\\git\\cabinet\\BAB\\ressources\\backgroud ki ma tle3.png"));
		lblNewLabel.setBounds(0, 0, 878, 448);
		add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(166, 150, 46, 14);
		add(lblNewLabel_6);

	}
}
