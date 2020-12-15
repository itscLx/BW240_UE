/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.tutorium.tut11;

/**
 * @author christianwalter
 *
 * @since 15.12.2020
 */
public class AppTestLKW {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lastkraftwagen l1 = new Lastkraftwagen(800, 2.40, "Scania", 500.00);
		
		try {
			l1.beladen(550.00);
		} catch (ZuSchwerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println(l1.getGewicht());
		
	}

}
