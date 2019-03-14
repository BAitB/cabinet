package Interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AcceuilS_pan extends JPanel {
	JLabel labelPhone;
	JLabel labelInfoP,lblImmBSect,label_1;
	boolean Switch=true;
	public AcceuilS_pan() {
		setLayout(null);
		
		JLabel labelF = new JLabel("");
		labelF.setIcon(new ImageIcon("ressources\\icons8-caduceus-100.png"));
		labelF.setBounds(388, 43, 100, 110);
		//labelF.setBounds(216, 0, 866, 553);
		add(labelF);
		
		JLabel labelBien = new JLabel("BIENVENU\r\n au\r\n CABINET MEDICAL\r\n");
		labelBien.setFont(new Font("Papyrus", Font.BOLD, 25));
		labelBien.setBounds(183, 153, 534, 32);
		add(labelBien);
		
		JLabel labelBien2 = new JLabel("HOPE");
		labelBien2.setFont(new Font("Papyrus", Font.BOLD, 25));
		labelBien2.setBounds(388, 196, 100, 32);
		add(labelBien2);
		
		JLabel labelTel = new JLabel("");
		labelTel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Switch==true)
				{
				labelTel.setIcon(new ImageIcon("ressources\\upA.png"));
				labelPhone.setVisible(true);
				labelInfoP.setVisible(true);
				lblImmBSect.setVisible(true);
				label_1.setVisible(true);
				Switch=false;
				}
				else {
					labelTel.setIcon(new ImageIcon("ressources\\downA.png"));
					labelPhone.setVisible(false);
					labelInfoP.setVisible(false);
					lblImmBSect.setVisible(false);
					label_1.setVisible(false);
					Switch=true;
				}
				
			}
		});
		labelTel.setIcon(new ImageIcon("ressources\\downA.png"));
		labelTel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		labelTel.setBounds(417, 249, 32, 32);
		add(labelTel);
		
		 labelPhone = new JLabel("");
		labelPhone.setIcon(new ImageIcon("ressources\\phone.png"));
		labelPhone.setBounds(388, 305, 24, 32);
		add(labelPhone);
		labelPhone.setVisible(false);
		
		labelInfoP = new JLabel("+212 655681358");
		labelInfoP.setBounds(417, 312, 111, 14);
		add(labelInfoP);
		labelInfoP.setVisible(false);
		
		 lblImmBSect = new JLabel("imm b sect 14 res atba mabrouka ryad RABAT");
		lblImmBSect.setBounds(417, 349, 268, 14);
		add(lblImmBSect);
		lblImmBSect.setVisible(false);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("ressources\\address.png"));
		label_1.setBounds(388, 341, 24, 32);
		add(label_1);
		label_1.setVisible(false);
		
		
    	JLabel labelFon = new JLabel("");
		labelFon.setIcon(new ImageIcon("ressources\\backgroud ki ma tle3.png"));
		labelFon.setBounds(0, 0, 899, 481);
		add(labelFon);

	}
}
