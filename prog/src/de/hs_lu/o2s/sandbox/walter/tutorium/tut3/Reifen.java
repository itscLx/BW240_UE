package de.hs_lu.o2s.sandbox.walter.tutorium.tut3;

public class Reifen {

	/**
	 * deklaration variablen
	 */
	
	double reifenbreite;
	int felgengröße;
	String reifentyp;
	
	
	
	/**
	 * Konstruktoren
	 */
	public Reifen() {

	}
	
	public Reifen(double reifenbreite, int felgengröße, String reifentyp) {

		this.reifenbreite = reifenbreite;
		this.felgengröße = felgengröße;
		this.reifentyp = reifentyp;
	}

	
	

	
	
	
	
	/**
	 * toString
	 */
	
	@Override
	public String toString() {
		return "reifenbreite=" + reifenbreite + ", felgengröße=" + felgengröße + "";
	}






/**
 * 
 * GETTER UND SETTER
 */

	public double getReifenbreite() {
		return reifenbreite;
	}


	public void setReifenbreite(double reifenbreite) {
		this.reifenbreite = reifenbreite;
	}


	public int getFelgengröße() {
		return felgengröße;
	}


	public void setFelgengröße(int felgengröße) {
		this.felgengröße = felgengröße;
	}
	
	
	
	
	
}
