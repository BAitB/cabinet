package Interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AcceuilS_pan extends JPanel {
	boolean Switch=true;
	private JTable table;
	public AcceuilS_pan() {
		setLayout(null);
		
		JLabel lblLaListeDattente = new JLabel("La liste d'attente d'aujourd'hui");
		lblLaListeDattente.setFont(new Font("Segoe WP Semibold", Font.BOLD, 16));
		lblLaListeDattente.setBounds(274, 11, 356, 31);
		add(lblLaListeDattente);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 53, 740, 356);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HP\\git\\cabinet\\BAB\\ressources\\msg.png"));
		label.setBounds(760, 184, 40, 31);
		add(label);

	}
}
