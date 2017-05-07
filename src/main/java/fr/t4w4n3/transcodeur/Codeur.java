package fr.t4w4n3.transcodeur;

import java.util.List;

import fr.t4w4n3.firetongue.javanais.Mot;
import fr.t4w4n3.firetongue.javanais.Phrase;
import fr.t4w4n3.firetongue.javanais.PhraseElement;

public abstract class Codeur implements Processeur {
	protected Message messageIn;
	protected Message messageOut;
	protected Key key;

}