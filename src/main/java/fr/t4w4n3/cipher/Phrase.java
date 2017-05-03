package fr.t4w4n3.cipher;

public class Phrase {
	private Mot[] mot = new Mot[100];

	public Mot[] getMot() {
		return mot;
	}
	
	public void setMot(String[] mots){
		
	}

	public boolean estFrancaise() {
		for (Mot element : mot) {
			if (!element.estFrancais()) {
				return false;
			}
		}
		return true;
	}
}