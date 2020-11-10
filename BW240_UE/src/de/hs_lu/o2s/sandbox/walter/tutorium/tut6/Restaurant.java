package de.hs_lu.o2s.sandbox.walter.tutorium.tut6;

import java.util.ArrayList;

public class Restaurant extends Haus implements Bar{
	
	private double sitzflaeche;
	private int maxKunden;
	private final String inhaber;
	private ArrayList <String> getraenkeArrayList = new ArrayList<String>();
	private String getraenke[];

	public Restaurant(String inhaber) {
		// TODO Auto-generated constructor stub
		this.inhaber = inhaber;
	}

	public Restaurant(String strasse, String inhaber) {
		super(strasse);
		this.inhaber = inhaber;
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String strasse, int etagen, String inhaber) {
		super(strasse, etagen);
		this.inhaber = inhaber;
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String strasse, int etagen, int einwohner, String inhaber) {
		super(strasse, etagen, einwohner);
		this.inhaber = inhaber;
		// TODO Auto-generated constructor stub
	}
	
	public Restaurant(double sitzflaeche, int maxKunden, String inhaber) {
		this.sitzflaeche = sitzflaeche;
		this.maxKunden = maxKunden;
		this.inhaber = inhaber;
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

	@Override
	public double kostenSanierung(int Preis) {
		return this.getGrundstuecksFlaeche() * Preis * 3;
	}

	@Override
	public void berechneUmsatz(double preis) {
		this.umsatz = this.getMaxKunden() * preis;
	}

	public String getInhaber() {
		return inhaber;
	}

	@Override
	public double generateSteuererklärung() {

		double steuer = 0.07;
		double gewerbesteuer = 0.15;
		return this.getUmsatz() * steuer * gewerbesteuer;
		
	
	}

	@Override
	public void addGetraenke(String getraenk) {
		// TODO Auto-generated method stub
		getraenkeArrayList.add(0, getraenk);
		getraenke = (String[]) getraenkeArrayList.toArray();
		
	}



	

}
