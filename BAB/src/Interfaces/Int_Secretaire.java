package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import actors.RDV;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JSpinner;

public class Int_Secretaire extends JFrame {

	private JPanel contentPane;
	private JLabel magana;
	JPanel panel_1;
	JLabel labelimg;
	Patient_sec_pan patient=new Patient_sec_pan();

	RDV_PAN RP=new RDV_PAN();
	AcceuilS_pan acceuil=new AcceuilS_pan();
	//compte_pan compte=new compte_pan();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Int_Secretaire frame = new Int_Secretaire();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	
	public Int_Secretaire() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				acceuil.setBounds(0, 90,866,846);
				acceuil.setVisible(true);
				panel_1.add(acceuil);
				labelimg.setVisible(false);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(0, 0, 217, 553);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblpatient = new JLabel("      Patient");
		lblpatient.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblpatient.setOpaque(true);
				lblpatient.setBackground(new Color(250, 255, 240));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblpatient.setBackground(new Color(175, 238, 238));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				patient.setVisible(true);
			    acceuil.setVisible(false);	
			   // compte.setVisible(false);
			    RP.setVisible(false);
			    patient.setBounds(0, 90,866,846);
			    //label_3.setVisible(false);
			//lblNewLabel_1.setOpaque(true);
			panel_1.add(patient);
			}
		});
		lblpatient.setIcon(new ImageIcon("ressources\\icons8-\u00EAtre-malade-36.png"));
		lblpatient.setHorizontalAlignment(SwingConstants.LEFT);
		lblpatient.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblpatient.setBackground(Color.GRAY);
		lblpatient.setBounds(12, 209, 205, 49);
		panel.add(lblpatient);
		
		JLabel lblRDV = new JLabel("      Rendez-vous");
		lblRDV.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblRDV.setOpaque(true);
				lblRDV.setBackground(new Color(250, 255, 240));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblRDV.setBackground(new Color(175, 238, 238));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {	
				RP.setBounds(0, 90,866,846);
				patient.setVisible(false);
			    acceuil.setVisible(false);		
			 //   compte.setVisible(false);
			    RP.setVisible(true);
				panel_1.add(RP);
				labelimg.setVisible(false);
				acceuil.setVisible(false);
				RDV.ListeCINPatient(RDV_PAN.combPatient);
				RDV.ListeCINMedecin(RDV_PAN.comboDoc);
				RDV.ListeCINSecretaire(RDV_PAN.comboSecretaire);
			}
		});
		lblRDV.setIcon(new ImageIcon("ressources\\icons8-health-checkup-30.png"));
		lblRDV.setHorizontalAlignment(SwingConstants.LEFT);
		lblRDV.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblRDV.setBackground(Color.GRAY);
		lblRDV.setBounds(12, 258, 205, 49);
		panel.add(lblRDV);
		
		JLabel lblMonCompte = new JLabel("      Mon compte");
		lblMonCompte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblMonCompte.setOpaque(true);
				lblMonCompte.setBackground(new Color(250, 255, 240));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblMonCompte.setBackground(new Color(175, 238, 238));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//compte.setBounds(0, 90,866,846);
				patient.setVisible(false);
			    acceuil.setVisible(false);
			    RP.setVisible(false);
			  //  compte.setVisible(true);
			//	panel_1.add(compte);
				labelimg.setVisible(false);
				compte.actualiser();
			}
		});
		lblMonCompte.setIcon(new ImageIcon("ressources\\user1.png"));
		lblMonCompte.setHorizontalAlignment(SwingConstants.LEFT);
		lblMonCompte.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblMonCompte.setBackground(Color.GRAY);
		lblMonCompte.setBounds(12, 313, 205, 49);
		panel.add(lblMonCompte);
		
		JLabel lblAccueil = new JLabel("      Acceuil");
		lblAccueil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblAccueil.setOpaque(true);
				lblAccueil.setBackground(new Color(250, 255, 240));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblAccueil.setBackground(new Color(175, 238, 238));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				acceuil.setBounds(0, 90,866,846);
				patient.setVisible(false);
			  //  compte.setVisible(false);
			    RP.setVisible(false);
			    acceuil.setVisible(true);
				panel_1.add(acceuil);
				labelimg.setVisible(false);
			}
		});
		lblAccueil.setIcon(new ImageIcon("ressources\\icons8-accueil-32.png"));
		lblAccueil.setHorizontalAlignment(SwingConstants.LEFT);
		lblAccueil.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblAccueil.setBackground(Color.GRAY);
		lblAccueil.setBounds(12, 150, 205, 49);
		panel.add(lblAccueil);
		
		JLabel lblsedeconnecter = new JLabel("Se d\u00E9connecter");
		lblsedeconnecter.setIcon(new ImageIcon("ressources\\logout.png"));
		lblsedeconnecter.setOpaque(true);
		lblsedeconnecter.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));
		lblsedeconnecter.setBackground(new Color(245, 255, 250));
		lblsedeconnecter.setBounds(0, 504, 217, 49);
		panel.add(lblsedeconnecter);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("ressources\\stethoscope.png"));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(12, 24, 193, 66);
		panel.add(label_2);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(216, 0, 866, 553);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		 labelimg = new JLabel("");
		labelimg.setBackground(new Color(175, 238, 238));
		labelimg.setIcon(new ImageIcon("ressources\\backgroud ki ma tle3.png"));
		labelimg.setBounds(0, 90, 866, 463);
		panel_1.add(labelimg);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(175, 238, 238));
		panel_2.setBounds(12, 0, 187, 83);
		panel_1.add(panel_2);
		
		JLabel lblMlleKniytha = new JLabel("Mlle Kniytha");
		lblMlleKniytha.setIcon(new ImageIcon("ressources\\icons8-woman-profile-32.png"));
		lblMlleKniytha.setBounds(0, 13, 187, 44);
		panel_2.add(lblMlleKniytha);
		
		magana = new JLabel("");
		magana.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		magana.setBounds(425, 13, 394, 57);
		panel_1.add(magana);
		
		Thread clock = new Thread() {
		    @Override
		    public void run() {
		        while (true) { magana.setText(Int_Medecin.sa3a());
		            try {
		                sleep(500); 
		            } catch (InterruptedException ie) {
		            }
		        }
		    }
		};
		clock.start();
	}
}
