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
import java.awt.event.ActionEvent;

public class RDV_PAN extends JPanel {
	private JTable table;
	private JTextField FieldCINP;
	private JTextField FieldDate;
	private JTextField FieldCINDOC;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public RDV_PAN() {
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 204));
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
				FieldCINDOC.setText("");
				FieldCINP.setText("");
				FieldDate.setText("");
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(353, 0, 525, 441);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		panel.setBounds(0, 0, 353, 408);
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
		
		FieldCINP = new JTextField();
		FieldCINP.setBounds(156, 119, 141, 28);
		panel.add(FieldCINP);
		FieldCINP.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CIN Patient");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_3.setBounds(25, 117, 91, 28);
		panel.add(lblNewLabel_3);
		
		FieldDate = new JTextField();
		FieldDate.setBounds(156, 180, 141, 28);
		panel.add(FieldDate);
		FieldDate.setColumns(10);
		
		FieldCINDOC = new JTextField();
		FieldCINDOC.setBounds(156, 43, 141, 28);
		panel.add(FieldCINDOC);
		FieldCINDOC.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(156, 247, 141, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("CINS");
		lblNewLabel_4.setBounds(24, 250, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(24, 309, 68, 14);
		panel.add(lblDescription);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("ressources\\backgroud ki ma tle3.png"));
		lblNewLabel.setBounds(0, 0, 878, 513);
		add(lblNewLabel);

	}
}
