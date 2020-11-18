/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.se.kw47;

/**
 * @author christianwalter
 *
 * @since 18.11.2020
 */
public class Mitarbeiter {

	Mitarbeiter chef;
	String name;
	Mitarbeiter[] angestellte;
	
	/**
	 * 
	 */
	public Mitarbeiter(Mitarbeiter chef) {
	this.chef = chef;
	}
	
}
