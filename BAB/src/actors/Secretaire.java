package actors;

import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

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
}
