/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.tutorium.tut8;

import junit.framework.TestCase;

/**
 * @author christianwalter
 *
 * @since 17.11.2020
 */
public class TestCollection extends TestCase {

	public void testGemuesegeschaeft() {
		Gemuese g1 = new Gemuese();
		Gemuese g2 = new Gemuese();
		Obst o1 = new Obst();
		Gemüsegeschäft ge1 = new Gemüsegeschäft();
		assertTrue(ge1.add(g2));
	}
	
	public void testObstladen() {
		Obst o1 = new Obst();
		Obst o2 = new Obst();
		Obststand oe1 = new Obststand();
		assertTrue(oe1.add(o2));
	}
	
	
}
