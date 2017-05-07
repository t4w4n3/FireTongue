package fr.t4w4n3.firetongue.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.t4w4n3.firetongue.javanais.CodeurJavanais;
import fr.t4w4n3.firetongue.javanais.Mot;

public class CodeurJavanaisTest {

	@Test
	public final void testInsertParasiteAvantVoyelles() {
		CodeurJavanais codeurJavanais = new CodeurJavanais();
		List<Mot> mots = new ArrayList<Mot>();
		mots.add(new Mot("bonjour"));
		mots.add(new Mot("chante"));
		mots.add(new Mot("moyen"));
		mots.add(new Mot("exemple"));
		mots.add(new Mot("au"));
		String motJavanais;
		motJavanais = codeurJavanais.insertParasiteAvantVoyelles(mots.get(0)).getContenu();
		assertEquals("Insert parasit in \"bonjour\"", motJavanais, "bavonjavour");
		assertEquals("Insert parasit in \"chante\"", motJavanais, "chavantave");
		assertEquals("Insert parasit in \"moyen\"", motJavanais, "mavoyen");
		assertEquals("Insert parasit in \"exemple\"", motJavanais, "chavantave");
		assertEquals("Insert parasit in \"au\"", motJavanais, "chavantave");

	}
}
