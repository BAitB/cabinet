package actors;

public class Medecin{
	private String nomM;
	private String prenomM;
	private String cinM;
	private String specialite;
	private String telM;
	public Medecin(String nomM, String prenomM, String cinM, String specialite, String telM) {
		super();
		this.nomM = nomM;
		this.prenomM = prenomM;
		this.cinM = cinM;
		this.specialite = specialite;
		this.telM = telM;
	}
	public String getNomM() {
		return nomM;
	}
	public void setNomM(String nomM) {
		this.nomM = nomM;
	}
	public String getPrenomM() {
		return prenomM;
	}
	public void setPrenomM(String prenomM) {
		this.prenomM = prenomM;
	}
	public String getCinM() {
		return cinM;
	}
	public void setCinM(String cinM) {
		this.cinM = cinM;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getTelM() {
		return telM;
	}
	public void setTelM(String telM) {
		this.telM = telM;
	}
	
}
