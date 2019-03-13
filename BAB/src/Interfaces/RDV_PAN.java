package Interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class RDV_PAN extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public RDV_PAN() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(35, 67, 46, 14);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(124, 64, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(35, 118, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(35, 169, 46, 14);
		add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 115, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mohamed\\git\\cabinet\\BAB\\ressources\\backgroud ki ma tle3.png"));
		lblNewLabel.setBounds(10, 11, 787, 401);
		add(lblNewLabel);

	}
}
