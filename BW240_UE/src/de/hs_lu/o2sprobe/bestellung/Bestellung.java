/**
 * 
 */
package de.hs_lu.o2sprobe.bestellung;

/**
 * @author christianwalter
 *
 * @since 15.12.2020
 */
public abstract class Bestellung {
	
	private String lieferant;
	
	
	/**
	 * 
	 */
	public Bestellung() {
		// TODO Auto-generated constructor stub
	}
	
	public Bestellung(String string) {
		// TODO Auto-generated constructor stub
		this.lieferant = string;
	}

	
	public abstract int getGesamtMenge();
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " für Lieferrant " + getLieferant() + " mit Gesamtmenge " + getGesamtMenge();
	}

	public String getLieferant() {
		return lieferant;
	}

	public void setLieferant(String lieferant) {
		this.lieferant = lieferant;
	}
	
	
	
}
