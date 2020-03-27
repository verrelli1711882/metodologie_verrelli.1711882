package Programmatore;

public class Programmatore {
	private String nome;
	private String cognome;
	private String azienda;
	private String linguaggi;
	
	public Programmatore(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
		azienda="";
		linguaggi="";
	}
	public void setAzienda(String nomeAzienda) {
		azienda=nomeAzienda;
	}
	public void addLinguaggio(String linguaggio) {
		linguaggi+=linguaggio+" ";
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getAzienda() {
		if (azienda.equals("")){return "al momento non lavora";}
		return azienda;
	}
	public String getLinguaggi() {
		if (linguaggi.contentEquals("")) {return "al momento non conosce linguaggi";}
		return linguaggi;
	}
}
