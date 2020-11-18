/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.se.kw47.ue2;

/**
 * @author christianwalter
 *
 * @since 18.11.2020
 */
public class Kunde {

	
	private Vertriebsmitarbeiter Betreuer;
	
	/**
	 * 
	 */
	public Kunde(Vertriebsmitarbeiter vertriebsmitarbeiter) {
		// TODO Auto-generated constructor stub
		setBetreuer(vertriebsmitarbeiter);
	}


	
	
	
	/**
	 * GETTER UND SETTER
	 */
	public Vertriebsmitarbeiter getBetreuer() {
		return Betreuer;
	}


	public void setBetreuer(Vertriebsmitarbeiter betreuer) {
		this.Betreuer = betreuer;
	}
	
	
	
}
