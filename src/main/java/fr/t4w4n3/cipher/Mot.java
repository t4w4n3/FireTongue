package fr.t4w4n3.cipher;

public class Mot {
	private String contenu = "";
	private int index;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;

	}

	public boolean estFrancais() {
		if (this.contenu == "") {
			return true;
		}
		return false;
	}

	public Mot(String contenu, int index) {
		this.contenu = contenu;
		this.index = index;
	}
}