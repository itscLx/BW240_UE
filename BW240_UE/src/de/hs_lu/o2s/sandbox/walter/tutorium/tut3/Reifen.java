package de.hs_lu.o2s.sandbox.walter.tutorium.tut3;

public class Reifen {

	/**
	 * deklaration variablen
	 */
	
	double reifenbreite;
	int felgengroessee;
	String reifentyp;
	
	
	
	/**
	 * Konstruktoren
	 */
	public Reifen() {

	}
	
	public Reifen(double reifenbreite, int felgengroesse, String reifentyp) {

		this.reifenbreite = reifenbreite;
		this.felgengroessee = felgengroesse;
		this.reifentyp = reifentyp;
	}

	
	

	
	
	
	
	/**
	 * toString
	 */
	
	@Override
	public String toString() {
		return "reifenbreite=" + reifenbreite + ", felgengröße=" + felgengroessee + "";
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


	public int getFelgengroessee() {
		return felgengroessee;
	}


	public void setFelgengroessee(int felgengroessee) {
		this.felgengroessee = felgengroessee;
	}
	
	
	
	
	
}
