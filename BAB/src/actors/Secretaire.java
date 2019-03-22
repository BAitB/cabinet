package actors;

public class Secretaire {
	String nomS;
	String prenomS;
	String cinS;
	String telS;
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

}
