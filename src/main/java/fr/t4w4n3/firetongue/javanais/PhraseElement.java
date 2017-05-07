package fr.t4w4n3.firetongue.javanais;

public abstract class PhraseElement {
	private String contenu;

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;		
	}

	public PhraseElement(String contenu) {
		this.contenu = contenu;
	}

}