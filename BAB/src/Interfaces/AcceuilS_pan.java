package Interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import actors.MemoCalendar;
import actors.Secretaire;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AcceuilS_pan extends JPanel {
	boolean Switch=true;
	public static JTable table;
	private JTextField textField;
	public AcceuilS_pan() {
		setLayout(null);
		
		JLabel lblLaListeDattente = new JLabel("La liste d'attente d'aujourd'hui");
		lblLaListeDattente.setFont(new Font("Segoe WP Semibold", Font.BOLD, 16));
		lblLaListeDattente.setBounds(274, 11, 356, 31);
		add(lblLaListeDattente);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 85, 740, 356);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel labelMemo = new JLabel("");
		labelMemo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MemoCalendar n=new  MemoCalendar();
				
			}
		});
		labelMemo.setIcon(new ImageIcon("ressources\\msg.png"));
		labelMemo.setBounds(760, 184, 40, 31);
		add(labelMemo);
		
		JLabel lblChercher = new JLabel("chercher ");
		lblChercher.setBounds(21, 54, 52, 14);
		add(lblChercher);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				String txt=textField.getText();
				Secretaire.chercher(txt, table);
			}
		});
		textField.setBounds(95, 46, 144, 31);
		add(textField);
		textField.setColumns(10);

	}
}
