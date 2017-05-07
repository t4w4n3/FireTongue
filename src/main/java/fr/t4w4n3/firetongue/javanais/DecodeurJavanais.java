package fr.t4w4n3.firetongue.javanais;

import java.util.List;

import fr.t4w4n3.transcodeur.Decodeur;
import fr.t4w4n3.transcodeur.Message;

public class DecodeurJavanais extends Decodeur {
	private String parasite;

	protected Mot one(Mot mot) {
		String motFrancais;
		motFrancais = mot.getContenu().replaceAll("(?iu)" + parasite + "([aeiouyéàèùâêîôû])", "$1");
		mot.setContenu(motFrancais);
		return mot;

	}

	protected Mot two(Mot mot) {

		return mot;

	}

	public DecodeurJavanais() {
		this.parasite = TranscodeurJavanais.getParasite();
	}

	public Mot sortSteps(Object mot) {
		Mot one = one((Mot) mot);
		return one;
	}

	public Message process(Message phrase) {
		List<PhraseElement> phraseElement = ((Phrase) phrase).getPhraseElements();
		for (int i = 0; i < phraseElement.size(); i++) {
			if (phraseElement.get(i) instanceof Mot) {
				phraseElement.set(i, sortSteps(phraseElement.get(i)));
			}
		}

		return phrase;
	}

}