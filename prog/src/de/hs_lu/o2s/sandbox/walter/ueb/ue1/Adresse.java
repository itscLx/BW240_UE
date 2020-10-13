package de.hs_lu.o2s.sandbox.walter.ueb.ue1;

public class Adresse {

	/**
	 * Deklaration von Variablen 
	 */
	
	
	String str, hnr, plz, stadt, bundesland, land;
	
	
	
	/**
	 * 
	 * @param str Straße
	 * @param hnr Hausnummer
	 * @param plz Postleitzahl
	 * @param stadt Stadt
	 * @param bundesland Bundesland
	 * @param land Land
	 */
	public Adresse(String str, String hnr, String plz, String stadt, String bundesland, String land) {

		this.str = str;
		this.hnr = hnr;
		this.plz = plz;
		this.stadt = stadt;
		this.bundesland = bundesland;
		this.land = land;
	
	}
	
	/**
	 * toString Methode wandelt Variablen in String
	 */
	
	public String toString() {
		
		return this.getStr() + " " + this.getHnr() + "\n" +this.getPlz() + " " + this.getStadt() + "\n" + this.getBundesland() + "\n" +this. getLand();
	}
	
	
	/**
	 * 
	 * @return gibt true wenn rheinland-pfalz in bundesland gespeichert ist und false wenn was anderes in dieser Variable enthalten ist.
	 * Bevor If Abfrage benutzt wird, wird bundesland toLowerCase, damit Groß und Kleinschreibung irrelevant wird.
	 */
	
	public boolean liegtInRLP() {
		String lowerCaseBundesland = this.getBundesland().toLowerCase();
		
		if(lowerCaseBundesland.contains("rheinland-pfalz")) {
			return true;
		}else {
			return false;
		}
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getHnr() {
		return hnr;
	}

	public void setHnr(String hnr) {
		this.hnr = hnr;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getBundesland() {
		return bundesland;
	}

	public void setBundesland(String bundesland) {
		this.bundesland = bundesland;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}
	
	
	
	
	
}
