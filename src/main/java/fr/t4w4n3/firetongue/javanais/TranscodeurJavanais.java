package fr.t4w4n3.firetongue.javanais;

import fr.t4w4n3.transcodeur.Codeur;
import fr.t4w4n3.transcodeur.Decodeur;
import fr.t4w4n3.transcodeur.Transcodeur;

public class TranscodeurJavanais implements Transcodeur {
	private Codeur codeur;
	private Decodeur decodeur;

	public TranscodeurJavanais() {
		this.setCodeur(new CodeurJavanais());
		this.setDecodeur(new DecodeurJavanais());
	}

	public CodeurJavanais getCodeur() {
		return (CodeurJavanais) this.codeur;
	}

	public DecodeurJavanais getDecodeur() {
		return (DecodeurJavanais) this.decodeur;
	}

	public void setCodeur(Codeur codeur) {
		this.codeur = codeur;
	}

	public void setDecodeur(Decodeur decodeur) {
		this.decodeur = decodeur;
	}

}