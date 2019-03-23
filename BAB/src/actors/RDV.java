package actors;

  import DataBase.JDBC;
  import DataBase.Helper;
  import Interfaces.RDV_PAN;
  

import java.util.Date;

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

	public static void ListerRDV() {
		
	
}
}
