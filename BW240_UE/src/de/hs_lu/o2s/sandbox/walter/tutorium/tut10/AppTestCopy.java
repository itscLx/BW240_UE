package de.hs_lu.o2s.sandbox.walter.tutorium.tut10;

import java.awt.datatransfer.DataFlavor;

public class AppTestCopy {

	public static void main(String[] args) {
		Supermarkt m1 = new Supermarkt();
		m1.setName("LIDL");
		m1.setKundenanzahl(100);
		System.out.println("M1 vorher");
		System.out.println(m1);
		Supermarkt shallowSP = m1.deepCopy();
		System.out.println("M1 shallow vorher");
		System.out.println(shallowSP);
		
		m1.setName("ALDI");
		
		System.out.println("M1 nach Änderung");
		System.out.println(m1);
		System.out.println("M1 shallow nach Änderung");
		System.out.println(shallowSP);
		
		System.out.println("---------------DEEP COPY--------------");
		System.out.println("M1 Vorher");
		System.out.println(m1);
		
	}

}
