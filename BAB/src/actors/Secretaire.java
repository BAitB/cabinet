package actors;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

import DataBase.Helper;
import DataBase.JDBC;

public class Secretaire {
	String nomS;
	String prenomS;
	String cinS;
	String telS;
	String login;
	String password;
	public Secretaire(String nomS, String prenomS, String cinS, String telS) {
		super();
		this.nomS = nomS;
		this.prenomS = prenomS;
		this.cinS = cinS;
		this.telS = telS;
	}
	public String getNomS() {
		return nomS;
	}
	public void setNomS(String nomS) {
		this.nomS = nomS;
	}
	public String getPrenomS() {
		return prenomS;
	}
	public void setPrenomS(String prenomS) {
		this.prenomS = prenomS;
	}
	public String getCinS() {
		return cinS;
	}
	public void setCinS(String cinS) {
		this.cinS = cinS;
	}
	public String getTelS() {
		return telS;
	}
	public void setTelS(String telS) {
		this.telS = telS;
	}
   public static int getProfil(String login,String password)
   {
	   int resultat=-1;
	   String req="select profil from authentification where login='"+login+"'and password='"+password+"'";
	   try {
			java.sql.Connection conn =JDBC.getConnection();
			Statement stm;
			stm=(Statement) conn.createStatement();
			ResultSet rs=stm.executeQuery(req);
			rs.next();
			int profil=rs.getInt(1);
			resultat=profil;
			}
			catch(Exception e1)
   		{
   			e1.printStackTrace();
   			System.out.println("mal9ithach");
   		}
	   return resultat;
   }
   
   public static void chercher(String txt,JTable table) {

		
		String req="SELECT * FROM patient join rdv on patient.cinP=rdv.cinP where nomP LIKE '"+txt+"%'";
		try {
			java.sql.Connection con=JDBC.getConnection();
		java.sql.Statement stm=(java.sql.Statement) con.createStatement();
		ResultSet rs=stm.executeQuery(req);
		DefaultTableModel dtm=Helper.buildTableModel(rs);
		table.setModel(dtm);
		}
		catch(SQLException e){ e.printStackTrace();}
	}
}
