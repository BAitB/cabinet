package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DataBase.Helper;
import actors.Patient;
import actors.RDV;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

public class Int_Medecin extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JLabel label_3,magana;
	Patient_pan patien=new Patient_pan();
	compte_pan compte=new compte_pan();
	
	private JTable table;
	private JLabel lblNewLabel_4,lblNewLabel_3 , lblSalleDattente, lblStatistiques;
	
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
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
			@Override
			public void windowActivated(WindowEvent e) {
				RDV.ListerRDV(table);//rdv
				try {
					Patient_pan.table.setModel(Helper.buildTableModel(Patient.all()));
					lblNewLabel_4 .setText("   Rendez vous  "+(RDV.countrdv()));
					lblNewLabel_3.setText(" Nombre Patients  "+(RDV.countpatient()));
					 lblSalleDattente.setText("    Salle d'Attente "+RDV.countSA(format.format(date)));
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 773, 302);
		AcceuilPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		 lblNewLabel_4 = new JLabel("   Rendez vous  "+(RDV.countrdv()));
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_4.setIcon(new ImageIcon("ressources\\icons8-health-checkup-30.png"));
		lblNewLabel_4.setBounds(654, 394, 185, 39);
		AcceuilPanel.add(lblNewLabel_4);
		
		 lblNewLabel_3 = new JLabel(" Nombre Patients  "+(RDV.countpatient()));
		lblNewLabel_3.setIcon(new ImageIcon("ressources\\icons8-appointment-scheduling-30.png"));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_3.setBounds(431, 394, 185, 39);
		AcceuilPanel.add(lblNewLabel_3);
		
		
		
		 lblSalleDattente = new JLabel("    Salle d'Attente "+RDV.countSA(format.format(date)));
		lblSalleDattente.setIcon(new ImageIcon("ressources\\icons8-waiting-room-30.png"));
		lblSalleDattente.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblSalleDattente.setBounds(205, 394, 185, 39);
		AcceuilPanel.add(lblSalleDattente);
		
		
		JLabel lblConsultations = new JLabel("  Consultations  ");
		lblConsultations.setIcon(new ImageIcon("ressources\\icons8-counselor-30.png"));
		lblConsultations.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblConsultations.setBounds(10, 394, 185, 39);
		AcceuilPanel.add(lblConsultations);
		
		JLabel outlookLabel = new JLabel("");
		outlookLabel.setIcon(new ImageIcon("ressources\\outlook.png"));
		outlookLabel.setBounds(793, 196, 63, 39);
		AcceuilPanel.add(outlookLabel);
		
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
		
		magana = new JLabel("");
		magana.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		magana.setBounds(460, 13, 394, 57);
		panel_1.add(magana);
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
			//	lblNewLabel_1.setOpaque(true);
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
				//lblNewLabel_1.setOpaque(true);
				panel_1.add(compte);
				compte.actualiser();
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
				RDV.ListerRDV(table);
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
		lblMonCompte.setBounds(12, 293, 205, 49);
		panel.add(lblMonCompte);
		lblPatient.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		
		lblPatient.setIcon(new ImageIcon("ressources\\icons8-\u00EAtre-malade-36.png"));
		lblPatient.setHorizontalAlignment(SwingConstants.LEFT);
		lblPatient.setBounds(12, 223, 205, 49);
		panel.add(lblPatient);
		
		
		
		Thread clock = new Thread() {
		    @Override
		    public void run() {
		        while (true) { magana.setText(sa3a());
		     
		  
		            try {
		                sleep(500); 
		            } catch (InterruptedException ie) {
		            }
		        }
		    }
		};
		clock.start();
	}
	
	public static String sa3a() {
		java.util.Date date1=new java.util.Date();
		java.util.GregorianCalendar calendar = new GregorianCalendar();
		java.util.Date time  = calendar.getTime();
		String f= ""+time;
      
        return f;
	}
	
	}
