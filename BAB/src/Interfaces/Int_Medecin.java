package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Int_Medecin extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JLabel label_3;
	Patient_pan patien=new Patient_pan();
	compte_pan compte=new compte_pan();
	//private JLabel lblMonCompte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Int_Medecin frame = new Int_Medecin();
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
	public Int_Medecin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(0, 0, 217, 553);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSeDconnecter = new JLabel("Se d\u00E9connecter");
		lblSeDconnecter.setBackground(new Color(245, 255, 250));
		lblSeDconnecter.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));
		lblSeDconnecter.setIcon(new ImageIcon("ressources\\logout.png"));
		lblSeDconnecter.setBounds(0, 504, 217, 49);
		lblSeDconnecter.setOpaque(true);
		panel.add(lblSeDconnecter);
		
		
		
		
		
		
		
		
		JLabel lblBab = new JLabel("");
		lblBab.setHorizontalAlignment(SwingConstants.CENTER);
		lblBab.setIcon(new ImageIcon("ressources\\stethoscope.png"));
		lblBab.setBounds(12, 27, 193, 66);
		panel.add(lblBab);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(216, 0, 866, 553);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(240, 255, 240));
		lblNewLabel_1.setBounds(200, 0, 666, 90);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(175, 238, 238));
		panel_3.setBounds(12, 0, 187, 70);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblImandknsjksd = new JLabel("Dr  "+"kniyto");
		lblImandknsjksd.setIcon(new ImageIcon("ressources\\icons8-docteur-homme-32.png"));
		lblImandknsjksd.setBounds(0, 13, 187, 44);
		panel_3.add(lblImandknsjksd);
		
		JPanel AcceuilPanel = new JPanel();
		AcceuilPanel.setBounds(0, 90, 866, 463);
		panel_1.add(AcceuilPanel);
		AcceuilPanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("     Rendez vous");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_4.setIcon(new ImageIcon("ressources\\icons8-health-checkup-30.png"));
		lblNewLabel_4.setBounds(22, 274, 185, 39);
		AcceuilPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("    Nombre Patients");
		lblNewLabel_3.setIcon(new ImageIcon("ressources\\icons8-appointment-scheduling-30.png"));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_3.setBounds(22, 219, 185, 39);
		AcceuilPanel.add(lblNewLabel_3);
		
		JLabel lblSalleDattente = new JLabel("    Salle d'Attente");
		lblSalleDattente.setIcon(new ImageIcon("ressources\\icons8-waiting-room-30.png"));
		lblSalleDattente.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblSalleDattente.setBounds(22, 341, 185, 39);
		AcceuilPanel.add(lblSalleDattente);
		
		JLabel lblConsultations = new JLabel("   Consultations");
		lblConsultations.setIcon(new ImageIcon("ressources\\icons8-counselor-30.png"));
		lblConsultations.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblConsultations.setBounds(22, 401, 185, 39);
		AcceuilPanel.add(lblConsultations);
		
		JLabel canapeLabel = new JLabel("");
		canapeLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				SalleAttente S=new SalleAttente();
				S.setVisible(true);
				setVisible(false);
			}
		});
		
		canapeLabel.setIcon(new ImageIcon("ressources\\canape.png"));
		canapeLabel.setBounds(746, 341, 110, 99);
		AcceuilPanel.add(canapeLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Salle d'attente");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_2.setBounds(725, 325, 110, 20);
		AcceuilPanel.add(lblNewLabel_2);
		
		JLabel outlookLabel = new JLabel("");
		outlookLabel.setIcon(new ImageIcon("ressources\\outlook.png"));
		outlookLabel.setBounds(10, 29, 63, 39);
		AcceuilPanel.add(outlookLabel);
		
		JLabel calendrierLabel = new JLabel("");
		calendrierLabel.setIcon(new ImageIcon("ressources\\calendar.png"));
		calendrierLabel.setBounds(10, 107, 63, 39);
		AcceuilPanel.add(calendrierLabel);
		
		JLabel nextLabel = new JLabel("");
		nextLabel.setIcon(new ImageIcon("ressources\\next.png"));
		nextLabel.setBounds(793, 29, 63, 39);
		AcceuilPanel.add(nextLabel);
		
		JLabel msgLabel = new JLabel("");
		msgLabel.setIcon(new ImageIcon("ressources\\msg.png"));
		msgLabel.setBounds(793, 107, 63, 39);
		AcceuilPanel.add(msgLabel);
		
		JLabel label_3 = new JLabel("");

		label_3.setBounds(0, -90, 866, 553);
		AcceuilPanel.add(label_3);

		label_3.setIcon(new ImageIcon("ressources\\backgroud ki ma tle3.png"));
		label_3.setBackground(new Color(245, 255, 250));
		label_3.setVisible(true);
		
		JLabel lblPatient = new JLabel("     Patient");
		lblPatient.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblPatient.setOpaque(true);
				lblPatient.setBackground(new Color(250, 255, 240));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPatient.setBackground(new Color(175, 238, 238));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				patien.setVisible(true);
				AcceuilPanel.setVisible(false);				
				compte.setVisible(false);
				
				patien.setBounds(0, 90,866,846);
				label_3.setVisible(false);
				lblNewLabel_1.setOpaque(true);
				panel_1.add(patien);
				
				
			}
		});
		JLabel lblMonCompte = new JLabel("     Mon Compte");
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
				patien.setVisible(false);
				AcceuilPanel.setVisible(false);				
				compte.setVisible(true);
				compte.setBounds(0, 90,866,846);
				label_3.setVisible(false);
				lblNewLabel_1.setOpaque(true);
				panel_1.add(compte);
			}
		});
		JLabel lblNewLabel = new JLabel("      Acceuil");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel.setOpaque(true);
				lblNewLabel.setBackground(new Color(250, 255, 240));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setBackground(new Color(175, 238, 238));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				patien.setVisible(false);
				AcceuilPanel.setVisible(true);				
				compte.setVisible(false);
			}
		});
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel.setIcon(new ImageIcon("ressources\\icons8-accueil-32.png"));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(12, 161, 205, 49);
		panel.add(lblNewLabel);
		lblMonCompte.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblMonCompte.setIcon(new ImageIcon("ressources\\user1.png"));
		lblMonCompte.setHorizontalAlignment(SwingConstants.LEFT);
		lblMonCompte.setBounds(12, 281, 205, 49);
		panel.add(lblMonCompte);
		lblPatient.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		
		lblPatient.setIcon(new ImageIcon("ressources\\icons8-\u00EAtre-malade-36.png"));
		lblPatient.setHorizontalAlignment(SwingConstants.LEFT);
		lblPatient.setBounds(12, 223, 205, 49);
		panel.add(lblPatient);
	}
	}
