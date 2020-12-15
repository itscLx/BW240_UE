/**
 * 
 */
package de.hs_lu.o2sprobe.computer;

/**
 * @author christianwalter
 *
 * @since 15.12.2020
 */
public class PC {

	private int speicher;

	
	/**
	 * 
	 */
	public PC(int speicher) {
		this.speicher = speicher;
	}
	
	
	
	public int getSpeicher() {
		return speicher;
	}

	public void setSpeicher(int speicher) {
		this.speicher = speicher;
	}



	@Override
	public String toString() {
		return "PC mit Speicher " + getSpeicher();
	}
	
	
	
	
	
	
}
