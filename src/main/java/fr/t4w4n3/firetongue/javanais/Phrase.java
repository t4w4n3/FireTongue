package fr.t4w4n3.firetongue.javanais;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.t4w4n3.transcodeur.Message;

public class Phrase extends Message {
	private List<PhraseElement> phraseElements = new ArrayList<PhraseElement>();

	public List<PhraseElement> getPhraseElements() {
		return phraseElements;
	}

	public void setPhraseElement(int index, PhraseElement phraseElement) {
		this.phraseElements.set(index, phraseElement);
	}

	public PhraseElement getPhraseElement(int index) {
		return phraseElements.get(index);
	}

	public PhraseElement getElementType(String element) {
		return null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (PhraseElement phraseElement : this.phraseElements) {
			sb.append(phraseElement.getContenu());
		}
		return sb.toString();
	}

	public Phrase(String message) {
		String[] elements = message.split("(?<=[\\W]+)|(?>=[\\W]+)|(?=[\\W]+)");
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher;
		for (String element : elements) {
			matcher = pattern.matcher(element);
			if (matcher.matches()) {
				this.phraseElements.add(new Mot(element));
			} else {
				this.phraseElements.add(new Ponctuation(element));
			}
		}
	}

}