package fr.t4w4n3.firetongue.javanais;

import java.util.List;

import fr.t4w4n3.transcodeur.Decodeur;

public class DecodeurJavanais extends Decodeur {
	
	protected String one(String in) {
		return in;

	}

	public Phrase process(Phrase phrase) {
		List<PhraseElement> phraseElement = phrase.getPhraseElements();
		for (int i = 0; i < phraseElement.size(); i ++) {
			if (phraseElement.get(i) instanceof Mot) {
				phrase.setPhraseElement(i, one(phraseElement.get(i).getContenu()));
			}
		}

		return phrase;
	}

}