package fr.t4w4n3.firetongue.javanais;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class PhraseElement {
	private String contenu;

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public PhraseElement(String contenu) {
		this.contenu = contenu;
	}

	
}