package de.hs_lu.o2s.sandbox.walter.tutorium.tut5;

import java.util.ArrayList;

public class Restaurant extends Haus {
	
	private double sitzflaeche;
	private int maxKunden;
	private final String INHABER;
	private ArrayList <String> getraenkeArrayList = new ArrayList<String>();
	private String getraenke[];


	public Restaurant(String inhaber, double oeffnung, double schliessung) {
		// TODO Auto-generated constructor stub
		this.INHABER = inhaber;
		setOeffnung(oeffnung);
		setSchliessung(schliessung);
		

	}

	public Restaurant(String strasse, String inhaber) {
		super(strasse);
		this.INHABER = inhaber;
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String strasse, int etagen, String inhaber) {
		super(strasse, etagen);
		this.INHABER = inhaber;
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String strasse, int etagen, int einwohner, String inhaber) {
		super(strasse, etagen, einwohner);
		this.INHABER = inhaber;
		// TODO Auto-generated constructor stub
	}
	
	public Restaurant(double sitzflaeche, int maxKunden, String inhaber) {
		this.sitzflaeche = sitzflaeche;
		this.maxKunden = maxKunden;
		this.INHABER = inhaber;
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
	
	public String toString() {
		String s = super.toString();
		s += "Hat eine Sitzfl�che von " + this.getSitzflaeche() + " und kann maximal " + this.getMaxKunden()
		+ " Kunden bewirten.";
		return s;
	}
	
	public double berechneVerkaufspreis(double quadratmeterPreis) {
		double preis = quadratmeterPreis * getGrundstuecksFlaeche() * 3.0;
		return preis;
	}


	public String getInhaber() {
		return INHABER;
	}

	@Override
	public double kostenSanierung(int Preis) {
		// TODO Auto-generated method stub
		return this.getGrundstuecksFlaeche() * Preis * 2.0;
	}

	@Override
	public double berechneUmsatz(double preis) {
		// TODO Auto-generated method stub
		return this.getEinwohner() * preis + preis * getraenkeArrayList.size();
	}
	
	
	public void addGetraenke(String getraenk) {
		getraenkeArrayList.add(0, getraenk);
		getraenke = (String[]) getraenkeArrayList.toArray();
	}

	@Override
	public String sperrStunde(double sperrOeffnung, double sperrSchliessung) {

			return "";
	}
	

}
