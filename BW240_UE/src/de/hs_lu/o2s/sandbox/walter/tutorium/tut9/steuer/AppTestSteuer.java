/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.tutorium.tut9.steuer;

/**
 * @author christianwalter
 *
 * @since 24.11.2020
 */
public class AppTestSteuer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Steuer s1 = new Steuer();
		
		s1.put(Laender.DE, 19.0);
		s1.put(Laender.CH, 25.0);
	}

}
