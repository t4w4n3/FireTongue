package fr.t4w4n3.firetongue.javanais;

import java.util.ArrayList;
import java.util.List;

import fr.t4w4n3.transcodeur.Codeur;
import fr.t4w4n3.transcodeur.Message;

public class CodeurJavanais extends Codeur {
	private String parasite;

	protected Mot insertParasiteAvantVoyelles(Mot mot) {
		String motJavanais;
		motJavanais = mot.getContenu().replaceAll("(?iu)([^aeiouyéàèùâêîôû])([aeiouyéàèùâêîôû])",
				"$1" + parasite + "$2");
		motJavanais = motJavanais.replaceAll("(?iu)^([aeiouyéàèùâêîôû])", "1" + parasite + "$1");
		mot.setContenu(motJavanais);
		return mot;
	}

	protected Mot insertParasiteY(Mot mot) {
		return mot;
	}

	public CodeurJavanais() {
		this.parasite = TranscodeurJavanais.getParasite();
	}

	public Mot sortSteps(Object mot) {
		Mot one = insertParasiteAvantVoyelles((Mot) mot);
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