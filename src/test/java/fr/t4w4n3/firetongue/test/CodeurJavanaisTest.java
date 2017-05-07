package fr.t4w4n3.firetongue.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.t4w4n3.firetongue.javanais.CodeurJavanais;
import fr.t4w4n3.firetongue.javanais.Mot;
import fr.t4w4n3.firetongue.javanais.Phrase;
import fr.t4w4n3.firetongue.javanais.PhraseElement;

public class CodeurJavanaisTest{
	public final void testInsertParasiteAvantVoyelles(){
		CodeurJavanais codeurJavanais = new CodeurJavanais();
		List<Mot> mots = new ArrayList<Mot>();
		mots.add(new Mot("bonjour"));
		mots.add(new Mot("chante"));
		mots.add(new Mot("moyen"));
		mots.add(new Mot("exemple"));
		mots.add(new Mot("au"));
		String motJavanais;
		for (Mot mot : mots){
			motJavanais = codeurJavanais.insertParasiteAvantVoyelles(mot);
		}
		
	}
}