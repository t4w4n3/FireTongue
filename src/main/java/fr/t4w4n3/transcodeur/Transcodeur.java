package fr.t4w4n3.transcodeur;

public abstract class Transcodeur {
	private Codeur codeur;
	private Decodeur decodeur;

	public void setCodeur(Codeur codeur) {
		this.codeur = codeur;
	}

	public void setDecodeur(Decodeur decodeur) {
		this.decodeur = decodeur;
	}

	public Decodeur getDecodeur() {
		return decodeur;
	}

	public Codeur getCodeur() {
		return codeur;
	}

	public Transcodeur() {

	}

}