package fr.t4w4n3.firetongue.javanais;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import fr.t4w4n3.transcodeur.Codeur;
import fr.t4w4n3.transcodeur.Decodeur;
import fr.t4w4n3.transcodeur.Transcodeur;

public class TranscodeurJavanais implements Transcodeur {
	private Codeur codeur;
	private Decodeur decodeur;

	public TranscodeurJavanais() {
		this.setCodeur(new CodeurJavanais());
		this.setDecodeur(new DecodeurJavanais());
	}

	public CodeurJavanais getCodeur() {
		return (CodeurJavanais) this.codeur;
	}

	public DecodeurJavanais getDecodeur() {
		return (DecodeurJavanais) this.decodeur;
	}

	public void setCodeur(Codeur codeur) {
		this.codeur = codeur;
	}

	public void setDecodeur(Decodeur decodeur) {
		this.decodeur = decodeur;
	}

	public static String getParasite() {
		Properties prop = new Properties();
		InputStream input = null;
		String result = "av";
		try {

			String filename = "config.properties";
			input = TranscodeurJavanais.class.getClassLoader().getResourceAsStream(filename);

			if (input != null) {
				prop.load(input);

				// get the property value and print it out
				result = prop.getProperty("parasite");
			} else {
				throw new IOException();
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
		return result;

	}

}