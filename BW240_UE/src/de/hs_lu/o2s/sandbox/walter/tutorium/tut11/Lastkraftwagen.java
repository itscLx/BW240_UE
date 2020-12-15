package de.hs_lu.o2s.sandbox.walter.tutorium.tut11;

public class Lastkraftwagen {
	
	private int ps;
	private double hoehe;
	private String marke;
	private double gewicht;
	private double hoechstbeladung;
	
	public Lastkraftwagen() {
		
	}
	
	public Lastkraftwagen(int ps, double hoehe, String marke) {
		this.ps = ps;
		this.hoehe = hoehe;
		this.marke = marke;
	}
	
	
	public Lastkraftwagen(int ps, double hoehe, String marke, double hoechstbeladung) {
		this(ps, hoehe, marke);
		this.hoechstbeladung = hoechstbeladung;
	}
	
	
	public boolean beladen(double gewicht) throws ZuSchwerException {
		if((gewicht + this.gewicht) > hoechstbeladung) {
			this.gewicht = this.hoechstbeladung;
			throw new ZuSchwerException();
		} else {
			this.gewicht += gewicht;
			System.out.println("Der LKW wurde beladen");
			return true;
		}
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public double getHoechstbeladung() {
		return hoechstbeladung;
	}

	public void setHoechstbeladung(double hoechstbeladung) {
		this.hoechstbeladung = hoechstbeladung;
	}
	
	
	

}
