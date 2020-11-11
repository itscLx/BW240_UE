/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.tutorium.tut7;

/**
 * @author christianwalter
 *
 * @since 10.11.2020
 */
public class AppBoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Segelboot s1 = new Segelboot(10, 20);
		Kreuzfahrtschiff k1 = new Kreuzfahrtschiff();
		k1.setKajueten(50);
		k1.setPassagiere(100);
		s1.setLaenge(1600.50);
		k1.setLaenge(2500.80);
		s1.legtAn("Hamburg");
		k1.legtAn("Hamburg");
	}

}
