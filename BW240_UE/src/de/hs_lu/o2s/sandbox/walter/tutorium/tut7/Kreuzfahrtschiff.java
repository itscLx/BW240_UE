package de.hs_lu.o2s.sandbox.walter.tutorium.tut7;

public class Kreuzfahrtschiff extends Boot {
	
	private int anzPool;
	private int anzStockwerke;
	private int anzKapitaene;
	private int dauer; //Gibt die Dauer der Momentanen Kreuzfahrt an (in Tagen)
	private int besatzung; //Anzahl der Besatzung auf dem Kreuzfahrtschiff
	
	public int getAnzPool() {
		return anzPool;
	}
	public void setAnzPool(int anzPool) {
		this.anzPool = anzPool;
	}
	public int getAnzStockwerke() {
		return anzStockwerke;
	}
	public void setAnzStockwerke(int anzStockwerke) {
		this.anzStockwerke = anzStockwerke;
	}
	public int getAnzKapitaene() {
		return anzKapitaene;
	}
	public void setAnzKapitaene(int anzKapitaene) {
		this.anzKapitaene = anzKapitaene;
	}
	public int getDauer() {
		return dauer;
	}
	public void setDauer(int dauer) {
		this.dauer = dauer;
	}
	
	
	@Override
	public int compareTo(Object o) {
		if(super.compareTo(o) == 0) {
			if(getAnzPool() > ((Kreuzfahrtschiff)o).getAnzPool()) {
				return 1;
			}else if (getAnzPool() < ((Kreuzfahrtschiff)o).getAnzPool()) {
				return -1;
			}else if (getAnzPool() == ((Kreuzfahrtschiff)o).getAnzPool()) {
				return 0;
			}else {
				return 0;
			}
		}else {
			return super.compareTo(o);
		}
	}
	

}
