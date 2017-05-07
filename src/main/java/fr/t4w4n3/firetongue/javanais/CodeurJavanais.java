package fr.t4w4n3.firetongue.javanais;

import java.util.List;

import fr.t4w4n3.transcodeur.Codeur;
import fr.t4w4n3.transcodeur.Message;

public class CodeurJavanais extends Codeur {
	private String parasite;

	protected String insertParasiteAvantVoyelles(String in) {
		// Pattern pattern = Pattern.compile("\\w+");
		// Matcher matcher;
		in = in.replaceAll("([aeiouy])", this.parasite + "$1");
		return in;

	}

	protected String two(String in) {

		return in;

	}

	public CodeurJavanais() {
		this.parasite = TranscodeurJavanais.getParasite();
	}

	public String sortSteps(String in) {
		String one = insertParasiteAvantVoyelles(in);
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