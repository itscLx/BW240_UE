package de.hs_lu.o2s.sandbox.walter.tutorium.tut3;

public class Auto {

	/**
	 * Deklaration variablen
	 */
	
	String marke, typ;
	int baujahr;
	double neuwagenwert;
	Reifen reifen;
	
	
	/**
	 * 
	 * Konstruktoren
	 */
	public Auto(String marke, String typ, int baujahr, double neuwagenwert) {
		// TODO Auto-generated constructor stub
		
		this.marke = marke;
		this.typ = typ;
		this.baujahr = baujahr;
		this.neuwagenwert = neuwagenwert;
	}
	
	
	public Auto(String marke, String typ, int baujahr, double neuwagenwert, Reifen reifen) {
		// TODO Auto-generated constructor stub
		
		this.marke = marke;
		this.typ = typ;
		this.baujahr = baujahr;
		this.neuwagenwert = neuwagenwert;
		this.reifen = reifen;
		
	}
	
	
	
	
	
	
	/**
	 * toString Methode
	 */
	
	@Override
	public String toString() {
		return "marke=" + marke + ", typ=" + typ + ", baujahr=" + baujahr + ", neuwagenwert=" + neuwagenwert
				+ reifen.toString();
	}
	
	
	/**
	 * 
	 * GETTER UND SETTER
	 */
	
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	public double getNeuwagenwert() {
		return neuwagenwert;
	}
	public void setNeuwagenwert(double neuwagenwert) {
		this.neuwagenwert = neuwagenwert;
	}
	
	
}
