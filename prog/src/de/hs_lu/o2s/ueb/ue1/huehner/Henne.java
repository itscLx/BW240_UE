package de.hs_lu.o2s.ueb.ue1.huehner;

public class Henne {

	

	/**
	 * Deklaration von Variablen 
	 */
	
	
	String name;
	Ei ei;
	
	/**
	 * 
	 * @param name Name der Henne
	 * @param ei Objekt wird entgegen genommen
	 */
	public Henne(String name, Ei ei){
		// TODO Auto-generated constructor stub
		this.name = name;
		this.ei = ei;
	}

	
	/**
	 * toString Methode mit zugriff auf toString von Klasse Ei.
	 */

	public String toString() {
		return "Henne mit Namen " + this.getName() + " und Ei mit " + ei.toString();
	}
	
	
	
	
	/**
	 * GETTER AND SETTER
	 */
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Ei getEi() {
		return ei;
	}


	public void setEi(Ei ei) {
		this.ei = ei;
	}
	
	
	
	
	
	
}
