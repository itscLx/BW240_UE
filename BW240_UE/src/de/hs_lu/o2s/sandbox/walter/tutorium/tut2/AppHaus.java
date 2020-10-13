package de.hs_lu.o2s.sandbox.walter.tutorium.tut2;

public class AppHaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Haus haus1 = new Haus();
		Haus haus2 = new Haus("Gutleuthausstrasse");
		Haus haus3 = new Haus("Gutleuthausstrasse", 2);
		Haus haus4 = new Haus("Gutleuthausstrasse", 2, 4);
		Haus haus5 = new Haus("Gutleuthausstrasse", 2, 2, 100.00);
		
		
		System.out.println(haus2.toString());
		System.out.println(haus3.toString());
		System.out.println(haus4.toString());
		System.out.println(haus5.toString());
		
		
		
	}

}
