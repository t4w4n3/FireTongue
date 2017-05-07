package fr.t4w4n3.firetongue.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.t4w4n3.firetongue.javanais.CodeurJavanais;
import fr.t4w4n3.firetongue.javanais.Mot;

public class CodeurJavanaisTest {

	@Test
	public final void testInsertParasiteAvantVoyelles() {
		CodeurJavanais codeurJavanais = new CodeurJavanais();
		String motJavanais;
		motJavanais = codeurJavanais.insertParasiteAvantVoyelles(new Mot("bonjour")).getContenu();
		assertEquals("Insert parasit in \"bonjour\"", motJavanais, "bavonjavour");
		motJavanais = codeurJavanais.insertParasiteAvantVoyelles(new Mot("chante")).getContenu();
		assertEquals("Insert parasit in \"chante\"", motJavanais, "chavantave");
		motJavanais = codeurJavanais.insertParasiteAvantVoyelles(new Mot("moyen")).getContenu();
		assertEquals("Insert parasit in \"moyen\"", motJavanais, "mavoyen");
		motJavanais = codeurJavanais.insertParasiteAvantVoyelles(new Mot("exemple")).getContenu();
		assertEquals("Insert parasit in \"exemple\"", motJavanais, "avexavemplave");
		motJavanais = codeurJavanais.insertParasiteAvantVoyelles(new Mot("au")).getContenu();
		assertEquals("Insert parasit in \"au\"", motJavanais, "avau");
		motJavanais = codeurJavanais.insertParasiteAvantVoyelles(new Mot("paravent")).getContenu();
		assertEquals("Insert parasit in \"paravent\"", motJavanais, "pavaravavavent");

	}
}
