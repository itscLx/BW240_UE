/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.se.kw43;

/**
 * @author christianwalter
 *
 * @since 21.10.2020
 */
public class Sparkonto extends Konto{

	private int kündigungsfrist;

	/**
	 * @param anzahlMonate
	 */
	public Sparkonto(int anzahlMonate) {
		super();
		this.kündigungsfrist = anzahlMonate;
	}
	
	
	/**
	 * 
	 */
	public Sparkonto() {
		// TODO Auto-generated constructor stub
	}
	
	
}
