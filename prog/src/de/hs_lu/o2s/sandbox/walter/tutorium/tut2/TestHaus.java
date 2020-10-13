package de.hs_lu.o2s.sandbox.walter.tutorium.tut2;

import junit.framework.TestCase;

public class TestHaus extends TestCase {

	public void testHaus(){
		
		Haus h1 = new Haus("Gutleuthausstrasse", 4, 10, 1000.99);
		System.out.println(h1.toString());
	
		assertEquals(4, h1.getEtagen());
		
	}
	
	public void testVerkaufspreis() {
		Haus h1 = new Haus();
		h1.setGrundstuecksFlaeche(500.0);
		double vk = h1.berechneVerkaufspreis(10.00);
		assertEquals((500.0*10.00), vk);
	}
	
}
