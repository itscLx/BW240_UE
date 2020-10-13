package de.hs_lu.o2s.sandbox.walter.tutorium.tut2;

public class Haus {
	
	

	public Haus(String strasse, int etagen, int einwohner, double grundstuecksFlaeche) {
		super();
		this.strasse = strasse;
		this.etagen = etagen;
		this.einwohner = einwohner;
		this.grundstuecksFlaeche = grundstuecksFlaeche;
	}

	private String strasse;
	private int etagen;
	private int einwohner;
	private double grundstuecksFlaeche;
	
	
	public Haus() {
		
	}
	
	public Haus(String strasse) {
		this.strasse = strasse;
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
		return etagen;
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

	public double getGrundstuecksFlaeche() {
		return grundstuecksFlaeche;
	}

	public void setGrundstuecksFlaeche(double grundstuecksFlaeche) {
		this.grundstuecksFlaeche = grundstuecksFlaeche;
	}

	@Override
	public String toString() {
		return "Das Haus befindet sich in der Strasse: " + this.getStrasse() + " und hat " + this.getEtagen() + " Etagen." + "\n" + "Es befinden sich " + this.getEinwohner() + " in dem Haus, auf einer Flaeche von " + this.getGrundstuecksFlaeche();
	}
	
	public double berechneVerkaufspreis(double quadratmeterPreis) {
		return getGrundstuecksFlaeche() * quadratmeterPreis;
	}
	

	
	
}
