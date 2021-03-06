package fr.t4w4n3.firetongue.application;

import fr.t4w4n3.firetongue.javanais.Phrase;
import fr.t4w4n3.firetongue.javanais.TranscodeurJavanais;
import fr.t4w4n3.transcodeur.Message;

public class Application {

	public static void main(String[] args) {
		TranscodeurJavanais transcodeurJavanais = new TranscodeurJavanais();
		Phrase phrase = new Phrase(args[1]);
		if (args[0].equals("c")) {
			Message result = transcodeurJavanais.getCodeur().process(phrase);
			System.out.println(result.toString());
		} else if (args[0].equals("d")) {
			Message result = transcodeurJavanais.getDecodeur().process(phrase);
			System.out.println(result.toString());
		}
		
	}
}