package de.hs_lu.o2s.sandbox.walter.tutorium.tut5;

public abstract class Haus {
	
	

	private String strasse;
	private int etagen;
	private int einwohner;
	private double grundstuecksFlaeche;
	private static double Grundsteuer;
	private double oeffnung;
	private double schliessung;
	
	
	public Haus() {
		Grundsteuer = 16.0;
	}
	
	public Haus(String strasse) {
		this.strasse = strasse;
		//Optional
//		this.setStrasse(strasse);
	}
	
	public Haus(String strasse, int etagen) {
		this(strasse);
		this.etagen = etagen;
	}
	
	public Haus(String strasse, int etagen, int einwohner) {
		this(strasse, etagen);
		this.einwohner = einwohner;
	}
	
	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getEtagen() {
		return this.etagen;
	}

	public void setEtagen(int etagen) {
		this.etagen = etagen;
	}

	public int getEinwohner() {
		return einwohner;
	}

	public void setEinwohner(int einwohner) {
		this.einwohner = einwohner;
	}
	
	public void druckDich() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		
		String s;
		s = this.getClass().getSimpleName() + " mit Einwohnern: " + this.getEinwohner()
			+ " und Etagen: " + this.getEtagen() + " liegt in der Stra�e " + this.strasse + "\n";
		return s;
	}

	public double getGrundstuecksFlaeche() {
		return grundstuecksFlaeche;
	}

	public void setGrundstuecksFlaeche(double grundstuecksFlaeche) {
		this.grundstuecksFlaeche = grundstuecksFlaeche;
	}
	
	public double berechneVerkaufspreis(double quadratmeterPreis) {
		return this.getGrundstuecksFlaeche() * quadratmeterPreis;
	}

	/**
	 * @param Preis
	 * @return
	 */
	public abstract double kostenSanierung(int Preis);
	
	public abstract double berechneUmsatz(double preis);
	
	public abstract String sperrStunde(double sperrOeffnung, double sperrSchliessung);

	/**
	 * @return the oeffnung
	 */
	public double getOeffnung() {
		return oeffnung;
	}

	/**
	 * @param oeffnung the oeffnung to set
	 */
	public void setOeffnung(double oeffnung) {
		this.oeffnung = oeffnung;
	}

	/**
	 * @return the schliessung
	 */
	public double getSchliessung() {
		return schliessung;
	}

	/**
	 * @param schliessung the schliessung to set
	 */
	public void setSchliessung(double schliessung) {
		this.schliessung = schliessung;
	}

	
	
	


}
