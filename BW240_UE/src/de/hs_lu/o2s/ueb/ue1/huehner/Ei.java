package de.hs_lu.o2s.ueb.ue1.huehner;

public class Ei {

	

	/**
	 * Deklaration von Variablen 
	 */
	
	
	String farbe;
	double groesse;
	
	
	/**
	 * Konstruktor
	 * @param farbe Farbe des Ei's
	 * @param groesse Größe des Ei's
	 */
	
	public Ei(String farbe, double groesse) {
		// TODO Auto-generated constructor stub
		this.farbe = farbe;
		this.groesse = groesse;
	}
	
	
	/**
	 * Methode toString welche Farbe und Größe in String umwandelt.
	 */
	
	public String toString() {
		return "Farbe " + this.getFarbe() + " und Größe " + this.getGroesse();
	}
	
	
	
	/**
	 *	GETTER AND SETTER 
	 */
	
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public double getGroesse() {
		return groesse;
	}
	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}
	
	
	
	
}
