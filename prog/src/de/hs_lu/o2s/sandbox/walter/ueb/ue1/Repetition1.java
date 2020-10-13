package de.hs_lu.o2s.sandbox.walter.ueb.ue1;

import java.awt.print.Printable;

import de.hs_lu.o2s.ueb.ue1.huehner.Ei;
import de.hs_lu.o2s.ueb.ue1.huehner.Henne;

public class Repetition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My first Java Repetition!");
		
		Adresse ad1 = new Adresse("Gutleuthausstraße", "20", "67433", "Neustadt", "Rheinland-Pfalz", "Deutschland");
		
		Ei ei = new Ei("braun", 5.0);
		Henne berta = new Henne("Berta", ei);
		
		
		
		
		
System.out.println(ad1.toString());		


System.out.println(ad1.liegtInRLP());


Person p1 = new Person("Christian", "Walter", ad1);
System.out.println(p1.toString());


System.out.println(berta.toString());
	}

}
