package fr.t4w4n3.firetongue.application;

import fr.t4w4n3.firetongue.javanais.Phrase;
import fr.t4w4n3.firetongue.javanais.TranscodeurJavanais;
import fr.t4w4n3.transcodeur.Message;
import fr.t4w4n3.transcodeur.Transcodeur;

public class Application {

	public static void main(String[] args) {
		TranscodeurJavanais transcodeurJavanais = new TranscodeurJavanais();
		/*Object object = new Phrase(args[1]);
		Message message = (Message) object;
		Phrase phrase = (Phrase) message;*/
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