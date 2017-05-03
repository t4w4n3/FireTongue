package fr.t4w4n3.cipher;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

abstract class Processeur {
	String parasite = "";
	private Phrase phraseEntree = new Phrase();
	private Phrase phraseSortie = new Phrase();

	private String getPropertie(String key) {
		Properties prop = new Properties();
		InputStream input = null;
		String value = "";
		try {

			String filename = "config.properties";
			input = Application.class.getClassLoader().getResourceAsStream(filename);
			if (input != null) {
				// load a properties file from class path, inside static method
				prop.load(input);

				// get the property value and print it out
				value = prop.getProperty("parasite");
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return value;
	}

	private void setParasite() {
		this.parasite = getPropertie("parasite");
	}

	public void setphraseEntree(String phrase) {

	}

	public String getphraseEntree(String phrase) {
		return phrase;

	}

	public Processeur() {
		setParasite();
	}
}