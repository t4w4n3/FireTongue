package fr.t4w4n3.firetongue.javanais;

import java.util.List;

import fr.t4w4n3.transcodeur.Codeur;
import fr.t4w4n3.transcodeur.Message;

public class CodeurJavanais extends Codeur {

	protected String one(String in) {

		return in;

	}
	protected String two(String in) {

		return in;

	}

	public String sortSteps(String in) {
		String one = one(in);
		String two = two(one);
		return two;
	}

	public Message process(Message phrase) {
		List<PhraseElement> phraseElement = ((Phrase) phrase).getPhraseElements();
		for (int i = 0; i < phraseElement.size(); i++) {
			if (phraseElement.get(i) instanceof Mot) {
				((Phrase) phrase).setPhraseElement(i, sortSteps(phraseElement.get(i).getContenu()));
			}
		}

		return phrase;
	}

}