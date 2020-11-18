package de.hs_lu.o2s.sandbox.walter.tutorium.tut4;

public class AppRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurant r1 = new Restaurant(20.0, 10, "Gutleuthausstrasse 20", 10, 10);
		
		System.out.println(r1.toString());
		
		Haus h1 = r1;
		
		r1.setStrasse("Turmstrasse 1");
		
		System.out.println(h1.toString());
		System.out.println(r1.toString());
		
		h1.setEtagen(12);
		
		System.out.println(h1.toString());
		System.out.println(r1.toString());
		
		Haus h2 = new Haus("Ernst-Boehe-Strasse 4", 3);
		
	
	}

}
