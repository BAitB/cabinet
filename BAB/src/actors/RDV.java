package actors;

  import DataBase.JDBC;
  import DataBase.Helper;
  import Interfaces.RDV_PAN;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;


public class RDV {
	String cinM;
	String cinP;
	Date date;
	String description;
	

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
		java.sql.Connection con=JDBC.getConnection();
		String req="select cinP from patient ";
		c.removeAllItems();
		try {
			java.sql.Statement stm=(java.sql.Statement) con.createStatement();
			ResultSet rs=stm.executeQuery(req);
			while(rs.next())
			{
				c.addItem(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ListeCINMedecin(JComboBox c){
		java.sql.Connection con=JDBC.getConnection();
		String req1="select cinM from medecin ";
		c.removeAllItems();
		try {
			java.sql.Statement stm=(java.sql.Statement) con.createStatement();
			ResultSet rs1=stm.executeQuery(req1);
			while(rs1.next())
			{
				c.addItem(rs1.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void ListeCINSecretaire(JComboBox cc){
		java.sql.Connection con=JDBC.getConnection();
		String req2="select cinS from secretaire ";
		cc.removeAllItems();
		try {
			java.sql.Statement stm=(java.sql.Statement) con.createStatement();
			ResultSet rs2=stm.executeQuery(req2);
			while(rs2.next())
			{
				cc.addItem(rs2.getString(1));
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
	
	
}
