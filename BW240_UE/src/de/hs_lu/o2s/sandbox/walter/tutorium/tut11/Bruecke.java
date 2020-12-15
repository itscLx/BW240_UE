package de.hs_lu.o2s.sandbox.walter.tutorium.tut11;


public abstract class Bruecke implements Comparable<Bruecke>{
	
	
	private double laenge;
	private int baujahr;
	private int letzteRenovierung;
	
	
	public Bruecke() {
		
	}
	
	public Bruecke(double laenge, int baujahr, int letzteRenovierung) {
		this.laenge = laenge;
		this.baujahr = baujahr;
		this.letzteRenovierung = letzteRenovierung;
	}
	
	public double getLaenge() {
		return laenge;
	}
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	public int getLetzteRenovierung() {
		return letzteRenovierung;
	}
	public void setLetzteRenovierung(int letzteRenovierung) {
		this.letzteRenovierung = letzteRenovierung;
	}
	
	public int naechsteRenovierung() {
		return this.letzteRenovierung + 20;
	}
	
	public String toString() {
		String s = this.getClass().getSimpleName() + " ist im Jahr " + this.getBaujahr() 
				+	" mit einer L�nge von " + this.getLaenge() + " Metern gebaut worden. \n"
				+ "Zuletzt Renoviert wurde die Br�cke am " + this.getLetzteRenovierung() 
				+ " und muss im Jahr " + this.naechsteRenovierung() + " erneut renoviert werden.";
		return s;
		
	}
	
	public abstract boolean maxLast(double gewicht);

	@Override
	public int compareTo(Bruecke o) {
		if(this.laenge > o.laenge) {
			System.out.println(laenge + " ist länger");
			return 1;
		} else if (this.laenge < o.laenge) {
			System.out.println(o.laenge + " ist länger");
			return -1;
		} else if(this.laenge == o.laenge) {
			return 0;
		}
		return 0;
	}
	
	

}
