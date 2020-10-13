package de.hs_lu.o2s.sandbox.walter.ueb.ue1;

import junit.framework.TestCase;

public class TestPerson extends TestCase {

	public void testAdressenPerson() {
		Adresse adr1 = new Adresse("Gruener Weg", "12", "67434", "Neustadt/Weinstr.", "Rheinland-Pfalz", "Deutschland");
		Adresse adr2 = new Adresse("Ernst-Boehe-Str.", "4", "67059", "Ludwigshafen am Rhein", "Rheinland-Pfalz", "Deutschland");
		
		System.out.println(adr1.toString() + "\n\n" + adr2.toString() + "\n");
		
		Person person1 = new Person("Arthur", "Clarke");
		person1.setAdresse(adr1);
		
		Person person2 = new Person("Peter", "Mudra", adr2);
		
		Person person3 = new Person("Thomas", "Schüssler", new Adresse("Paul-Wittsack-Straße", "10", "68163", "Mannheim", "Baden-Würrtemberg", "Deutschland"));
		
		person2.setBeruf("Lehrer");
		person2.setBerufstaetig(true);
		
		person3.setBeruf("Lehrer");
		person3.setBerufstaetig(true);
		person3.setGeburtsjahr(1995);
		
		System.out.println(person1.toString() + "\n\n" + person2.toString() + "\n\n" + person3.toString());
		
		
		
	}
	
	
	public void testGeburtsjahr() {
		
		Person person = new Person("Christian", "Müller", new Adresse("Landauer-Straße", "123", "67433", "Neustadt", "Rheinland-Pfalz", "Deutschland"));
		
		person.setGeburtsjahr(1980);
		
		assertEquals(1980, person.getGeburtsjahr());
	}
	
	
}
