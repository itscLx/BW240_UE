package de.hs_lu.o2s.sandbox.walter.tutorium.tut4;

public class Restaurant extends Haus {
	private double sitzflaeche;
	private int maxKunden;
	
	public Restaurant(double sitzflaeche, int maxKunden, String strasse) {
		super(strasse);
		this.setSitzflaeche(sitzflaeche);
		this.setMaxKunden(maxKunden);
		this.setStrasse(strasse);
	}
	public Restaurant(double sitzflaeche, int maxKunden, String strasse, int etage) {
		super(strasse, etage);
		this.setSitzflaeche(sitzflaeche);
		this.setMaxKunden(maxKunden);
		this.setStrasse(strasse);
	}
	
	public Restaurant(double sitzflaeche, int maxKunden, String strasse, int etage, int einwohner) {
		super(strasse, etage, einwohner);
		this.setSitzflaeche(sitzflaeche);
		this.setMaxKunden(maxKunden);
		this.setStrasse(strasse);
	}

	
	
	public String toString() {
		return "Das Restaurant hat " + getSitzflaeche() + " sitzflaeche. Es koennen maximal " + getMaxKunden() + " Kunden in das Restaurant. Das " + super.toString();
	}
	
	
	public double getSitzflaeche() {
		return sitzflaeche;
	}

	public void setSitzflaeche(double sitzflaeche) {
		this.sitzflaeche = sitzflaeche;
	}

	public int getMaxKunden() {
		return maxKunden;
	}

	public void setMaxKunden(int maxKunden) {
		this.maxKunden = maxKunden;
	}
	
	
	
	
	
}
