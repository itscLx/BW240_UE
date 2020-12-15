/**
 * 
 */
package de.hs_lu.o2sprobe.computer;

/**
 * @author christianwalter
 *
 * @since 15.12.2020
 */
public class Maus {

	private PC angeschlossenAn;

	
	/**
	 * 
	 */
	public Maus() {
		// TODO Auto-generated constructor stub
		this.angeschlossenAn = null;
	}
	
	public Maus(PC angeschlossenAn) {
		this.angeschlossenAn = angeschlossenAn;
	}
	
	
	public PC getAngeschlossenAn() {
		return angeschlossenAn;
	}

	public void setAngeschlossenAn(PC angeschlossenAn) {
		this.angeschlossenAn = angeschlossenAn;
	}

	@Override
	public String toString() {
		String s = "";
		if(getAngeschlossenAn() != null) {
			return "Maus angeschlossen an " + getAngeschlossenAn();
		}else {
			return "Maus nicht angeschlosse";
		}
	}
	
	
	
	
	
	
	
}
