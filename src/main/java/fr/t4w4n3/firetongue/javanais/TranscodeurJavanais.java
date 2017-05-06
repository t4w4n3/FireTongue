package fr.t4w4n3.firetongue.javanais;

import fr.t4w4n3.transcodeur.Codeur;
import fr.t4w4n3.transcodeur.Decodeur;
import fr.t4w4n3.transcodeur.Transcodeur;

public class TranscodeurJavanais extends Transcodeur {
	
	public TranscodeurJavanais() {
		this.setCodeur(new CodeurJavanais());
		this.setDecodeur(new DecodeurJavanais());
	}

	public Phrase loadInput(String input){
		return null;
	}
}