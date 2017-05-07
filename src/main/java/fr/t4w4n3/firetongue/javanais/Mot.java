package fr.t4w4n3.firetongue.javanais;

public class Mot extends PhraseElement {

	public Mot(String contenu) {
		super(contenu);
	}

	public void setContenu(String contenu) {
		char firstChar = getContenu().charAt(0);
		if (Character.isUpperCase(firstChar)) {
			super.setContenu(contenu.substring(0, 1).toUpperCase() + contenu.substring(1).toLowerCase());
		} else {
			super.setContenu(contenu);
		}

	}
}