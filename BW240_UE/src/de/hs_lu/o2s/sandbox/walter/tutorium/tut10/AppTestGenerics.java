package de.hs_lu.o2s.sandbox.walter.tutorium.tut10;

import java.util.HashMap;

public class AppTestGenerics {

	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		Obst o1 = new Obst("17.12", 2.99, "Aepfel");
		Gemuese g1 = new Gemuese("11.12", 1.44, "Bohnen");
		h1.put(o1.getName(), o1);
		h1.put(g1.getName(), g1);
		
		Supermarkt s1 = new Supermarkt();
		s1.setName("Aldi");
		
		
		Supermarkt s2 = new Supermarkt();
		s2.setName("Globus");
		Supermarkt s3 = new Supermarkt();
		s3.setName("Penny");
		
		Grossmarkt maerkte = new Grossmarkt();
		maerkte.put("1b", s1);
		maerkte.put("3a", s2);
		maerkte.put("2c", s3);
		
		System.out.println("Grossmarkt vor Veränderung");
		System.out.println(maerkte);
		
		Grossmarkt shalloGrossmarkt = maerkte.shallowCopy();
		
		System.out.println("Shallow - Grossmarkt vor Veränderung");
		System.out.println(shalloGrossmarkt);
		
		s1.setName("REWE");
		
		System.out.println("Grossmarkt nach Veränderung");
		System.out.println(maerkte);
		
		
		System.out.println("Shallow - Grossmarkt nach Veränderung");
		System.out.println(shalloGrossmarkt);
		
		
		System.out.println("-------------DEEPCOPY------------------");
		
		System.out.println("Grossmarkt vor Veränderung");
		System.out.println(maerkte);
		
		Grossmarkt deepGrossmarkt = maerkte.deepCopy();
		
		System.out.println("Deep - Grossmarkt vor Veränderung");
		System.out.println(deepGrossmarkt);
		
		s2.setName("WASGAU");
		
		System.out.println("Grossmarkt nach Veränderung");
		System.out.println(maerkte);
		
		
		System.out.println("Deep - Grossmarkt nach Veränderung");
		System.out.println(deepGrossmarkt);
		
	}

}
