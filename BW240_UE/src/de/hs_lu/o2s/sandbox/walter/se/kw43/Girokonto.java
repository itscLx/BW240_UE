/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.se.kw43;

import java.util.Currency;

/**
 * @author christianwalter
 *
 * @since 21.10.2020
 */
public class Girokonto extends Konto {

	
	
	private Currency dispolimit;

	
	
	
	/**
	 * 
	 */
	public Girokonto() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param dispolimit
	 */
	public Girokonto(Currency dispolimit) {
		super();
		this.dispolimit = dispolimit;
	}

	
	
	
	public Currency getDispolimit() {
		return dispolimit;
	}

	public void setDispolimit(Currency dispolimit) {
		this.dispolimit = dispolimit;
	}
	
	
}
