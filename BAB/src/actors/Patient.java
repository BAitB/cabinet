package actors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;





public class Patient {
	String nomP;
	String prenomP;
	String cinP;
	static LinkedList<RDV> rdv;
	String sexeP;
	int ageP;
	String description;
	String adresseP;
	String telP;
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public String getPrenomP() {
		return prenomP;
	}
	public void setPrenomP(String prenomP) {
		this.prenomP = prenomP;
	}
	public String getCinP() {
		return cinP;
	}
	public void setCinP(String cinP) {
		this.cinP = cinP;
	}
	public static LinkedList<RDV> getRdv() {
		return rdv;
	}
	public Patient(String nomP, String prenomP, String cinP, String sexeP, int ageP, String description,
			String adresseP, String telP) {
		super();
		this.nomP = nomP;
		this.prenomP = prenomP;
		this.cinP = cinP;
		this.sexeP = sexeP;
		this.ageP = ageP;
		this.description = description;
		this.adresseP = adresseP;
		this.telP = telP;
	}
	public static void setRdv(LinkedList<RDV> rdv) {
		Patient.rdv = rdv;
	}
	public String getSexeP() {
		return sexeP;
	}
	public void setSexeP(String sexeP) {
		this.sexeP = sexeP;
	}
	public int getAgeP() {
		return ageP;
	}
	public void setAgeP(int ageP) {
		this.ageP = ageP;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAdresseP() {
		return adresseP;
	}
	public void setAdresseP(String adresseP) {
		this.adresseP = adresseP;
	}
	public String getTelP() {
		return telP;
	}
	public void setTelP(String telP) {
		this.telP = telP;
	}
	public static void insert(String cin,String n, String p, String adresse, String tel, String sexe, int age) {
		String req="Insert into patient values('"+cin+"','"+n+"','"+p+"','"+sexe+"','"+age+"','','"+adresse+"','"+tel+"')";
		Connection conn=DataBase.JDBC.getConnection();
		try {
			
			Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			stmt.executeUpdate(req);
			
			
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
	public static ResultSet all() {
		String req="SELECT * from patient ";
		Connection conn=DataBase.JDBC.getConnection();
		ResultSet rs=null;
		try {
			
			Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=stmt.executeQuery(req);
		
			
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		return rs;

		
	}
	
	public static void Delete(String CIN){
		String req="Delete from patient where cinP='"+CIN+"'";
		Connection conn=DataBase.JDBC.getConnection();
		try {
			
			Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			stmt.executeUpdate(req);
			
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
	}
	
	
}
