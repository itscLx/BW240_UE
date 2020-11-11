/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.tutorium.tut7;

/**
 * @author christianwalter
 *
 * @since 10.11.2020
 */
public class ZuVielePersonenException extends IndexOutOfBoundsException {
	
	private final int anzahlPersonen = 1;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 */
	public ZuVielePersonenException() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @return the anzahlPersonen
	 */
	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}
	
	
	

}
