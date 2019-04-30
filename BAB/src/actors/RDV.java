package actors;

  import DataBase.JDBC;
  import DataBase.Helper;
  import Interfaces.RDV_PAN;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import com.mysql.jdbc.Statement;


public class RDV {
	String cinM;
	String cinP;
	Date date;
	String description;
	public static HashMap   hP,hM,hS;
	

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCinM() {
		return cinM;
	}
	public void setCinM(String cinM) {
		this.cinM = cinM;
	}
	public String getCinP() {
		return cinP;
	}
	public void setCinP(String cinP) {
		this.cinP = cinP;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public RDV(String cinM, String cinP, Date date) {
		super();
		this.cinM = cinM;
		this.cinP = cinP;
		this.date = date;
	}
	
	public static void ListerRDV(JTable table) {

		
		String req="select * from rdv ";
		try {
			java.sql.Connection con=JDBC.getConnection();
		java.sql.Statement stm=(java.sql.Statement) con.createStatement();
		ResultSet rs=stm.executeQuery(req);
		DefaultTableModel dtm=Helper.buildTableModel(rs);
		table.setModel(dtm);
		}
		catch(SQLException e){ e.printStackTrace();}
	}
	public static void ListeCINPatient(JComboBox c){
		int indice=0;
		hP=new HashMap();
		c.removeAllItems();
		java.sql.Connection con=JDBC.getConnection();
		String req="select nomP, cinP from patient ";
		try {
			java.sql.Statement stm=(java.sql.Statement) con.createStatement();
			ResultSet rs=stm.executeQuery(req);
			while(rs.next())
			{
				c.addItem(rs.getString(1) +" - "+rs.getString(2));
			    hP.put(indice, rs.getString(2));
				indice++;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ListeCINMedecin(JComboBox c){
		int indice=0;
		hM=new HashMap();
		java.sql.Connection con=JDBC.getConnection();
		String req1="select nomM, cinM from medecin ";
		c.removeAllItems();
		try {
			java.sql.Statement stm=(java.sql.Statement) con.createStatement();
			ResultSet rs1=stm.executeQuery(req1);
			while(rs1.next())
			{
				c.addItem(rs1.getString(1)+" - "+rs1.getString(2));
				hM.put(indice,rs1.getString(2));
				indice++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void ListeCINSecretaire(JComboBox cc){
		int indice=0;
		java.sql.Connection con=JDBC.getConnection();
		String req2="select nomS,cinS from secretaire ";
		hS=new HashMap();
		cc.removeAllItems();
		try {
			java.sql.Statement stm=(java.sql.Statement) con.createStatement();
			ResultSet rs2=stm.executeQuery(req2);
			while(rs2.next())
			{
				cc.addItem(rs2.getString(1)+" - "+rs2.getString(2));
				hS.put(indice,rs2.getString(2));
				indice++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void supprimer(JTextField Fieldid)
	{
		int id =Integer.parseInt(Fieldid.getText());
		String req3="delete from rdv where idRDV='"+id+"'";
		java.sql.Connection con=JDBC.getConnection();
		try {
		Statement stm=(Statement) con.createStatement();
		stm.executeUpdate(req3);
		
		
		}catch(SQLException ee){ ee.printStackTrace();}
		
		RDV_PAN.ListerButton.doClick();
	
	}
	public static void Ajouter(JComboBox cm,JComboBox cp,JComboBox cs,JTextField d,JTextArea des)
	{
		int idp=cp.getSelectedIndex();
		int ids=cs.getSelectedIndex();
		int idm=cm.getSelectedIndex();
		String CINM=(String) hM.get(idm);
		String CINS=(String) hS.get(ids);
		String CINP=(String) hP.get(idp);
		String dt=d.getText();
		String ds=des.getText();
		String req="Insert into rdv values('"+CINM+"','"+CINP+"','"+CINS+"','"+dt+"','"+ds+"',NULL)";
		java.sql.Connection co=JDBC.getConnection();
		try {
		Statement stm=(Statement) co.createStatement();
		stm.executeUpdate(req);
		
		}catch(SQLException ee){ ee.printStackTrace();}
		RDV_PAN.ListerButton.doClick();
	}
	
	public static void Modifier(JTextField id,JComboBox cm,JComboBox cp,JComboBox cs,JTextField d,JTextArea des )
	{
		int iden=Integer.parseInt(id.getText());
		int idp=cp.getSelectedIndex();
		int ids=cs.getSelectedIndex();
		int idm=cm.getSelectedIndex();
		String CINM=(String) hM.get(idm);
		String CINS=(String) hS.get(ids);
		String CINP=(String) hP.get(idp);
		String dt=d.getText();
		String ds=des.getText();
		String req="UPDATE rdv SET cinM='"+CINM+"',cinP='"+CINP+"',cinS='"+CINS+"',date='"+dt+"',description='"+ds+"' where idRDV='"+iden+"'";
		java.sql.Connection co=JDBC.getConnection();
		try {
			Statement stm=(Statement) co.createStatement();
			 stm.executeUpdate(req);
		}catch(SQLException ee){ ee.printStackTrace();}
		RDV_PAN.ListerButton.doClick();
	}
	public static void Filter(String valR,JTable table)
	{
		
		String req="SELECT * FROM `rdv` WHERE concat(`cinM`, `cinP`, `cinS`, `date`, `description`, `idRDV`) LIKE '%"+valR+"%'";
		java.sql.Connection co=JDBC.getConnection();
		try {
		Statement stm=(Statement) co.createStatement();
		ResultSet rs=stm.executeQuery(req);
		DefaultTableModel dtm=Helper.buildTableModel(rs);
		table.setModel(dtm);
		
		}catch(SQLException ee){ ee.printStackTrace();}
		
		RDV_PAN.ListerButton.doClick();
	
	}
	public static void  FiltereJcomboBox(JComboBox c)
	{
		c.setSelectedItem(" ");
		AutoCompleteDecorator.decorate(c);
	}
	
	public static void RetelechergerCombobox(String CIN,HashMap h,JComboBox cm)  //cette fonction consistait a retelecharger le contenu des combobox apres la selection d'un enregistrement danq Jtable
	{
		for(int i=0;i<RDV.hM.size();i++)
		{
			if(CIN.equals(h.get(i)))
			{
				cm.setSelectedIndex(i);
			}
		}
	}
	
	
}
